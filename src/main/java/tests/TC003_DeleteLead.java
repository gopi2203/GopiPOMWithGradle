package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class TC003_DeleteLead extends ProjectMethods {
	@BeforeClass
	public void setData() {
		testCaseName = "TC003_DeleteLead";
		testCaseDescription ="Delete a lead";
		category = "Smoke";
		author= "Babu";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public  void deleteLead(String firstName) throws InterruptedException   {
		new MyHomePage()
		.clickLeads()
		.clickFindLeads()
		.typeFirstName(firstName)
		.clickFindLeads()
		.clickLeadIDLink()
		.clickDelete();
		
		
//		click(locateElement("linktext", "Leads"));
//		click(locateElement("linktext", "Find Leads"));
//		click(locateElement("xpath", "//span[text()='Email']"));
//		type(locateElement("name", "emailAddress"),email);
//		click(locateElement("xpath", "//button[text()='Find Leads']"));
//		Thread.sleep(1000);
//		String leadId = getText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
//		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
//		click(locateElement("linktext", "Delete"));
//				
//		click(locateElement("linktext", "Find Leads"));
//		type(locateElement("name", "id"),leadId);
//		click(locateElement("xpath", "//button[text()='Find Leads']"));
//		Thread.sleep(1000);
//		WebElement eleVerify = locateElement("class", "x-paging-info");
//		verifyExactText(eleVerify, errorMsg);
	
	}

}
