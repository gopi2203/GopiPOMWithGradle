package bankbazaarpages;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MutualFunds extends ProjectMethods {
	@And("click search for mutual funds")
public MutualfundsSelectBirthday searchMutualFunds() {
	WebElement searchMutualfunds = locateElement("linktext", "Search for Mutual Funds");
	click(searchMutualfunds);
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return new MutualfundsSelectBirthday();
}
}
