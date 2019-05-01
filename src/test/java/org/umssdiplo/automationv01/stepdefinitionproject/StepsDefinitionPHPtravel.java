package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.umssdiplo.automationv01.core.managepage.Dashboard.BlogPages.BlogManager;
import org.umssdiplo.automationv01.core.managepage.Dashboard.BlogPages.Posts.PostPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.BlogPages.Category.CategoryPostPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.Dashboard;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private Login login;
    private Dashboard dashboardPage;
    private BlogManager blogManager;

    private PostPage postPage;
    private CategoryPostPage categoryBlogPage;


    @Given("^'PHP travel' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        dashboardPage = login.setCredentials();
    }

    @And("^click on blog menu$")
    public void clickOnBlogMenu() { blogManager = dashboardPage.clickBlogMenu(); }

    @And("^go to the 'Post' in blog page$")
    public void goToToTheBlogPage() {
        postPage = blogManager.clickPostMenu();
    }

    @And("^click on 'Search' in post page$")
    public void clickOnSearchInPostPage() {
        postPage.clickSearch();
    }

    @And("^search \"([^\"]*)\" on post page$")
    public void searchOnPostPage(String name) throws Throwable {
        postPage.searchElement(name);
    }

    @And("^click 'go button' on Post page$")
    public void clickGoButtonOnPostPage() {
        postPage.clickButton();
    }

    @And("^client en 'delete post' in post page$")
    public void clientEnDeletePostInPostPage() {
        postPage.clickDeletePostPage();
    }

    @And("^press on the Enter key to delete in post page$")
    public void pressOnTheEnterKeyToDeleteInPostPage() {
        postPage.pressEnterDelete();
    }

    @And("^close Session on Dashboard page$")
    public void cerrarSesionOnDashboardPage() {
        login = dashboardPage.closeSesion();
    }

    @And("^click in new in blog page$")
    public void clickInNewInBlogPage() {
        postPage.clickNew();
    }

    @And("^check List in blog nemu$")
    public void assertListInBlogSecction(){ blogManager.setValuesModelexpexted(); }

    @Then("^assert list in blog secction:$")
    public void assertListInBlogSecction(DataTable datos) throws Throwable {
        blogManager.checkAssert(datos);
    }

    @And("^check \"([^\"]*)\" in secction Post into blogs$")
    public void checkInSecctionPostIntoBlogs(String arg0) throws Throwable {
        postPage.checkBlogmanagerTitle(arg0);
    }

    @Then("^fill in data for new post:$")
    public void fillInDataForNewPost(DataTable datos) throws Throwable {
        postPage.setfillDatainPost(datos);
    }

    @And("^press on the Enter key to create in post page$")
    public void pressOnTheEnterKeyToCreateInPostPage() {
        postPage.pressEnterNew();
    }

    @And("^click en edit in post page$")
    public void clickEnEditInPostPage() {
        postPage.editElement();
    }

    @And("^change value into post \"([^\"]*)\"$")
    public void changeValueIntoPost(String arg0) throws Throwable {
        postPage.setElementIntoPost(arg0);
    }

    @And("^press on the Enter key to Update in post page$")
    public void pressOnTheEnterKeyToUpdateInPostPage() {
        postPage.clickUpdatePost();
    }

    @And("^select the first element and save value$")
    public void selectTheFirstElementAndSaveValue() {
        postPage.selectFirtelement();
    }

    @And("^first value salved search on post page$")
    public void firstValueSalvedSearchOnPostPage() {
        postPage.searchSalveElement();
    }

    @And("^assert not exist element firts salve$")
    public void assertNotExistElementFirtsSalve() {
        postPage.assertFirtElement();
    }

    @And("^check \"([^\"]*)\" exist in post page$")
    public void checkExistInPostPage(String arg0) throws Throwable {
        postPage.checkTranlate(arg0);
    }

    @And("^go to the 'Category' in blog page$")
    public void goToTheCategoryInBlogPage() {
        categoryBlogPage = blogManager.clickCategoryMenu();
    }

    @And("^check \"([^\"]*)\" in secction category into blogs$")
    public void checkInSecctionCategoryIntoBlogs(String arg0) throws Throwable {
        categoryBlogPage.checkTitleExiste(arg0);
    }

    @And("^assert element with result in title$")
    public void assertElementWithResultInTitle() {
        categoryBlogPage.assertTitle();
    }


    // Option Hotels



    // Option Flights



    // Option Tours



    // Option Cars



    // Option Blog
}
