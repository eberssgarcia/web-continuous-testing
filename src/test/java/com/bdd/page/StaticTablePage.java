package com.bdd.page;

public class StaticTablePage extends BasePage {

    // Xpaths
    private String cell = "//*[@id='root']/div/";
    private String mainTable = "//*[@id='root']/div/table";

    public StaticTablePage() {
        super(driver);
    }

    public void navigateToGrid() {
        navigateTo("https://1v2njkypo4.csb.app/");
    }

    public String getValueFromGrid(int row, int colum) {
        return getVakueFromTable(cell, row, colum);
    }

    public boolean cellStatus() {
        return elemtIsDisplay(mainTable);
    }
}
