package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class AddToCartStepDefinition {
	public WebDriver driver;
	TestContextSetup testContextSetup;

	public AddToCartStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
    }
	
	@When("user search product by shortname<Tom>")
	public void user_search_product_by_shortname_tom(String ProductName) {
		
		
	}

	@Then("user clicked on add to cart")
	public void user_clicked_on_add_to_cart() {
		
	}

	@Then("user click on bag")
	public void user_click_on_bag() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("user click on checkout the product")
	public void user_click_on_checkout_the_product() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
