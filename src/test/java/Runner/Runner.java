package Runner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/resources/Feature/Login.feature", glue="src/test/java/Runner")
public class Runner extends AbstractTestNGCucumberTests
{

	
}
