package com.bdd.page;

import com.bdd.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Level;

public class DemoblazePage extends BasePage {

    // Xpath - Sign Up
    private String singUp = "//a[@id='signin2']";
    private String registerUsername = "//input[@id='sign-username']";
    private String registerPassword = "//input[@id='sign-password']";
    private String btnSingUp = "//button[contains(text(),'Sign up')]";
    // Xpath - Log In
    private String logIn = "//a[@id='login2']";
    private String logInUsername = "//input[@id='loginusername']";
    private String logInPassword = "//input[@id='loginpassword']";
    private String btnLogIn = "//button[contains(text(),'Log in')]";
    private String userProfile = "//a[@id='nameofuser']";
    private String logOut = "//a[@id='logout2']";
    // Add product
    private String btnAddToCart = "//a[contains(text(),'Add to cart')]";
    private String cart = "//a[@id='cartur']";

    public DemoblazePage() {
        super(driver);
    }

    // Methods
    public void navigateToDemoblaze() {
        navigateTo("https://www.demoblaze.com/");
        driver.manage().window().maximize();
    }

    public void clickSignUp() {
        Util.logger(this.getClass()).log(Level.INFO, "Clic en el boton Sign Up.");
        clickElement(singUp);
    }

    public void enterCriteria(String user, String password) {
        Util.logger(this.getClass()).log(Level.INFO, "Ingresando usuario..");
        write(registerUsername, user);
        Util.logger(this.getClass()).log(Level.INFO, "Ingresando password");
        write(registerPassword, password);
    }

    public void clickBtnRegister() {
        Util.logger(this.getClass()).log(Level.INFO, "Clic en el boton Sign Up.");
        clickElement(btnSingUp);
    }

    public String registerUserMessage() {
        return getAlertText();
    }

    // Log In
    public void clickLogIn() {
        Util.logger(this.getClass()).log(Level.INFO, "Clic en el boton Login.");
        clickElement(logIn);
    }

    public void enterCriteriaLogIn(String user, String password) {
        write(logInUsername, user);
        write(logInPassword, password);
    }

    public void clickBtnLogIn() {
        Util.logger(this.getClass()).log(Level.INFO, "Clic en el boton Login.");
        clickElement(btnLogIn);
    }

    public String logInValidateProfile() {
        try {
            return getTextFromElement(userProfile);
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    public void clicToLogOut() {
        Util.logger(this.getClass()).log(Level.INFO, "Clic en el boton Logout.");
        clickElement(logOut);
    }

    // Add product
    public void agregoAlCarritoUn(String product) {
        By productLocator = By.xpath("//body/div[@id='contcont']/div[1]/div[2]/div[1]/div/div[1]/div[1]/h4[1]");
        waitForElementToBeVisible(productLocator);
        List<WebElement> productElements = driver.findElements(productLocator);
        for (WebElement productElement : productElements) {
            String productName = productElement.getText();
            if (product.contains(productName)) {
                Util.logger(this.getClass()).log(Level.INFO, "Seleccionando el producto --> ");
                productElement.click();
                return;
            }
        }
    }

    public void addToCart() {
        Util.logger(this.getClass()).log(Level.INFO, "Agregando producto al carrito.");
        clickElement(btnAddToCart);
        acceptAlert();
    }

    public void clickToCart() {
        clickElement(cart);
    }

    public boolean isProductAdded(String product) {
        By productLocator = By.xpath("//*[@id='tbodyid']/tr/td[2]");
        waitForElementToBeVisible(productLocator);
        List<WebElement> productElements = driver.findElements(productLocator);
        for (WebElement productElement : productElements) {
            String productName = productElement.getText();
            if (product.equals(productName)) {
                return true;
            }
        }
        return false;
    }
}





