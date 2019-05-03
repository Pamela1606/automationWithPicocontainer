package org.umssdiplo.automationv01.core.managepage.Dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.FlightsManager;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Dashboard extends BasePage {

    @FindBy(css = "#social-sidebar-menu > li:nth-child(8) > a")
    private WebElement flightMenu;


    @FindBy(css = "#logout strong")
    private WebElement logoutButton;

    public FlightsManager clickFlightMenu() {
        CommonEvents.waitWebElementClickable(flightMenu);
        CommonEvents.clickButton(flightMenu);
        return new FlightsManager();
    }


    public Login closeSesion() {
        CommonEvents.forceWait(3000);
        CommonEvents.waitWebElementClickable(logoutButton);
        CommonEvents.clickButton(logoutButton);
        return new Login();
    }

}
