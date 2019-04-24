package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Dashboard.Dashboard;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Routes.AddRoute.AddRoutePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Routes.RoutesPage;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private Login login;
    private Dashboard dashboardPage;
    private RoutesPage routesPage;
    private AddRoutePage addRoutePage;

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
        dashboardPage.clickFlighMenu();
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
        addRoutePage.selectStatus(arg0);
    }

    @And("^fill \"([^\"]*)\" Total Hours field on Add Route page$")
    public void fillTotalHoursField(String arg0) throws Throwable {
        addRoutePage.fillTotalHours(arg0);
    }

    @And("^fill \"([^\"]*)\" Vat Tax field on Add Route page$")
    public void fillVatTaxField(String arg0) throws Throwable {
        addRoutePage.fillVatTax(arg0);
    }

    @And("^fill \"([^\"]*)\" Deposite field on Add Route page$")
    public void fillDepositeField(String arg0) throws Throwable {
        addRoutePage.fillDeposite(arg0);
    }

    @And("^select \"([^\"]*)\" Flight Type on Add Route page$")
    public void selectFlightTypeOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage.selectFlightsType(arg0);
    }

    @And("^select \"([^\"]*)\" Refundable on Add Route page$")
    public void selectRefundableOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage.selectRefundable(arg0);
    }

    @And("^select \"([^\"]*)\" Direction on Add Route page$")
    public void selectDirectionOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage.selectDirection(arg0);
    }

    @And("^fill \"([^\"]*)\" Price Adults field on Add Route page$")
    public void fillPriceAdultsFieldOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage.fillPriceAdults(arg0);
    }

    @And("^fill \"([^\"]*)\" Price Child field on Add Route page$")
    public void fillPriceChildFieldOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage.fillPriceChild(arg0);
    }

    @And("^fill \"([^\"]*)\" Price Infant field on Add Route page$")
    public void fillPriceInfantFieldOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage.fillPriceInfant(arg0);
    }

    @And("^select \"([^\"]*)\" City Airport Departure on Add Route page$")
    public void selectCityAirportDepartureOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage.selectCityAirportDeparture(arg0);
    }

    @And("^select \"([^\"]*)\" Airline Departure on Add Route page$")
    public void selectAirlineDepartureOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage.selectAirlineDeparture(arg0);
    }

    @And("^fill \"([^\"]*)\" Flights No Departure on Add Route Page$")
    public void fillFlightsNoDepartureOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage.fillFlightsNoDeparture(arg0);
}

    @And("^fill \"([^\"]*)\" Date Departure on Add Route Page$")
    public void fillDateDepartureOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage.fillDateDeparture(arg0);
    }

    @And("^fill \"([^\"]*)\" Time Departure on Add Route page$")
    public void fillTimeDepartureOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage.fillTimeDeparture(arg0);
    }

    @And("^fill \"([^\"]*)\" CheckOut Departure on Add Route Page$")
    public void fillCheckOutDepartureOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage.fillCheckOutDeparture(arg0);
    }

    @And("^select \"([^\"]*)\" City Airport Arrival on Add Route page$")
    public void selectCityAirportArrivalOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage.selectCityAirportArrival(arg0);
    }

    @And("^select \"([^\"]*)\" Airline Arrival on Add Route page$")
    public void selectAirlineArrivalOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage.selectAirlineArrival(arg0);
    }

    @And("^fill \"([^\"]*)\" Flights No Arrival on Add Route Page$")
    public void fillFlightsNoArrivalOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage.fillFlightsNoArrival(arg0);
    }

    @And("^fill \"([^\"]*)\" Date Arrival on Add Route Page$")
    public void fillDateArrivalOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage.fillDateArrival(arg0);
    }

    @And("^fill \"([^\"]*)\" Time Arrival on Add Route page$")
    public void fillTimeArrivalOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage.fillTimeArrival(arg0);
    }

    @And("^fill \"([^\"]*)\" CheckOut Arrival on Add Route Page$")
    public void fillCheckOutArrivalOnAddRoutePage(String arg0) throws Throwable {
        addRoutePage.fillCheckOutArrival(arg0);
    }


    // Option Tours



    // Option Cars



    // Option Blog
}
