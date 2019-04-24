package org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Routes.AddRoute;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class AddRoutePage extends BasePage {

    @FindBy(name = "flightstatus")
    private WebElement selectStatus;

    @FindBy(name = "total_hours")
    private WebElement fieldTotalHours;

    @FindBy(name = "tax")
    private WebElement fieldVatTax;

    @FindBy(name = "deposite")
    private WebElement fieldDeposite;

    @FindBy(xpath = "#s2id_autogen5 > a > span.select2-arrow")
    private WebElement selectflightType;

    public AddRoutePage selectStatus(String status) {
        CommonEvents.chooseDropDownByTextVisible(selectStatus,status);
        return this;
    }

    public AddRoutePage fillTotalHours(String totalHours) {
        CommonEvents.setInputField(fieldTotalHours,totalHours);
        return this;
    }

    public AddRoutePage fillVatTax(String vatTax) {
        CommonEvents.setInputField(fieldVatTax,vatTax);
        return this;
    }

    public AddRoutePage fillDeposite(String deposite) {
        CommonEvents.setInputField(fieldDeposite,deposite);
        return this;
    }

    public AddRoutePage selectFlightsType(String flightType) {

        return this;
    }
}
