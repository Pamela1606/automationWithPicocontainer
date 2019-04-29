package org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Hotels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class HotelPage extends BasePage {

    @FindBy(css = "div.panel-heading")
    private WebElement titleHotelPage;

    @FindBy(css = "button[type='submit']")
    private WebElement addHotelButton;

    @FindBy(css = "tbody > tr:nth-child(1) > td:nth-child(5) a")
    private WebElement nameHotel;

    public String getTitleHotelPage() {
        String titleHotelPageActual = CommonEvents.getTextContent(titleHotelPage);
        return titleHotelPageActual.toUpperCase();
    }

    public AddHotelPage clickAddButton() {
        CommonEvents.clickButton(addHotelButton);
        return new AddHotelPage();
    }

    public String getNameHotel() {
        String nameHotelActual = CommonEvents.getTextContent(nameHotel);
        return nameHotelActual;
    }
}
