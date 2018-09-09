package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

/*@CucumberOptions(features="src/test/java/feature/CreateLead.feature",glue= {"pages","steps"},monochrome=true, snippets=SnippetType.CAMELCASE)
@RunWith(Cucumber.class)*/
@CucumberOptions(features="src/test/java/feature/BankBazaar.feature",glue= {"bankbazaarpages","steps"},monochrome=true, snippets=SnippetType.CAMELCASE)
@RunWith(Cucumber.class)
public class RunTest {

}
