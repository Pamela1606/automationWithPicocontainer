package org.umssdiplo.automationv01.core.managepage.Home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class MainMenu extends BasePage {
  @FindBy(xpath = "//a[contains(text(), 'CARS')]")
  private WebElement carsOption;


  public void selectCarsOption() {
    CommonEvents.clickButton(carsOption);
  }
}
