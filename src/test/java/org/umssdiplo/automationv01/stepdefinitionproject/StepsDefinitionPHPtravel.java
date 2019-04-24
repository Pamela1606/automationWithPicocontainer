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


    // Option Tours



    // Option Cars



    // Option Blog
}
