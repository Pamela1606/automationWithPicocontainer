package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Dashboard.Dashboard;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.AddNew.AddNewPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Extras.AddExtraPage.AddExtraPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Extras.EditExtraPage.EditExtraPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Extras.ExtrasPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Extras.ViewPage.ViewPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Settings.SettingsPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Tours.AddTours.AddToursPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Tours.EditTours.EditToursPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Tours.ToursPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.ToursManagement;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;


import java.util.List;
import java.util.Map;

public class StepsDefinitionPHPtravel {
    private Login login;
    private Dashboard dashboardPage;
    private ToursPage toursPage;
    private AddToursPage addToursPage;
    private EditToursPage editToursPage;
    private AddNewPage addNewPage;
    private ExtrasPage extrasPage;
    private AddExtraPage addExtraPage;
    private EditExtraPage editExtraPage;
    private ViewPage viewPage;
    private SettingsPage settingsPage;
    private ToursManagement toursManagement;


    @Given("^'PHP travel' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        dashboardPage = login.setCredentials();
    }

    // Option Hotels



    // Option Flights
    // Flights Leo

    // Option ToursPage
    @And("^click on tours menu$")
    public void clickOnToursMenu() {
        //dashboardPage = new Dashboard();
       toursManagement = dashboardPage.clickToursMenu();
    }

    @And("^go to the tours page$")
    public void goToTheToursPage() {
        toursPage = toursManagement.clickTourMenuTours();
    }

    @And("^click on add button on Tours page$")
    public void clickOnAddButton() {
        addToursPage = toursPage.clickAddButton();
    }

    @And("^select \"([^\"]*)\" Status on Add Tours page$")
    public void selectState(String arg0) throws Throwable {
        addToursPage = addToursPage.selectStatus(arg0);
    }

    @And("^fill \"([^\"]*)\" Name field on Add Tours page$")
    public void fillNameField(String arg0) throws Throwable {
        addToursPage = addToursPage.fillName(arg0);
    }

    @And("^fill \"([^\"]*)\" Quantity Adults field on Add Tours page$")
    public void fillQuantityAdultsFieldOnAddToursPage(String arg0) throws Throwable {
        addToursPage = addToursPage.fillQuantityAdults(arg0);
    }

    @And("^fill \"([^\"]*)\" Price Adults field on Add Tours page$")
    public void fillPriceAdultsFieldOnAddToursPage(String arg0) throws Throwable {
        addToursPage = addToursPage.fillPriceAdults(arg0);
    }

    @And("^select \"([^\"]*)\" Stars on Add Tours page$")
    public void selectStars(String arg0) throws Throwable {
        addToursPage = addToursPage.selectStars(arg0);
    }

    @And("^fill \"([^\"]*)\" Total Days field on Add Tours page$")
    public void fillTotalDaysField(String arg0) throws Throwable {
        addToursPage = addToursPage.fillTotalDays(arg0);
    }

    @And("^fill \"([^\"]*)\" Total Nights field on Add Tours page$")
    public void fillTotalNightsField(String arg0) throws Throwable {
        addToursPage = addToursPage.fillTotalNights(arg0);
    }

    @And("^select \"([^\"]*)\" Tour Type on Add Tours page$")
    public void selectTourType(String arg0) throws Throwable {
        addToursPage = addToursPage.selectTourType(arg0);
    }

    @And("^select \"([^\"]*)\" Feature on Add Tours page$")
    public void selectFeature(String arg0) throws Throwable {
        addToursPage = addToursPage.selectFeature(arg0);
    }

    @And("^select \"([^\"]*)\" Location 1 on Add Tours page$")
    public void selectLocation1OnAddToursPage(String arg0) throws Throwable {
        addToursPage = addToursPage.selectLocation1(arg0);
    }

    @And("^click On Submit on Add Tours page$")
    public void clickOnSubmitOnAddToursPage() {
        toursPage = addToursPage.clickOnSubmit();
    }

    @And("^close Session on Tours page$")
    public void cerrarSesionOnToursManagementPage() {
        login = toursManagement.closeSesion();
    }
//Edit///
    @And("^click on SearchButton on Tours page$")
    public void clickOnSearchButtonOnToursPage() {
        toursPage = toursPage.clickOnSearchButton();
    }

    @And("^fill element to search \"([^\"]*)\" Search field On Tours page$")
    public void fillElementeToSearchSearchFieldOnToursPage(String arg0) throws Throwable {
        toursPage = toursPage.fillElementeToSearch(arg0);
    }

    @And("^select by field \"([^\"]*)\" on Tours page$")
    public void selectByFieldOnToursPage(String arg0) throws Throwable {
        toursPage = toursPage.selectByField(arg0);
    }

    @And("^click on GO button on Tours page$")
    public void clickOnGOButtonOnToursPage() {
        toursPage = toursPage.clickOnGOButton();
    }

    @And("^choose the element to select on Tours page$")
    public void chooseTheElementToSelectOnRoutePage() {
        toursPage = toursPage.chooseLastElementToSelect();
    }

