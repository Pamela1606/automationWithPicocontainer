package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Dashboard.Dashboard;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Hotels.AddHotels.AddHotelPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Rooms.AddRooms.AddRoomPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Hotels.EditHotels.EditHotelPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Rooms.EditRooms.EditRoomPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Hotels.HotelPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Rooms.RoomPage;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

import java.util.List;
import java.util.Map;

public class StepsDefinitionPHPtravel {
    private Login login;
    private Dashboard dashboardPage;

    private HotelPage hotelPage;
    private AddHotelPage addHotelPage;
    private EditHotelPage editHotelPage;
    private String nameHotelDeleted;

    private RoomPage roomPage;
    private AddRoomPage addRoomPage;
    private EditRoomPage editRoomPage;
    private String roomTypeDeleted;

    @Given("^'PHP travel' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        dashboardPage = login.setCredentials();
    }


    // Option Hotels
    // Hotels - List of Hotels
    @And("^click to 'option Hotels' on lateral menu into dashboard page$")
    public void clickToOptionHotelsOnLateralMenuIntoDashboardPage() {
        dashboardPage = dashboardPage.clickOptionHotelLateralMenu();
    }

    @And("^click to 'sub option Hotels' on lateral menu into dashboard page$")
    public void clickToSubOptionHotelsOnLateralMenuIntoDashboardPage() {
        hotelPage = dashboardPage.clickSubOptionHotelLateralMenu();
    }

    @Then("^Verify that the \"([^\"]*)\" is displayed on 'dashboard' page$")
    public void verifyThatTheIsDisplayedOnDashboardPage(String titleHotelPage) throws Throwable {
        String titleHotelPageActual = hotelPage.getTitleHotelPage();
        Assert.assertEquals(titleHotelPageActual, titleHotelPage);
    }

    // Hotels - Add Hotels
    @And("^click to 'add button' on Hotels page$")
    public void clickToAddButtonOnHotelsPage() {
        addHotelPage = hotelPage.clickAddButton();
    }

    @And("^fill 'datas on general tab form' on add Hotel page$")
    public void fillDatasOnGeneralTabFormOnAddHotelPage(DataTable dataTable) {
        List<Map<String, String>> valuesHotels = dataTable.asMaps(String.class, String.class);
        hotelPage = addHotelPage.getFillGeneralTabFormHotel(valuesHotels);
    }

    @Then("^Verify that the \"([^\"]*)\" is displayed on 'List Hotels' page$")
    public void verifyThatTheIsDisplayedOnListHotelsPage(String nameHotelList) throws Throwable {
        String nameHotelListActual = hotelPage.getNameHotel();
        Assert.assertEquals(nameHotelListActual, nameHotelList);
    }

    // Hotels - Edit Hotels
    @And("^click to 'edit option' on Hotels List to a Hotel selected$")
    public void clickToEditOptionOnHotelsListToAHotelSelected() {
        editHotelPage = hotelPage.clickEditButton();
    }

    @And("^click to tab 'Meta Info' on Hotel Edit selected$")
    public void clickToTabMetaInfoOnHotelEditSelected() {
        editHotelPage = editHotelPage.clickEditMetaInfo();
    }

    @And("^update data form of 'meta info tab' in edit Hotel page$")
    public void updateDataFormOfMetaInfoTabInEditHotelPage(DataTable dataTable) {
        List<Map<String, String>> editDataHotels = dataTable.asMaps(String.class, String.class);
        hotelPage = editHotelPage.updateDataFormOfMetaInfoTab(editDataHotels);
    }

    @Then("^Verify that the \"([^\"]*)\" message is displayed on 'List Hotels' page$")
    public void verifyThatTheMessageIsDisplayedOnListHotelsPage(String messageExpected) throws Throwable {
        String messageActual = hotelPage.getMessageNotification();
        Assert.assertEquals(messageActual, messageExpected);
    }

    // Hotels - Delete Hotels
    @And("^click to 'delete option' on the registry first on Hotels List into dashboard page$")
    public void clickToDeleteOptionOnTheRegistryFirstOnHotelsListIntoDashboardPage() {
        nameHotelDeleted = hotelPage.getNameHotel();
        hotelPage = hotelPage.clickDeleteOptionButton();
    }

