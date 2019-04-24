package org.umssdiplo.automationv01.core.managepage.Dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Routes.RoutesPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Dashboard extends BasePage {

    @FindBy(css="#social-sidebar-menu > li:nth-child(8) > a")
    private WebElement flightMenu;
    @FindBy(css="#Flights > li:nth-child(1) > a")
    private WebElement flightMenuRoutes;

    public Dashboard clickFlighMenu() {
        CommonEvents.clickButton(flightMenu);
        return this;
    }

    public RoutesPage clickFlighMenuRoutes() {
        CommonEvents.clickButton(flightMenuRoutes);
        return new RoutesPage();
    }
}
