package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {

	public CreateLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(driver, this);		
	}
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	public CreateLeadPage enterFirstName(String fName) {
		type(eleFirstName, fName);
		return this;

	}

	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	public CreateLeadPage enterLastName(String lName) {
		type(eleLastName, lName);
		return this;		
	}


	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	public CreateLeadPage enterCompanyName(String cName) {
		type(eleCompanyName, cName);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_dataSourceId")
	private WebElement elesourceName;
	public CreateLeadPage selectSourceName(int sourceName) {
		selectDropDownUsingIndex(elesourceName, sourceName);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_marketingCampaignId")
	private WebElement elemarketName;
	public CreateLeadPage selectmarketName(String marketName) {
		selectDropDownUsingText(elemarketName, marketName);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement elePhonenum;
	public CreateLeadPage enterPhonetNum(String Phonenum) {
		type(elePhonenum, Phonenum);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement eleEmailID;
	public CreateLeadPage enterEmailId(String EmailId) {
		type(eleEmailID, EmailId);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleclickCreateLeadBtn;
	public ViewLeadPage clickCreateLeadBtn() {
		click(eleclickCreateLeadBtn);
		return new ViewLeadPage(driver, test); 
	}
	//Capture the lead ID
	
	
	
}