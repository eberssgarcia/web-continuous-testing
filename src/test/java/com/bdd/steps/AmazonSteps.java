package com.bdd.steps;

import com.bdd.page.AmazonPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AmazonSteps {

    AmazonPage amazonPage = new AmazonPage();

    @Given("the user navigates to www.amazon.com")
    public void navigateToAmazon() {
        amazonPage.navigateToAmazon();
    }

    @And("searchs for {string}")
    public void searchsFor(String criteria) {
        amazonPage.enterSearchCriteria(criteria);
        amazonPage.clickSearch();
    }

    @And("navigates to page number {string}")
    public void navigatesToTheSenondPage(String pageNumber) {
        amazonPage.goToPage(pageNumber);
    }

    @And("selects the thrid item")
    public void selectsTheThridItem() {
        amazonPage.pick3rdItem();
    }

    @Then("the user is able to add it to the card")
    public void theUserIsAbleToAddItToTheCard() {
        amazonPage.addToCart();
        Assert.assertEquals("Agregado al carrito", amazonPage.addedToCartMessage());
    }
}
