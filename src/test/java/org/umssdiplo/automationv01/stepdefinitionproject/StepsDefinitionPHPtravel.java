package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.umssdiplo.automationv01.core.managepage.Dashboard.BlogPages.BlogManager;
import org.umssdiplo.automationv01.core.managepage.Dashboard.BlogPages.Posts.PostPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.Dashboard;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private Login login;
    private Dashboard dashboardPage;
    private BlogManager blogManager;

    private PostPage postPage;


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

    @And("^clien en 'delete post' in post page$")
    public void clienEnDeletePostInPostPage() {
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


    // Option Hotels



    // Option Flights



    // Option Tours



    // Option Cars



    // Option Blog
}
