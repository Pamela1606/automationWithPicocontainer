package org.umssdiplo.automationv01.core.managepage.POM_Adidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.POM_Adidas.Hombre.Futbol.Futbol;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Adidas extends BasePage {

    @FindBy(linkText = "HOMBRE")
    private WebElement linkHombre;

    @FindBy(xpath = " //li/a[contains(text(),'Fútbol')]")
    private WebElement linkFutbol;

    public Adidas  hoverMenLink() {
        CommonEvents.hoverOnElement(linkHombre);
        return this;
    }

    public Futbol clickFutbol() {
        CommonEvents.clickButton(linkFutbol);
        return new Futbol();
    }
}
