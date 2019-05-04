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



    // Option Cars



    // Option Blog
}
