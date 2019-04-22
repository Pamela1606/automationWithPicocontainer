package org.umssdiplo.automationv01.core.managepage.POM_UsPUMA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.POM_UsPUMA.PageShoes.PageSoccer.Futbol;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Adidas extends BasePage {

    @FindBy(linkText = "HOMBRE")
    private WebElement linkHombre;


    public void hoverMenLink() {
        CommonEvents.hoverOnElement(linkHombre);
    }

    public Futbol clickFutbol() {
        CommonEvents.jsClickElement("");
        return new Futbol();
    }
}
