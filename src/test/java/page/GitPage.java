package page;

import com.bdd.Util;

import java.util.logging.Level;

public class GitPage extends BasePage {

    // Locator
    private String lblUser = "//input[@id='login_field']";
    private String lblPassword = "//input[@id='password']";
    private String btnLogin = "//body/div[1]/div[3]/main[1]/div[1]/div[4]/form[1]/div[1]/input[13]";
    private String messageError = "//body/div[1]/div[3]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]";

    // Contructor
    public GitPage() {
        super(driver);
    }

    // Methods
    public void navigateToGit() {
        navigateTo("https://github.com/login");
        driver.manage().window().maximize();
    }

    public void writeUser() {
        Util.logger(this.getClass()).log(Level.INFO, "Ingresando usuario.");
        write(lblUser, "eber");
    }

    public void writePassword() {
        Util.logger(this.getClass()).log(Level.INFO, "Ingresando password.");
        write(lblPassword, "12345");
    }

    public void clickLogin() {
        Util.logger(this.getClass()).log(Level.INFO, "Click en boton login.");
        clickElement(btnLogin);
    }

    public String validateMessageResult() {
        return getTextFromElement(messageError);
    }
}
