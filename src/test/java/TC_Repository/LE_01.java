package TC_Repository;

import generic_Utility.BaseClass;
import generic_Utility.Excel_Utility;
import generic_Utility.JavaUtility;
import objectRepository.CreateNewLeadsPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomePage;

public class LE_01 extends BaseClass{
	
	@org.testng.annotations.Test

	public void le_01Case() throws Exception{
		JavaUtility JUTIL=new JavaUtility();
		int num=JUTIL.getRandomNumber(1000);
		Excel_Utility EUTIL=new Excel_Utility();
		String FIRSTNAME=EUTIL.getIndividualTestDate("Leads",2,1);
		String LASTNAME=EUTIL.getIndividualTestDate("Leads",2,2);
		String COMPANY=EUTIL.getIndividualTestDate("Leads",2,3);
		HomePage hp=new HomePage(driver);
		hp.clickOnOnLeads();
		LeadsHomePage lp=new LeadsHomePage(driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadsPage cnlp=new CreateNewLeadsPage(driver);
		cnlp.createLeads(FIRSTNAME+num, LASTNAME, COMPANY);
		Thread.sleep(4000);	
	}


}
