package stepDefinition;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class OfferPageStepDefinition {
    TestContextSetup testContextSetup;
    PageObjectManager pageObjectManager;
    public String offerPageProductName;

    public OfferPageStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
    }

    @Then("user searched for {string} shortname in offers page")
    public void user_searched_for_same_shortname_in_offers_page(String shortname) {
        switchToOffersPage();
        OffersPage offersPage = testContextSetup.pageObjectManager.OffersPage();
        offersPage.searchItem(shortname);
        offerPageProductName = offersPage.getProductName();
        System.out.println(offerPageProductName + " is extracted from the Offers page");
    }

    public void switchToOffersPage() {
        //if (testContextSetup.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers"))
        //pageObjectManager = new PageObjectManager(testContextSetup.driver);
        LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
        landingPage.selectTopDealsPage();
        testContextSetup.genericUtils.SwitchWindowToChild();
    }

    @Then("validate product name in offer page matches with Landing Page")
    public void validate_product_name_in_offer_page_matches_with_Landing_Page() {
        Assert.assertEquals(offerPageProductName, testContextSetup.landingPageProductName);
    }

}
