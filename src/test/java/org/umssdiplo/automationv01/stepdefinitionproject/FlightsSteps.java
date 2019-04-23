package org.umssdiplo.automationv01.stepdefinitionproject;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;


public class FlightsSteps {

    private Login login;

    @Given("^'pagina PHP travel' esta cargando$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^llenar credentiales en pagina 'Login'$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentials();
    }


}
