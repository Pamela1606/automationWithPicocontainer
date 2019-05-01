/**
 * @autor M. Antonio Vargas
 */
package org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.CarsSettings;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;
import java.util.Map;

public class CarsSettingsPage extends BasePage {
  @FindBy(css = "a[href='#CARTYPES']")
  private WebElement typesTab;

  @FindBy(css = "button[data-target='#ADD_CARS_TYPES']")
  private WebElement addCarTypeButton;

  @FindBy(css = "div#ADD_CARS_TYPES input[name='name']")
  private WebElement typeNameInput;

  @FindBy(css = "div#ADD_CARS_TYPES input[name='translated[ru][name]']")
  private WebElement nameInRussianInput;

  @FindBy(css = "div#ADD_CARS_TYPES input[name='translated[fa][name]']")
  private WebElement nameInFarsiInput;

  @FindBy(css = "div#ADD_CARS_TYPES input[name='translated[fr][name]']")
  private WebElement nameInFrenchInput;

  @FindBy(css = "div#ADD_CARS_TYPES input[name='translated[tr][name]']")
  private WebElement nameInTurkishInput;

  @FindBy(css = "div#ADD_CARS_TYPES input[name='translated[ar][name]']")
  private WebElement nameInArabicInput;

  @FindBy(css = "div#ADD_CARS_TYPES input[name='translated[es][name]']")
  private WebElement nameInSpanishInput;

  @FindBy(css = "div#ADD_CARS_TYPES button[type='submit']")
  private WebElement addCarTypeModalButton;

  @FindBy(css = "div#CARTYPES tbody > tr:first-child > td:nth-child(3)")
  private WebElement tdOfFirstRecordCarTypes;

  public CarsSettingsPage clickOnTheTypesTab() {
    CommonEvents.clickButton(typesTab);

    return this;
  }

  public CarsSettingsPage clickAddButtonOfTypesTab() {
    CommonEvents.clickButton(addCarTypeButton);

    return this;
  }

  public CarsSettingsPage fillAddCarTypeModalForm(List<Map<String, String>> data) {
    Map<String, String> dataForm = data.get(0);

    CommonEvents.waitWebElementIsVisible(typeNameInput);

    CommonEvents.setInputField(typeNameInput, dataForm.get("Type name"));
    CommonEvents.setInputField(nameInRussianInput, dataForm.get("Name in Russian"));
    CommonEvents.setInputField(nameInFarsiInput, dataForm.get("Name in Farsi"));
    CommonEvents.setInputField(nameInFrenchInput, dataForm.get("Name in French"));
    CommonEvents.setInputField(nameInTurkishInput, dataForm.get("Name in Turkish"));
    CommonEvents.setInputField(nameInArabicInput, dataForm.get("Name in Arabic"));
    CommonEvents.setInputField(nameInSpanishInput, dataForm.get("Name in Spanish"));

    CommonEvents.clickButton(addCarTypeModalButton);

    return this;
  }

  public String getNameOfFirstRecordOfTabTypes() {
    return CommonEvents.getTextContent(tdOfFirstRecordCarTypes);
  }

}
