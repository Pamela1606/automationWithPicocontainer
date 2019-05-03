package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Dashboard.Dashboard;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airlines.AddAirlines.AddAirlinesPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airlines.AirlinesPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airlines.EditAirlines.EditAirlinesPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airlines.InspectAirlines.InspectAirlinesPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airports.AddAirport.AddAirportPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airports.AirportsPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airports.EditAirport.EditAirportPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airports.InspectAirport.InspectAirportPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.FlightsManager;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Routes.AddRoute.AddRoutePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Routes.EditRoute.EditRoutePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Routes.RoutesPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Settings.SettingsPage;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private Login login;
    private Dashboard dashboardPage;
    private RoutesPage routesPage;
    private AddRoutePage addRoutePage;
    private EditRoutePage editRoutePage;
    private AirportsPage airportsPage;
    private AddAirportPage addAirportPage;
    private EditAirportPage editAirportPage;
    private InspectAirportPage inspectAirportPage;
    private SettingsPage settingsPage;
    private AirlinesPage airlinesPage;
    private AddAirlinesPage addAirlinesPage;
    private EditAirlinesPage editAirlinesPage;
    private InspectAirlinesPage inspectAirlinesPage;
    private FlightsManager flightsManager;

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

    @And("^click on flights menu$")
    public void clickOnFlightsMenu() {
        flightsManager = dashboardPage.clickFlightMenu();
    }

    @And("^go to the routes page$")
    public void goToTheRoutesPage() {
        routesPage = flightsManager.clickFlightMenuRoutes();
    }

    @And("^click on add button on Routes page$")
    public void clickOnAddButton() {
        addRoutePage = routesPage.clickAddButton();
    }

    @And("^select \"([^\"]*)\" Status on Add Route page$")
    public void selectState(String arg0) throws Throwable {
        addRoutePage = addRoutePage.selectStatus(arg0);
    }

    @And("^fill \"([^\"]*)\" Total Hours field on Add Route page$")
    public void fillTotalHoursField(String arg0) throws Throwable {
        addRoutePage =  addRoutePage.fillTotalHours(arg0);
    }

    @And("^fill \"([^\"]*)\" Vat Tax field on Add Route page$")
    public void fillVatTaxField(String arg0) throws Throwable {
        addRoutePage =  addRoutePage.fillVatTax(arg0);
    }

    @And("^fill \"([^\"]*)\" Deposite field on Add Route page$")
    public void fillDepositeField(String arg0) throws Throwable {
        addRoutePage =  addRoutePage.fillDeposite(arg0);
    }

    @And("^select \"([^\"]*)\" Flight Type on Add Route page$")
    public void selectFlightTypeOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage = addRoutePage.selectFlightsType(arg0);
    }

    @And("^select \"([^\"]*)\" Refundable on Add Route page$")
    public void selectRefundableOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage =  addRoutePage.selectRefundable(arg0);
    }

    @And("^select \"([^\"]*)\" Direction on Add Route page$")
    public void selectDirectionOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage = addRoutePage.selectDirection(arg0);
    }

    @And("^fill \"([^\"]*)\" Price Adults field on Add Route page$")
    public void fillPriceAdultsFieldOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage = addRoutePage.fillPriceAdults(arg0);
    }

    @And("^fill \"([^\"]*)\" Price Child field on Add Route page$")
    public void fillPriceChildFieldOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage =  addRoutePage.fillPriceChild(arg0);
    }

    @And("^fill \"([^\"]*)\" Price Infant field on Add Route page$")
    public void fillPriceInfantFieldOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage = addRoutePage.fillPriceInfant(arg0);
    }

    @And("^select \"([^\"]*)\" City Airport Departure on Add Route page$")
    public void selectCityAirportDepartureOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage = addRoutePage.selectCityAirportDeparture(arg0);
    }

    @And("^select \"([^\"]*)\" Airline Departure on Add Route page$")
    public void selectAirlineDepartureOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage = addRoutePage.selectAirlineDeparture(arg0);
    }

    @And("^fill \"([^\"]*)\" Flights No Departure on Add Route page$")
    public void fillFlightsNoDepartureOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage = addRoutePage.fillFlightsNoDeparture(arg0);
}

    @And("^fill \"([^\"]*)\" Date Departure on Add Route page$")
    public void fillDateDepartureOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage = addRoutePage.fillDateDeparture(arg0);
    }

    @And("^fill \"([^\"]*)\" Time Departure on Add Route page$")
    public void fillTimeDepartureOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage = addRoutePage.fillTimeDeparture(arg0);
    }

    @And("^fill \"([^\"]*)\" CheckOut Departure on Add Route Page$")
    public void fillCheckOutDepartureOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage = addRoutePage.fillCheckOutDeparture(arg0);
    }

    @And("^select \"([^\"]*)\" City Airport Arrival on Add Route page$")
    public void selectCityAirportArrivalOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage = addRoutePage.selectCityAirportArrival(arg0);
    }

    @And("^select \"([^\"]*)\" Airline Arrival on Add Route page$")
    public void selectAirlineArrivalOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage = addRoutePage.selectAirlineArrival(arg0);
    }

    @And("^fill \"([^\"]*)\" Flights No Arrival on Add Route page$")
    public void fillFlightsNoArrivalOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage = addRoutePage.fillFlightsNoArrival(arg0);
    }

    @And("^fill \"([^\"]*)\" Date Arrival on Add Route page$")
    public void fillDateArrivalOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage = addRoutePage.fillDateArrival(arg0);
    }

    @And("^fill \"([^\"]*)\" Time Arrival on Add Route page$")
    public void fillTimeArrivalOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage = addRoutePage.fillTimeArrival(arg0);
    }

    @And("^fill \"([^\"]*)\" CheckOut Arrival on Add Route page$")
    public void fillCheckOutArrivalOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage = addRoutePage.fillCheckOutArrival(arg0);
    }

    @And("^click On Submit on Add Route page$")
    public void clickOnSubmitOnAddRoutePage() {
        routesPage = addRoutePage.clickOnSubmit();
    }

    @And("^click on SearchButton on Route page$")
    public void clickOnSearchButtonOnRoutePage() {
        routesPage = routesPage.clickOnSearchButton();
    }

    @And("^fill element to search \"([^\"]*)\" Search field On Route page$")
    public void fillElementeToSearchSearchFieldOnRoutePage(String arg0) throws Throwable {
        routesPage = routesPage.fillElementeToSearch(arg0);
    }

    @And("^select by field \"([^\"]*)\" on Route page$")
    public void selectByFieldOnRoutePage(String arg0) throws Throwable {
        routesPage = routesPage.selectByField(arg0);
    }

    @And("^click on GO button on Route page$")
    public void clickOnGOButtonOnRoutePage() {
        routesPage = routesPage.clickOnGOButton();
    }

    @And("^select \"([^\"]*)\" Status on Edit Route page$")
    public void selectStatusOnEditRoutePage(String arg0) throws Throwable {
        editRoutePage = editRoutePage.selectStatus(arg0);
    }

    @And("^edit with \"([^\"]*)\" Total Hours field on Edit Route page$")
    public void editWithTotalHoursFieldOnEditRoutePage(String arg0) throws Throwable {
        editRoutePage = editRoutePage.editTotalHoursField(arg0);
    }

    @And("^edit with \"([^\"]*)\" Vat Tax field on Edit Route page$")
    public void editWithVatTaxFieldOnEditRoutePage(String arg0) throws Throwable {
        editRoutePage = editRoutePage.editVatTaxField(arg0);
    }

    @And("^edit with \"([^\"]*)\" Deposite field on Edit Route page$")
    public void editWithDepositeFieldOnEditRoutePage(String arg0) throws Throwable {
        editRoutePage = editRoutePage.editDepositeField(arg0);
    }

    @And("^select \"([^\"]*)\" Flight Type on Edit Route page$")
    public void selectFlightTypeOnEditRoutePage(String arg0) throws Throwable {
        editRoutePage = editRoutePage.editselectFlightType(arg0);
    }

    @And("^select \"([^\"]*)\" Refundable on Edit Route page$")
    public void selectRefundableOnEditRoutePage(String arg0) throws Throwable {
        editRoutePage = editRoutePage.editselectRefundable(arg0);
    }

    @And("^edit \"([^\"]*)\" Date Departure on Edit Route page$")
    public void editDateDepartureOnEditRoutePage(String arg0) throws Throwable {
        editRoutePage = editRoutePage.editDateDeparture(arg0);
    }

    @And("^edit \"([^\"]*)\" Date Arrival on Edit Route page$")
    public void editDateArrivalOnEditRoutePage(String arg0) throws Throwable {
        editRoutePage = editRoutePage.editDateArrival(arg0);
    }

    @And("^click On Submit on Edit Route page$")
    public void clickOnSubmitOnEditRoutePage() {
        routesPage = editRoutePage.clickOnSubmit();
    }

    @And("^go to the Airport page$")
    public void goToTheAirportPage() {
        airportsPage = flightsManager.clickFlightMenuAirports();
    }

    @And("^click on add button on Airport page$")
    public void clickOnAddButtonOnArportPage() {
        addAirportPage = airportsPage.clickOnAddButton();
    }

    @And("^fill \"([^\"]*)\" Code field on Add Airport page$")
    public void fillCodeFieldOnAirportPage(String arg0) throws Throwable {
        addAirportPage = addAirportPage.fillCode(arg0);
    }

    @And("^fill \"([^\"]*)\" Name field on Add Airport page$")
    public void fillNameField(String arg0) throws Throwable {
        addAirportPage = addAirportPage.fillName(arg0);
    }

    @And("^fill \"([^\"]*)\" Citycode field on Add Airport page$")
    public void fillCitycodeFieldOnAirportPage(String arg0) throws Throwable {
        addAirportPage = addAirportPage.fillCitycode(arg0);
    }

    @And("^fill \"([^\"]*)\" Cityname field on Add Airport page$")
    public void fillCitynameFieldOnAirportPage(String arg0) throws Throwable {
        addAirportPage = addAirportPage.fillCityname(arg0);
    }

    @And("^fill \"([^\"]*)\" Countryname field on Add Airport page$")
    public void fillCountrynameFieldOnAirportPage(String arg0) throws Throwable {
        addAirportPage = addAirportPage.fillCountryname(arg0);
    }

    @And("^fill \"([^\"]*)\" Countrycode field on Add Airport page$")
    public void fillCountrycodeFieldOnAirportPage(String arg0) throws Throwable {
        addAirportPage = addAirportPage.fillCountrycode(arg0);
    }

    @And("^fill \"([^\"]*)\" Timezone field on Add Airport page$")
    public void fillTimezoneFieldOnAirportPage(String arg0) throws Throwable {
        addAirportPage = addAirportPage.fillTimezone(arg0);
    }

    @And("^fill \"([^\"]*)\" Latitud field on Add Airport page$")
    public void fillLatitudFieldOnAirportPage(String arg0) throws Throwable {
        addAirportPage = addAirportPage.fillLatitud(arg0);
    }

    @And("^fill \"([^\"]*)\" Longitud field on Add Airport page$")
    public void fillLongitudFieldOnAirportPage(String arg0) throws Throwable {
        addAirportPage = addAirportPage.fillLongitud(arg0);
    }

    @And("^fill \"([^\"]*)\" City field on Add Airport page$")
    public void fillCityFieldOnAirportPage(String arg0) throws Throwable {
        addAirportPage = addAirportPage.fillCity(arg0);
    }

    @And("^click on save & return on Add Airport page$")
    public void clickOnSaveReturnOnAddAirportPage() {
        airportsPage = addAirportPage.clickOnSaveReturn();
    }

    @And("^click on Search button on Airport page$")
    public void clickOnSearchButtonOnAirportPage() {
        airportsPage = airportsPage.clickOnSearchButton();
    }

    @And("^fill element to search \"([^\"]*)\" Search field on Airport page$")
    public void fillElementToSearchSearchFieldOnAirportPage(String arg0) throws Throwable {
        airportsPage = airportsPage.fillElementToSearch(arg0);
    }

    @And("^select by field \"([^\"]*)\" on Airport page$")
    public void selectByFieldOnAirportPage(String arg0) throws Throwable {
        airportsPage = airportsPage.selectByField(arg0);
    }

    @And("^click on GO button on Airport page$")
    public void clickOnGOButtonOnAirportPage() {
        airportsPage = airportsPage.clickOnGOButton();
    }

    @And("^close Session on Dashboard page$")
    public void cerrarSesionOnDashboardPage() {
        login = dashboardPage.closeSesion();
    }

    @And("^click on icon edit element selected on Airport page$")
    public void clickOnIconEditOnFirstElementOnAirportPage() {
        editAirportPage = airportsPage.clickIconElementToEdit();
    }

    @And("^edit with \"([^\"]*)\" Code field on Edit Airport page$")
    public void editWithCodeFieldOnEditAirportPage(String arg0) throws Throwable {
        editAirportPage = editAirportPage.editCode(arg0);
    }

    @And("^edit with \"([^\"]*)\" Name field on Edit Airport page$")
    public void editWithNameFieldOnEditAirportPage(String arg0) throws Throwable {
        editAirportPage = editAirportPage.editName(arg0);
    }

    @And("^edit with \"([^\"]*)\" Citycode field on Edit Airport page$")
    public void editWithCitycodeFieldOnEditAirportPage(String arg0) throws Throwable {
        editAirportPage = editAirportPage.editCitycode(arg0);
    }

    @And("^edit with \"([^\"]*)\" Cityname field on Edit Airport page$")
    public void editWithCitynameFieldOnEditAirportPage(String arg0) throws Throwable {
        editAirportPage = editAirportPage.editCityname(arg0);
    }

    @And("^edit with \"([^\"]*)\" Countryname field on Edit Airport page$")
    public void editWithCountrynameFieldOnEditAirportPage(String arg0) throws Throwable {
        editAirportPage = editAirportPage.editCountryname(arg0);
    }

    @And("^edit with \"([^\"]*)\" Countrycode field on Edit Airport page$")
    public void editWithCountrycodeFieldOnEditAirportPage(String arg0) throws Throwable {
        editAirportPage = editAirportPage.editCountrycode(arg0);
    }

    @And("^edit with \"([^\"]*)\" Timezone field on Edit Airport page$")
    public void editWithTimezoneFieldOnEditAirportPage(String arg0) throws Throwable {
        editAirportPage = editAirportPage.editTimezone(arg0);
    }

    @And("^edit with \"([^\"]*)\" Latitud field on Edit Airport page$")
    public void editWithLatitudFieldOnEditAirportPage(String arg0) throws Throwable {
        editAirportPage = editAirportPage.editLatitud(arg0);
    }

    @And("^edit with \"([^\"]*)\" Longitud field on Edit Airport page$")
    public void editWithLongitudFieldOnEditAirportPage(String arg0) throws Throwable {
        editAirportPage = editAirportPage.editLongitud(arg0);
    }

    @And("^edit with \"([^\"]*)\" City field on Edit Airport page$")
    public void editWithCityFieldOnEditAirportPage(String arg0) throws Throwable {
        editAirportPage = editAirportPage.editCity(arg0);
    }

    @And("^edit with on save & return on Edit Airport page$")
    public void editWithOnSaveReturnOnEditAirportPage() {
        airportsPage = editAirportPage.clickOnSaveReturn();
    }

    @And("^choose the element to select on Airport page$")
    public void chooseTheElementToSelectOnAirportPage() {
        airportsPage = airportsPage.chooseLastElementToSelect();
    }

    @And("^choose the element to select on Route page$")
    public void chooseTheElementToSelectOnRoutePage() {
        routesPage = routesPage.chooseLastElementToSelect();
    }

    @And("^click on icon edit element selected on Route page$")
    public void clickOnIconEditElementSelectedOnRoutePage() {
        editRoutePage = routesPage.clickIconElementToEdit();
    }

    @And("^click on icon inspect element selected on Airport page$")
    public void clickOnIconInspectElementSelectedOnAirportPage() {
        inspectAirportPage = airportsPage.clickIconElementToInspect();
    }

    @And("^check Code Field with value \"([^\"]*)\" on Inspect Airport page$")
    public void checkCodeFieldWithValueOnInspectAirportPage(String esperado) throws Throwable {
        String actual = inspectAirportPage.getCodeToCompare();
        Assert.assertEquals(esperado,actual);
    }

    @And("^check Name Field with value \"([^\"]*)\" on Inspect Airport page$")
    public void checkNameFieldWithValueOnInspectAirportPage(String esperado) throws Throwable {
        String actual = inspectAirportPage.getNameToCompare();
        Assert.assertEquals(esperado,actual);
    }

    @And("^check Citycode Field with value \"([^\"]*)\" on Inspect Airport page$")
    public void checkCitycodeFieldWithValueOnInspectAirportPage(String esperado) throws Throwable {
        String actual = inspectAirportPage.getCitycodeToCompare();
        Assert.assertEquals(esperado,actual);
    }

    @And("^check Cityname Field with value \"([^\"]*)\" on Inspect Airport page$")
    public void checkCitynameFieldWithValueOnInspectAirportPage(String esperado) throws Throwable {
        String actual = inspectAirportPage.getCitynameToCompare();
        Assert.assertEquals(esperado,actual);
    }

    @And("^check Countryname Field with value \"([^\"]*)\" on Inspect Airport page$")
    public void checkCountrynameFieldWithValueOnInspectAirportPage(String esperado) throws Throwable {
        String actual = inspectAirportPage.getCountrynameToCompare();
        Assert.assertEquals(esperado,actual);
    }

    @And("^check Countrycode Field with value \"([^\"]*)\" on Inspect Airport page$")
    public void checkCountrycodeFieldWithValueOnInspectAirportPage(String esperado) throws Throwable {
        String actual = inspectAirportPage.getCountrycodeToCompare();
        Assert.assertEquals(esperado,actual);
    }

    @And("^check Timezone Field with value \"([^\"]*)\" on Inspect Airport page$")
    public void checkTimezoneFieldWithValueOnInspectAirportPage(String esperado) throws Throwable {
        String actual = inspectAirportPage.getTimezoneToCompare();
        Assert.assertEquals(esperado,actual);
    }

    @And("^check Latitud Field with value \"([^\"]*)\" on Inspect Airport page$")
    public void checkLatitudFieldWithValueOnInspectAirportPage(String esperado) throws Throwable {
        String actual = inspectAirportPage.getLatitudToCompare();
        Assert.assertEquals(esperado,actual);
    }

    @And("^check Longitud Field with value \"([^\"]*)\" on Inspect Airport page$")
    public void checkLongitudFieldWithValueOnInspectAirportPage(String esperado) throws Throwable {
        String actual = inspectAirportPage.getLongitudToCompare();
        Assert.assertEquals(esperado,actual);
    }

    @And("^check City Field with value \"([^\"]*)\" on Inspect Airport page$")
    public void checkCityFieldWithValueOnInspectAirportPage(String esperado) throws Throwable {
        String actual = inspectAirportPage.getCityToCompare();
        Assert.assertEquals(esperado,actual);
    }

    @And("^click on Return button on Inspect Airport page$")
    public void clickOnReturnButtonOnInspectAirportPage() {
        airportsPage = inspectAirportPage.clickOnReturnButton();
    }

    @And("^click on icon delete element selected on Airport page$")
    public void clickOnIconDeleteElementSelectedOnAirportPage() {
        airportsPage = airportsPage.clickIconElementToDelete();
    }

    @And("^press on the Enter key to delete the chosen element on Airport page$")
    public void pressOnTheEnterKeyToDeleteTheChosenElementOnAirportPage() {
        airportsPage = airportsPage.pressEnterKey();
    }

    @And("^click on icon delete element selected on Route page$")
    public void clickOnIconDeleteElementSelectedOnRoutePage() {
        routesPage = routesPage.clickIconElementToDelete();
    }

    @And("^press on the Enter key to delete the chosen element on Route page$")
    public void pressOnTheEnterKeyToDeleteTheChosenElementOnRoutePage() {
        routesPage = routesPage.pressEnterKey();
    }

    @And("^go to the Setting page$")
    public void goToTheSettingPage() {
        settingsPage = flightsManager.clickFlightMenuSettings();
    }

    @And("^select \"([^\"]*)\" Test Mode on Setting page$")
    public void selectTestModeOnSettingPage(String arg0) throws Throwable {
        settingsPage = settingsPage.selectTestMode(arg0);
    }

    @And("^click on Submit Button on Setting page$")
    public void clickOnSubmitButtonOnSettingPage() {
        settingsPage = settingsPage.clickOnSubmitButton();
    }

    @And("^go to the Airline page$")
    public void goToTheAirlinePage() {
        airlinesPage = flightsManager.clickFlightMenuAirlines();
    }

    @And("^click on add button on Airline page$")
    public void clickOnAddButtonOnAirlinePage() {
        addAirlinesPage = airlinesPage.clickAddButton();
    }

    @And("^fill \"([^\"]*)\" Name field on Add Airline page$")
    public void fillNameFieldOnAddAirlinePage(String arg0) throws Throwable {
        addAirlinesPage = addAirlinesPage.fillFieldName(arg0);
    }

    @And("^fill \"([^\"]*)\" Iata Desi field on Add Airline page$")
    public void fillIataDesiFieldOnAddAirlinePage(String arg0) throws Throwable {
        addAirlinesPage = addAirlinesPage.fillFieldIataDesi(arg0);
    }

    @And("^fill \"([^\"]*)\" (\\d+)-Digit-Code field on Add Airline page$")
    public void fillDigitCodeFieldOnAddAirlinePage(String arg0, int arg1) throws Throwable {
        addAirlinesPage = addAirlinesPage.fillField3DigitCode(arg0);
    }

    @And("^fill \"([^\"]*)\" Country field on Add Airline page$")
    public void fillCountryFieldOnAddAirlinePage(String arg0) throws Throwable {
        addAirlinesPage = addAirlinesPage.selectCountry(arg0);
    }

    @And("^click button Save and Return on Add Airline page$")
    public void clickButtonSaveAndReturnOnAddAirlinePage() {
        airlinesPage = addAirlinesPage.saveReturnButton();
    }

    @And("^wait upload image \"([^\"]*)\" on Add Airline page$")
    public void waitUploadImageOnAddAirlinePage(String arg0) throws Throwable {
        addAirlinesPage = addAirlinesPage.waitToUploadImage();
    }

    @And("^click on Search button on Airline page$")
    public void clickOnSearchButtonOnAirlinePage() {
        airlinesPage = airlinesPage.clickOnSearchButton();

    }

    @And("^fill element to search \"([^\"]*)\" Search field on Airline page$")
    public void fillElementToSearchSearchFieldOnAirlinePage(String arg0) throws Throwable {
        airlinesPage = airlinesPage.fillSearchField(arg0);
    }

    @And("^select by field \"([^\"]*)\" on Airline page$")
    public void selectByFieldOnAirlinePage(String arg0) throws Throwable {
        airlinesPage = airlinesPage.selectField(arg0);
    }

    @And("^click on GO button on Airline page$")
    public void clickOnGOButtonOnAirlinePage() {
        airlinesPage = airlinesPage.clickOnGoButton();
    }

    @And("^choose the element to select on Airline page$")
    public void chooseTheElementToSelectOnAirlinePage() {
        airlinesPage = airlinesPage.chooseLastElementToSelect();
    }

    @And("^click on icon edit element selected on Airline page$")
    public void clickOnIconEditElementSelectedOnAirlinePage() {
        editAirlinesPage = airlinesPage.clickIconElementToEdit();
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
    }


    // Option Tours



    // Option Cars



    // Option Blog
}
