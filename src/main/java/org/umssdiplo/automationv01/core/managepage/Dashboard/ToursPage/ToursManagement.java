package org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Settings.SettingsPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.AddNew.AddNewPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Extras.ExtrasPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Reviews.ReviewsPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Tours.ToursPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class ToursManagement extends BasePage {

    @FindBy(xpath = "//*[@id=\"Tours\"]/li[1]/a")
    private WebElement tourMenuTours;

    @FindBy(xpath = "//*[@id=\"Tours\"]/li[2]/a")
    private WebElement tourMenuAddNew;

    @FindBy(xpath = "//*[@id=\"Tours\"]/li[3]/a")
    private WebElement tourMenuExtras;

    @FindBy(xpath = "//*[@id=\"Tours\"]/li[4]/a")
    private WebElement tourMenuReviews;

    @FindBy(xpath = "//*[@id=\"Tours\"]/li[5]/a")
    private WebElement tourMenuSettings;

    public ToursPage clickTourMenuTours() {
        CommonEvents.waitWebElementClickable(tourMenuTours);
        CommonEvents.clickButton(tourMenuTours);
        return new ToursPage();
    }

    public AddNewPage clickTourMenuAddNew() {
        CommonEvents.waitWebElementClickable(tourMenuAddNew);
        CommonEvents.clickButton(tourMenuAddNew);
        return new AddNewPage();
    }

    public ExtrasPage clickTourMenuExtras() {
        CommonEvents.waitWebElementClickable(tourMenuExtras);
        CommonEvents.clickButton(tourMenuExtras);
        return new ExtrasPage();
    }

    public ReviewsPage clickTourMenuReviews() {
        CommonEvents.waitWebElementClickable(tourMenuReviews);
        CommonEvents.clickButton(tourMenuReviews);
        return new ReviewsPage();
    }

    public SettingsPage clickTourMenuSettings() {
        CommonEvents.waitWebElementClickable(tourMenuSettings);
        CommonEvents.clickButton(tourMenuSettings);
        return new SettingsPage();
    }


}
