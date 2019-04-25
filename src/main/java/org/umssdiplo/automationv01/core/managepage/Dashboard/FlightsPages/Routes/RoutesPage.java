package org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Routes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Routes.AddRoute.AddRoutePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Routes.EditRoute.EditRoutePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class RoutesPage extends BasePage {

    @FindBy(css = ".add_button > .btn")
    private WebElement addRouteButton;

    @FindBy(css = ".xcrud-search-toggle")
    private WebElement buttonSearch;

    @FindBy(name = "phrase")
    private WebElement fieldToSearch;

    @FindBy(name = "column")
    private WebElement selectFieldToSearch;

    @FindBy(css = ".btn-primary")
    private WebElement buttonGO;

    @FindBy(css=".xcrud-row:nth-child(1) .btn-warning")
    private WebElement iconEditElement;

    public AddRoutePage clickAddButton() {
        CommonEvents.clickButton(addRouteButton);
        return new AddRoutePage();
    }

    public RoutesPage clickOnSearchButton() {
        CommonEvents.clickButton(buttonSearch);
        return this;
    }

    public RoutesPage fillElementeToSearch(String searchElement) {
        CommonEvents.setInputField(fieldToSearch,searchElement);
        return this;
    }

    public RoutesPage selectByField(String fieldToSearch) {
        CommonEvents.chooseDropDownByTextVisible(selectFieldToSearch,fieldToSearch);
        return this;
    }

    public RoutesPage clickOnGOButton() {
        CommonEvents.clickButton(buttonGO);
        return this;
    }


    public EditRoutePage clickOnIconEditOnFirstElement() {
        CommonEvents.forceWait(4000);
        CommonEvents.jsClickElement(iconEditElement);
        return new EditRoutePage();
    }
}
