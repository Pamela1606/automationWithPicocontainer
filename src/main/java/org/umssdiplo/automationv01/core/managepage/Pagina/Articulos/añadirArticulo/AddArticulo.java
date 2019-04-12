package org.umssdiplo.automationv01.core.managepage.Pagina.Articulos.añadirArticulo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class AddArticulo extends BasePage {


    @FindBy(xpath = "//*[@id=\"mat-input-6\"]")
    private WebElement elementNombre;
    @FindBy(xpath = "//*[@id=\"mat-input-7\"]")
    private WebElement elementMarca;
    @FindBy(xpath = "//*[@id=\"mat-input-8\"]")
    private WebElement elementCapacidad;
    @FindBy(xpath = "//*[@id=\"mat-input-9\"]")
    private WebElement elementPrecio;
    @FindBy(xpath = "//*[@id=\"mat-input-11\"]")
    private WebElement elementDescripcion;
    @FindBy(xpath = "//*[@id=\"mat-option-3\"]")
    private WebElement elementCategoria;
    @FindBy(xpath = "//*[@id=\"mat-option-0\"]")
    private WebElement elementTienda;

    public void insertarValores() {
        String nombre = " Nuevo Tractor";
        String marca = " Nueva Marca";
        String capacidad = "0";
        String precio = "15620";
        String descripcion = "Este es una nueva maquinaria";
        CommonEvents.setInputField(elementNombre,nombre);
        CommonEvents.setInputField(elementMarca, marca);
        CommonEvents.setInputField(elementCapacidad,capacidad);
        CommonEvents.setInputField(elementPrecio, precio);
        CommonEvents.setInputField(elementDescripcion,descripcion);
        CommonEvents.jsClickElement(elementCategoria);
/*        By by = By.xpath("//JHFAKSHF"+ NOMBRE+"")
        CommonEvents.clickElement(by);  */
    }
}
