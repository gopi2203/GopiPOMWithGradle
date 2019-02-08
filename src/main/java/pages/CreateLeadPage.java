package pages;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	@And("enter company name (.*)")
	public CreateLeadPage typeCompanyName(String data) {
		WebElement eleCompanyName = locateElement("id", "createLeadForm_companyName");
		type(eleCompanyName, data);
		return this;
	}
	@And("enter first name (.*)")
	public CreateLeadPage typeFirstName	(String data) {
		WebElement eleFirstName = locateElement("id", "createLeadForm_firstName");
		type(eleFirstName, data);
		return this;
	}
	@And("enter last name (.*)")
	public CreateLeadPage typeLastName	(String data) {
		WebElement eleLastName = locateElement("id", "createLeadForm_lastName");
		type(eleLastName, data);
		return this;
	}

	public CreateLeadPage typeEmail	(String data) {
		WebElement setEmail = locateElement("id", "createLeadForm_primaryEmail");
		type(setEmail,data);
		return this;
	}
	@When("clicks on create lead")
	public ViewLeadsPage clickCreateLead() {
		WebElement eleCreateLead= locateElement("class", "smallSubmit");
		click(eleCreateLead);
		return new ViewLeadsPage();
	}
}









