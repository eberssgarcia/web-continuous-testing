package com.bdd.page;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ListPage extends BasePage {

    // Xpaths
    private String searchField = "//body/form[1]/input[1]";
    private String searchResults = "name";

    public ListPage() {
        super(driver);
    }

    public void iNavigateToTheListPage() {
        navigateTo("");
    }

    public void iSearchTheList() throws InterruptedException {
        try {
            Thread.sleep(600); // El sistema se frene por 600 milisegundos
            write(searchField, "Washington");
        } catch (NoSuchElementException e) {
            System.out.println("The WebElement search field couldn`t be found.");
            e.printStackTrace();
        }
    }

    // Creamos un metodo de tipo String por que bringMeAllElements nos trae todos los elementos de la lista.
    // Lo que hacemos con este metodo es si "Washington" esta en la lista.
    public List<String> getAllSearchResults() {
        List<WebElement> list = bringMeAllElements(searchResults);
        List<String> stringsFromList = new ArrayList<>();
        for (WebElement e : list) {
            stringsFromList.add(e.getText());
        }
        return stringsFromList;
    }
}
