package org.umssdiplo.automationv01.core.managepage.Pagina.Articulos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Pagina.Articulos.añadirArticulo.AddArticuloDialog;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Articulos extends BasePage {

    private AddArticuloDialog addArticuloDialog;

    @FindBy( xpath = "/html/body/app-root/app-articulos/div[1]/a/div[1]")
    private WebElement clickAniadirArticulo;

    public AddArticuloDialog clickAniadirArticulo(){
        CommonEvents.jsClickElement(clickAniadirArticulo);
        return  getAddArticuloDialog();
    }

    private AddArticuloDialog getAddArticuloDialog(){
        addArticuloDialog = new AddArticuloDialog();
        return addArticuloDialog;
    }

}
