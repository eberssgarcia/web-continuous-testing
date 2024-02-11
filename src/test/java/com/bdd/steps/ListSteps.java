package com.bdd.steps;

import page.ListPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class ListSteps {
    ListPage listPage = new ListPage();

    @Given("I navigate to the list page")
    public void iNavigateToTheListPage() {
        listPage.iNavigateToTheListPage();
    }

    @When("I search the list")
    public void iSearchTheList() throws InterruptedException {
        listPage.iSearchTheList();
    }

    // Validamos si
    @Then("I can find the text in the list")
    public void iCanFindTheTextInTheList() {
        List<String> lista = listPage.getAllSearchResults(); // Creamos una lista conformado por todos los String de getAllSearchResults()
        boolean textInThere = lista.contains("Seattle, Washington");

        if (textInThere) {
            System.out.println("The text is on the list: PASSED.");
        } else {
            throw new Error("The text in not on the list: FAILED!");
        }
    }

}
