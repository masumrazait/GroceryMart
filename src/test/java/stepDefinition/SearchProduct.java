package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SearchProduct {

    WebDriver driver;
    String ProductName;
    String ProductName2;


    @Given("I search for a product on the homepage using the shortname {string}")
    public void i_search_for_a_product_on_the_homepage_using_the_shortname(String ShortName) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(ShortName);
        Thread.sleep(3000);
    }

    @When("the product is visible on the grid and stored")
    public void the_product_is_visible_on_the_grid_and_stored() {
        ProductName = driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
        System.out.println(ProductName);

    }

    @Then("I search for the same product on the offer page using the shortname {string} and validate to the homepage product")
    public void i_search_for_the_same_product_on_the_offer_page_using_the_shortname_and_validate_to_the_homepage_product(String Name) {
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().window().maximize();
        driver.findElement(By.id("search-field")).sendKeys(Name);
        ProductName2 = driver.findElement(By.xpath("//table[@class='table table-bordered']/tbody/tr[1]/td")).getText();
        System.out.println(ProductName2);
        if (ProductName.equals(ProductName2)) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }
        System.out.println("Page Title is : " + driver.getTitle());
        System.out.println("Product Name is : " + ProductName);
        driver.close();

    }


}
