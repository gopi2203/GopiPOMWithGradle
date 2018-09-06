package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.MyHomePage;
import pages.MyLeadsPage;
import wdMethods.ProjectMethods;

public class TC004_MergeLead extends ProjectMethods {
	@BeforeClass
	public void setData() {
		testCaseName = "TC003_DeleteLead";
		testCaseDescription ="Delete a lead";
		category = "Smoke";
		author= "Babu";
		dataSheetName="MergeLead";
	}
	@Test(dataProvider="fetchData")
	public  void mergeLead(String cname, String fname, String lname, String cname2, String fname2, String lname2) throws InterruptedException    {
		String FirstMergename = new MyHomePage()
				.clickLeads()
				.clickCreateLead()
				.typeCompanyName(cname)
				.typeFirstName(fname)
				.typeLastName(lname)
				.clickCreateLead()
				.getcName();
		System.out.println("Name: "+FirstMergename);

		String SecMergeName = new MyHomePage()
				.clickLeads()
				.clickCreateLead()
				.typeCompanyName(cname2)
				.typeFirstName(fname2)
				.typeLastName(lname2)
				.clickCreateLead()
				.getcName();
		System.out.println("Name: "+SecMergeName);

		new MyLeadsPage().clickMergeLeads().clickFirMergeIcon().typeLeadId(FirstMergename).clickFindLeadsButton().clickLeadIDLinkWithNoSnap().selectParentWindow()
		.clickSecMergeIcon().typeLeadId(SecMergeName).clickFindLeadsButton().clickLeadIDLinkWithNoSnap().selectParentWindow().clickMerge().acceptAlert();

		new MyLeadsPage().clickFindLeadsLink().typeLeadId(FirstMergename).clickFindLeadsButton().verifyDeleteLead();


	}

}
