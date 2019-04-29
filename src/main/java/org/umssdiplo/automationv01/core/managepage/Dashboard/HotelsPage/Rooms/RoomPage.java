package org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Hotels.Rooms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class RoomPage extends BasePage {

    @FindBy(css = "div.panel-heading")
    private WebElement titleHotelPage;

    public String getTitleHotelPage() {
        String titleHotelPageActual = CommonEvents.getTextContent(titleHotelPage);
        return titleHotelPageActual.toUpperCase();
    }

}
