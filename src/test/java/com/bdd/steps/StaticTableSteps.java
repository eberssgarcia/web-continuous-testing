package com.bdd.steps;

import com.bdd.page.StaticTablePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class StaticTableSteps {

    StaticTablePage staticTablePage = new StaticTablePage();

    @Given("I navigate to static table")
    public void iNavigateToStaticTable() {
        staticTablePage.navigateToGrid();
    }

    @Then("I can return the I wanted")
    public void iCanReturnTheIWanted() {
        String value = staticTablePage.getValueFromGrid(3, 2);
        Assert.assertEquals("r: 2, c: 1", value);
    }

    @Then("I can validate the table is displayed")
    public void iCanValidateTheTableIsDisplayed() {
        Assert.assertTrue("El elemento esta siendo mostrado.", staticTablePage.cellStatus());
    }
}