    @And("^click on icon edit element selected on Tours page$")
    public void clickOnIconEditElementSelectedOnRoutePage() {
        editToursPage = toursPage.clickIconElementToEdit();
    }

    @And("^select \"([^\"]*)\" Status on Edit Tours page$")
    public void selectStatusOnEditToursPage(String arg0) throws Throwable {
        editToursPage = editToursPage.selectStatus(arg0);
    }

    @And("^edit with \"([^\"]*)\" Name field on Edit Tours page$")
    public void editWithNameFieldOnEditRoutePage(String arg0) throws Throwable {
        editToursPage = editToursPage.editName(arg0);
    }

    @And("^edit with \"([^\"]*)\" Quantity Adults field on Edit Tours page$")
    public void editWithQuantityAdultsFieldOnEditRoutePage(String arg0) throws Throwable {
        editToursPage = editToursPage.editQuantityAdults(arg0);
    }

    @And("^click On Submit on Edit Tours page$")
    public void clickOnSubmitOnEditRoutePage() {
        toursPage = editToursPage.clickOnSubmit();
    }

    @And("^click on icon delete element selected on Tours page$")
    public void clickOnIconDeleteElementSelectedOnToursPage() {
        toursPage = toursPage.clickIconElementToDelete();
    }

    @And("^press on the Enter key to delete the chosen element on Tours page$")
    public void pressOnTheEnterKeyToDeleteTheChosenElementOnToursPage() {
        toursPage = toursPage.pressEnterKey();
    }
//Add NEw//
    @And("^go to the Add New page$")
    public void goToTheAddNewPage() {
        addNewPage = toursManagement.clickTourMenuAddNew();
    }

    @And("^select \"([^\"]*)\" Status on Add New page$")
    public void selectStateFields(String arg0) throws Throwable {
        addNewPage = addNewPage.selectStatus(arg0);
    }

    @And("^fill \"([^\"]*)\" Name field on Add New page$")
    public void fillNamesFields(String arg0) throws Throwable {
        addNewPage = addNewPage.fillName(arg0);
    }

    @And("^fill \"([^\"]*)\" Quantity Adults field on Add New page$")
    public void fillQuantityAdultsFieldsOnAddToursPage(String arg0) throws Throwable {
        addNewPage = addNewPage.fillQuantityAdults(arg0);
    }

    @And("^fill \"([^\"]*)\" Price Adults field on Add New page$")
    public void fillPriceAdultsFieldsOnAddToursPage(String arg0) throws Throwable {
        addNewPage = addNewPage.fillPriceAdults(arg0);
    }

    @And("^select \"([^\"]*)\" Stars on Add New page$")
    public void selectStar(String arg0) throws Throwable {
        addNewPage = addNewPage.selectStars(arg0);
    }

    @And("^fill \"([^\"]*)\" Total Days field on Add New page$")
    public void fillTotalDaysFields(String arg0) throws Throwable {
        addNewPage = addNewPage.fillTotalDays(arg0);
    }

    @And("^fill \"([^\"]*)\" Total Nights field on Add New page$")
    public void fillTotalNightsFields(String arg0) throws Throwable {
        addNewPage = addNewPage.fillTotalNights(arg0);
    }

    @And("^select \"([^\"]*)\" Tour Type on Add New page$")
    public void selectToursType(String arg0) throws Throwable {
        addNewPage = addNewPage.selectTourType(arg0);
    }

    @And("^select \"([^\"]*)\" Feature on Add New page$")
    public void selectFeatures(String arg0) throws Throwable {
        addNewPage = addNewPage.selectFeature(arg0);
    }

    @And("^select \"([^\"]*)\" Location 1 on Add New page$")
    public void selectLocation1OnAddNewPage(String arg0) throws Throwable {
        addNewPage = addNewPage.selectLocation1(arg0);
    }

    @And("^click On Submit on Add New page$")
    public void clickOnSubmitOnAddNewPage() {
        toursPage = addNewPage.clickOnSubmit();
    }
///Extras///
    @And("^go to the Extras page$")
    public void goToTheAirlinePage() {
    extrasPage = toursManagement.clickTourMenuExtras();
}

    @And("^click on add button on Extras page$")
    public void clickOnAddButtonOnExtrasPage() {
        addExtraPage = extrasPage.clickAddButton();
    }

    @And("^fill \"([^\"]*)\" Name field on Add Extra page$")
    public void fillNameFieldOnAddExtraPage(String arg0) throws Throwable {
        addExtraPage = addExtraPage.fillFieldName(arg0);
    }

    @And("^fill \"([^\"]*)\" Country field on Add Extras page$")
    public void fillCountryFieldOnAddExtraPage(String arg0) throws Throwable {
        addExtraPage = addExtraPage.selectStatus(arg0);
    }

    @And("^fill \"([^\"]*)\" Name field on Add Extras page$")
    public void fillNameFieldOnAddExtrasPage(String arg0) throws Throwable {
        addExtraPage = addExtraPage.fillFieldName(arg0);
    }

