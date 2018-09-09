package bankbazaarpages;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MutualPersonalInfo extends ProjectMethods {
@And("set your name (.*)")
public MutualPersonalInfo setName(String data) {
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("......................");
	WebElement setFirstName = locateElement("xpath", "//input[@name='firstName']");
	type(setFirstName, data);
	return this;
}
@And("clicks on view mutual funds")
public ValidationPage clickViewMutualFunds() {
	WebElement clickViewMutualFunds = locateElement("xpath", "//a[text()='View Mutual Funds']");
	click(clickViewMutualFunds);
	return new ValidationPage();
}
}
