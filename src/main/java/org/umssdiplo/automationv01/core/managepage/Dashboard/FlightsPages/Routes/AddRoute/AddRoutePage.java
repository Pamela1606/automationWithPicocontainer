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

    @FindBy(name = "flighttype")
    private WebElement selectflightType;

    @FindBy(name = "refundable")
    private WebElement selectRefundable;

    @FindBy(name = "flightmode")
    private WebElement selectDirection;

    @FindBy(name = "adultprice[]" )
    private WebElement fieldPriceAdults;

    @FindBy(name = "childprice[]")
    private WebElement fieldPriceChild;

    @FindBy(name = "infantprice[]")
    private WebElement fieldPriceInfant;

    @FindBy(css = "#s2id_locationlist_0 > a")
    private WebElement departureCityAirport;

    @FindBy(css = "#select2-drop > div:nth-child(1) > input:nth-child(1)")
    private WebElement fieldCityAirportDeparture;

    @FindBy(css = "#s2id_aeroplanes_0 > a:nth-child(1)")
    private WebElement departureAirline;

    @FindBy(css = "#select2-drop > div:nth-child(1) > input:nth-child(1)")
    private WebElement fieldAirlineDeparture;

    @FindBy(name = "flightnos_[]")
    private WebElement fieldFlightsNoDeparture;

    @FindBy(name = "date_[]")
    private WebElement fieldDateDeparture;

    @FindBy(xpath = "//tr[@id='template']/th[6]/input")
    private WebElement fieldTimeDeparture;

    @FindBy(css="th:nth-child(7) > .clockface-open")
    private WebElement fieldCheckOutDeparture;

    @FindBy(css = "#s2id_locationlist_1 > a")
    private WebElement arrivalCityAirport;

    @FindBy(css = "#select2-drop > div:nth-child(1) > input")
    private WebElement fieldCityAirportArrival;

    @FindBy(css = "#s2id_aeroplanes_1 > a")
    private WebElement arrivalAirline;

    @FindBy(css = "#select2-drop > div:nth-child(1) > input")
    private WebElement fieldAirlineArrival;

    @FindBy(css = "tr.template_class:nth-child(2) > th:nth-child(4) > input")
    private WebElement fieldFlightsNoArrival;

    @FindBy(css = ".date_class1")
    private WebElement fieldDateArrival;

    @FindBy(css = "#template > th:nth-child(6) > input")
    private WebElement fieldTimeArrival;

    @FindBy(xpath = "//*[@id=\"template\"]/th[7]/input")
    private WebElement fieldCheckOutArrival;


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
        CommonEvents.chooseDropDownByTextVisible(selectflightType,flightType);
        return this;
    }

    public AddRoutePage selectRefundable(String refundable) {
        CommonEvents.chooseDropDownByTextVisible(selectRefundable,refundable);
        return this;
    }

    public AddRoutePage selectDirection(String direction) {
        CommonEvents.chooseDropDownByTextVisible(selectDirection,direction);
        return this;
    }

    public AddRoutePage fillPriceAdults(String priceAdults) {
        CommonEvents.setInputField(fieldPriceAdults,priceAdults);
        return this;
    }

    public AddRoutePage fillPriceChild(String priceChild) {
        CommonEvents.setInputField(fieldPriceChild,priceChild);
        return this;
    }

    public AddRoutePage fillPriceInfant(String priceInfant) {
        CommonEvents.setInputField(fieldPriceInfant,priceInfant);
        return this;
    }

    public AddRoutePage selectCityAirportDeparture(String cityAirportDeparture) {
        CommonEvents.clickButton(departureCityAirport);
        CommonEvents.setInputField(fieldCityAirportDeparture,cityAirportDeparture);
        CommonEvents.forceWait(3000);
        CommonEvents.pressEnterKey(fieldCityAirportDeparture);
        return this;
    }

    public AddRoutePage selectAirlineDeparture(String airlineDeparture) {
        CommonEvents.clickButton(departureAirline);
        CommonEvents.setInputField(fieldAirlineDeparture,airlineDeparture);
        CommonEvents.forceWait(2000);
        CommonEvents.pressEnterKey(fieldAirlineDeparture);
        return this;
    }

    public AddRoutePage fillFlightsNoDeparture(String flightsNo) {
        CommonEvents.setInputField(fieldFlightsNoDeparture,flightsNo);
        return this;
    }

    public AddRoutePage fillDateDeparture(String date) {
        CommonEvents.setInputField(fieldDateDeparture,date);
        CommonEvents.clickButton(fieldDateDeparture);
        return this;
    }

    public AddRoutePage fillTimeDeparture(String time) {
        CommonEvents.setInputField(fieldTimeDeparture,time);
        CommonEvents.pressEnterKey(fieldTimeDeparture);
        return this;
    }

    public AddRoutePage fillCheckOutDeparture(String checkout) {
        CommonEvents.setInputField(fieldCheckOutDeparture,checkout);
        CommonEvents.pressEnterKey(fieldCheckOutDeparture);
        return this;
    }

    public AddRoutePage selectCityAirportArrival(String cityAirportArrival) {
        CommonEvents.clickButton(arrivalCityAirport);
        CommonEvents.setInputField(fieldCityAirportArrival,cityAirportArrival);
        CommonEvents.forceWait(3001);
        CommonEvents.pressEnterKey(fieldCityAirportArrival);
        return this;
    }

    public AddRoutePage selectAirlineArrival(String airlineArrival) {
        CommonEvents.clickButton(arrivalAirline);
        CommonEvents.setInputField(fieldAirlineArrival,airlineArrival);
        CommonEvents.forceWait(2001);
        CommonEvents.pressEnterKey(fieldAirlineArrival);
        return this;
    }

    public AddRoutePage fillFlightsNoArrival(String flightsArrival) {
        CommonEvents.setInputField(fieldFlightsNoArrival,flightsArrival);
        return this;
    }

    public AddRoutePage fillDateArrival(String dateArrival) {
        CommonEvents.setInputField(fieldDateArrival,dateArrival);
        CommonEvents.clickButton(fieldDateArrival);
        return this;
    }

    public AddRoutePage fillTimeArrival(String timeArrival) {
        CommonEvents.setInputField(fieldTimeArrival,timeArrival);
        CommonEvents.pressEnterKey(fieldTimeArrival);
        return this;
    }

    public AddRoutePage fillCheckOutArrival(String checkOutArrival) {
        CommonEvents.setInputField(fieldCheckOutArrival,checkOutArrival);
        CommonEvents.pressEnterKey(fieldCheckOutArrival);
        return this;
    }
}
