# Login feature review the behavior in thie feature
Feature: Login

  Scenario: Home page is displayed once set credential in login page
    Given 'PHP travel' page is loaded
    And set my credentials on 'Login' page


  #Option Hotels

  #Option Flights

  #Option Tours
  @CNT
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

  @ENT
  Scenario: Tours Page display and edit an element
    And click on tours menu
    And go to the tours page
    And click on SearchButton on Tours page
    And fill element to search "Bolivia" Search field On Tours page
    And select by field "Name" on Tours page
    And click on GO button on Tours page
    And choose the element to select on Tours page
    And click on icon edit element selected on Tours page
    And select "Disabled" Status on Edit Tours page
    And edit with "Mexico" Name field on Edit Tours page
    And edit with "4" Quantity Adults field on Edit Tours page
    And click On Submit on Edit Tours page

  @DNT
  Scenario: Tours Page display and delete an element
    And click on tours menu
    And go to the tours page
    And click on SearchButton on Tours page
    And fill element to search "Bolivia" Search field On Tours page
    And select by field "Name" on Tours page
    And click on GO button on Tours page
    And choose the element to select on Tours page
    And click on icon delete element selected on Tours page
    And press on the Enter key to delete the chosen element on Tours page
    And close Session on Dashboard page

  @CNA
  Scenario: Tours Page display and create a new AddNew
    And click on tours menu
    And go to the Add New page
    And select "Enabled" Status on Add New page
    And fill "Bolivia" Name field on Add New page
    And fill "2" Quantity Adults field on Add New page
    And fill "260" Price Adults field on Add New page
    And select "3" Stars on Add New page
    And fill "3" Total Days field on Add New page
    And fill "2" Total Nights field on Add New page
    And select "Adventure" Tour Type on Add New page
    And select "Yes" Feature on Add New page
    And select "La Paz" Location 1 on Add New page
    And click On Submit on Add New page
    And close Session on Dashboard page

  @CNE
  Scenario: create a new Extra
    And click on tours menu
    And go to the Extras page
    And click on add button on Extras page
    And fill "Cochabamba" Name field on Add Extras page
    And fill "Yes" Status field on Add Extras page
    And fill "250" Price field on Add Extras page
    And wait upload image "cochabamba.jpg" on Add Extras page
    And click button Save and Return on Add Extras page
    And close Session on Dashboard page

  @VNE
  Scenario: View the new Extra
    And click on tours menu
    And go to the Extras page
    And click on Search button on Extras page
    And fill element to search "Cochabamba" Search field on Extras page
    And select by field "Name" on Extras page
    And click on GO button on Extras page
    And choose the element to select on Extras page
    And click on icon inspect element selected on Extras page
    And check with "Cochabamba" Name field on View page
    And check with "BOLIVIA" Status field on View page
    And check with "350" Price field on View page
    And click button Return on Views page
    And close Session on Dashboard page

  @ENE
  Scenario: edit the new Extra
    And click on tours menu
    And go to the Extras page
    And click on Search button on Extras page
    And fill element to search "Cochabamba" Search field on Extras page
    And select by field "Name" on Extras page
    And click on GO button on Extras page
    And choose the element to select on Extras page
    And click on icon edit element selected on Extras page
    And edit with "Cochabamba" Name field on Edit Extras page
    And edit select "No" Status field on Edit Extras page
    And edit with "320" Price field on Edit Extras page
    And click button Save and Return on Edit Extras page
    And close Session on Dashboard page

  @DNE
  Scenario: Delete the new Extra
    And click on tours menu
    And go to the Extras page
    And click on Search button on Extras page
    And fill element to search "Cochabamba" Search field on Extras page
    And select by field "Name" on Extras page
    And click on GO button on Extras page
    And choose the element to select on Extras page
    And click on icon delete element selected on Extras page
    And press on the Enter key to delete the chosen element on Extras page
    And close Session on Dashboard page



  #Option Cars

  #Option Blog
