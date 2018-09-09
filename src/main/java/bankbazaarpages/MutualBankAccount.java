package bankbazaarpages;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MutualBankAccount extends ProjectMethods{
	@And("select your bank")
	public MutualBankAccount selectBankName() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement bankName = locateElement("xpath", "//span[text()='HDFC']");
		click(bankName);
		try {
			Thread.sleep(3000);
			System.out.println("sleeping for 3 secs.............");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	@And("click bank continue")
	public MutualPersonalInfo clickBankContinue() {
		WebElement clickBankContinue = locateElement("xpath", "//a[text()='Continue']");
		click(clickBankContinue);
		System.out.println("sleeping for 3 secs.............");
		try {
			Thread.sleep(3000);
			System.out.println("sleeping for 3 secs.............");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new MutualPersonalInfo();
	}

}
