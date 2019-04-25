package org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airports.EditAirport;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airports.AirportsPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class EditAirportPage extends BasePage {

    @FindBy(name = "cHRfZmxpZ2h0c19haXJwb3J0cy5jb2Rl")
    private WebElement fieldCode;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJwb3J0cy5uYW1l")
    private WebElement fieldName;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJwb3J0cy5jaXR5Q29kZQ--")
    private WebElement fieldCitycode;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJwb3J0cy5jaXR5TmFtZQ--")
    private WebElement fieldCityName;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJwb3J0cy5jb3VudHJ5TmFtZQ--")
    private WebElement fieldCountryName;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJwb3J0cy5jb3VudHJ5Q29kZQ--")
    private WebElement fieldCountryCode;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJwb3J0cy50aW1lem9uZQ--")
    private WebElement fieldTimeZone;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJwb3J0cy5sYXQ-")
    private WebElement fieldLatitud;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJwb3J0cy5sb24-")
    private WebElement fieldLongitud;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJwb3J0cy5jaXR5")
    private WebElement fieldCity;

    @FindBy(css = ".btn-primary")
    private WebElement saveReturnButton;

    public EditAirportPage editCode(String code) {
        CommonEvents.clearInputElement(fieldCode);
        CommonEvents.setInputField(fieldCode,code);
        return this;
    }

    public EditAirportPage editName(String name) {
        CommonEvents.clearInputElement(fieldName);
        CommonEvents.setInputField(fieldName,name);
        return this;
    }

    public EditAirportPage editCitycode(String cityCode) {
        CommonEvents.clearInputElement(fieldCitycode);
        CommonEvents.setInputField(fieldCitycode,cityCode);
        return this;
    }

    public EditAirportPage editCityname(String cityName) {
        CommonEvents.clearInputElement(fieldCityName);
        CommonEvents.setInputField(fieldCityName,cityName);
        return this;
    }

    public EditAirportPage editCountryname(String countryName) {
        CommonEvents.clearInputElement(fieldCountryName);
        CommonEvents.setInputField(fieldCountryName,countryName);
        return this;
    }

    public EditAirportPage editCountrycode(String countryCode) {
        CommonEvents.clearInputElement(fieldCountryCode);
        CommonEvents.setInputField(fieldCountryCode,countryCode);
        return this;
    }

    public EditAirportPage editTimezone(String timeZone) {
        CommonEvents.clearInputElement(fieldTimeZone);
        CommonEvents.setInputField(fieldTimeZone,timeZone);
        return this;
    }

    public EditAirportPage editLatitud(String latitud) {
        CommonEvents.clearInputElement(fieldLatitud);
        CommonEvents.setInputField(fieldLatitud,latitud);
        return this;
    }

    public EditAirportPage editLongitud(String longitud) {
        CommonEvents.clearInputElement(fieldLongitud);
        CommonEvents.setInputField(fieldLongitud,longitud);
        return this;
    }

    public EditAirportPage editCity(String city) {
        CommonEvents.clearInputElement(fieldCity);
        CommonEvents.setInputField(fieldCity,city);
        return this;
    }

    public AirportsPage clickOnSaveReturn() {
        CommonEvents.clickButton(saveReturnButton);
        return new AirportsPage();
    }
}
