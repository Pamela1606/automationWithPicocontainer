package org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airlines;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airlines.AddAirlines.AddAirlinesPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;


public class AirlinesPage extends BasePage {

    @FindBy(css=".btn-success:nth-child(2)")
    private WebElement addButton;

    public AddAirlinesPage clickAddButton(){
        CommonEvents.waitWebElementIsVisible(addButton);
        CommonEvents.clickButton(addButton);
        return new AddAirlinesPage();
    }
}
