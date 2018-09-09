package bankbazaarpages;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class KnowAboutInv extends ProjectMethods{
	@And("click mutual funds")
public MutualFunds clickMutualFunds() {
	WebElement mutualFunds = locateElement("xpath", "//span[text()='Mutual Fund']");
	click(mutualFunds);
	return new MutualFunds();
}
}
