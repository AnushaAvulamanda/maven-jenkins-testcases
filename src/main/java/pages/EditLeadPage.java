package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods {
	public EditLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement elechangecName;
	public EditLeadPage enterChangeCompanyName(String comName) {
		type(elechangecName, comName);
		return this;
}
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleclickUpdateBtn;
	public ViewLeadPage clickUpdateBtn() {
		click(eleclickUpdateBtn);
		return new ViewLeadPage(driver, test);
	}

}
