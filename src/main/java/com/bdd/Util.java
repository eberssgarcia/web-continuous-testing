package com.bdd;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.Scenario;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

import java.util.HashMap;
import java.util.logging.Logger;

public class Util {

    public static Logger logger(@NotNull Class clase) {
        return Logger.getLogger(clase.getName());
    }

    public static void screenshot(WebDriver driver, Scenario scenario) {
        takeScreenShotWeb(scenario, driver);
    }

    public static void takeScreenShotWeb(Scenario scenario, WebDriver driver) {
        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "evidencia");
    }

    public static String getValueFromDataTable(DataTable dataTable, String title) {
        List<Map<String, String>> data = dataTable.asMaps();
        for (Map<String, String> row : data) {
            if (row.containsKey(title)) {
                return row.get(title);
            }
        }
        return null; // or throw an exception if the title is not found
    }

}
