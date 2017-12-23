package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_HomePage extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC003";
		testCaseName = "TC003_HomePage";
		testDescription = "Homepage clickcrmsfa link";
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
		.clickCrmsfaLink();
		//.clickLogout()
			
		
		
		
	}

}

