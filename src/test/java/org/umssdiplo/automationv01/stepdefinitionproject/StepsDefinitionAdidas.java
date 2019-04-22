package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.POM_Adidas.Adidas;
import org.umssdiplo.automationv01.core.managepage.POM_Adidas.Hombre.Futbol.Calzado.Carrito.Carrito;
import org.umssdiplo.automationv01.core.managepage.POM_Adidas.Hombre.Futbol.Calzado.Tenis;
import org.umssdiplo.automationv01.core.managepage.POM_Adidas.Hombre.Futbol.Futbol;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionAdidas {
    private Adidas adidas;
    private Futbol futbolPage;
    private Tenis tenisPage;
    private Carrito carritoPage;

    @Given("^go Adidas pagina cargada$")
    public void loadPageAdidas() throws Throwable {
        adidas = LoadPage.cargaPagina();
    }

    @And("^Hover Men link Header$")
    public void hoverMenLinkHeader() throws Throwable {
        adidas.hoverMenLink();
    }

    @And("^Click fubtbol link Tennis column$")
    public void clickFubtbolLinkTennisColum() throws Throwable {
        futbolPage = adidas.clickFutbol();
    }

    @And("^Obetener valores del primer calzado de futbol$")
    public void obtenerValores() throws Throwable {
        futbolPage.obtenerValores();
    }

    @And("^Click Calzado de Fútbol X 18.3 TF$")
    public void clickCalzadoDeFútbolXTF() throws Throwable {
        tenisPage = futbolPage.clickCalzado();
    }

    @And("^seleccionar talla MX 9.5$")
    public void seleccionarTalla() throws Throwable {
        tenisPage.selectTalla();
    }

    @And("^Click añadir a carrito button$")
    public void clickAñadirACarritoButton() throws Throwable {
        tenisPage.clickAniadirCarrito();
    }

    @And("^Verify cantidad \"([^\"]*)\"$")
    public void verificarCantidadCantidad(String arg0) throws Throwable {
        String actual = tenisPage.getCantidadTenis();
        String esperado = arg0;
        Assert.assertEquals(esperado,actual);
    }

    @And("^Click ver carrito link$")
    public void clickVerCarritoLink() {
        carritoPage = tenisPage.clickVerCarrito();
    }

    @And("^Verify \"([^\"]*)\" title is displayed$")
    public void verifyTitleIsDisplayed(String arg0) throws Throwable {
        String esperado = arg0;
        String actual = carritoPage.getTitleTenis();
        Assert.assertEquals(esperado,actual);
    }

    @And("^Price should be \"([^\"]*)\"$")
    public void priceShouldBe(String arg0) throws Throwable {
        String esperado = arg0;
        String actual = carritoPage.getPrecioActual();
        Assert.assertEquals(esperado,actual);
    }

    @And("^Total should be \"([^\"]*)\"$")
    public void totalShouldBe(String arg0) throws Throwable {
        String esperado = arg0;
        String actual = carritoPage.getTotalActual();
        Assert.assertEquals(esperado,actual);
    }
}
