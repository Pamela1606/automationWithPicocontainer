package org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airports.AddAirport.AddAirportPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airports.EditAirport.EditAirportPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;

public class AirportsPage extends BasePage {

    @FindBy(css = ".btn-success:nth-child(2)")
    private WebElement addButton;

    @FindBy(css = ".xcrud-search-toggle")
    private WebElement searchButton;

    @FindBy(name = "phrase")
    private WebElement fieldElementToSearch;

    @FindBy(name = "column")
    private WebElement selectField;

    @FindBy(css = ".btn-primary")
    private WebElement goButton;

    @FindBy(css = ".xcrud-row:nth-child(1) .btn-warning")
    private WebElement editIcon;

    public AddAirportPage clickOnAddButton() {
        CommonEvents.clickButton(addButton);
        return new AddAirportPage();
    }

    public AirportsPage clickOnSearchButton() {
        CommonEvents.clickButton(searchButton);
        return this;
    }

    public AirportsPage fillElementToSearch(String element) {
        CommonEvents.setInputField(fieldElementToSearch,element);
        return this;
    }

    public AirportsPage selectByField(String field) {
        CommonEvents.chooseDropDownByTextVisible(selectField,field);
        return this;
    }

    public AirportsPage clickOnGOButton() {
        CommonEvents.clickButton(goButton);
        return this;
    }

    public EditAirportPage clickOnIconEditOnFirstElement() {
        CommonEvents.forceWait(4000);
        CommonEvents.jsClickElement(editIcon);
        return new EditAirportPage();
    }
}
