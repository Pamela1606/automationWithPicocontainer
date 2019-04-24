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

 # @blog
 # Scenario: New Post
 #   And click on blog menu
 #   And go to the 'Post' in blog page
 #   And click in new in blog page
   # And click on 'Search' in post page
    #And search "Elvikito beaches and lobste" on post page
    #And click 'go button' on Post page
    #And clien en 'delete post' in post page
    #And press on the Enter key to delete in post page
    #And close Session on Dashboard page

#  @blog
#  Scenario: Delete Post
#    And click on blog menu
#    And go to the 'Post' in blog page
#    And click on 'Search' in post page
#    And search "Elvikito beaches and lobste" on post page
#    And click 'go button' on Post page
#    And clien en 'delete post' in post page
#    And press on the Enter key to delete in post page
#    And close Session on Dashboard page


#  @blog
#  Scenario: Edit Post
#    And click on blog menu
#    And go to the 'Post' in blog page
#    And click on 'Search' in post page
#    And search "Virgin Gorda beaches and lobste" on post page
#    And click 'go button' on Post page

#  @blog
#  Scenario: Check post
#    And click on blog menu
#    And go to the 'Post' in blog page
#    And click on 'Search' in post page
#    And search "Virgin Gorda beaches and lobste" on post page
#    And click 'go button' on Post page

    #And click on Search button on Airport page
    #And fill element to search "CBBA" Search field on Airport page
    #And select by field "Citycode" on Airport page
    #And click on GO button on Airport page
    #And choose the element to select on Airport page
    #And click on icon delete element selected on Airport page
    #And press on the Enter key to delete the chosen element on Airport page
    #And close Session on Dashboard page

  #Option Hotels

  #Option Flights

  #Option Tours

  #Option Cars

  #Option Blog
