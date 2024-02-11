package page;

import com.bdd.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.logging.Level;

public class BlazedemoPage extends BasePage {

    // Xpaths
    private String selectOrigen = "(//select[@name='fromPort'])";
    private String selectDestino = "(//select[@name='toPort'])";
    private String btnFindFlights = "(//input[@class='btn btn-primary'])";
    private String selectFlight = "//tbody/tr[1]/td[1]/input[1]";
    private String lblMessageExpected = "//h1[contains(text(),'Thank you for your purchase today!')]";

    private String lblName = "//input[@id='inputName']";
    private String lblAddress = "//input[@id='address']";
    private String lblCity = "//input[@id='city']";
    private String lblState = "//input[@id='state']";
    private String lblZipCode = "//input[@id='zipCode']";

    private String selectCardType = "(//select[@name='cardType'])";

    private String lblCreditCardNumber = "//input[@id='creditCardNumber']";
    private String lblCreditCardMonth = "//input[@id='creditCardMonth']";
    private String lblCreditCardYear = "//input[@id='creditCardYear']";
    private String lblNameOfCard = "//input[@id='nameOnCard']";

    private String btnPucharseFlight = "//input[@value='Purchase Flight']";

    public BlazedemoPage() {
        super(driver);
    }

    // Methods
    public void openToBlazedemo() {
        navigateTo("https://blazedemo.com");
        driver.manage().window().maximize();
    }

    public void seleccionDeOrigen(String origen) {
        Util.logger(this.getClass()).log(Level.INFO, "Haciendo clic en el Select --> {0}", origen);
        clickElement(selectOrigen);

        List<WebElement> scrollSelectOrigen = driver.findElements(By.cssSelector("select[name='fromPort'] option"));

        for (WebElement element : scrollSelectOrigen) {
            System.out.println(element.getText()); // Por ejemplo, imprimir el texto de cada elemento
            if (element.getText().equals(origen)) {
                element.click();
            }
        }
    }

    public void seleccionDeDestino(String destino) {
        Util.logger(this.getClass()).log(Level.INFO, "Haciendo clic en el Select --> {0}", destino);
        clickElement(selectDestino);

        List<WebElement> scrollSelectDestino = driver.findElements(By.cssSelector("select[name='toPort'] option"));

        for (WebElement element : scrollSelectDestino) {
            System.out.println(element.getText()); // Por ejemplo, imprimir el texto de cada elemento
            if (element.getText().equals(destino)) {
                element.click();
            }
        }
    }

    public void clicToFindFlights() {
        clickElement(btnFindFlights);
    }

    public void seleccionDeAerolinea() {
        clickElement(selectFlight);
    }

    public void typeName(String name) {
        Util.logger(this.getClass()).log(Level.INFO, "Haciendo clic en el Select --> {0}", name);
        write(lblName, name);
    }

    public void typeAddress(String address) {
        Util.logger(this.getClass()).log(Level.INFO, "Haciendo clic en el Select --> {0}", address);
        write(lblAddress, address);
    }

    public void typeCity(String city) {
        Util.logger(this.getClass()).log(Level.INFO, "Haciendo clic en el Select --> {0}", city);
        write(lblCity, city);
    }

    public void typeState(String state) {
        Util.logger(this.getClass()).log(Level.INFO, "Haciendo clic en el Select --> {0}", state);
        write(lblState, state);
    }

    public void typeZipCode(String zipCode) {
        Util.logger(this.getClass()).log(Level.INFO, "Haciendo clic en el Select --> {0}", zipCode);
        write(lblZipCode, zipCode);
    }

    public void typeCardType(String cardType) {

        Util.logger(this.getClass()).log(Level.INFO, "Haciendo clic en el Select --> {0}", cardType);
        clickElement(selectCardType);

        List<WebElement> scrollSelectCardType = driver.findElements(By.cssSelector("select[name='cardType'] option"));

        for (WebElement element : scrollSelectCardType) {
            System.out.println(element.getText()); // Por ejemplo, imprimir el texto de cada elemento
            if (element.getText().equals(cardType)) {
                element.click();
            }
        }
    }

    public void typeCreditCardNumnber(String creditCardNumber) {
        Util.logger(this.getClass()).log(Level.INFO, "Haciendo clic en el Select --> {0}", creditCardNumber);
        write(lblCreditCardNumber, creditCardNumber);
    }

    public void typeMonth(String month) {
        Util.logger(this.getClass()).log(Level.INFO, "Haciendo clic en el Select --> {0}", month);
        write(lblCreditCardMonth, month);
    }

    public void typeYear(String year) {
        Util.logger(this.getClass()).log(Level.INFO, "Haciendo clic en el Select --> {0}", year);
        write(lblCreditCardYear, year);
    }

    public void typeNameOfCard(String nameOfCard) {
        Util.logger(this.getClass()).log(Level.INFO, "Haciendo clic en el Select --> {0}", nameOfCard);
        write(lblNameOfCard, nameOfCard);
    }

    public void clicToPucharseFlight() {
        clickElement(btnPucharseFlight);
    }

    public String validateMessageExpected() {
        Util.logger(this.getClass()).log(Level.INFO, "Validando mensaje --> {0}", getTextFromElement(lblMessageExpected));
        return getTextFromElement(lblMessageExpected);
    }
}
