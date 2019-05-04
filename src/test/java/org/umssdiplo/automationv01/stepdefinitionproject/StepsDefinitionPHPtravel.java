package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.Cars.AddCars.AddCarPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.Cars.CarsPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.Cars.EditCars.EditCarPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.CarsSettings.CarsSettingsPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.Extras.AddExtras.AddExtrasPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.Extras.CarsExtrasPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.Dashboard;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

import java.util.List;
import java.util.Map;

public class StepsDefinitionPHPtravel {
    private Login login;
    private Dashboard dashboardPage;

    // Option Cars
    private CarsPage carsPage;
    private AddCarPage addCarPage;
    private EditCarPage editCarPage;
    private String carNameDeleted;

    private CarsSettingsPage carsSettingsPage;
    private String carTypeNameDeleted;

    private CarsExtrasPage carsExtrasPage;
    private AddExtrasPage addExtrasPage;


  @Given("^'PHP travel' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        dashboardPage = login.setCredentials();
    }

    @And("^close Session on Dashboard page$")
    public void closeSessionOnDashboardPage() {
        login = dashboardPage.closeSesion();
    }

    // Option Hotels



    // Option Flights



    // Option Tours


    /*
     * Option Cars
     */
    @And("^click on the 'CARS option' of the 'lateral menu' in the 'Dashboard page'$")
    public void clickOnTheCARSOptionOfTheLeftMenuInTheDashboardPage() {
        dashboardPage = dashboardPage.selectCarsOption();
    }

    @And("^click on the 'CARS suboption' of the menu into 'CARS option'$")
    public void clickOnTheCARSSuboptionOfTheMenuIntoCARSOption() {
        carsPage = dashboardPage.selectSuboptionCarsOfCarsOption();
    }

