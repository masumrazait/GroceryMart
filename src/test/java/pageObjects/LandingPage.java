package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    public WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    By search = By.xpath("//input[@type='search']");
    By productName = By.cssSelector("h4.product-name");
    By TopDeals = By.linkText("Top Deals");

    public void searchItem(String name) {
        driver.findElement(search).sendKeys(name);

    }
    public void getSearchText(String name) {
        driver.findElement(search).getText();

    }
    public String getProductName() {
        return driver.findElement(productName).getText();
    }
    public void selectTopDealsPage() {
        driver.findElement(TopDeals).click();
    }

}
