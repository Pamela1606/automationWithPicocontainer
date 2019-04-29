package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.Cars.AddCars.AddCarPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.Cars.CarsPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.Dashboard;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

import java.util.List;
import java.util.Map;

public class StepsDefinitionPHPtravel {
    private Login login;
    private Dashboard dashboardPage;

    private CarsPage carsPage;
    private AddCarPage addCarPage;

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


    // Option Blog
}
