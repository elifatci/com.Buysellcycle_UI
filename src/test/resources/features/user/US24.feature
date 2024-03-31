
Feature: US_24 As a user, I would like to have an account page to view, change or delete the information I entered when registering on the site.


  Background:
    * Go to "Url"
    * Clicks the Login buttonLink on the home page
    * Login by entering valid "customerEmailReyyan" and "password" on the SignIn page.
    * Go to the "My Account" page.

    Scenario: TC_01 As a user, you should be able to log in and update your profile picture in the My Account
    menu on the dashboard page.

      * In SideBar, the menu item "My Account" appears.
      * Upload a new profile picture by clicking on the "Browse" button and verify that it has been uploaded.

    Scenario: TC_02 As a user, you should be able to log in and update basic info  in the My Account menu on the
    dashboard page.

      * Go to the "Basic Info" tab.
      * Verify that the TextBoxes on the "Basic Info" tab are visible.
      * Verify that "First Name","Email Address" are displayed correctly.
      * Verify that the "last name" textbox is empty
      * Profile by entering new information in TextBoxes update and save their information.

    Scenario: TC_03 As a user, you must create a new password in the Password information in the Change Password tab on the
    My Account page and must not create a new password with incorrect information entry

      * Click the "Change Password" tab.
      * "Current Password" TextBox contains the current password, "New Password" and "Re-enter New Password" TextBoxes contain the current password.enter the new password and click the Updatenow button..
      * "Current Password" TextBox enter the invalid password."New Password" and "Re-enter New Password"Enter the new password in the TextBoxes. And Updatenow Click button.
      * "The current password is not match with Verify that the old password." message appears
      * Enter the updated password in the "Current Password" TextBox.  "New Password" and "Re-enter New Password" Enter different passwords in the TextBoxes. And Updatenow Click on the button.
      * "The new password confirmation and new password must match." message appears Verify
      * The updated password in the "Current Password" TextBox,"New Password" and "Re-enter New Password" Enter the old password in the TextBoxes and update it.

    Scenario: TC_04 As a user, you should be able to update the information in the Address tab of the My Account page

      * Click the Address tab.
      * "Full Name", "Address", "Region","E-mail", "Phone Number" information Verify that it matches the user's information.
      * Edit icon and delete icon is displayed and active verify.
      * Make sure the new address registration button is visible and active.verify that
      * In a new address registration window "Shipping Address" and "Billing address" Verify type is clickable
      * Verify that the "Name,email Address,Phone Number,fields are visible and information has been entered.
      *  Press the "create" button.