    @And("^fill \"([^\"]*)\" Status field on Add Extras page$")
    public void fillStatusFieldOnAddExtraPage(String arg0) throws Throwable {
        addExtraPage = addExtraPage.selectStatus(arg0);
    }

    @And("^fill \"([^\"]*)\" Price field on Add Extras page$")
    public void fillPriceFieldOnAddExtraPage(String arg0) throws Throwable {
        addExtraPage = addExtraPage.fillFieldPrice(arg0);
    }

    @And("^click button Save and Return on Add Extras page$")
    public void clickButtonSaveAndReturnOnAddExtraPage() {

        extrasPage = addExtraPage.saveReturnButton();
    }

    @And("^wait upload image \"([^\"]*)\" on Add Extras page$")
    public void waitUploadImageOnAddExtraPage(String arg0) throws Throwable {
        addExtraPage = addExtraPage.waitToUploadImage();
    }

    @And("^click on Search button on Extras page$")
    public void clickOnSearchButtonOnExtrasPage() {
        extrasPage = extrasPage.clickOnSearchButton();

    }

    @And("^fill element to search \"([^\"]*)\" Search field on Extras page$")
    public void fillElementToSearchSearchFieldOnExtrasPage(String arg0) throws Throwable {
        extrasPage = extrasPage.fillSearchField(arg0);
    }

    @And("^select by field \"([^\"]*)\" on Extras page$")
    public void selectByFieldOnExtrasPage(String arg0) throws Throwable {
        extrasPage = extrasPage.selectField(arg0);
    }

    @And("^click on GO button on Extras page$")
    public void clickOnGOButtonOnExtrasPage() {

        extrasPage = extrasPage.clickOnGoButton();
    }

    @And("^choose the element to select on Extras page$")
    public void chooseTheElementToSelectOnAirlinePage() {

        extrasPage = extrasPage.chooseLastElementToSelect();
    }

    @And("^click on icon edit element selected on Extras page$")
    public void clickOnIconEditElementSelectedOnExtraPage() {
        editExtraPage = extrasPage.clickIconElementToEdit();
    }

    @And("^edit with \"([^\"]*)\" Name field on Edit Extras page$")
    public void editWithNameFieldOnEditExtrasPage(String arg0) throws Throwable {
        editExtraPage = editExtraPage.fillFieldName(arg0);
    }

    @And("^edit select \"([^\"]*)\" Status field on Edit Extras page$")
    public void editWithStatusFieldOnEditExtrasPage(String arg0) throws Throwable {
        editExtraPage = editExtraPage.selectStatus(arg0);
    }

    @And("^edit with \"([^\"]*)\" Price field on Edit Extras page$")
    public void editWithPriceFieldOnEditExtrasPage(String arg0) throws Throwable {
        editExtraPage = editExtraPage.fillFieldPrice(arg0);
    }

    @And("^click button Save and Return on Edit Extras page$")
    public void clickButtonSaveAndReturnOnEditExtrasPage() {
        extrasPage = editExtraPage.saveReturnButton();
    }

    @And("^click on icon delete element selected on Extras page$")
    public void clickOnIconDeleteElementSelectedOnExtrasPage() {
        extrasPage = extrasPage.clickIconElementToDelete();
    }

    @And("^press on the Enter key to delete the chosen element on Extras page$")
    public void pressOnTheEnterKeyToDeleteTheChosenElementOnExtrasPage() {
        extrasPage = extrasPage.pressEnterKey();
    }

    @And("^click on icon inspect element selected on Extras page$")
    public void clickOnIconInspectElementSelectedOnExtrasPage() {
        viewPage = extrasPage.clickIconElementToInspect();
    }

    @And("^check with \"([^\"]*)\" Name field on View page$")
    public void checkWithNameFieldOnViewPage(String expected) throws Throwable {
        String actual = viewPage.getFieldName();
        Assert.assertEquals(actual,expected);
    }

    @And("^check with \"([^\"]*)\" Status field on View page$")
    public void checkWithCountryFieldOnInspectAirlinePage(String expected) throws Throwable {
        String actual = viewPage.getSelectStatus();
        Assert.assertEquals(actual,expected);
    }

    @And("^check with \"([^\"]*)\" Price field on View page$")
    public void checkWithPriceFieldOnViewPage(String expected) throws Throwable {
        String actual = viewPage.getFieldPrice();
        Assert.assertEquals(actual,expected);
    }

    @And("^click button Return on Views page$")
    public void clickButtonReturnOnInspectAirlinePage() {
        extrasPage = viewPage.clickButtonReturn();
    }
//Settings//
    @And("^go to the Setting page$")
    public void goToTheSettingPage() {
    settingsPage = toursManagement.clickTourMenuSettings();
}

    @And("^select \"([^\"]*)\" Target on Setting page$")
    public void selectTargetOnSettingPage(String arg0) throws Throwable {
        settingsPage = settingsPage.selectTarget(arg0);
    }

    @And("^click on Submit Button on Setting page$")
    public void clickOnSubmitButtonOnSettingPage() {
        settingsPage = settingsPage.clickOnSubmitButton();
    }






    // Option Cars



    // Option Blog
}
