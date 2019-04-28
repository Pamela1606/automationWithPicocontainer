package org.umssdiplo.automationv01.core.managepage.Dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.HotelPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Dashboard extends BasePage {


    @FindBy(css = "#social-sidebar-menu > li:nth-child(7) > a")
    private WebElement hotelMenu;

    @FindBy(css = "#Hotels > li:nth-child(1) > a")
    private WebElement hotelSubMenu;

    public Dashboard clickOptionHotelLateralMenu() {
        CommonEvents.waitWebElementClickable(hotelMenu);
        CommonEvents.clickButton(hotelMenu);
        return this;
    }

    public HotelPage clickSubOptionHotelLateralMenu() {
        CommonEvents.waitWebElementClickable(hotelSubMenu);
        CommonEvents.clickButton(hotelSubMenu);
        return new HotelPage();
    }
}
