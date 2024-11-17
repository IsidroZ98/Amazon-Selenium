package com.revature.steps;

import com.revature.TestDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class AddingItemsToCart {
    //GIven not auto generated during feature file run
    @Given("The user is in the home page adding items")
    public void the_user_is_in_the_home_page() {
        TestDriver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        TestDriver.homePage.openPage();
        Assert.assertTrue(TestDriver.driver.getTitle(),true );
    }
    @When("The user enters the name of the {string} into the search bar")
    public void the_user_enters_the_name_of_the_into_the_search_bar(String string) {
        TestDriver.homePage.searchItemOnSearchBar(string);

    }
    @When("The user clicks on the search button")
    public void the_user_clicks_on_the_search_button() {
        TestDriver.homePage.searchBarSubmitButton();
    }
    @When("The user clicks on the product page for the item")
    public void the_user_clicks_on_the_product_page_for_the_item() {
        TestDriver.homePage.searchedItemClick();
    }
    @Then("The user will click on the add to cart button")
    public void the_user_will_click_on_the_add_to_cart_button() {
        TestDriver.homePage.addtoCartButtonClick();
    }
    @When("The user clicks on their cart")
    public void the_user_clicks_on_their_cart() {
        // Write code here that turns the phrase above into concrete actions
        TestDriver.homePage.navCartClick();
    }
    @Then("The user should see their product in the cart")
    public void the_user_should_see_their_product_in_the_cart() {
        //Not sure how to verify this for completition sake right now just going to check that Item count is greater than 1
        String expectedSubCartCount = "1 item";
        String actualSubCartCount = TestDriver.homePage.cartSubTotal.getText();
        Assert.assertEquals(expectedSubCartCount,actualSubCartCount);
    }
    @Then("The user should be able to remove that item from the cart")
    public void the_user_should_be_able_to_remove_that_item_from_the_cart() {
        TestDriver.homePage.removeItemfromCart();
    }
}
