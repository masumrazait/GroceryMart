package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage {
	public WebDriver driver;

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
    }

    By search = By.xpath("//input[@type='search']");
    By productName = By.cssSelector("h4.product-name");

    By AddToCart= By.xpath("//div[@class='products-wrapper']//div[@class='product-action']//button[@type='button']");
    By BagBtn= By.xpath("//a[@class='cart-icon']//img[@alt='Cart']");
    
    public void searchItem(String name) {
        driver.findElement(search).sendKeys(name);
    }

    public void getSearchText() {
        driver.findElement(search).getText();
    }

    public void AddToCart() {
        driver.findElement(AddToCart).click();
    }
    
    public void BagBtn() {
        driver.findElement(BagBtn).click();
    }

}
