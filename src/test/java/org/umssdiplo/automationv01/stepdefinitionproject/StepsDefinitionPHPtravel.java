package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Dashboard.Dashboard;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Routes.AddRoute.AddRoutePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Routes.EditRoute.EditRoutePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Routes.RoutesPage;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private Login login;
    private Dashboard dashboardPage;
    private RoutesPage routesPage;
    private AddRoutePage addRoutePage;
    private EditRoutePage editRoutePage;

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
        dashboardPage = dashboardPage.clickFlighMenu();
    }

    @And("^go to the routes page$")
    public void goToTheRoutesPage() {
        routesPage = dashboardPage.clickFlighMenuRoutes();
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

    @And("^click on icon edit on first element on Route page$")
    public void clickOnIconEditOnFirstElementOnRoutePage() {
        editRoutePage = routesPage.clickOnIconEditOnFirstElement();
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


    // Option Tours



    // Option Cars



    // Option Blog
}
