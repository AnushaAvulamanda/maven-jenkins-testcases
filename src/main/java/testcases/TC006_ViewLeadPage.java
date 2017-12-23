package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_ViewLeadPage extends ProjectMethods {
	@BeforeClass
	public void setData() {
		dataSheetName = "TC006";
		testCaseName = "TC006_ViewLeadPage";
		testDescription = "Verify firstName in viewlead";
		category= "Smoke";
		authors	="Anusha";
		browserName ="firefox";
	}

	@Test(dataProvider="fetchData")
	public void logInLogOut(String userName, String passWord,String FirstName,String LastName,String CName,String verifyFName,String source,String Market, String Phonenum, String EmailId) 
	{

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfaLink()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterFirstName(FirstName)
		.enterLastName(LastName)
		.enterCompanyName(CName)
		.selectSourceName(Integer.parseInt(source))
		.selectmarketName(Market)
		.enterPhonetNum(Phonenum)
		.enterEmailId(EmailId);
		//.clickCreateLeadBtn()
		//.VerifyFirstName(verifyFName)
		//.clickLogout()

	}
}

