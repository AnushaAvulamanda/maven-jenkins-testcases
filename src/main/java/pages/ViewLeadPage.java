package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {

	public ViewLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;

		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="sectionHeaderTitle_leads")
	private WebElement eleverifyduptit;

	public ViewLeadPage Verifyduptitle(String expectedTitle) {
		verifyTitle(expectedTitle);
		return this;

	}
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleVerifyFirstName;

	public ViewLeadPage VerifyFirstName(String expectedText) {
		verifyExactText(eleVerifyFirstName, expectedText);
		return this;

	}
	@FindBy(how=How.ID,using="sectionHeaderTitle_leads")
	private WebElement eleverifytit;

	public ViewLeadPage Verifytitle(String expectedTitle) {
		verifyTitle(expectedTitle);
		return this;

	}
	/*private void verifyTitle(WebElement eleverifytit2, String expectedTitle) {
		// TODO Auto-generated method stub

	}*/
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleclickFindLeadLinkMerge;
	public FindLeadPage clickFindLeadLinkMerge() {
		click(eleclickFindLeadLinkMerge);
		return new FindLeadPage(driver,test);
	}

	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement eleclickDelete;
	public MyLeadsPage clickDelete() {
		click(eleclickDelete);
		return new MyLeadsPage(driver,test);
	}
	@FindBy(how=How.XPATH,using="//a[@class='subMenuButton']")
	private WebElement eleclickduplicatebtn;
	public DuplicatePage clickduplicatebtn() {
		click(eleclickduplicatebtn);
		return new DuplicatePage(driver,test);
	}
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleclickEdit;
	public EditLeadPage clickEditLink() {
		click(eleclickEdit);
		return new EditLeadPage(driver,test);
	}
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement lkdjaslk;
	
	public String Leadid(){
		
		String captureid = lkdjaslk.getText();
		return captureid;
	}


	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleVerifyCName;

	public ViewLeadPage VerifyCName(String expectedText) {
		verifyExactText(eleVerifyCName, expectedText);
		return this;

	}
}
