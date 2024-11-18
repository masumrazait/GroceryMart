package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import pagesObjects.LandingPage;
import utils.TestContextSetup;

import java.util.concurrent.TimeUnit;

public class LandingPagesStepDefinition {

    public String landingPageProductName;
    public String offerPageProductName;
    TestContextSetup testContextSetup;
    LandingPage landingPage;

    public LandingPagesStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
    }

    @Given("user is on GreenCart Landing page")
    public void user_is_on_green_cart_landing_page() {

    }

    @When("user searched with shortname {string} and extracted actual name of product")
    public void user_searched_with_shortname_and_extracted_actual_name_of_product(String ShortName) throws InterruptedException {
        landingPage.searchItem(ShortName);
        Thread.sleep(3000);
        testContextSetup.landingPageProductName = landingPage.getProductName().split("-")[0].trim();
        System.out.println(landingPageProductName + " is extracted from home page");
    }
}
