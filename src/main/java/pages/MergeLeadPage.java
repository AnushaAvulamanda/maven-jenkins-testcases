package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods {
	public MergeLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;

		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.LINK_TEXT,using="Merge")
	private WebElement eleclickMergeBtn;
	public ViewLeadPage clickMergeBtn() {
		click(eleclickMergeBtn);
		return new ViewLeadPage(driver,test);
	}
	@FindBy(how=How.LINK_TEXT,using="//table[@class='twoColumnForm']/tbody/tr[2]/td[2]/a")
	private WebElement eleclickiconTolead;
	public FindLeadPage clickiconTolead() {
		click(eleclickiconTolead);
		return new FindLeadPage(driver,test);
	}
	@FindBy(how=How.LINK_TEXT,using="//table[@class='twoColumnForm']/tbody/tr/td[2]/a")
	private WebElement eleclickiconfromlead;
	public FindLeadPage clickiconfromlead() {
		click(eleclickiconfromlead);
		return new FindLeadPage(driver,test);
	}
	
}
