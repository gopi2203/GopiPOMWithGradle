package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods{

	//	public FindLeadsPage() {
	//		PageFactory.initElements(driver, this);
	//	}
	//	@CacheLookup
	//	@FindBy(xpath="(//input[@name='firstName'])[3]")
	//	WebElement eleFirstName;

	public FindLeadsPage clickFirMergeIcon() {
		WebElement clickMerIcon1 = locateElement("xpath", "//table[@id='widget_ComboBox_partyIdFrom']/following-sibling::a/img");
		clickWithNoSnap(clickMerIcon1);
		switchToWindow(1);
		return new FindLeadsPage();
	}

	public FindLeadsPage clickSecMergeIcon() {
		WebElement clickMerIcon2 = locateElement("xpath", "//table[@id='widget_ComboBox_partyIdTo']/following-sibling::a/img");
		clickWithNoSnap(clickMerIcon2);
		switchToWindow(1);
		return new FindLeadsPage();
	}

	public MergeLeadPage typeLeadId(String data) {
		WebElement eleLeadID = locateElement("name", "id");
		type(eleLeadID, data);
		return this;
	}

	public MergeLeadPage selectParentWindow() {
		switchToWindow(0);
		return this;
	}

	public MergeLeadPage clickMerge() {
		WebElement clickMergeIcon = locateElement("xpath", "//a[text()='Merge']");
		clickWithNoSnap(clickMergeIcon);
		return this;
	}

	public MergeLeadPage clickFindLeads() {
		WebElement eleFindLeads = locateElement("xpath", "//button[text()='Find Leads']");
		click(eleFindLeads);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return this;
	}

	public MergeLeadPage verifyDeleteLead() throws InterruptedException {
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
}









