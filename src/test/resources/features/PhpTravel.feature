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


  # MV-005
  Scenario: Verify that the car edition works correctly
    And click on the 'CARS option' of the 'lateral menu' in the 'Dashboard page'
    And click on the 'CARS suboption' of the menu into 'CARS option'
    And click on the 'edit option' of the first record in the 'cars page'
    And click on the 'Meta info tab' in the 'edit car page'
    And fill 'Meta info form' of 'edit car page' with the following data
      | Meta Title | Meta Keywords | Meta Description       |
      | Meta test  | Test          | Meta test description. |
    Then verify that "CHANGES SAVED!" notification message is displayed in the 'cars page'


  # MV-003
  Scenario: Verify that the car delete works correctly
    And click on the 'CARS option' of the 'lateral menu' in the 'Dashboard page'
    And click on the 'CARS suboption' of the menu into 'CARS option'
    And click on the 'delete option' of the first record in the 'cars page'
    And click on the 'accept button' of the 'confirm dialog' on the 'cars page'
    Then verify that 'car name' of the deleted record does not display in the 'cars page'


  # MV-007
  Scenario Outline: Verify that the car types registry works correctly
    And click on the 'CARS option' of the 'lateral menu' in the 'Dashboard page'
    And click on the 'CARS SETTINGS suboption' of the menu into 'CARS option'
    And click on the 'Types tab' in the 'cars settings page'
    And click on the 'ADD button' on top of 'Types list' in the 'cars settings page'
    And fill 'add car type modal form' of 'car settings page' with the following data
      | Type name   | Name in Russian | Name in Farsi | Name in French | Name in Turkish | Name in Arabic | Name in Spanish |
      | <Type name> | мини фургон     | مینی ون       | Mini van       | minibüs         | فان صغيرة      | Mini furgoneta  |
    Then verify that "<Type name>" is displayed in the first record of the 'car type table' of 'Types tab' option in 'cars settings page'

    Examples:
      | Type name |
      | Mini van  |


  # MV-008
  Scenario Outline: Verify that the car types edition works correctly
    And click on the 'CARS option' of the 'lateral menu' in the 'Dashboard page'
    And click on the 'CARS SETTINGS suboption' of the menu into 'CARS option'
    And click on the 'Types tab' in the 'cars settings page'
    And click on the 'edit option' of the first record in the 'Types tab' of 'cars settings page'
    And fill 'update car type modal form' of 'car settings page' with the following data
      | Type name   | Name in Russian | Name in Farsi | Name in French | Name in Turkish | Name in Arabic | Name in Spanish |
      | <Type name> | спортивный      | ورزش ها       | des sports     | Spor Dalları    | رياضات         | Deportivo       |
    Then verify that "CHANGES SAVED!" notification message is displayed in the 'cars settings page'
    And verify that "<Type name>" is displayed in the first record of the 'car type table' of 'Types tab' option in 'cars settings page'

    Examples:
      | Type name |
      | Sports    |


  # MV-009
  Scenario: Verify that the car types delete works correctly
    And click on the 'CARS option' of the 'lateral menu' in the 'Dashboard page'
    And click on the 'CARS SETTINGS suboption' of the menu into 'CARS option'
    And click on the 'Types tab' in the 'cars settings page'
    And click on the 'delete option' of the first record in the 'Types tab' of 'cars settings page'
    And click on the 'accept button' of the 'confirm dialog' on the 'cars settings page'
    Then verify that 'car name' of the deleted record does not display in the 'Types tab' of 'cars settings page'


  #Option Blog
