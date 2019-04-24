package org.umssdiplo.automationv01.core.managepage.Dashboard.BlogPages.Posts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class PostPage extends BasePage {

    @FindBy(xpath = "//div/a[contains(text(),'Search')]")
    private WebElement buttonSearch;

    @FindBy(name = "phrase")
    private WebElement elementSearch;

    @FindBy(xpath = "//div/span/span/a[contains(text(), 'Go')]")
    private WebElement buttonGo;

    @FindBy(xpath = "//form/button[contains(text(), 'Add')]")
    private WebElement buttonNew;

    @FindBy(xpath = "//span[@class='btn-group']/a[@class='btn btn-default btn-xcrud btn-danger']/i[@class='fa fa-times']")
    private WebElement delete;

    public PostPage clickSearch() {
        CommonEvents.waitWebElementIsVisible(buttonSearch);
        CommonEvents.clickButton(buttonSearch);
        return this;
    }

    public PostPage searchElement(String name) {
        CommonEvents.waitWebElementIsVisible(elementSearch);
        CommonEvents.setInputField(elementSearch, name);
        return this;
    }

    public PostPage clickButton() {
        CommonEvents.waitWebElementIsVisible(buttonGo);
        CommonEvents.clickButton(buttonGo);
        return this;
    }

    public PostPage clickDeletePostPage() {
        CommonEvents.forceWait(5000);
        CommonEvents.waitWebElementIsVisible(delete);
        CommonEvents.clickButton(delete);
        return this;
    }

    public PostPage pressEnterDelete() {
        CommonEvents.forceWait(4000);
        webDriver.switchTo().alert().accept();
        return this;
    }

    public PostPage clickNew() {
        CommonEvents.waitWebElementIsVisible(buttonNew);
        CommonEvents.clickButton(buttonNew);
        return this;
    }
}
