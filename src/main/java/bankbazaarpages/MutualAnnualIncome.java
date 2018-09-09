package bankbazaarpages;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MutualAnnualIncome extends ProjectMethods{
	@And("type annual income (.*)")
	public MutualAnnualIncome setAnnualIncome(String data) {
		System.out.println("inside annual income");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement annualIncome = locateElement("name", "netAnnualIncome");
		type(annualIncome, data);
//		System.out.println("Annual income is: "+annualIncome.getText());
		return this;
	}
	@And("click annual income continue")
	public MutualBankAccount clickContinue() {
		WebElement clickContinue = locateElement("xpath", "//a[text()='Continue']");
		click(clickContinue);
		return new MutualBankAccount();
	}
}
