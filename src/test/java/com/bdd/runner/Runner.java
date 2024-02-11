package com.bdd.runner;


import com.bdd.Util;
import com.bdd.page.BasePage;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/build/cucumber.json"},
        features = {"src/test/resources/feature"},
        glue = {"com.bdd.steps"},
        stepNotifications = true,
        tags = "@blazedemo-001",
        monochrome = true)

public class Runner {

    @BeforeClass
    public static void beforeExecution() {
        Util.logger(Runner.class).info("BEFORE >>>>>>>>>>>>>>>>>>");
    }

    @AfterClass
    public static void afterExecution() {
        Util.logger(Runner.class).info("AFTER >>>>>>>>>>>>>>>>>>");
        BasePage.closeDriver();
    }
}
