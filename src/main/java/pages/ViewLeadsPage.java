package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class ViewLeadsPage extends ProjectMethods{


	public EditLeads clickEdit() {
		WebElement eleFindLeads = locateElement("linktext", "Edit");
		click(eleFindLeads);
		return new EditLeads();
	}
	
	public ViewLeadsPage clickDelete() {
		WebElement eleFindLeads = locateElement("linktext", "Delete");
		click(eleFindLeads);
		return this;
	}

}









