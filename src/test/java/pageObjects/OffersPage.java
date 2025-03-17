package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
    public WebDriver driver;

    public OffersPage(WebDriver driver) {
        this.driver = driver;
    }

    private By search = By.xpath("//input[@type='search']");
    private By productName = By.xpath("//table[@class='table table-bordered']//tbody/tr[1]/td[1]");

    public void SearchItem(String name) {
        driver.findElement(search).sendKeys(name);

    }
    public void getSearchText(String name) {
        driver.findElement(search).getText();

    }
    public String getProductName() {
        return driver.findElement(productName).getText();
    }

}
