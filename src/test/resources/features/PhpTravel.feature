# Login feature review the behavior in thie feature
Feature: Login

  Background: Home page is displayed once set credential in login page
    Given 'PHP travel' page is loaded
    And set my credentials on 'Login' page

  #@blog
  #Scenario: List Options in Blogs
  #  And click on blog menu
  #  And check List in blog nemu
  #  Then assert list in blog secction:
  #    | one | two | three |
  #    | POSTS | BLOG CATEGORIES| BLOG SETTINGS|
  #  And close Session on Dashboard page

  #@blog
  #Scenario: Check BLOG MANAGEMENT in Blogs page
  #  And click on blog menu
  #  And go to the 'Post' in blog page
  #  And check "BLOG MANAGEMENT" in secction Post into blogs
  #  And close Session on Dashboard page

  #@blog
  #Scenario: New Post
  #  And click on blog menu
  #  And go to the 'Post' in blog page
  #  And click in new in blog page
  #  Then fill in data for new post:
  #    | title | keywords | description | category |
  #    | Elvikito beaches and lobste | Scenario | Scenario Template | Travel and Foods |
  #  And press on the Enter key to create in post page
  #  And close Session on Dashboard page

  #@blog
  #Scenario: Edit Post
  #  And click on blog menu
  #  And go to the 'Post' in blog page
  #  And click on 'Search' in post page
  #  And search "The Art Of Fashion" on post page
  #  And click 'go button' on Post page
  #  And click en edit in post page
  #  And change value into post "Adventure"
  #  And press on the Enter key to Update in post page
  #  And close Session on Dashboard page

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



  #Option Hotels

  #Option Flights

  #Option Tours

  #Option Cars

  #Option Blog
