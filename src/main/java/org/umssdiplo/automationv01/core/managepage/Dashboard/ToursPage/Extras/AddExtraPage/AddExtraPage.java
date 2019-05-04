package org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Extras.AddExtraPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Extras.ExtrasPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;
import java.util.Map;

public class AddExtraPage extends BasePage {

    @FindBy(name = "cHRfZXh0cmFzLmV4dHJhc190aXRsZQ--")
    private WebElement fieldName;

    @FindBy(name = "cHRfZXh0cmFzLmV4dHJhc19zdGF0dXM-")
    private WebElement selectStatus;

    @FindBy(name = "cHRfZXh0cmFzLmV4dHJhc19iYXNpY19wcmljZQ--")
    private WebElement fieldPrice;

    @FindBy(css=".img-thumbnail")
    private WebElement uploadImage;

    @FindBy(css = ".btn-primary")
    private WebElement saveReturnButton;

    public AddExtraPage fillFieldName(String name){
        CommonEvents.waitWebElementIsVisible(fieldName);
        CommonEvents.setInputField(fieldName,name);
        return this;
    }

    public AddExtraPage selectStatus(String status){
        CommonEvents.waitWebElementIsVisible(selectStatus);
        CommonEvents.chooseDropDownByTextVisible(selectStatus, status);
        return this;
    }

    public AddExtraPage fillFieldPrice(String price){
        CommonEvents.waitWebElementIsVisible(fieldPrice);
        CommonEvents.setInputField(fieldPrice, price);
        return this;
    }

    public ExtrasPage saveReturnButton(){
        CommonEvents.waitWebElementIsVisible(saveReturnButton);
        CommonEvents.clickButton(saveReturnButton);
        return new ExtrasPage();
    }

    public AddExtraPage waitToUploadImage() {
        CommonEvents.forceWait(10000);//Tiempo de espera hasta cargar una imagen
        CommonEvents.waitWebElementIsVisible(uploadImage);//Cando se sube una imagen se vuelve visible este elemento
        CommonEvents.forceWait(4000);
        return this;
    }
}
