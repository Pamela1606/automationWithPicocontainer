# Login feature review the behavior in thie feature
Feature: Login

  Background: Home page is displayed once set credential in login page
    Given 'PHP travel' page is loaded
    And set my credentials on 'Login' page


  #Option Hotels

  #Option Flights
  Scenario: Flights Page display and create a new Route One Way
    And click on flights menu
    And go to the routes page
    And click on add button on Routes page
    And select "Enabled" Status on Add Route page
    And fill "8" Total Hours field on Add Route page
    And fill "10" Vat Tax field on Add Route page
    And fill "10" Deposite field on Add Route page
    And select "Business" Flight Type on Add Route page
    And select "Refundable" Refundable on Add Route page
    And select "One Way" Direction on Add Route page
    And fill "522" Price Adults field on Add Route page
    And fill "110" Price Child field on Add Route page
    And fill "60" Price Infant field on Add Route page
    And select "Adana Arpt" City Airport Departure on Add Route page
    And select "Rossiya Airlines" Airline Departure on Add Route page
    And fill "843" Flights No Departure on Add Route page
    And fill "30/04/2019" Date Departure on Add Route page
    And fill "11:00:00" Time Departure on Add Route page
    And fill "11:30:00" CheckOut Departure on Add Route Page
    And select "Biggin Hill Airport" City Airport Arrival on Add Route page
    And select "Rossiya Airlines" Airline Arrival on Add Route page
    And fill "843" Flights No Arrival on Add Route page
    And fill "30/04/2019" Date Arrival on Add Route page
    And fill "19:00:00" Time Arrival on Add Route page
    And fill "19:30:00" CheckOut Arrival on Add Route page
    And click On Submit on Add Route page

  Scenario: Flights Page display and edit an element
    And click on flights menu
    And go to the routes page
    And click on SearchButton on Route page
    And fill element to search "Adana Arpt" Search field On Route page
    And select by field "From" on Route page
    And click on GO button on Route page
    And click on icon edit on first element on Route page
    And edit with "9" Total Hours field on Edit Route page
    And edit with "20" Vat Tax field on Edit Route page
    And edit with "20" Deposite field on Edit Route page
    And select "Economy" Flight Type on Edit Route page
    And select "Non Refundable" Refundable on Edit Route page
    And edit "06/05/2019" Date Departure on Edit Route page
    And edit "06/05/2019" Date Arrival on Edit Route page
    And click On Submit on Edit Route page

  #Option Tours

  #Option Cars

  #Option Blog
