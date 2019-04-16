package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Pagina.Pagina;
import org.umssdiplo.automationv01.core.utils.CargarPagina;

public class StepsDefinitionTiendaVirtual {

    private Pagina pagina;

    @Given("^'Cargar Pagina de \"Inicio\" '$")
    public void tiendaVirtualCargarPagina() throws Throwable {
        this.pagina = CargarPagina.cargar();
    }

    @Given("^redireccionar a la pagina '../articulos'$")
    public void clickOnArticulos() throws Throwable{
        this.pagina.clickOptionArticulos();
    }

    @And("^mostrar Formulario de articulos$")
    public void clickOnAniadirArticulo() throws Throwable {
        this.pagina.getArticulos().clickAniadirArticulo();
    }
    @And("^esperar Pop Up visible$")
    public void esperarPopUpAniadir() throws Throwable {
        this.pagina.getArticulos().clickAniadirArticulo().esperarPopUp();
    }



















    /* @And("^LLenar datos de articulo$")
    public void llenarDatosArticuloNuevo(String nombre, String marca, String modelo, String capacidad, String precio, String descripcion )  {
       AddArticuloDialog addArticuloDialog = new AddArticuloDialog();
        Articulo articulo = new Articulo();
        articulo.setNombre(nombre);
        articulo.setMarca(marca);
        articulo.setModelo(modelo);
        articulo.setCapacidad(capacidad);
        articulo.setPrecio(precio);
        articulo.setDescripcion(descripcion);
        addArticuloDialog.llenarDatos(articulo);
    }*/

}
