package com.bdd.steps;

import com.bdd.page.GooglePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GoogleSteps {

    // Instanciamos la clase GooglePage
    GooglePage googlePage = new GooglePage();


    @Given("^I am on the Google page$")
    public void iAmOnTheGooglePage() {
        googlePage.navigateToGoogle();
    }

    @When("I enter a search {string}")
    public void iEnterASearchCriteria(String textSend) {
        googlePage.enterSearchCriteria(textSend);
    }

    @And("^click on the search button$")
    public void clickOnTheSearchButton() {
        googlePage.clickGoogleSearch();
    }

    @Then("^the results match the criteria$")
    public void theResultsMatchTheCriteria() {
        Assert.assertEquals("Argentina - Wikipedia, la enciclopedia libre", googlePage.firstResult());
    }
}
