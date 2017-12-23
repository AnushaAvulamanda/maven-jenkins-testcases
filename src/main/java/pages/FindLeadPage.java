package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods {
	
	public FindLeadPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	}
	/*@FindBy(how=How.XPATH,using="//a[@class='linktext'])[4]")
	private WebElement eleclickid;
	public FindLeadPage clickcaptureid() {
		click(eleclickid);
		return this;
}	*/
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement elefindleadFirstName;
	public FindLeadPage enterFirstName(String firstName) {
		type(elefindleadFirstName, firstName);
		return this;
}
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Leads')]")
	private WebElement elefindleadbtn;
	public FindLeadPage clickFindleadbtn() {
		click(elefindleadbtn);
		return this;
}
		
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Leads')]")
	private WebElement eleclickfindLead;
	public FindLeadPage clickfindlead() {
		click(eleclickfindLead);
		return this;
	}
	@FindBy(how=How.XPATH,using="(//button[@class='x-btn-text'])[7]")
	private WebElement eleclickfindleadbtnduplicate;
	public FindLeadPage clickfindleadbtnduplicate() {
		click(eleclickfindleadbtnduplicate);
		return this;
	}
		
	@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[6]")
	private WebElement eleclickfirstresiddup;
	public ViewLeadPage clickfirstresultiddup() {
		click(eleclickfirstresiddup);
		return new ViewLeadPage(driver,test);
	}
	@FindBy(how=How.XPATH,using="(//a[contains(text(),'12891')])[1]")
	private WebElement eleclickToLeadfirstresultidmerge;
	public MergeLeadPage clickToLeadfirstresidMerge() {
		click(eleclickToLeadfirstresultidmerge);
		return new MergeLeadPage(driver,test);
	}
	@FindBy(how=How.XPATH,using="(//a[contains(text(),'12894')])[1]")
	private WebElement eleclickfirstresultidmerge;
	public MergeLeadPage clickfirstresid() {
		click(eleclickfirstresultidmerge);
		return new MergeLeadPage(driver,test);
	}
	@FindBy(how=How.XPATH,using="//td[@class='x-panel-btn-td']/table/tbody/tr/td[2]")
	private WebElement eleclickToFindleadbtnmerge;
	public FindLeadPage clickTofindleadbtnmerge() {
		click(eleclickToFindleadbtnmerge);
		return this;
	}
	@FindBy(how=How.XPATH,using="//td[@class='x-panel-btn-td']/table/tbody/tr/td[2]")
	private WebElement eleclickFindleadbtnmerge;
	public FindLeadPage clickfindleadbtnmerge() {
		click(eleclickFindleadbtnmerge);
		return this;
	}
	@FindBy(how=How.XPATH,using="//div[@class='x-tab-strip-wrap']/ul/li[3]")
	private WebElement eleclickEmail;
	public FindLeadPage clickemail() {
		click(eleclickEmail);
		return this;
	}
	@FindBy(how=How.NAME,using="id")
	private WebElement eleenterleadToidmerge;
	public FindLeadPage enterToleadIdmerge(String enterToLeadidmerge) {
		type(eleenterleadToidmerge, enterToLeadidmerge);
		return this;
	}
	@FindBy(how=How.NAME,using="id")
	private WebElement eleenterleadidmerge;
	public FindLeadPage enterleadIdmergelast(String enterLeadidmergelast) {
		type(eleenterleadidmerge, enterLeadidmergelast);
		return this;
	}
	@FindBy(how=How.NAME,using="id")
	private WebElement eleenterleadfromidmerge;
	public FindLeadPage enterfromleadIdmerge(String enterfromLeadidmerge) {
		type(eleenterleadfromidmerge, enterfromLeadidmerge);
		return this;
	}
	@FindBy(how=How.NAME,using="emailAddress")
	private WebElement eleenteremail;
	public FindLeadPage enteremailId(String enteremailid) {
		type(eleenteremail, enteremailid);
		return this;
	}

	@FindBy(how=How.NAME,using="phoneNumber")
	private WebElement elePhone;
	public FindLeadPage enterPhone(String Phonenum) {
		type(elePhone, Phonenum);
		return this;
	}
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Phone')]")
	private WebElement eleClickPhone;
	public FindLeadPage clickPhone() {
		click(eleClickPhone);
		return this;
	}
		
	@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[4]")
	private WebElement elefirstid;
	public ViewLeadPage clickFirstresultid() {
		click(elefirstid);
		return new ViewLeadPage(driver, test);
}
	
	
	
}