# Login feature review the behavior in thie feature
Feature: Login

  Background: Home page is displayed once set credential in login page
    Given 'PHP travel' page is loaded
    And set my credentials on 'Login' page

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



  #Option Hotels

  #Option Flights

  #Option Tours

  #Option Cars

  #Option Blog
