package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", glue = "stepDefinition", monochrome = true,
        plugin = {"html:target/cucumber-reports.html","json:target/cucumber-reports.json"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
