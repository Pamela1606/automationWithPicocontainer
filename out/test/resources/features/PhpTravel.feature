# Login feature review the behavior in thie feature
Feature: Login

  Scenario: Home page is displayed once set credential in login page
    Given 'PHP travel' page is loaded
    And set my credentials on 'Login' page


  #Option Hotels

  #Option Flights

  #Option Tours
  @CNR
  Scenario: Tours Page display
    And click on tours menu
    And go to the tours page
    And click on add button on Tours page
    And select "Enabled" Status on Add Tours page
    And fill "Bolivia" Name field on Add Tours page
    And fill "2" Quantity Adults field on Add Tours page
    And fill "260" Price Adults field on Add Tours page
    And select "3" Stars on Add Tours page
    And fill "3" Total Days field on Add Tours page
    And fill "2" Total Nights field on Add Tours page
    And select "Adventure" Tour Type on Add Tours page
    And select "Yes" Feature on Add Tours page
    And select "La Paz" Location 1 on Add Tours page
    And click On Submit on Add Tours page
    And close Session on Dashboard page


    #And click On Submit on Edit Tours page
  #Option Cars

  #Option Blog
