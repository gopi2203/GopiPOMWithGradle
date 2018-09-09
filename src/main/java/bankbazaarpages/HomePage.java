package bankbazaarpages;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{
	
	@And("click investment")
public KnowAboutInv clickInvestment() {
	WebElement investment = locateElement("xpath","//a[@title='Investments']");
	click(investment);
	return new KnowAboutInv();
}
	
	
}
