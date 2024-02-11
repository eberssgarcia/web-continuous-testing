package com.bdd.steps;

import com.bdd.page.SanboxPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class SanboxSteps {

    SanboxPage sanboxPage = new SanboxPage();

    @Given("I navigate to sandbox page")
    public void iNavigateToSandboxPage() {
        sanboxPage.navigateToSandbox();

    }

    @And("select a value from the dropdown")
    public void selectAValueFromTheDropdown() {
        sanboxPage.selectCategory("Manual");
    }

}
