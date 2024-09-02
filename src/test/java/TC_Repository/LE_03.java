package TC_Repository;

import generic_Utility.BaseClass;
import generic_Utility.Excel_Utility;
import generic_Utility.JavaUtility;
import objectRepository.CreateNewLeadsPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomePage;

public class LE_03 extends BaseClass {
	
	@org.testng.annotations.Test
	public void le_03() throws Exception {
	JavaUtility jutil = new JavaUtility();
	int num = jutil.getRandomNumber(1000);
	Excel_Utility eutil = new Excel_Utility();
	
	String FirstName = eutil.getIndividualTestDate("Leads", 8, 1);
	String LastName = eutil.getIndividualTestDate("Leads", 8, 2);
	String Company = eutil.getIndividualTestDate("Leads", 8, 3);
	String Title = eutil.getIndividualTestDate("Leads", 8, 4);
	String Phone = eutil.getIndividualTestDate("Leads", 8, 5);
	String Mobile= eutil.getIndividualTestDate("Leads", 8, 6);
	String Email = eutil.getIndividualTestDate("Leads", 8, 7);
	String NoE = eutil.getIndividualTestDate("Leads", 8, 8);
	
	HomePage hp = new HomePage(driver);
	hp.clickOnOnLeads();
	LeadsHomePage lp = new LeadsHomePage(driver);
	lp.clickOnNewLeadBtn();
	CreateNewLeadsPage cn = new CreateNewLeadsPage(driver);
	cn.createLeads(FirstName+num,LastName, Company, Title, Phone, Mobile, Email, NoE);
	Thread.sleep(3000);
}

}
