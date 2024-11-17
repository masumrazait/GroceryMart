package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectsManager {
    public LandingPage landingPage;
    public OfferPage offerPage;
    public WebDriver driver;

    public PageObjectsManager() {
        this.driver = driver;
    }

    public LandingPage getLandingPage() {
        LandingPage landingPage = new LandingPage(driver);
        return landingPage;
    }

    public OfferPage getOfferPage() {
        OfferPage offerPage = new OfferPage(driver);
        return offerPage;
    }
}
