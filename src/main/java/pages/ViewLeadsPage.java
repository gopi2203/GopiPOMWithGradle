package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class ViewLeadsPage extends ProjectMethods{


	public EditLeads clickEdit() {
		WebElement eleFindLeads = locateElement("linktext", "Edit");
		click(eleFindLeads);
		return new EditLeads();
	}

	public MyLeadsPage clickDelete() {
		WebElement eleFindLeads = locateElement("linktext", "Delete");
		click(eleFindLeads);
		return new MyLeadsPage();
	}

	public DuplicateLeadPage clickDuplicate() {
		WebElement eleFindLeads = locateElement("linktext", "Duplicate Lead");
		click(eleFindLeads);
		return new DuplicateLeadPage();
	}

	public String getcName() {
		WebElement getUserId = locateElement("xpath", "//span[@id='viewLead_companyName_sp']");
		String text = getText(getUserId);
		String correctText = text.replaceAll("[^0-9]", "");
		System.out.println(correctText);
		return correctText;
	}

	public String getEmail() {
		WebElement getEmailId = locateElement("xpath", "(//a[@class='linktext'])[4]");
		String text = getText(getEmailId);
		System.out.println(text);
		return text;
	}

	public ViewLeadsPage verifyDuplicateLead() throws InterruptedException {
		WebElement getTitle = locateElement("id","viewLead_generalProfTitle_sp");
		getText(getTitle);
		verifyExactText(getTitle, "Welcome Gopi");
		return this;
	}

}









