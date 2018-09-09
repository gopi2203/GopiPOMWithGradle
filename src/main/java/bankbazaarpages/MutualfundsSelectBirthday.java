package bankbazaarpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class MutualfundsSelectBirthday extends ProjectMethods {
	@And("select birth month and year")
public MutualfundsSelectBirthday selectMonthYear() {
	WebElement selectAge = locateElement("xpath", "//div[@class='rangeslider__handle']");
	Actions builder = new Actions(driver);
	builder.dragAndDropBy(selectAge,(24-18)*8,0).perform();
	WebElement checkAge = locateElement("class", "rangeslider__handle-label");
	System.out.println(getText(checkAge));
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//	String month="Aug";
	WebElement selectYear = locateElement("xpath","//a[contains(text(),'Aug')]");
	click(selectYear);
	return this;
}
	@And("select birth date")
	public MutualfundsSelectBirthday selectDate() {
//		int date =27;
		WebElement setDate = locateElement("xpath", "//div[contains(text(),'27')]");
		click(setDate);
		return this;
	}
	/*@And("verify birthday")
	public MutualfundsSelectBirthday verifyBirthDay() {
		WebElement verifyDate = locateElement("class", "Calendar_highlight_xftqk");
		System.out.println("Birthday is: "+getText(verifyDate));
		return this;
	}*/
	@And("click continue")
	public MutualfundsSelectBirthday clickContinue() {
		WebElement clickContinue = locateElement("xpath", "//a[text()='Continue']");
		click(clickContinue);
		return this;
	}
	/*@And("type annual income (.*)")
	public MutualfundsSelectBirthday setAnnualIncome(String data) {
		WebElement annualIncome = locateElement("xpath", "//input[@name='netAnnualIncome']");
		type(annualIncome, data);
		return this;
	}
	
	@And("click annual income continue")
	public MutualBankAccount clickContinueIncome() {
		WebElement clickContinue = locateElement("xpath", "//a[text()='Continue']");
		click(clickContinue);
		return new MutualBankAccount();
	}*/

}
