# Login feature review the behavior in thie feature
Feature: Login

  Background: Home page is displayed once set credential in login page
    Given 'PHP travel' page is loaded
    And set my credentials on 'Login' page


  #Option Hotels

  #Option Flights
  Scenario: Flights Page display and create a new Route
  And click on flights menu
  And go to the routes page
  And click on add button on Routes page
  And select "Enabled" Status on Add Route page
  And fill "10" Total Hours field on Add Route page
  And fill "53" Vat Tax field on Add Route page
  And fill "53" Deposite field on Add Route page
  And select "business" Flight Type on Add Route page

  #Option Tours

  #Option Cars

  #Option Blog
