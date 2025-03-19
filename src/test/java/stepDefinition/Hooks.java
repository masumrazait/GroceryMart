package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.TestContextSetup;

import java.io.IOException;

public class Hooks {
    TestContextSetup testContextSetup;

    public Hooks(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
    }

    @After
    public void afterScenario() throws IOException {
        System.out.println("All Test Cases executed");
        testContextSetup.testBase.WebDriverManager().quit();
    }

}
