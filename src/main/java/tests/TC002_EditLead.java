package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class TC002_EditLead extends ProjectMethods {
	
	@BeforeClass
	public void setData() {
		testCaseName = "TC001_CreateLead";
		testCaseDescription ="Create a lead";
		category = "Smoke";
		author= "Babu";
		dataSheetName="TC002";
	}
	@Test(dataProvider="fetchData")
	public  void editLead(String firstName,String updateFirstName) throws InterruptedException   {
		new MyHomePage()
		.clickLeads()
		.clickFindLeads()
		.typeFirstName(firstName)
		.clickFindLeads()
		.clickLeadIDLink()
		.clickEdit()
		.typeFirstName(updateFirstName)
		.clickUpdate();
		
		
	}
	

}
