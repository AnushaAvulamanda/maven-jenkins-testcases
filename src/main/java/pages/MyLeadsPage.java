package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods {

	public MyLeadsPage(RemoteWebDriver driver, ExtentTest test) {
	
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleclickCreateLead;
	public CreateLeadPage clickCreateLeadLink() {
		click(eleclickCreateLead);
		return new CreateLeadPage(driver, test);
	}
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleclickMergeLead;
	public MergeLeadPage clickMergeLeadLink() {
		click(eleclickMergeLead);
		return new MergeLeadPage(driver, test);
	}
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleclickFindLead;
	public FindLeadPage clickFindLeadLink() {
		click(eleclickFindLead);
		return new FindLeadPage(driver, test);
	}
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement eleenterleadid;
	public MyLeadsPage enterleadID(String leadid) {
		type(eleenterleadid, leadid);
		return this;
}
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Leads')]")
	private WebElement eleclickFindLeadbtn;
	public MyLeadsPage clickFindLeadbtn() {
		click(eleclickFindLeadbtn);
		return this;
	}
	@FindBy(how=How.XPATH,using="//div[contains(text(),'No records to display')]")
	private WebElement eleVerifyerrormsg;

	public MyLeadsPage Verifyerrmsg(String expectedText) {
		verifyExactText(eleVerifyerrormsg, expectedText);
		return this;

	}
	
	

}
