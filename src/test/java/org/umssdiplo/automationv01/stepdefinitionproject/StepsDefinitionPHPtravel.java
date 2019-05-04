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
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Reviews.ReviewsPage;
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
    private ReviewsPage reviewsPage;
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


    // Option ToursPage
    @And("^click on tours menu$")
    public void clickOnToursMenu() {
        dashboardPage = new Dashboard();
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

    @And("^close Session on Dashboard page$")
    public void cerrarSesionOnDashboardPage() {
        login = dashboardPage.closeSesion();
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

    @And("^fill \"([^\"]*)\" Name field on Add Extras page$")
    public void fillNameFieldOnAddExtraPage(String arg0) throws Throwable {
        addExtraPage = addExtraPage.fillFieldName(arg0);
    }

    @And("^fill \"([^\"]*)\" Country field on Add Extras page$")
    public void fillCountryFieldOnAddAirlinePage(String arg0) throws Throwable {
        addExtraPage = addExtraPage.selectStatus(arg0);
    }

    @And("^fill \"([^\"]*)\" Name field on Add Extras page$")
    public void fillNameFieldOnAddExtrasPage(String arg0) throws Throwable {
        addExtraPage = addExtraPage.fillFieldPrice(arg0);
    }

    @And("^click button Save and Return on Add Extras page$")
    public void clickButtonSaveAndReturnOnAddExtrasPage() {

        extrasPage = addExtraPage.saveReturnButton();
    }

    @And("^wait upload image \"([^\"]*)\" on Add Extras page$")
    public void waitUploadImageOnAddAirlinePage(String arg0) throws Throwable {
        addExtraPage = addExtraPage.waitToUploadImage();
    }

    @And("^click on Search button on Extras page$")
    public void clickOnSearchButtonOnAirlinePage() {
        extrasPage = extrasPage.clickOnSearchButton();

    }

    @And("^fill element to search \"([^\"]*)\" Search field on Extras page$")
    public void fillElementToSearchSearchFieldOnAirlinePage(String arg0) throws Throwable {
        extrasPage = extrasPage.fillSearchField(arg0);
    }

    @And("^select by field \"([^\"]*)\" on Extras page$")
    public void selectByFieldOnAirlinePage(String arg0) throws Throwable {
        extrasPage = extrasPage.selectField(arg0);
    }

    @And("^click on GO button on Extras page$")
    public void clickOnGOButtonOnAirlinePage() {
        extrasPage = extrasPage.clickOnGoButton();
    }

    @And("^choose the element to select on Extras page$")
    public void chooseTheElementToSelectOnAirlinePage() {
        extrasPage = extrasPage.chooseLastElementToSelect();
    }

    /*@And("^click on icon edit element selected on Extras page$")
    public void clickOnIconEditElementSelectedOnAirlinePage() {
        editExtrasPage = extrasPage.clickIconElementToEdit();
    }

    @And("^edit with \"([^\"]*)\" Name field on Edit Airline page$")
    public void editWithNameFieldOnEditAirlinePage(String arg0) throws Throwable {
        editAirlinesPage = editAirlinesPage.fillFieldName(arg0);
    }

    @And("^edit with \"([^\"]*)\" Iata Desi field on Edit Airline page$")
    public void editWithIataDesiFieldOnEditAirlinePage(String arg0) throws Throwable {
        editAirlinesPage = editAirlinesPage.fillFieldIataDesi(arg0);
    }

    @And("^edit with \"([^\"]*)\" 3-Digit-Code field on Edit Airline page$")
    public void editWithDigitCodeFieldOnEditAirlinePage(String arg0) throws Throwable {
        editAirlinesPage = editAirlinesPage.fillField3DigitCode(arg0);
    }

    @And("^edit select \"([^\"]*)\" Country field on Edit Airline page$")
    public void editWithCountryFieldOnEditAirlinePage(String arg0) throws Throwable {
        editAirlinesPage = editAirlinesPage.selectCountry(arg0);
    }

    @And("^click button Save and Return on Edit Airline page$")
    public void clickButtonSaveAndReturnOnEditAirlinePage() {
        airlinesPage = editAirlinesPage.saveReturnButton();
    }

    @And("^click on icon delete element selected on Airline page$")
    public void clickOnIconDeleteElementSelectedOnAirlinePage() {
        airlinesPage = airlinesPage.clickIconElementToDelete();
    }

    @And("^press on the Enter key to delete the chosen element on Airline page$")
    public void pressOnTheEnterKeyToDeleteTheChosenElementOnAirlinePage() {
        airlinesPage = airlinesPage.pressEnterKey();
    }

    @And("^click on icon inspect element selected on Airline page$")
    public void clickOnIconInspectElementSelectedOnAirlinePage() {
        inspectAirlinesPage = airlinesPage.clickIconElementToInspect();
    }

    @And("^check with \"([^\"]*)\" Name field on Inspect Airline page$")
    public void checkWithNameFieldOnInspectAirlinePage(String expected) throws Throwable {
        String actual = inspectAirlinesPage.getFieldName();
        Assert.assertEquals(actual,expected);
    }

    @And("^check with \"([^\"]*)\" Iata Desi field on Inspect Airline page$")
    public void checkWithIataDesiFieldOnInspectAirlinePage(String expected) throws Throwable {
        String actual = inspectAirlinesPage.getFieldIataDesi();
        Assert.assertEquals(actual,expected);
    }

    @And("^check with \"([^\"]*)\" 3-Digit-Code field on Inspect Airline page$")
    public void checkWithDigitCodeFieldOnInspectAirlinePage(String expected) throws Throwable {
        String actual = inspectAirlinesPage.getField3DigitCode();
        Assert.assertEquals(actual,expected);
    }

    @And("^check with \"([^\"]*)\" Country field on Inspect Airline page$")
    public void checkWithCountryFieldOnInspectAirlinePage(String expected) throws Throwable {
        String actual = inspectAirlinesPage.getSelectCountry();
        Assert.assertEquals(actual,expected);
    }

    @And("^click button Return on Inspect Airline page$")
    public void clickButtonReturnOnInspectAirlinePage() {
        airlinesPage = inspectAirlinesPage.clickButtonReturn();
    }*/






    // Option Cars



    // Option Blog
}