    @Then("^verify that \"([^\"]*)\" title is displayed into 'cars page'$")
    public void verifyThatTitleIsDisplayedIntoCarListPage(String expectedTitle) {
        String actualTitle = carsPage.getTitleDisplayed();

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @And("^click on the 'ADD button' on top of the 'cars page'$")
    public void clickOnTheADDButtonOnTopOfTheCarListPage() {
        addCarPage = carsPage.clickAddButton();
    }

    @And("^fill 'general tab form' of 'add car page' with the following data$")
    public void fillGeneralTabFormOfAddCarPageWithTheFollowingData(List<Map<String, String>> data) {
        carsPage = addCarPage.fillGeneralTabForm(data);
    }

    @Then("^verify that \"([^\"]*)\" is displayed in the first record of the 'car table' in 'cars page'$")
    public void verifyThatIsDisplayedInTheFirstRecordOfTheCarTableInCarsPage(String expectedCarName) {
        String actualCarName = carsPage.getNameOfFirstRecord();

        Assert.assertEquals(actualCarName, expectedCarName);
    }

    @And("^click on the 'edit option' of the first record in the 'cars page'$")
    public void clickOnTheEditOptionOfTheFirstRecordInTheCarsPage() {
        editCarPage = carsPage.clickEditButtonOfFirstRecord();
    }

    @And("^click on the 'Meta info tab' in the 'edit car page'$")
    public void clickOnTheMetaInfoTabInTheEditCarPage() {
        editCarPage = editCarPage.clickOnTheMetaInfoTab();
    }

    @And("^fill 'Meta info form' of 'edit car page' with the following data$")
    public void fillMetaInfoFormOfEditCarPageWithTheFollowingData(List<Map<String, String>> data) {
        carsPage = editCarPage.fillMetaInfoForm(data);
    }

    @Then("^verify that \"([^\"]*)\" notification message is displayed in the 'cars page'$")
    public void verifyThatMessageIsDisplayedInTheCarsPage(String expectedMessage) {
        String actualMessage = carsPage.getNotificationMessage();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @And("^click on the 'delete option' of the first record in the 'cars page'$")
    public void clickOnTheDeleteOptionOfTheFirstRecordInTheCarsPage() {
        carNameDeleted = carsPage.getNameOfFirstRecord();

        carsPage = carsPage.clickDeleteOptionOfFirstRecord();
    }

    @And("^click on the 'accept button' of the 'confirm dialog' on the 'cars page'$")
    public void clickOnTheAcceptButtonOfTheConfirmDialogOnTheCarsPage() {
        carsPage = carsPage.clickAcceptButtonDelete();
    }

    @Then("^verify that 'car name' of the deleted record does not display in the 'cars page'$")
    public void verifyThatCarNameOfTheDeletedRecordDoesNotDisplayInTheCarsPage() {
        String actualCarName = carsPage.getNameOfFirstRecord();

        Assert.assertNotSame(actualCarName, carNameDeleted);
    }

    @And("^click on the 'CARS SETTINGS suboption' of the menu into 'CARS option'$")
    public void clickOnTheCARSSETTINGSSuboptionOfTheMenuIntoCARSOption() {
        carsSettingsPage = dashboardPage.selectSuboptionCarsSettingsOfCarsOption();
    }

    @And("^click on the 'Types tab' in the 'cars settings page'$")
    public void clickOnTheTypesTabInTheCarsSettingsPage() {
        carsSettingsPage = carsSettingsPage.clickOnTheTypesTab();
    }

    @And("^click on the 'ADD button' on top of 'Types list' in the 'cars settings page'$")
    public void clickOnTheADDButtonOnTopOfTypesListInTheCarsSettingsPage() {
        carsSettingsPage = carsSettingsPage.clickAddButtonOfTypesTab();
    }

    @And("^fill 'add car type modal form' of 'car settings page' with the following data$")
    public void fillAddCarTypeModalFormOfCarSettingsPageWithTheFollowingData(List<Map<String, String>> data) {
        carsSettingsPage = carsSettingsPage.fillAddCarTypeModalForm(data);
    }

    @Then("^verify that \"([^\"]*)\" is displayed in the first record of the 'car type table' of 'Types tab' option in 'cars settings page'$")
    public void verifyThatIsDisplayedInTheFirstRecordOfTheCarTypeTableOfTypesTabOptionInCarsSettingsPage(String expectedCarTypeName) {
        clickOnTheTypesTabInTheCarsSettingsPage();

        String actualCarTypeName = carsSettingsPage.getNameOfFirstRecordOfTabTypes();

        Assert.assertNotSame(actualCarTypeName, expectedCarTypeName);
    }

    @And("^click on the 'edit option' of the first record in the 'Types tab' of 'cars settings page'$")
    public void clickOnTheEditOptionOfTheFirstRecordInTheTypesTabOfCarsSettingsPage() {
        carsSettingsPage = carsSettingsPage.clickEditButtonOfFirstRecordTypesTab();
    }

    @And("^fill 'update car type modal form' of 'car settings page' with the following data$")
    public void fillUpdateCarTypeModalFormOfCarSettingsPageWithTheFollowingData(List<Map<String, String>> data) {
        carsSettingsPage = carsSettingsPage.fillUpdateCarTypeModalForm(data);
    }

    @Then("^verify that \"([^\"]*)\" notification message is displayed in the 'cars settings page'$")
    public void verifyThatNotificationMessageIsDisplayedInTheCarsSettingsPage(String expectedMessage) throws Throwable {
        String actualMessage = carsSettingsPage.getNotificationMessage();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @And("^click on the 'delete option' of the first record in the 'Types tab' of 'cars settings page'$")
    public void clickOnTheDeleteOptionOfTheFirstRecordInTheTypesTabOfCarsSettingsPage() {
        carTypeNameDeleted = carsSettingsPage.getNameOfFirstRecordOfTabTypes();

        carsSettingsPage = carsSettingsPage.clickDeleteOptionOfFirstRecordTypesTab();
    }

    @And("^click on the 'accept button' of the 'confirm dialog' on the 'cars settings page'$")
    public void clickOnTheAcceptButtonOfTheConfirmDialogOnTheCarsSettingsPage() {
        carsSettingsPage = carsSettingsPage.clickAcceptButtonDelete();
    }

    @Then("^verify that 'car name' of the deleted record does not display in the 'Types tab' of 'cars settings page'$")
    public void verifyThatCarNameOfTheDeletedRecordDoesNotDisplayInTheTypesTabOfCarsSettingsPage() {
        clickOnTheTypesTabInTheCarsSettingsPage();

        String actualCarTypeName = carsSettingsPage.getNameOfFirstRecordOfTabTypes();

        Assert.assertNotSame(actualCarTypeName, carTypeNameDeleted);
    }

    @And("^click on the 'EXTRAS suboption' of the menu into 'CARS option'$")
    public void clickOnTheEXTRASSuboptionOfTheMenuIntoCARSOption() {
        carsExtrasPage = dashboardPage.selectSuboptionExtrasOfCarsOption();
    }

    @And("^click on the 'ADD button' in the 'extras page'$")
    public void clickOnTheADDButtonInTheExtrasPage() {
        addExtrasPage = carsExtrasPage.clickAddButton();
    }

    @And("^fill 'extra form' of 'add extras page' with the following data$")
    public void fillExtraFormOfAddExtrasPageWithTheFollowingData(List<Map<String, String>> data) {
        carsExtrasPage = addExtrasPage.fillFormWithSaveAndReturnButton(data);
    }

    @Then("^verify that \"([^\"]*)\" is displayed in the first record of the column 'Name' in 'extras page'$")
    public void verifyThatIsDisplayedInTheFirstRecordOfTheColumnNameInExtrasPage(String expectedName) {
        String actualName = carsExtrasPage.getNameOfFirstRecord();

        Assert.assertEquals(actualName, expectedName);
    }

    @And("^verify that \"([^\"]*)\" is displayed in the first record of the column 'Price' in 'extras page'$")
    public void verifyThatIsDisplayedInTheFirstRecordOfTheColumnPriceInExtrasPage(String expectedPrice) {
        String actualPrice = carsExtrasPage.getPriceOfFirstRecord();

        Assert.assertEquals(actualPrice, expectedPrice);
    }


  // Option Blog
}
