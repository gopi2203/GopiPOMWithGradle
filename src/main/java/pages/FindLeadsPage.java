package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{

	//	public FindLeadsPage() {
	//		PageFactory.initElements(driver, this);
	//	}
	//	@CacheLookup
	//	@FindBy(xpath="(//input[@name='firstName'])[3]")
	//	WebElement eleFirstName;

	public FindLeadsPage typeFirstName(String data) {
		WebElement eleFirstName = locateElement("xpath", "(//input[@name='firstName'])[3]");
		type(eleFirstName, data);
		return this;
	}

	public FindLeadsPage typeLeadId(String data) {
		WebElement eleLeadID = locateElement("name", "id");
		type(eleLeadID, data);
		return this;
	}

	public FindLeadsPage clickEmail(String data) {
		WebElement clickEmail = locateElement("xpath", "//span[text()='Email']");
		click(clickEmail);
		WebElement eleEmail = locateElement("name", "emailAddress");
		type(eleEmail, data);
		return this;
	}

	public FindLeadsPage clickFindLeadsButton() {
		WebElement eleFindLeads = locateElement("xpath", "//button[text()='Find Leads']");
		click(eleFindLeads);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return this;
	}

	public FindLeadsPage verifyDeleteLead() throws InterruptedException {
		WebElement getOutput = locateElement("xpath", "//div[text()='No records to display']");
		getText(getOutput);
		verifyExactText(getOutput, "No records to display");
		return this;
	}

	public ViewLeadsPage clickLeadIDLink() throws InterruptedException {
		WebElement eleLeadIDLink = locateElement("xpath", "(//a[@class='linktext'])[4]");
		click(eleLeadIDLink);
		return new ViewLeadsPage();
	}

	public MergeLeadPage clickLeadIDLinkWithNoSnap() throws InterruptedException {
		WebElement eleLeadIDLinkWithNoSnap = locateElement("xpath", "(//a[@class='linktext'])[1]");
		clickWithNoSnap(eleLeadIDLinkWithNoSnap);
		return new MergeLeadPage();
	}
}









