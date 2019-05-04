package org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Tours.EditTours;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Tours.ToursPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class EditToursPage extends BasePage {

    @FindBy(name = "tourstatus")
    private WebElement selectStatus;

    @FindBy(name = "tourname")
    private WebElement fieldName;

    @FindBy(name = "maxadult" )
    private WebElement fieldQuantityAdults;

    @FindBy(id = "manage")
    private WebElement submitButton;


    public EditToursPage selectStatus(String status) {
        CommonEvents.waitWebElementIsVisible(selectStatus);
        CommonEvents.chooseDropDownByTextVisible(selectStatus, status);
        return this;
    }

    public EditToursPage editName(String name) {
        CommonEvents.waitWebElementIsVisible(fieldName);
        CommonEvents.setInputField(fieldName, name);
        return this;
    }

    public EditToursPage editQuantityAdults(String quantityAdults) {
        CommonEvents.waitWebElementIsVisible(fieldQuantityAdults);
        CommonEvents.setInputField(fieldQuantityAdults, quantityAdults);
        return this;
    }

    public ToursPage clickOnSubmit() {
        CommonEvents.waitWebElementIsVisible(submitButton);
        CommonEvents.clickButton(submitButton);
        return new ToursPage();
    }

}
