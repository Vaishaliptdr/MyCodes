package StepsDefinition.Runner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {"src/test/resources/features/loginOrangeHRM.feature"}, // Path to feature files
    glue = {"StepsDefinition"},            // Package containing step definitions
    plugin = {"pretty", "html:target/cucumber-reports.html",
    		"json:target/cucumber-reports.json"} // Generate report
)
public class Runner extends AbstractTestNGCucumberTests {
}
