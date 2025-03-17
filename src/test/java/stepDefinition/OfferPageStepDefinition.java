package stepDefinition;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import utils.TestContextSetup;

import java.util.Iterator;
import java.util.Set;

public class OfferPageStepDefinition {
    TestContextSetup testContextSetup;
    public String offerPageProductName;

    public OfferPageStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
    }

    @Then("user searched for {string} shortname in offers page")
    public void user_searched_for_same_shortname_in_offers_page(String shortname) {
        switchToOffersPage();
        OffersPage offersPage = new OffersPage(testContextSetup.driver);
        offersPage.SearchItem(shortname);
        offerPageProductName = offersPage.getProductName();
        System.out.println(offerPageProductName + " is extracted from the Offers page");
    }

    public void switchToOffersPage() {
        //if (testContextSetup.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers"))
        LandingPage landingPage = new LandingPage(testContextSetup.driver);
        landingPage.selectTopDealsPage();
        Set<String> windows = testContextSetup.driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentWindow = it.next();
        String childWindow = it.next();
        testContextSetup.driver.switchTo().window(childWindow);
    }

    @Then("validate product name in offer page matches with Landing Page")
    public void validate_product_name_in_offer_page_matches_with_Landing_Page() {
        Assert.assertEquals(offerPageProductName, testContextSetup.landingPageProductName);
        testContextSetup.driver.quit();
    }


}
