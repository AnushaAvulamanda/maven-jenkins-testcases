package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_MyHomePage  extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC003";
		testCaseName = "TC004_MyHomePage";
		testDescription = "Click Leads Button";
		category= "Smoke";
		authors	="Anusha";
		browserName ="firefox";
	}

	@Test(dataProvider="fetchData")
	public void logInLogOut(String userName, String passWord) {

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfaLink()
		.clickLeadsLink()
		.clickCreateLeadLink();
		//.clickLogout()

	}
}
