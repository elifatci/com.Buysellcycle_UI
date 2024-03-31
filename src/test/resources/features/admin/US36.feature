@US36
Feature: US36 As an administrator, I would like to have a profile page to access my profile information and logout.

  Background:
    * Go to "adminUrl"
    * Login by entering valid "adminEmailElif" and "password" on the SignIn page.

  @US36TC01
  Scenario:TC_01 Viewing profile icons and subheadings on the admin dashboard panel

    * Verify that the profile icon is visible on the Dashboard page
    * Verify that subheadings are visible when hovering over the profile icon
    * Hover over your profile icon and click on the My profile link.
    * Confirm that the My profile page has been opened

  @US36TC02
  Scenario:TC_02 Testing the basic info section on my profile page on the admin page

    * Hover over your profile icon click on the My profile link.
    * Verify that First Name, Last Name, E-mail Address, Phone Number, Date of Bird information is visible in the Basic Info section.
    * Verify that the update and avatar buttons are visible and functional
    * Verify that the profile picture is updated
    * Verify that the information can be updated

  @US36TC03
  Scenario:TC_03 Testing the change password section on the my profile page on the admin page
    * Hover over your profile icon and click on the My profile link.
    * Click on the Change password button and verify that you are directed to the relevant page.
    * Verify that the CURRENT PASSWORD, NEW PASSWORD, RE ENTER NEW PASSWORD textboxes are visible
    * Verify that the password can be updated

  @US36TC04
  Scenario:TC_04 Testing the address section on my profile page on the admin page
    * Hover over your profile icon and click on the My profile link.
    * Click on the Address button
    * Verify that the Address page opens
    * Verify that the Add new address button is visible and active
    * Verify that address information is visible
    * Click the Add new address button
    * Verify that the save button is visible
    * Fill in the starred fields and click the save button.
    * Verify that the address has been added

  @US36TC05
  Scenario:TC_05 Address section negative test
    * Hover over your profile icon and click on the My profile link.
    * Click on the Address button
    * Click the Add new address button
    * Leave the textboxes of the required fields empty and click on the save button.
    * Select the select from options option from Country dropdown
    * Click on the save button
