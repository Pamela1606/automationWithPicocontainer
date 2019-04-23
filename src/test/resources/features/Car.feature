# Car feature
Feature: Car functionality

  Background:
    Given 'PHP travel' page is loaded
    And set my credentials on 'Login' page

  Scenario: delete one car of the list
    And click 'CARS option' in the 'main menu' of the 'Home page'
    And click 'suboption CARS' of the 'option CAR' in the main menu
    And click 'x button' on the one car of the list of cars
    Then verify that the selected car with doesnt exist in the 'car list'
