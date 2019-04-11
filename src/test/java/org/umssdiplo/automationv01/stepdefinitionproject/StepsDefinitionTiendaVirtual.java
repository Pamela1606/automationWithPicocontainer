package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Pagina.Articulos.Articulos;
import org.umssdiplo.automationv01.core.managepage.Pagina.Articulos.añadirArticulo.AddArticulo;
import org.umssdiplo.automationv01.core.managepage.Pagina.Pagina;
import org.umssdiplo.automationv01.core.utils.CargarPagina;

public class StepsDefinitionTiendaVirtual {

    private Pagina pagina;
    private Articulos articulos = new Articulos();
    private AddArticulo addArticulo = new AddArticulo();

    @Given("^'Cargar pagina'$")
    public void tiendaVirtualCargarPagina() throws Throwable {
        this.pagina = CargarPagina.cargar();
    }

    @Given("^'Click articulos'$")
    public void clickOnArticulos() throws Throwable{
        this.pagina.clickOptionArticulos();
    }

    @And("^'Click Aniadir Articulo'$")
    public void clickOnAniadirArticulo() throws Throwable {
        articulos.clickAniadir();
    }

    @And("^'Aniadir Articulo'$")
    public void setAddArticulo(){
        addArticulo.setElements();
    }

}
