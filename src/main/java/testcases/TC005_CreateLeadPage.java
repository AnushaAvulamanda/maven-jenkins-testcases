package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_CreateLeadPage extends ProjectMethods{

	@BeforeClass
	public void setData() {
		dataSheetName = "TC005";
		testCaseName = "TC005_CreateLeadPage";
		testDescription = "Click CreateLead Button";
		category= "Smoke";
		authors	="Anusha";
		browserName ="firefox";
	}

	@Test(dataProvider="fetchData")
	public void logInLogOut(String userName, String passWord,String FirstName,String LastName,String CompanyName) {

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfaLink()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterFirstName(FirstName)
		.enterLastName(LastName)
		.enterCompanyName(CompanyName)
		.clickCreateLeadBtn();
		//.VerifyFirstName(VerifyfName)
		//.clickLogout()

	}
}
