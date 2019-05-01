package org.umssdiplo.automationv01.core.managepage.Dashboard.BlogPages.Category;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class CategoryPostPage extends BasePage {

    ModelCategory modelCategory = new ModelCategory("");

    @FindBy(xpath = "//div/div[contains(text(),'Blog Categories')]")
    private WebElement titleElement;

    public CategoryPostPage checkTitleExiste(String arg0) {
        System.out.println(CommonEvents.getTextContent(titleElement));
        CommonEvents.waitWebElementIsVisible(titleElement);
        modelCategory.setName(arg0);
        return this;
    }

    public void assertTitle() {
        assert modelCategory.getName().equals(CommonEvents.getTextContent(titleElement));
    }
}
