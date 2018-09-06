package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods{

	public DuplicateLeadPage typeTitle(String data) {
		WebElement eleTitle = locateElement("id","createLeadForm_generalProfTitle");
		type(eleTitle, data);
		return this;
	}

	public ViewLeadsPage clickSubmit() {
		WebElement clickSubCreate = locateElement("name", "submitButton");
		click(clickSubCreate);
		return new ViewLeadsPage();
	}

	public DuplicateLeadPage selectParentWindow() {
		switchToWindow(0);
		return this;
	}

	public DuplicateLeadPage clickMerge() {
		WebElement clickMergeIcon = locateElement("xpath", "//a[text()='Merge']");
		clickWithNoSnap(clickMergeIcon);
		return this;
	}

	public DuplicateLeadPage clickFindLeads() {
		WebElement eleFindLeads = locateElement("xpath", "//button[text()='Find Leads']");
		click(eleFindLeads);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return this;
	}

	public DuplicateLeadPage verifyDeleteLead() throws InterruptedException {
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









