# Login feature review the behavior in thie feature
Feature: Login

  Background: Home page is displayed once set credential in login page
    Given 'PHP travel' page is loaded
    And set my credentials on 'Login' page


  #Option Hotels

  #Option Flights

  @CNR
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
    And close Session on Dashboard page

  @ENR
  Scenario: Flights Page display and edit an element
    And click on flights menu
    And go to the routes page
    And click on SearchButton on Route page
    And fill element to search "Adana Arpt" Search field On Route page
    And select by field "From" on Route page
    And click on GO button on Route page
    And choose the element to select on Route page
    And click on icon edit element selected on Route page
    And edit with "9" Total Hours field on Edit Route page
    And edit with "20" Vat Tax field on Edit Route page
    And edit with "20" Deposite field on Edit Route page
    And select "Economy" Flight Type on Edit Route page
    And select "Non Refundable" Refundable on Edit Route page
    And edit "06/05/2019" Date Departure on Edit Route page
    And edit "06/05/2019" Date Arrival on Edit Route page
    And click On Submit on Edit Route page
    And close Session on Dashboard page

  @DNR
  Scenario: Flights Page display and delete an element
    And click on flights menu
    And go to the routes page
    And click on SearchButton on Route page
    And fill element to search "Adana Arpt" Search field On Route page
    And select by field "From" on Route page
    And click on GO button on Route page
    And choose the element to select on Route page
    And click on icon delete element selected on Route page
    And press on the Enter key to delete the chosen element on Route page

  @CNA
  Scenario: Flights Page display and create a new Airport
    And click on flights menu
    And go to the Airport page
    And click on add button on Airport page
    And fill "JWA" Code field on Add Airport page
    And fill "Jorge Wilstermann International Airport" Name field on Add Airport page
    And fill "CBBA" Citycode field on Add Airport page
    And fill "Cochabamba" Cityname field on Add Airport page
    And fill "BOLIVIA" Countryname field on Add Airport page
    And fill "BO" Countrycode field on Add Airport page
    And fill "-4" Timezone field on Add Airport page
    And fill "-17.3894997" Latitud field on Add Airport page
    And fill "-66.1567993" Longitud field on Add Airport page
    And fill "True" City field on Add Airport page
    And click on save & return on Add Airport page
    And close Session on Dashboard page


  @INA
  Scenario: Inspect the last Airport created
    And click on flights menu
    And go to the Airport page
    And click on Search button on Airport page
    And fill element to search "CBBA" Search field on Airport page
    And select by field "Citycode" on Airport page
    And click on GO button on Airport page
    And choose the element to select on Airport page
    And click on icon inspect element selected on Airport page
    And check Code Field with value "JWA" on Inspect Airport page
    And check Name Field with value "Jorge Wilstermann International Airport" on Inspect Airport page
    And check Citycode Field with value "CBBA" on Inspect Airport page
    And check Cityname Field with value "Cochabamba" on Inspect Airport page
    And check Countryname Field with value "BOLIVIA" on Inspect Airport page
    And check Countrycode Field with value "BO" on Inspect Airport page
    And check Timezone Field with value "-4" on Inspect Airport page
    And check Latitud Field with value "-17.38949" on Inspect Airport page
    And check Longitud Field with value "-66.156799" on Inspect Airport page
    And check City Field with value "True" on Inspect Airport page
    And click on Return button on Inspect Airport page

  @ENA
  Scenario: Flights Page display and edit an Airport
    And click on flights menu
    And go to the Airport page
    And click on Search button on Airport page
    And fill element to search "CBBA" Search field on Airport page
    And select by field "Citycode" on Airport page
    And click on GO button on Airport page
    And choose the element to select on Airport page
    And click on icon edit element selected on Airport page
    And edit with "JWA" Code field on Edit Airport page
    And edit with "Jorge Wilstermann International Airport" Name field on Edit Airport page
    And edit with "CBBA" Citycode field on Edit Airport page
    And edit with "Cochabamba" Cityname field on Edit Airport page
    And edit with "BOLIVIA" Countryname field on Edit Airport page
    And edit with "BO" Countrycode field on Edit Airport page
    And edit with "-4" Timezone field on Edit Airport page
    And edit with "-17.3894997" Latitud field on Edit Airport page
    And edit with "-66.1567993" Longitud field on Edit Airport page
    And edit with "False" City field on Edit Airport page
    And edit with on save & return on Edit Airport page
    And close Session on Dashboard page

  @DNA
  Scenario: Delete Airport created
    And click on flights menu
    And go to the Airport page
    And click on Search button on Airport page
    And fill element to search "CBBA" Search field on Airport page
    And select by field "Citycode" on Airport page
    And click on GO button on Airport page
    And choose the element to select on Airport page
    And click on icon delete element selected on Airport page
    And press on the Enter key to delete the chosen element on Airport page
    And close Session on Dashboard page

  #Option Tours

  #Option Cars

  #Option Blog
