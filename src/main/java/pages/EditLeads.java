package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class EditLeads extends ProjectMethods{

	public EditLeads typeFirstName(String data) {
		WebElement eleFirstName = locateElement("id", "updateLeadForm_firstName");
		type(eleFirstName, data);
		return this;
	}

	public ViewLeadsPage clickUpdate() {
		WebElement eleUpdate = locateElement("name", "submitButton");
		click(eleUpdate);
		return new ViewLeadsPage();
	}
}









