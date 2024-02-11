package com.bdd.steps;

import com.bdd.page.DemoblazePage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.Assert;

public class DemoblazeSteps {

    // Constructor
    DemoblazePage demoblazePage = new DemoblazePage();

    // Sign Up
    @Dado("que estoy en la plataforma Demoblaze")
    public void navigateToDemoblaze() {
        demoblazePage.navigateToDemoblaze();
    }

    @Y("luego ingreso a Sign Up")
    public void ingresoASignUp() {
        demoblazePage.clickSignUp();
    }

    @Cuando("completo los campos requeridos de {string} {string}")
    public void completoLosCamposRequeridosDe(String user, String password) {
        demoblazePage.enterCriteria(user, password);
        demoblazePage.clickBtnRegister();
    }

    @Entonces("validar que alerta de registro")
    public void validarQueAlertaDeRegistro() {
        Assert.assertEquals("Sign up successful.", demoblazePage.registerUserMessage());
    }

    // Log in
    @Y("luego ingreso a Log in")
    public void luegoIngresoALogIn() {
        demoblazePage.clickLogIn();
    }

    @Cuando("ingreso los campos requeridos de {string} {string}")
    public void ingresoLosCamposRequeridosDe(String user, String password) {
        demoblazePage.enterCriteriaLogIn(user, password);
        demoblazePage.clickBtnLogIn();
    }

    @Entonces("validar inicio de sesion con {string}")
    public void validarUsuarioLogeado(String user) {
        Assert.assertEquals("Welcome " + user, demoblazePage.logInValidateProfile());
    }

    @Y("hago clic en Log out")
    public void clicToLogOut() {
        demoblazePage.clicToLogOut();
    }

    // Add product
    @Cuando("agrego al carrito un {string}")
    public void agregoAlCarritoUn(String product) {
        demoblazePage.agregoAlCarritoUn(product);
        demoblazePage.addToCart();
    }

    @Entonces("validar que {string} se haya agregado correctamente")
    public void validarQueSeHayaAgregadoCorrectamente(String product) {
        demoblazePage.clickToCart();
        demoblazePage.isProductAdded(product);
    }
}