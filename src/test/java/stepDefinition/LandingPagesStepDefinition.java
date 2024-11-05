package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SearchProduct {

    WebDriver driver;
    String landingPageProductName;
    String offerPageProductName;


    @Given("user is on GreenCart Landing page")
    public void user_is_on_green_cart_landing_page() {
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @When("user searched with shortname {string} and extracted actual name of product")
    public void user_searched_with_shortname_and_extracted_actual_name_of_product(String ShortName) throws InterruptedException {
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(ShortName);
        Thread.sleep(3000);
        landingPageProductName = driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
        System.out.println(landingPageProductName + " is extracted from home page");
    }

    @Then("user searched for {string} shortname in offers page")
    public void user_searched_for_shortname_in_offers_page(String ShortName) {
        driver.findElement(By.linkText("Top Deals")).click();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        String parentWindow = i1.next();
        String childWindow = i1.next();
        driver.switchTo().window(childWindow);
        driver.findElement(By.id("search-field")).sendKeys(ShortName);
        offerPageProductName = driver.findElement(By.xpath("//table[@class='table table-bordered']/tbody/tr[1]/td")).getText();
        System.out.println(offerPageProductName + " is extracted from offers page");

    }

    @Then("validate product name in offers page match with landing page")
    public void validate_product_name_in_offers_page_match_with_landing_page() throws InterruptedException {
        Thread.sleep(3000);
        if (landingPageProductName.equals(offerPageProductName)) {
            System.out.println("Landing page product is matching to the offer page");
        } else {
            System.out.println("Landing page product is different");
        }
        driver.quit();
    }
}
