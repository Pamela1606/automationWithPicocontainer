package org.umssdiplo.automationv01.core.managepage.Pagina;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Pagina.Articulos.Articulos;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Pagina extends BasePage {

    @FindBy( xpath = "/html/body/app-root/app-cabecera/mat-toolbar/a[2]")
    private WebElement elementSelect;

    public Articulos clickOptionArticulos() {
        CommonEvents.jsClickElement(elementSelect);
        return new Articulos();
    }
}
