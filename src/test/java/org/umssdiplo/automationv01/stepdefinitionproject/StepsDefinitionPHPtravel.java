package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Dashboard.Dashboard;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airlines.AirlinesPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.FlightsManager;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Settings.SettingsPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.AddNew.AddNewPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Extras.AddExtraPage.AddExtraPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Extras.DeleteExtraPage.DeleteExtraPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Extras.EditExtraPage.EditExtraPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Extras.ExtrasPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Extras.ViewExtraPage.ViewExtraPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Reviews.ReviewsPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Tours.AddTours.AddToursPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Tours.DeleteTours.DeleteToursPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Tours.EditTours.EditToursPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Tours.ToursPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.ToursManagement;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private Login login;
    private Dashboard dashboardPage;
    private ToursPage toursPage;
    private AddToursPage addToursPage;
    private EditToursPage editToursPage;
    private DeleteToursPage deleteToursPage;
    private AddNewPage addNewPage;
    private ExtrasPage extrasPage;
    private AddExtraPage addExtraPage;
    private ViewExtraPage viewExtraPage;
    private EditExtraPage editExtraPage;
    private DeleteExtraPage deleteExtraPage;
    private ReviewsPage reviewsPage;
    private SettingsPage settingsPage;
    private AirlinesPage airlinesPage;
    private ToursManagement toursManagement;

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

    /*@And("^click on add button on Tours page$")
    public void clickOnAddButton() {
        addToursPage = toursPage.clickAddButton();
    }*/



    // Option Cars



    // Option Blog
}