    @And("^click to 'ok button' of the 'pop-up window' on the Hotel page$")
    public void clickToOkButtonOfThePopUpWindowOnTheHotelPage() {
        hotelPage = hotelPage.clickOkButtonToDelete();
    }

    @Then("^Verify that 'Hotel Name' was deleted of the Hotels List into dashboard page$")
    public void verifyThatHotelNameWasDeletedOfTheHotelsListIntoDashboardPage() {
        String nameHotelActual = hotelPage.getNameHotel();
        Assert.assertNotSame(nameHotelActual, nameHotelDeleted);
    }

    // Rooms - List of Rooms
    @And("^click to 'sub option Rooms' on lateral menu into dashboard page$")
    public void clickToSubOptionRoomsOnLateralMenuIntoDashboardPage() {
        roomPage = dashboardPage.clickSubOptionRoomLateralMenu();
    }

    // Rooms - Add Rooms
    @And("^click to 'add button' on Rooms page$")
    public void clickToAddButtonOnRoomsPage() {
        addRoomPage = roomPage.clickAddButtonRoom();
    }

    @And("^fill 'datas on general tab form' on add Room page$")
    public void fillDatasOnGeneralTabFormOnAddRoomPage(DataTable dataTable) {
        List<Map<String, String>> valuesRooms = dataTable.asMaps(String.class, String.class);
        roomPage = addRoomPage.getFillGeneralTabFormRoom(valuesRooms);
    }

    @Then("^Verify that the \"([^\"]*)\" is displayed in the first row on 'List Rooms' in the page$")
    public void verifyThatTheIsDisplayedInTheFirstRowOnListRoomsInThePage(String roomTypeExpected) throws Throwable {
        String roomTypeActual = roomPage.getRoomType();
        Assert.assertEquals(roomTypeActual, roomTypeExpected);
    }

    // Rooms - Edit Rooms
    @And("^click to 'edit option' on Rooms List of a Room selected$")
    public void clickToEditOptionOnRoomsListOfARoomSelected() {
        editRoomPage = roomPage.clickEditButtonRoom();
    }

    @And("^click to tab 'translate' on Room Edit selected$")
    public void clickToTabTranslateOnRoomEditSelected() {
        editRoomPage = editRoomPage.clickEditTranslate();
    }

    @And("^update data form of 'translate tab' in edit Room page$")
    public void updateDataFormOfTranslateTabInEditRoomPage(DataTable dataTable) {
        List<Map<String, String>> editDataRooms = dataTable.asMaps(String.class, String.class);
        roomPage = editRoomPage.updateDataFormOfTranslateTab(editDataRooms);
    }

    @Then("^Verify that the \"([^\"]*)\" message is displayed on 'List Rooms' page$")
    public void verifyThatTheMessageIsDisplayedOnListRoomsPage(String messageTransExpected) throws Throwable {
        String messageTransActual = roomPage.getMessageNotification();
        Assert.assertEquals(messageTransActual, messageTransExpected);
    }

    // Rooms - Delete Rooms
    @And("^click to 'delete option' on the registry first on Rooms List into dashboard page$")
    public void clickToDeleteOptionOnTheRegistryFirstOnRoomsListIntoDashboardPage() {
        roomTypeDeleted = roomPage.getRoomType();
        roomPage = roomPage.clickDeleteOptionButtonRoom();
    }

    @And("^click to 'ok button' of the 'pop-up window' on the Room page$")
    public void clickToOkButtonOfThePopUpWindowOnTheRoomPage() {
        roomPage = roomPage.clickOkButtonToDelete();
    }

    @Then("^Verify that 'Room Type' was deleted of the Rooms List into dashboard page$")
    public void verifyThatHotelNameWasDeletedOfTheRoomsListIntoDashboardPage() {
        String roomTypeActual = roomPage.getRoomType();
        Assert.assertNotSame(roomTypeActual, roomTypeDeleted);
    }






    // Option Flights



    // Option Tours



    // Option Cars



    // Option Blog
}
