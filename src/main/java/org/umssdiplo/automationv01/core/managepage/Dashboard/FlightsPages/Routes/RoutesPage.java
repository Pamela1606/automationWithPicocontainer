package org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Routes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Routes.AddRoute.AddRoutePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class RoutesPage extends BasePage {

    @FindBy(css=".add_button > .btn")
    private WebElement addRouteButton;

    public AddRoutePage clickAddButton() {
        CommonEvents.clickButton(addRouteButton);
        return new AddRoutePage();
    }
}
