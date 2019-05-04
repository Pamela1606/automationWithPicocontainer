package org.umssdiplo.automationv01.core.managepage.Dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.ToursManagement;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Dashboard extends BasePage {

    @FindBy(css = "#social-sidebar-menu > li:nth-child(9) > a")
    private WebElement toursMenu;

    @FindBy(css = "#logout strong")
    private WebElement logoutButton;

    public ToursManagement clickToursMenu() {
        CommonEvents.waitWebElementClickable(toursMenu);
        CommonEvents.clickButton(toursMenu);
        return new ToursManagement();
    }

    public Login closeSesion() {
        CommonEvents.forceWait(5000);
        CommonEvents.waitWebElementClickable(logoutButton);
        CommonEvents.clickButton(logoutButton);
        return new Login();
    }

}
