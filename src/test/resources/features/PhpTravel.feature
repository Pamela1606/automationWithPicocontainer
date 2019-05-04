# Login feature review the behavior in thie feature
Feature: Login

  Background: Home page is displayed once set credential in login page
    Given 'PHP travel' page is loaded
    And set my credentials on 'Login' page

  #Option Hotels

  #Option Flights

  @CNR
  Scenario: Flights Page display and create a Route One Way
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
  Scenario: Flights Page display and edit an Route created
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
  Scenario: Flights Page display and delete an Route created
    And click on flights menu
    And go to the routes page
    And click on SearchButton on Route page
    And fill element to search "Adana Arpt" Search field On Route page
    And select by field "From" on Route page
    And click on GO button on Route page
    And choose the element to select on Route page
    And click on icon delete element selected on Route page
    And press on the Enter key to delete the chosen element on Route page
    And close Session on Dashboard page

  @CNA
  Scenario: Flights Page display and create an Airport
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
  Scenario: Flights Page display and inspect an Airport created
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
    And close Session on Dashboard page

  @ENA
  Scenario: Flights Page display and edit an Airport created
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
  Scenario: Flights Page display and delete an Airport created
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

  @CTM
  Scenario: Flights Page display and Change Test mode
    And click on flights menu
    And go to the Setting page
    And select "On" Test Mode on Setting page
    And click on Submit Button on Setting page
    And close Session on Dashboard page

  @CA
  Scenario: Flights Page display and create an Airline
    And click on flights menu
    And go to the Airline page
    And click on add button on Airline page
    And fill "Ecojet Airline" Name field on Add Airline page
    And fill "910" Iata Desi field on Add Airline page
    And fill "ECO" 3-Digit-Code field on Add Airline page
    And fill "BOLIVIA" Country field on Add Airline page
    And wait upload image "ecojet.png" on Add Airline page
    And click button Save and Return on Add Airline page
    And close Session on Dashboard page

  @IAL
  Scenario: Flights Page display and inspect an Airline created
    And click on flights menu
    And go to the Airline page
    And click on Search button on Airline page
    And fill element to search "Ecojet Airline" Search field on Airline page
    And select by field "Name" on Airline page
    And click on GO button on Airline page
    And choose the element to select on Airline page
    And click on icon inspect element selected on Airline page
    And check with "Ecojet Airline" Name field on Inspect Airline page
    And check with "910" Iata Desi field on Inspect Airline page
    And check with "ECO" 3-Digit-Code field on Inspect Airline page
    And check with "BOLIVIA" Country field on Inspect Airline page
    And click button Return on Inspect Airline page
    And close Session on Dashboard page

  @EAL
  Scenario: Flights Page display and edit an Airline created
    And click on flights menu
    And go to the Airline page
    And click on Search button on Airline page
    And fill element to search "Ecojet Airline" Search field on Airline page
    And select by field "Name" on Airline page
    And click on GO button on Airline page
    And choose the element to select on Airline page
    And click on icon edit element selected on Airline page
    And edit with "Ecojet Airline" Name field on Edit Airline page
    And edit with "910" Iata Desi field on Edit Airline page
    And edit with "ECO" 3-Digit-Code field on Edit Airline page
    And edit select "BOLIVIA" Country field on Edit Airline page
    And click button Save and Return on Edit Airline page
    And close Session on Dashboard page

  @DAL
  Scenario: Flights Page display and delete an Airline created
    And click on flights menu
    And go to the Airline page
    And click on Search button on Airline page
    And fill element to search "Ecojet Airline" Search field on Airline page
    And select by field "Name" on Airline page
    And click on GO button on Airline page
    And choose the element to select on Airline page
    And click on icon delete element selected on Airline page
    And press on the Enter key to delete the chosen element on Airline page
    And close Session on Dashboard page


  #Option Tours

  #
  # Option Cars
  #

  # MV-001
  @cars
  Scenario: Display of car list page
    And click on the 'CARS option' of the 'lateral menu' in the 'Dashboard page'
    And click on the 'CARS suboption' of the menu into 'CARS option'
    Then verify that "CARS MANAGEMENT" title is displayed into 'cars page'
    And close Session on Dashboard page


  # MV-004
  @cars
  Scenario Outline: Verify that the car registry works correctly
    And click on the 'CARS option' of the 'lateral menu' in the 'Dashboard page'
    And click on the 'CARS suboption' of the menu into 'CARS option'
    And click on the 'ADD button' on top of the 'cars page'
    And fill 'general tab form' of 'add car page' with the following data
      | Car name     | Car Description          | Car Type |
      | New Car test | Description for new car. | Van      |

    Then verify that "<Car name>" is displayed in the first record of the 'car table' in 'cars page'
    And close Session on Dashboard page

    Examples:
      | Car name     |
      | New Car test |


  # MV-005
  @cars
  Scenario: Verify that the car edition works correctly
    And click on the 'CARS option' of the 'lateral menu' in the 'Dashboard page'
    And click on the 'CARS suboption' of the menu into 'CARS option'
    And click on the 'edit option' of the first record in the 'cars page'
    And click on the 'Meta info tab' in the 'edit car page'
    And fill 'Meta info form' of 'edit car page' with the following data
      | Meta Title | Meta Keywords | Meta Description       |
      | Meta test  | Test          | Meta test description. |
    Then verify that "CHANGES SAVED!" notification message is displayed in the 'cars page'
    And close Session on Dashboard page


  # MV-003
  @cars
  Scenario: Verify that the car delete works correctly
    And click on the 'CARS option' of the 'lateral menu' in the 'Dashboard page'
    And click on the 'CARS suboption' of the menu into 'CARS option'
    And click on the 'delete option' of the first record in the 'cars page'
    And click on the 'accept button' of the 'confirm dialog' on the 'cars page'
    Then verify that 'car name' of the deleted record does not display in the 'cars page'
    And close Session on Dashboard page


  # MV-007
  @cars
  Scenario Outline: Verify that the car types registry works correctly
    And click on the 'CARS option' of the 'lateral menu' in the 'Dashboard page'
    And click on the 'CARS SETTINGS suboption' of the menu into 'CARS option'
    And click on the 'Types tab' in the 'cars settings page'
    And click on the 'ADD button' on top of 'Types list' in the 'cars settings page'
    And fill 'add car type modal form' of 'car settings page' with the following data
      | Type name | Name in Russian | Name in Farsi | Name in French | Name in Turkish | Name in Arabic | Name in Spanish |
      | Mini van  | мини фургон     | مینی ون       | Mini van       | minibüs         | فان صغيرة      | Mini furgoneta  |
    Then verify that "<Type name>" is displayed in the first record of the 'car type table' of 'Types tab' option in 'cars settings page'
    And close Session on Dashboard page

    Examples:
      | Type name |
      | Mini van  |


  # MV-008
  @cars
  Scenario Outline: Verify that the car types edition works correctly
    And click on the 'CARS option' of the 'lateral menu' in the 'Dashboard page'
    And click on the 'CARS SETTINGS suboption' of the menu into 'CARS option'
    And click on the 'Types tab' in the 'cars settings page'
    And click on the 'edit option' of the first record in the 'Types tab' of 'cars settings page'
    And fill 'update car type modal form' of 'car settings page' with the following data
      | Type name | Name in Russian | Name in Farsi | Name in French | Name in Turkish | Name in Arabic | Name in Spanish |
      | Sports    | спортивный      | ورزش ها       | des sports     | Spor Dalları    | رياضات         | Deportivo       |
    Then verify that "CHANGES SAVED!" notification message is displayed in the 'cars settings page'
      And verify that "<Type name>" is displayed in the first record of the 'car type table' of 'Types tab' option in 'cars settings page'
    And close Session on Dashboard page

    Examples:
      | Type name |
      | Sports    |


  # MV-009
  @cars
  Scenario: Verify that the car types delete works correctly
    And click on the 'CARS option' of the 'lateral menu' in the 'Dashboard page'
    And click on the 'CARS SETTINGS suboption' of the menu into 'CARS option'
    And click on the 'Types tab' in the 'cars settings page'
    And click on the 'delete option' of the first record in the 'Types tab' of 'cars settings page'
    And click on the 'accept button' of the 'confirm dialog' on the 'cars settings page'
    Then verify that 'car name' of the deleted record does not display in the 'Types tab' of 'cars settings page'
    And close Session on Dashboard page


  # MV-014
  @cars
  Scenario Outline: Verify that the extras registry works correctly
    And click on the 'CARS option' of the 'lateral menu' in the 'Dashboard page'
    And click on the 'EXTRAS suboption' of the menu into 'CARS option'
    And click on the 'ADD button' in the 'extras page'
    And fill 'extra form' of 'add extras page' with the following data
      | Thumb           | Name        | Price |
      | rear-camera.jpg | Rear camera | 75    |
    Then verify that "<Extra name>" is displayed in the first record of the column 'Name' in 'extras page'
      And verify that "<Extra Price>" is displayed in the first record of the column 'Price' in 'extras page'
    And close Session on Dashboard page

    Examples:
      | Extra name  | Extra Price |
      | Rear camera | 75          |


  #Option Blog

  @blog
  Scenario: List Options in Blogs
    And click on blog menu
    And check List in blog nemu
    Then assert list in blog secction:
      | one | two | three |
      | POSTS | BLOG CATEGORIES| BLOG SETTINGS|
    And close Session on Dashboard page

  @blog
  Scenario: Check BLOG MANAGEMENT in Blogs page
    And click on blog menu
    And go to the 'Post' in blog page
    And check "BLOG MANAGEMENT" in secction Post into blogs
    And close Session on Dashboard page

  @blog
  Scenario: New Post
    And click on blog menu
    And go to the 'Post' in blog page
    And click in new in blog page
    Then fill in data for new post:
      | title | keywords | description | category |
      | Elvikito beaches and lobste | Scenario | Scenario Template | Travel and Foods |
    And press on the Enter key to create in post page
    And close Session on Dashboard page

  @blog
  Scenario: Edit Post
    And click on blog menu
    And go to the 'Post' in blog page
    And click on 'Search' in post page
    And search "The Art Of Fashion" on post page
    And click 'go button' on Post page
    And click en edit in post page
    And change value into post "Adventure"
    And press on the Enter key to Update in post page
    And close Session on Dashboard page

  @blog
  Scenario: Delete Post
    And click on blog menu
    And go to the 'Post' in blog page
    And select the first element and save value
    And click on 'Search' in post page
    And first value salved search on post page
    And click 'go button' on Post page
    And client en 'delete post' in post page
    And press on the Enter key to delete in post page
    And assert not exist element firts salve
    And close Session on Dashboard page

  @blog
  Scenario: Check update Post that containt Translate
    And click on blog menu
    And go to the 'Post' in blog page
    And select the first element and save value
    And click on 'Search' in post page
    And first value salved search on post page
    And click 'go button' on Post page
    And click en edit in post page
    And check "Translate" exist in post page
    And close Session on Dashboard page

  @blog
  Scenario: Check BLOG CATEGORIES in Blogs page
    And click on blog menu
    And go to the 'Category' in blog page
    And check "BLOG CATEGORIES" in secction category into blogs
    And assert element with result in title
    And close Session on Dashboard page

  @blog
  Scenario: New element in category into Blogs page
    And click on blog menu
    And go to the 'Category' in blog page
    And click in new categoty into blog page
    And fill name with "The Creative" as new 'category'
    And save new category in blog page
    And click on 'Search' in catoroty into post page
    And click 'go button' on category page
    And check exist element in category
    And close Session on Dashboard page

  @blog
  Scenario: Edit Category into Blogs page
    And click on blog menu
    And go to the 'Category' in blog page
    And click on 'Search' in catoroty into post page
    And click 'go button' on category page
    And click en edit in category secction
    And change value into category name "The Creative Edit"
    And salve change value in category
    And assert new value "The Creative Edit"
    And close Session on Dashboard page

  @blog
  Scenario: Delete Category into Blogs page
    And click on blog menu
    And go to the 'Category' in blog page
    And click on 'Search' in catoroty into post page
    And click 'go button' on category page
    And click in delete in category secction
    And assert value "The Creative Edit" not exist
    And close Session on Dashboard page
