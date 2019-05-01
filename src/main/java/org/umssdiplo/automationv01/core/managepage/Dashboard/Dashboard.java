package org.umssdiplo.automationv01.core.managepage.Dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.Cars.CarsPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.CarsSettings.CarsSettingsPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Dashboard extends BasePage {
  @FindBy(css = "a[href='#Cars']")
  private WebElement carsOption;

  @FindBy(xpath = "//ul[@id='Cars']//a[contains(text(),'Cars')]")
  private WebElement carsSuboption;

  @FindBy(xpath = "//ul[@id='Cars']//a[contains(text(),'Cars Settings')]")
  private WebElement carsSettingsSuboption;

  public Dashboard selectCarsOption() {
    CommonEvents.clickButton(carsOption);

    return this;
  }

  public CarsPage selectSuboptionCarsOfCarsOption() {
    CommonEvents.clickButton(carsSuboption);

    return new CarsPage();
  }

  public CarsSettingsPage selectSuboptionCarsSettingsOfCarsOption() {
    CommonEvents.clickButton(carsSettingsSuboption);

    return new CarsSettingsPage();
  }

}
