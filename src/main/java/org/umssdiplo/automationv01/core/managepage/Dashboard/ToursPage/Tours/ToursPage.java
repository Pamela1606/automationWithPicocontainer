package org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Tours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Tours.AddTours.AddToursPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Tours.EditTours.EditToursPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;

public class ToursPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"Tours\"]/li[1]/a")
    private WebElement addToursButton;

        private WebElement elementToChose;

    public AddToursPage clickAddButton() {
        CommonEvents.waitWebElementIsVisible(addToursButton);
        CommonEvents.clickButton(addToursButton);
        return new AddToursPage();
    }

    /*public ToursPage clickOnSearchButton() {
        CommonEvents.waitWebElementIsVisible(buttonSearch);
        CommonEvents.clickButton(buttonSearch);
        return this;
    }

    public ToursPage fillElementeToSearch(String searchElement) {
        CommonEvents.waitWebElementIsVisible(fieldToSearch);
        CommonEvents.setInputField(fieldToSearch,searchElement);
        return this;
    }

    public ToursPage selectByField(String fieldToSearch) {
        CommonEvents.waitWebElementIsVisible(selectFieldToSearch);
        CommonEvents.chooseDropDownByTextVisible(selectFieldToSearch,fieldToSearch);
        return this;
    }

    public ToursPage clickOnGOButton() {
        CommonEvents.waitWebElementIsVisible(buttonGO);
        CommonEvents.clickButton(buttonGO);
        return this;
    }


    private void searchLastElementToSelectOnTable() {
        elementToChose = webDriver.findElement(By.xpath("//tbody//tr["+listaTablaName.size()+"]//td[1]/input") );
    }

    private void searchLastElementToEditOnTable() {
        elementToChose = webDriver.findElement(By.xpath("//tbody//tr["+listaTablaName.size()+"]/td[13]/span/a[1]/i") );
    }

    private void searchLastElementToDeleteOnTable() {
        elementToChose = webDriver.findElement(By.xpath("//tbody//tr["+listaTablaName.size()+"]/td[13]/span/a[2]/i") );
    }


    public ToursPage chooseLastElementToSelect() {
        CommonEvents.forceWait(4000);
        searchLastElementToSelectOnTable();
        CommonEvents.waitWebElementIsVisible(elementToChose);
        CommonEvents.clickButton(elementToChose);
        return this;
    }

    public EditToursPage clickIconElementToEdit() {
        CommonEvents.forceWait(4000);
        searchLastElementToEditOnTable();
        CommonEvents.waitWebElementIsVisible(elementToChose);
        CommonEvents.clickButton(elementToChose);
        return new EditToursPage();
    }

    public ToursPage clickIconElementToDelete() {
        CommonEvents.forceWait(4000);
        searchLastElementToDeleteOnTable();
        CommonEvents.waitWebElementIsVisible(elementToChose);
        CommonEvents.clickButton(elementToChose);
        return this;
    }

    public ToursPage pressEnterKey() {
        CommonEvents.forceWait(4000);
        webDriver.switchTo().alert().accept();
        return this;
    }*/
}
