package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Dashboard.Dashboard;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.HotelPage;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private Login login;
    private Dashboard dashboardPage;
    private HotelPage hotelPage;

    @Given("^'PHP travel' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        dashboardPage = login.setCredentials();
    }


    // Option Hotels
    @And("^click to 'option Hotels' on lateral menu into dashboard page$")
    public void clickToOptionHotelsOnLateralMenuIntoDashboardPage() {
        dashboardPage = dashboardPage.clickOptionHotelLateralMenu();
    }

    @And("^click to 'sub option Hotels' on lateral menu into dashboard page$")
    public void clickToSubOptionHotelsOnLateralMenuIntoDashboardPage() {
        hotelPage = dashboardPage.clickSubOptionHotelLateralMenu();
    }

    @Then("^Verify that the \"([^\"]*)\" is displayed on 'dashboard' page$")
    public void verifyThatTheIsDisplayedOnDashboardPage(String titleHotelPage) throws Throwable {
        String titleHotelPageActual = hotelPage.getTitleHotelPage();
        Assert.assertEquals(titleHotelPageActual, titleHotelPage);
    }



    // Option Flights



    // Option Tours



    // Option Cars



    // Option Blog
}
