package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GreenKartStepDefinition {


    @Given("User is on GreenCart Landing page")
    public void user_is_on_green_cart_landing_page() {
        System.out.println("User is on GreenCart Landing page");
    }

    @When("user searched with Shortname {string} and extracted actual name of product")
    public void user_searched_with_shortname_and_extracted_actual_name_of_product(String string) {
        System.out.println("User searched with Shortname " + string + " and extracted actual name of product");
    }

    @Then("user searched for same shortname in offers page to check if product exits")
    public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exits() {
        System.out.println("User searched for same shortname in offers page to check if product exits");
    }


}
