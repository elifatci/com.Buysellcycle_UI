Feature: US_37 As an administrator, I would like to have a page on the site where
  I can see all active and inactive customers together.

  Background:
    * Go to "adminUrl"
    * Login by entering valid "adminEmailGamze" and "password" on the SignIn page.
    * Click Customer on the sidebar and all customer
    * Verify that user redirected All Customer page

  Scenario: TC_01 Test of all customer list and changing situation
    * Click isActive radio button and verify that user gets the successful message

  Scenario: TC_02 Test of editing basic info of active customer
    * Click on the Active Customer
    * Click Select button and edit button
    * Change lastname and click update button
    * Verify that user gets the successful message

  Scenario: TC_03 Test of deleting of active customer
    * Click on the Active Customer
    * Click Select button and delete button
    * Click Delete button on the modal
    * Verify that user gets the successful message

    Scenario: TC_04 Test of reaching detail info of active customer
      * Click on the Active Customer
      * Click Select button and details button
      * Verify that Customer Profile,Order Summary,Wallet Summary sre visible

  Scenario: TC_05 Test of editing basic info of inactive customer
    * Click on the InActive Customer
    * Click Select button and edit button on inactive customer
    * Change lastname and click update button
    * Verify that user gets the successful message

  Scenario: TC_06 Test of reaching detail info of inactive customer
    * Click on the InActive Customer
    * Click Select button and details button  on inactive customer
    * Verify that Customer Profile,Order Summary,Wallet Summary sre visible

  Scenario: TC_07 Test of deleting of inactive customer
    * Click on the InActive Customer
    * Click Select button and delete button on inactive customer
    * Click Delete button on the modal
    * Verify that user gets the successful message

  Scenario: TC_08 Test of creating new customer
    * Click on the Create Customer button
    * Fill the form with customer information
    * Click create button
    * Verify that user gets the successful message

  Scenario: TC_09 Test of creating new customer
    * Click on the Create Customer button
    * Click create button
    * Verify that Create button is visible


