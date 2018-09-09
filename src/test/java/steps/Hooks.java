package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends SeMethods{
	@Before
	public void beforeCucumber(Scenario sc) {
		/*System.out.println("Scenario name: "+sc.getName());
		System.out.println("Scenario ID: "+sc.getId());*/
		startResult();
		testCaseName = sc.getName();
		testCaseDescription =sc.getId();
		category = "Smoke";
		author= "Babu";
		startTestCase();
		startApp("chrome","https://www.bankbazaar.com");
		
	}
	@After
	public void afterCucumber(Scenario sc) {
//		System.out.println("Status: "+sc.getStatus());
		closeAllBrowsers();
		stopResult();
	}
}
