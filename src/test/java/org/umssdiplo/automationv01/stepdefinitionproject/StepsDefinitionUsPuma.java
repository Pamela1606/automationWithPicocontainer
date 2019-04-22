package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.POM_UsPUMA.Adidas;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionUsPuma {
    private Adidas adidas;


    @Given("^go UsPuma pagina cargada$")
    public  void loadPageUsPuma() throws Throwable {
        adidas = LoadPage.cargaPagina();
    }

    @And("^Hover Men link Header$")
    public void hoverMenLinkHeader() {
        adidas.hoverMenLink();
    }

    @And("^Click fubtbol link Tennis colum$")
    public void clickFubtbolLinkTennisColum() {
        adidas.clickFutbol();
    }
}
