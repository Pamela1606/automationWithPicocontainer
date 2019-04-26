package org.umssdiplo.automationv01.core.managepage.Dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airports.AirportsPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airports.EditAirport.EditAirportPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Routes.RoutesPage;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Dashboard extends BasePage {

    @FindBy(css = "#social-sidebar-menu > li:nth-child(8) > a")
    private WebElement flightMenu;
    @FindBy(css = "#Flights > li:nth-child(1) > a")
    private WebElement flightMenuRoutes;

    @FindBy(css = "#Flights > li:nth-child(2) > a")
    private WebElement flightMenuAirports;

    @FindBy(css = "#logout strong")
    private WebElement logoutButton;

    public Dashboard clickFlighMenu() {
        CommonEvents.waitWebElementClickable(flightMenu);
        CommonEvents.clickButton(flightMenu);
        return this;
    }

    public RoutesPage clickFlighMenuRoutes() {
        CommonEvents.clickButton(flightMenuRoutes);
        return new RoutesPage();
    }

    public AirportsPage clickFlighMenuAirports() {
        CommonEvents.waitWebElementClickable(flightMenuAirports);
        CommonEvents.clickButton(flightMenuAirports);
        return new AirportsPage();
    }

    public Login closeSesion() {
        CommonEvents.clickButton(logoutButton);
        return new Login();
    }

}
