@wip
Feature: US_24 As a user, I would like to have an account page to view, change or delete the information I entered when registering on the site.


  Background:
    * Go to "Url"
    * Clicks the Login buttonLink on the home page
    * Login by entering valid "customerEmailReyyan" and "password" on the SignIn page.

    Scenario: TC_01 As a user, you should be able to log in and update your profile picture in the My Account menu on the dashboard page

      * In SideBar, the menu item "My Account" appears.
      * Go to the "My Account" page.
      * Upload a new profile picture by clicking on the "Browse" button and verify that it has been uploaded.

    Scenario: TC_02 As a user, you should be able to log in and update basic info information in the My Account menu on the dashboard page

      * Go to the "Basic Info" tab.
      * Verify that the TextBoxes on the "Basic Info" tab are visible.
      * Verify that "First Name","Email Address" are displayed correctly.
      * Verify that the "last name" textbox is empty
      * Profile by entering new information in TextBoxes update and save their information.