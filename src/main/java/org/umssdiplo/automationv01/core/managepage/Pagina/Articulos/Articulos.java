package org.umssdiplo.automationv01.core.managepage.Pagina.Articulos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Pagina.Articulos.añadirArticulo.AddArticulo;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Articulos extends BasePage {

    @FindBy( xpath = "/html/body/app-root/app-articulos/div[1]/a/div[1]")
    private WebElement clickAniadirArticulo;

    public AddArticulo clickAniadir(){
        CommonEvents.jsClickElement(clickAniadirArticulo);
        return new AddArticulo();
    }
}
