package pagesObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectsManager {
    public LandingPage landingPage;
    public OfferPage offerPage;
    public WebDriver driver;

    public PageObjectsManager(WebDriver driver) {
        this.driver = driver;
    }

    public LandingPage getLandingPage() {
        landingPage = new LandingPage(driver);
        return landingPage;
    }

    public OfferPage getOfferPage() {
        offerPage = new OfferPage(driver);
        return offerPage;
    }
}
