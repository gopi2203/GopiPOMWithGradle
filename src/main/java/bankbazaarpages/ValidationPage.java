package bankbazaarpages;

import java.util.List;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class ValidationPage extends ProjectMethods{
	@Then("print scheme name and amount")
public ValidationPage validateSchemes() {
	List<WebElement> allSchemes = driver.findElementsByClassName("js-offer-name");
	for (WebElement eachScheme : allSchemes) {
		System.out.println(eachScheme.getText());
		WebElement eleAmount = driver.findElementByXPath("//span[contains(text(),'"+eachScheme.getText()+"')]/following::span[@class='fui-rupee bb-rupee-xs']/..");
		System.out.println(eleAmount.getText());
	}
	return this;
}
}
