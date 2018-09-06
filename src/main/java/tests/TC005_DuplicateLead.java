package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.MyHomePage;
import pages.MyLeadsPage;
import wdMethods.ProjectMethods;

public class TC005_DuplicateLead extends ProjectMethods {
	@BeforeClass
	public void setData() {
		testCaseName = "TC003_DeleteLead";
		testCaseDescription ="Delete a lead";
		category = "Smoke";
		author= "Babu";
		dataSheetName="DuplicateLead";
	}
	@Test(dataProvider="fetchData")
	public  void duplicateLead(String cname, String fname, String lname, String email, String title) throws InterruptedException    {
		String emailid = new MyHomePage()
				.clickLeads()
				.clickCreateLead()
				.typeCompanyName(cname)
				.typeFirstName(fname)
				.typeLastName(lname)
				.typeEmail(email)
				.clickCreateLead()
				.getEmail();
		System.out.println("Name: "+emailid);

		new MyLeadsPage().clickFindLeadsLink().clickEmail(emailid).clickFindLeadsButton().clickLeadIDLink()
		.clickDuplicate().typeTitle(title).clickSubmit().verifyDuplicateLead();




	}

}
