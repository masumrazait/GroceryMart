package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
    public WebDriver driver;

    public OfferPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By search = By.xpath("//input[@type='search']");
    private final By productName = By.xpath("//table[@class='table table-bordered']/tbody/tr[1]/td");


    public void searchItem(String name) {
        driver.findElement(search).sendKeys(name);
    }

    public void getSearchText() {
        driver.findElement(search).getText();
    }

    public String getProductName() {
        return driver.findElement(productName).getText();
    }
}
