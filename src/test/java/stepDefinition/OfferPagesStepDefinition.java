package stepDefinition;

import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.OfferPage;
import pageObjects.PageObjectsManager;
import utils.TestContextSetup;

public class OfferPagesStepDefinition {
    public String offerPageProductName;
    TestContextSetup testContextSetup;
    PageObjectsManager pageObjectsManager;


    public OfferPagesStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
    }

    @Then("user searched for {string} shortname in offers page")
    public void user_searched_for_shortname_in_offers_page(String ShortName) throws InterruptedException {
        switchToOffersPage();
        Thread.sleep(3000);
        OfferPage offerPage = testContextSetup.pageObjectsManager.getOfferPage();
        offerPage.searchItem(ShortName);
        offerPageProductName = offerPage.getProductName();
        System.out.println(offerPageProductName + " has been extracted from the offersPage product.");
    }

    public void switchToOffersPage() throws InterruptedException {
        LandingPage landingPage = testContextSetup.pageObjectsManager.getLandingPage();
        landingPage.selectTopDeals();
        Thread.sleep(3000);
        testContextSetup.genericUtils.SwitchWindowToChild();
    }

    @Then("validate product name in offers page match with landing page")
    public void validate_product_name_in_offers_page_match_with_landing_page() throws InterruptedException {
        Thread.sleep(3000);
        if (offerPageProductName.equals(testContextSetup.landingPageProductName)) {
            System.out.println("The homePage product matches the offerPage product.");
        } else {
            System.out.println("The homePage product is different from the offerPage product.");
        }
    }
}