package org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Hotels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Hotels.AddHotels.AddHotelPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Hotels.AddRooms.AddRoomPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Hotels.EditHotels.EditHotelPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Hotels.EditRooms.EditRoomPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class HotelPage extends BasePage {

    @FindBy(css = "div.panel-heading")
    private WebElement titleHotelPage;

    @FindBy(css = "button[type='submit']")
    private WebElement addHotelButton;

    @FindBy(css = "tbody > tr:nth-child(1) > td:nth-child(5) a")
    private WebElement nameHotel;

    @FindBy(css = "div.ui-pnotify-container h4")
    private WebElement messagesNotification;

    @FindBy(css = "tbody > tr:nth-child(1) > td:nth-child(12) span a:nth-child(2)")
    private WebElement editHotelButton;

    @FindBy(css = "tbody > tr:nth-child(1) > td:nth-child(12) span a:nth-child(3)")
    private WebElement deleteHotelButton;

    @FindBy(css = "tbody > tr:nth-child(1) > td:nth-child(3) a")
    private WebElement roomType;

    @FindBy(css = "button[type='submit']")
    private WebElement addRoomButton;

    @FindBy(css = "tbody > tr:nth-child(1) > td:nth-child(11) span a:nth-child(1)")
    private WebElement editRoomButton;

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

    public EditHotelPage clickEditButton() {
        CommonEvents.clickButton(editHotelButton);
        return new EditHotelPage();
    }

    public String getMessageNotification() {
        String messageActual = CommonEvents.getTextContent(messagesNotification);
        return messageActual;
    }

    public HotelPage clickDeleteOptionButton() {
        CommonEvents.clickButton(deleteHotelButton);
        return this;
    }

    public HotelPage clickOkButtonToDelete() {
        CommonEvents.acceptDialog();
        return this;
    }

    public AddRoomPage clickAddButtonRoom() {
        CommonEvents.clickButton(addRoomButton);
        return new AddRoomPage();
    }

    public String getRoomType() {
        String roomTypeActual = CommonEvents.getTextContent(roomType);
        return roomTypeActual;
    }

    public EditRoomPage clickEditButtonRoom() {
        CommonEvents.clickButton(editRoomButton);
        return new EditRoomPage();
    }
}
