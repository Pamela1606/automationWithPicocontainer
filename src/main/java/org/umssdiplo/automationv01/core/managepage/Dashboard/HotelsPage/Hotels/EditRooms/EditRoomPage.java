package org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Hotels.EditRooms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Hotels.HotelPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;
import java.util.Map;

public class EditRoomPage extends BasePage {

    @FindBy(css = "a[href='#TRANSLATE'")
    private WebElement translateTab;

    @FindBy(css = "div#TRANSLATE div[id='cke_translated[ru][desc]'] iframe")
    private WebElement russianFrame;

    @FindBy(css = "div#TRANSLATE div[id='cke_translated[fa][desc]'] iframe")
    private WebElement farsiFrame;

    @FindBy(css = "div#TRANSLATE div[id='cke_translated[fr][desc]'] iframe")
    private WebElement frenchFrame;

    @FindBy(css = "div#TRANSLATE div[id='cke_translated[tr][desc]'] iframe")
    private WebElement turkishFrame;

    @FindBy(css = "div#TRANSLATE div[id='cke_translated[ar][desc]'] iframe")
    private WebElement arabicFrame;

    @FindBy(css = "div#TRANSLATE div[id='cke_translated[es][desc]'] iframe")
    private WebElement spanishFrame;

    @FindBy(css = "button#update")
    private WebElement submitButtonRoom;

    public EditRoomPage clickEditTranslate() {
        CommonEvents.clickButton(translateTab);
        return this;
    }

    public HotelPage updateDataFormOfTranslateTab(List<Map<String, String>> editDataRooms) {
        Map<String, String> dtForm = editDataRooms.get(0);

        CommonEvents.forceWait(9000);
        CommonEvents.setIframeContent(russianFrame, dtForm.get("Russian"));
        CommonEvents.setIframeContent(farsiFrame, dtForm.get("Farsi"));
        CommonEvents.setIframeContent(frenchFrame, dtForm.get("French"));
        CommonEvents.setIframeContent(turkishFrame, dtForm.get("Turkish"));
        CommonEvents.setIframeContent(arabicFrame, dtForm.get("Arabic"));
        CommonEvents.setIframeContent(spanishFrame, dtForm.get("Spanish"));

        CommonEvents.clickButton(submitButtonRoom);
        return new HotelPage();
    }


//    public HotelPage getFillGeneralTabFormHotel(List<Map<String, String>> valuesHotels) {
//        Map<String, String> dtForm = valuesHotels.get(0);
//        CommonEvents.setInputField(nameHotel, dtForm.get("Hotel Name"));
//
//        CommonEvents.forceWait(9000);
//        CommonEvents.setIframeContent(descripHotelFrame, dtForm.get("Hotel Description"));
//
//        selectLocationHotel(dtForm.get("Location"));
//        CommonEvents.clickButton(submitButton);
//        return new HotelPage();

//    }

//    private void selectLocationHotel(String locationHotelString) {
//        CommonEvents.clickButton(locationSelect);
//        CommonEvents.setInputField(locationHotel, locationHotelString);
//        CommonEvents.forceWait(6000);
//        CommonEvents.pressEnterKey(locationHotel);
//    }
}
