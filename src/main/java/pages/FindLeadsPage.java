package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{

	public FindLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(xpath="(//input[@name='firstName'])[3]")
	WebElement eleFirstName;
	
	public FindLeadsPage typeFirstName(String data) {
//		WebElement eleFirstName = locateElement("xpath", "(//input[@name='firstName'])[3]");
		type(eleFirstName, data);
		return this;
	}
	
	
	
	public FindLeadsPage clickFindLeads() {
		WebElement eleFindLeads = locateElement("xpath", "//button[text()='Find Leads']");
		click(eleFindLeads);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	
	public ViewLeadsPage clickLeadIDLink() throws InterruptedException {
		WebElement eleLeadIDLink = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		click(eleLeadIDLink);
		return new ViewLeadsPage();
	}
}









