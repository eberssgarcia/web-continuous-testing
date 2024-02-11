package page;

import com.bdd.Util;

import java.util.logging.Level;

public class GooglePage extends BasePage {
    // Xpaths
    private String searchTextField = "//textarea[@id='APjFqb']";
    private String searchButton = "//input[@value='Buscar con Google']";
    private String firstResult = "//h3[contains(text(),'Argentina - Wikipedia, la enciclopedia libre')]";


    public GooglePage() {
        super(driver);
    }

    // Estos metodos son publicos por que despues accederemos a los StepDefinition
    public void navigateToGoogle() {
        navigateTo("https://google.com/");
        driver.manage().window().maximize();
    }

    public void enterSearchCriteria(String criteria) {
        Util.logger(this.getClass()).log(Level.INFO, "Ingresando criterio de búsqueda.");
        write(searchTextField, criteria);
    }

    public void clickGoogleSearch() {
        clickElement(searchButton);
    }

    public String firstResult() {
        Util.logger(this.getClass()).log(Level.INFO, "Obteniendo valor.");
        return getTextFromElement(firstResult);
    }

}
