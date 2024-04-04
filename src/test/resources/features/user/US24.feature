@wip
Feature: US_24 As a user, I would like to have an account page to view, change or delete the information I entered when registering on the site.


  Background:
    * Go to "loginUrl"
    * Login by entering valid "customerEmailReyyan" and "password" on the SignIn page.

    Scenario: TC_01 As a user, you should be able to log in and update your profile picture in the My Account
    menu on the dashboard page.

      * In SideBar, the menu item My Account appears.
      * Go to the My Account page.
      * Close the page


  @US24TC02
    Scenario: TC_02 As a user, you should be able to log in and update basic info  in the My Account menu on the
    dashboard page.

      * Go to the My Account page.
      * Go to the Basic Info tab.
      * Verify that the TextBoxes on the Basic Info tab are visible.
      * Verify that First Name,Email Address are displayed correctly.
      * To update TextBoxes, change the name in the Last name box and click the update now button to save the profile information.
      * Close the page

  @US24TC03
    Scenario: TC_03 As a user, you must create a new password in the Password information in the Change Password tab on the
    My Account page and must not create a new password with incorrect information entry

      * Go to the My Account page.
      * Click the Change Password tab.
      * "password" TextBox contains the current password, "reyyanNewPassword" and "reyyanNewPassword" TextBoxes contain the current password.enter the new password and click the Updatenow button..
      * "reyyanInvalidPassword" TextBox enter the invalid password. "reyyanNewPassword" and "reyyanNewPassword" Enter the new password in the TextBoxes. And Updatenow Click button.
      * The current password is not match with Verify that the old password. message appears
      * Enter the updated password in the "reyyanNewPassword" TextBox. "reyyanDifferentPassword1" and "reyyanDifferentPassword2" Enter different passwords in the TextBoxes. And Updatenow Click on the button.
      * The new password confirmation and new password must match. message appears Verify
      * The updated password in the "reyyanNewPassword" TextBox,"password" and "password" Enter the old password in the TextBoxes and update it.
      * Close the page
  @US24TC04
    Scenario: TC_04 As a user, you should be able to update the information in the Address tab of the My Account page
      * Go to the My Account page.
      * Click the Address tab.
      * Full Name, Address, Region,E-mail, Phone Number information Verify that it matches the user's information.
      * Edit icon and delete icon is displayed and active verify.
      * Make sure the new address registration button is visible and active.verify that
      * In a new address registration window Shipping Address and Billing address Verify type is clickable
      * Verify that the Name,email Address,Phone Number,fields are visible and information has been entered.
      *  Press the create button.
      * Close the page
