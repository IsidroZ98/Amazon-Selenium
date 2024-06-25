package com.revature.steps;

import com.revature.TestDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;

public class ProductSearchAndVerification {

    @Given("The user is in the home page")
    public void the_user_is_in_the_home_page() {
        TestDriver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        Assert.assertTrue(TestDriver.driver.getTitle(),true );
    }

    @When("The user enters {string} into search tab")
    public void the_user_enters_into_search_tab(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The user clicks the search button")
    public void the_user_clicks_the_search_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The user should be redirected to a results page for the item")
    public void the_user_should_be_redirected_to_a_results_page_for_the_item() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
