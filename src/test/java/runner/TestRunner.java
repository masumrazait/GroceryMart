package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", glue = "stepDefinition",
        plugin = {"html:Report/cucumber-reports.html","json:Report/cucumber-reports.json"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
