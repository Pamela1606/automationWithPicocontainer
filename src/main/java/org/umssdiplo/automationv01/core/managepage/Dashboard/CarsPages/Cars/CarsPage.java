/**
 * @autor M. Antonio Vargas
 */
package org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.Cars;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.Cars.AddCars.AddCarPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class CarsPage extends BasePage {
  @FindBy(css = "div.panel-heading")
  private WebElement pageTitle;

  @FindBy(css = "button[type='submit']")
  private WebElement addButton;

  @FindBy(css = "tbody > tr:nth-child(1) > td:nth-child(5) a")
  private WebElement linkNameOfFirstRecord;

  public String getTitleDisplayed() {
    return CommonEvents.getTextContent(pageTitle);
  }

  public AddCarPage clickAddButton() {
    CommonEvents.clickButton(addButton);

    return new AddCarPage();
  }

  public String getNameOfFirstRecord() {
    return CommonEvents.getTextContent(linkNameOfFirstRecord);
  }

}
