# Login feature review the behavior in thie feature
Feature: Login

  Background: Home page is displayed once set credential in login page
    Given 'PHP travel' page is loaded
    And set my credentials on 'Login' page

  #
  # Option Hotels
  #
  #Hotels - TV-001
  Scenario: List of Hotels is displayed to select option Hotels on lateral menu
    And click to 'option Hotels' on lateral menu into dashboard page
    And click to 'sub option Hotels' on lateral menu into dashboard page
    Then Verify that the "HOTELS MANAGEMENT" is displayed on 'dashboard' page

  #Hotels - TV-003
  Scenario Outline: Form of Hotels registry is displayed to select the add button on dashboard page
    And click to 'option Hotels' on lateral menu into dashboard page
    And click to 'sub option Hotels' on lateral menu into dashboard page
    And click to 'add button' on Hotels page
    And fill 'datas on general tab form' on add Hotel page
      | Hotel Name   | Hotel Description | Location |
      | <Name Hotel> | Description Test  | Iquique  |
    Then Verify that the "<Name Hotel>" is displayed on 'List Hotels' page

    Examples:
      | Name Hotel |
      | Test 3     |

  #Hotels - TV-004
  Scenario: Edition of datas in the tab "Meta Info" on the form edit of Hotels on dashboard page
    And click to 'option Hotels' on lateral menu into dashboard page
    And click to 'sub option Hotels' on lateral menu into dashboard page
    And click to 'edit option' on Hotels List to a Hotel selected
    And click to tab 'Meta Info' on Hotel Edit selected
    And update data form of 'meta info tab' in edit Hotel page
      | Meta Title      | Meta keywords | Meta Description |
      | Title Test Meta | keywords Test | Description Test |
    Then Verify that the "CHANGES SAVED!" message is displayed on 'List Hotels' page

  #Hotels - TV-005
  Scenario: Delete a selected hotel on the list of Hotels on dashboard page
    And click to 'option Hotels' on lateral menu into dashboard page
    And click to 'sub option Hotels' on lateral menu into dashboard page
    And click to 'delete option' on the registry first on Hotels List into dashboard page
    And click to 'ok button' of the 'pop-up window' on the Hotel page
    Then Verify that 'Hotel Name' was deleted of the Hotels List into dashboard page

  #Rooms - TV-010
  Scenario Outline: Form of Rooms registry is displayed to select the add button on dashboard page
    And click to 'option Hotels' on lateral menu into dashboard page
    And click to 'sub option Rooms' on lateral menu into dashboard page
    And click to 'add button' on Rooms page
    And fill 'datas on general tab form' on add Room page
      | Room Type   | Room Description | Price | Quantity | Minimum Stay | Max Adults | Max Children | No of Extra Beds | Extra Bed Charges |
      | <Room Type> | Description Test | 2000  | 3        | 7            | 4          | 2            | 1                | 20                |
    Then Verify that the "<Room Type>" is displayed in the first row on 'List Rooms' in the page

    Examples:
      | Room Type                        |
      | Studio Apartment With Creek View |

  #Rooms - TV-011
  Scenario: Edition of datas in the tab "translate" on the form edit of Rooms on dashboard page
    And click to 'option Hotels' on lateral menu into dashboard page
    And click to 'sub option Rooms' on lateral menu into dashboard page
    And click to 'edit option' on Rooms List of a Room selected
    And click to tab 'translate' on Room Edit selected
    And update data form of 'translate tab' in edit Room page
      | Russian              | Farsi                | French                           | Turkish        | Arabic            | Spanish                              |
      | Описание комнаты это | توضیحات اتاق این است | Description de la chambre est-ce | Oda Açıklaması | وصف الغرفة هو هذا | Descripción de la habitación es este |
    Then Verify that the "CHANGES SAVED!" message is displayed on 'List Rooms' page

  #Rooms - TV-012
  Scenario: Delete a selected room on the list of Rooms on dashboard page
    And click to 'option Hotels' on lateral menu into dashboard page
    And click to 'sub option Rooms' on lateral menu into dashboard page
    And click to 'delete option' on the registry first on Rooms List into dashboard page
    And click to 'ok button' of the 'pop-up window' on the Room page
    Then Verify that 'Room Type' was deleted of the Rooms List into dashboard page

#  #Rooms - TV-016
  Scenario Outline: Form of Extras registry is displayed to select the add button on dashboard page
    And click to 'option Hotels' on lateral menu into dashboard page
    And click to 'sub option Extras' on lateral menu into dashboard page
    And click to 'add button' on Extras page
    And fill 'datas on extra form' on add Extra page
      | Thumb    | Name         | Price         |
      | Vino.jpg | <Name Extra> | <Price Extra> |
    Then Verify that the "<Name Extra>" is displayed in the column name of 'List Extras' page
      And Verify that the "<Price Extra>" is displayed in the column price of 'List Extras' page

    Examples:
      | Name Extra | Price Extra |
      | Wine       | 50          |

  #Option Flights

  #Option Tours

  #Option Cars

  #Option Blog
