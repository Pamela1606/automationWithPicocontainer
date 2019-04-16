
Feature: Car functionality

  Scenario: Delete one car of the list
    Given 'PHP travel' page is loaded
    And set my credentials on 'Login' page
    And click 'option CARS' in the main menu
    And click 'suboption CARS' of the 'option CAR' in the main menu
    And click 'x button' on the one car
    Then verify that the selected car with doesnt exist in the 'car list'
