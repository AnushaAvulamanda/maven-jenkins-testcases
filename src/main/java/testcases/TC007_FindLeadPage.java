package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_FindLeadPage extends ProjectMethods {
	@BeforeClass
	public void setData() {
		dataSheetName = "TC007";
		testCaseName = "TC007_FindLeadPage";
		testDescription = "Verify firstName in viewlead";
		category= "Smoke";
		authors	="Anusha";
		browserName ="firefox";
	}

	@Test(dataProvider="fetchData")
	public void logInLogOut(String userName, String passWord,String FindleadFname,String VerifyTit,String ComName,String VerifyCName) 
	{

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfaLink()
		.clickLeadsLink()
		.clickFindLeadLink()
		.enterFirstName(FindleadFname)
		.clickFindleadbtn()
		.clickFirstresultid()
		.Verifytitle(VerifyTit);
		//.clickEditLink()
		//.enterChangeCompanyName(ComName)
		//.clickUpdateBtn()
		//.VerifyCName(VerifyCName);
		//.clickLogout()

	}
}

