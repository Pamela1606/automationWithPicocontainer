package org.umssdiplo.automationv01.core.managepage.Dashboard.BlogPages.Category;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class CategoryPostPage extends BasePage {

    ModelCategory modelCategory = new ModelCategory("");

    @FindBy(xpath = "//div/div[contains(text(),'Blog Categories')]")
    private WebElement titleElement;

    @FindBy(xpath = "//button[contains(text(), 'Add')]")
    private WebElement buttonNew;

    @FindBy(xpath = "//div[@class='row form-group'][1]/div[@class='col-md-8']/input[@class='form-control']")
    private WebElement inputname;

    @FindBy(xpath = "//div[@id='ADD_BLOG_CAT']/div[@class='modal-dialog']/div[@class='modal-content']/form/div[@class='modal-footer']/button[@class='btn btn-primary']")
    private WebElement saveButton;

    @FindBy(name = "phrase")
    private WebElement elementSearch;

    @FindBy(xpath = "//div/span/span/a[contains(text(), 'Go')]")
    private WebElement buttonGo;

    @FindBy(xpath = "//div/a[contains(text(),'Search')]")
    private WebElement buttonSearch;

    @FindBy(xpath = "//tbody/tr[@class='xcrud-row xcrud-row-0'][1]/td[3]")
    private WebElement elementCheck;

    public CategoryPostPage checkTitleExiste(String arg0) {
        System.out.println(CommonEvents.getTextContent(titleElement));
        CommonEvents.waitWebElementIsVisible(titleElement);
        modelCategory.setName(arg0);
        return this;
    }

    public void assertTitle() {
        assert modelCategory.getName().equals(CommonEvents.getTextContent(titleElement));
    }

    public CategoryPostPage clickNew() {
        CommonEvents.waitWebElementIsVisible(buttonNew);
        CommonEvents.clickButton(buttonNew);
        return this;
    }

    public CategoryPostPage fillNewCategory(String arg0) {
        CommonEvents.waitWebElementIsVisible(inputname);
        CommonEvents.setInputField(inputname, arg0);
        return this;
    }

    public CategoryPostPage savenewCategory() {
        CommonEvents.waitWebElementIsVisible(saveButton);
        CommonEvents.clickButton(saveButton);
        return this;
    }

    public CategoryPostPage clickSearchCategory() {
        CommonEvents.waitWebElementIsVisible(buttonSearch);
        CommonEvents.clickButton(buttonSearch);
        CommonEvents.waitWebElementIsVisible(elementSearch);
        CommonEvents.setInputField(elementSearch, "The Creative");
        return this;
    }

    public CategoryPostPage goPageSearch() {
        CommonEvents.waitWebElementIsVisible(buttonGo);
        CommonEvents.clickButton(buttonGo);
        return this;
    }

    public CategoryPostPage assertExistNewelement() {
        CommonEvents.waitWebElementIsVisible(elementCheck);
        assert CommonEvents.getTextContent(elementCheck).equals("The Creative");
        return this;
    }
}
