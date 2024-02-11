package com.bdd.steps;

import com.bdd.page.TradeMePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class TradeMeSteps {

    TradeMePage tradeMePage = new TradeMePage();

    @Given("I navigate to the TradeMe Motor Page")
    public void navigateToTradeMeMotor() {
        tradeMePage.navigateToTradeMeMotor();
    }

    @Then("I can verifu that of car makes is {int}")
    public void retunrAmountOfMakes(int makeAmount) {
        int expectedAmount = makeAmount;
        int actualAmount = tradeMePage.makeDropdownSize();
        Assert.assertEquals(expectedAmount, actualAmount);
    }

}
