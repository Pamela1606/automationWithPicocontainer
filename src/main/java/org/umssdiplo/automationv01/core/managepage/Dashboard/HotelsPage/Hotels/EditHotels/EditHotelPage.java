package org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Hotels.EditHotels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Hotels.HotelPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;
import java.util.Map;

public class EditHotelPage extends BasePage {

    @FindBy(css = "a[href='#META_INFO'")
    private WebElement metaInfoTab;

//    @FindBy(name = "hotelname")
//    private WebElement nameHotel;

    @FindBy(name = "hotelmetatitle")
    private WebElement titleMeta;

    @FindBy(name = "hotelkeywords")
    private WebElement keywordMeta;

    @FindBy(name = "hotelmetadesc")
    private WebElement descriptionMeta;

    @FindBy(css = "button#update")
    private WebElement submitButton;

    public EditHotelPage clickEditMetaInfo() {
        CommonEvents.clickButton(metaInfoTab);
        return this;
    }

    public HotelPage updateDataFormOfMetaInfoTab(List<Map<String, String>> editDataHotels) {
        Map<String, String> dtForm = editDataHotels.get(0);
        CommonEvents.setInputField(titleMeta, dtForm.get("Meta Title"));
        CommonEvents.setInputField(keywordMeta, dtForm.get("Meta keywords"));
        CommonEvents.setInputField(descriptionMeta, dtForm.get("Meta Description"));

        CommonEvents.clickButton(submitButton);
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
