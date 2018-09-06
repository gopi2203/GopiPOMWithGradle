package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.MyHomePage;
import pages.MyLeadsPage;
import pages.ViewLeadsPage;
import wdMethods.ProjectMethods;

public class TC003_DeleteLead extends ProjectMethods {
	@BeforeClass
	public void setData() {
		testCaseName = "TC003_DeleteLead";
		testCaseDescription ="Delete a lead";
		category = "Smoke";
		author= "Babu";
		dataSheetName="DeleteLead";
	}
	@Test(dataProvider="fetchData")
	public  void deleteLead(String cname, String fname, String lname)    {
		try {
			String name= new MyHomePage()
					.clickLeads()
					.clickCreateLead()
					.typeCompanyName(cname)
					.typeFirstName(fname)
					.typeLastName(lname)
					.clickCreateLead()
					.getcName();
			System.out.println("Name: "+name);
			
			new ViewLeadsPage().clickDelete();
			
			new MyLeadsPage().clickFindLeadsLink().typeLeadId(name).clickFindLeadsButton().verifyDeleteLead();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
