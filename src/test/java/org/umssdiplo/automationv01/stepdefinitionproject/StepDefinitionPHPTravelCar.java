package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import org.umssdiplo.automationv01.core.managepage.Home.MainMenu;

public class StepDefinitionPHPTravelCar {
  private MainMenu mainMenu;

  @And("^click 'CARS option' in the 'main menu' of the 'Home page'$")
  public void clickOptionCARSInTheMainMenuOfTheHomePage() {
    mainMenu.selectCarsOption();
  }
}
