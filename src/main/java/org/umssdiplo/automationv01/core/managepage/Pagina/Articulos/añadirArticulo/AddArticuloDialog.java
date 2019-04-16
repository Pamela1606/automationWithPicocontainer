package org.umssdiplo.automationv01.core.managepage.Pagina.Articulos.añadirArticulo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.Articulo;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class AddArticuloDialog extends BasePage {

    @FindBy ( xpath = "//mat-dialog-container")
    private WebElement containerDialog;
    @FindBy( name = "nombre" )
    private WebElement elementNombre;
    @FindBy( name = "marca")
    private WebElement elementMarca;
    @FindBy( name = "modelo")
    private WebElement elementModelo;
    @FindBy( name = "capacidad")
    private WebElement elementCapacidad;
    @FindBy( name = "precio")
    private WebElement elementPrecio;
    @FindBy( name = "descripcion")
    private WebElement elementDescripcion;
    @FindBy ( name = "")
    private WebElement elementCategoria;
    @FindBy ( name = "")
    private WebElement elementTienda;

    public void esperarPopUp(){
        CommonEvents.waitWebElementVisible(containerDialog);
    }

/*    public void setElementNombre(String nombre) {
        this.elementNombre.sendKeys(nombre);
    }

    public void setElementMarca(String marca) {
        this.elementMarca.sendKeys(marca);
    }

    public void setElementCapacidad(String capacidad) {
        this.elementCapacidad.sendKeys(capacidad);
    }

    public void setElementPrecio(String precio) {
        this.elementPrecio.sendKeys(precio);
    }

    public void setElementDescripcion(String descripcion) {
        this.elementDescripcion.sendKeys(descripcion);
    }

    public void setElementCategoria(String categoria) {
        this.elementCategoria.sendKeys(categoria);
    }

    public void setElementTienda(String tienda) {
        this.elementTienda.sendKeys(tienda);
    }


    public void llenarDatos(Articulo articulo) {
        CommonEvents.setInputField( elementNombre, articulo.getNombre());
        CommonEvents.setInputField( elementMarca,articulo.getMarca());
        CommonEvents.setInputField( elementModelo,articulo.getModelo());
        CommonEvents.setInputField( elementCapacidad,articulo.getCapacidad());
        CommonEvents.setInputField( elementPrecio,articulo.getPrecio());
        CommonEvents.setInputField( elementDescripcion,articulo.getDescripcion());
    }*/
}
