package com.bdd.steps;

import com.bdd.Util;
import page.BlazedemoPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.Assert;

public class BlazedemoSteps {

    BlazedemoPage blazedemoPage = new BlazedemoPage();

    @Dado("que el cliente ingresa a blazedemo")
    public void queElClienteIngresaABlazedemo() {
        blazedemoPage.openToBlazedemo();
    }

    @Y("selecciona {string} y {string}")
    public void seleccionaY(String origen, String destino) {
        blazedemoPage.seleccionDeOrigen(origen);
        blazedemoPage.seleccionDeDestino(destino);
        blazedemoPage.clicToFindFlights();
    }

    @Y("selecciona el vuelo con la aerolinea")
    public void seleccionaElVueloConLaAerolinea() {
        blazedemoPage.seleccionDeAerolinea();
    }

    @Cuando("completa todos los inputs requeridos correctamente")
    public void completaTodosLosInputsRequeridosCorrectamente(DataTable dataTable) {
        String name = Util.getValueFromDataTable(dataTable, "name");
        String address = Util.getValueFromDataTable(dataTable, "address");
        String city = Util.getValueFromDataTable(dataTable, "city");
        String state = Util.getValueFromDataTable(dataTable, "state");
        String zipCode = Util.getValueFromDataTable(dataTable, "zipCode");
        String cardType = Util.getValueFromDataTable(dataTable, "cardType");
        String creditCardNumber = Util.getValueFromDataTable(dataTable, "creditCardNumber");
        String month = Util.getValueFromDataTable(dataTable, "month");
        String year = Util.getValueFromDataTable(dataTable, "year");
        String nameOfCard = Util.getValueFromDataTable(dataTable, "nameOfCard");

        blazedemoPage.typeName(name);
        blazedemoPage.typeAddress(address);
        blazedemoPage.typeCity(city);
        blazedemoPage.typeState(state);
        blazedemoPage.typeZipCode(zipCode);
        blazedemoPage.typeCardType(cardType);
        blazedemoPage.typeCreditCardNumnber(creditCardNumber);
        blazedemoPage.typeMonth(month);
        blazedemoPage.typeYear(year);
        blazedemoPage.typeNameOfCard(nameOfCard);

        blazedemoPage.clicToPucharseFlight();
    }

    @Entonces("mostrar mensaje de compra exitoso: {string}")
    public void mostrarMensajeDeCompraExitoso(String expectedMessage) {
        Assert.assertEquals(expectedMessage, blazedemoPage.validateMessageExpected());
    }
}
