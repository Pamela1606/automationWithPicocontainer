# Login feature review the behavior in thie feature
Feature: Login

  Background: Home page is displayed once set credential in login page
    Given 'PHP travel' page is loaded
    And set my credentials on 'Login' page


  #Option Hotels

  #Option Flights

  #Option Tours

  #
  # Option Cars
  #

  # MV-001
  Scenario: Display of car list page
    And click on the 'CARS option' of the 'lateral menu' in the 'Dashboard page'
    And click on the 'CARS suboption' of the menu into 'CARS option'
    Then verify that "CARS MANAGEMENT" title is displayed into 'cars page'

  # MV-004
  Scenario Outline: Verify that the car registry works correctly
    And click on the 'CARS option' of the 'lateral menu' in the 'Dashboard page'
    And click on the 'CARS suboption' of the menu into 'CARS option'
    And click on the 'ADD button' on top of the 'cars page'
    And fill 'general tab form' of 'add car page' with the following data
      | Car name   | Car Description          | Car Type |
      | <Car name> | Description for new car. | Van      |
    Then verify that "<Car name>" is displayed in the first record of the 'car table' in 'cars page'

    Examples:
      | Car name     |
      | New Car test |

  #Option Blog
