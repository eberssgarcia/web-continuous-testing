package com.bdd.steps;

import com.bdd.page.GitPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.junit.Assert;

public class GitSteps {

    GitPage gitPage = new GitPage();

    @Dado("que abro la pagina de git")
    public void queAbroLaPaginaDeGit() throws Exception {
        gitPage.navigateToGit();
    }

    @Cuando("ingreso mis datos de usuario")
    public void ingresoMisDatosDeUsuario() {
        gitPage.writeUser();
        gitPage.writePassword();
        gitPage.clickLogin();
    }

    @Entonces("valido que el mensaje de error: {string}")
    public void validoQueElMensajeDeError(String arg0) {
        Assert.assertEquals(arg0, gitPage.validateMessageResult());
    }
}
