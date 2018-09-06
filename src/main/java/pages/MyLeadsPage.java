package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{


	public CreateLeadPage clickCreateLead() {
		WebElement eleCreateLead = locateElement("linktext", "Create Lead");
		click(eleCreateLead);
		return new CreateLeadPage();
	}
	
	public FindLeadsPage clickFindLeadsLink() {
		WebElement eleFindLeads = locateElement("linktext", "Find Leads");
		click(eleFindLeads);
		return new FindLeadsPage();
	}

	public MergeLeadPage clickMergeLeads() {
		WebElement eleMergeLeads = locateElement("linktext", "Merge Leads");
		click(eleMergeLeads);
		return new MergeLeadPage();
	}

}









