
Feature: As a user, I want a section where I can view the status of my orders.

  Background:
    * Go to "url"
    * Click Track Your Order link

  Scenario: TC_01 The user should be able to inquire about their orders using the Order Tracking Number on the Track Your Order page.
    * Verify that correct page is opened
    * Verify that Order Tracking Number textbox is visible
    * Verify that Secret ID textBox is visible

  Scenario: TC_02 When the user enters the correct "Order Tracking Number," they should be able to access their order information.
    * Click Order Tracking Number textbox and Write "OrderID"
    * Click Secret ID textbox and Write "SecretID"
    * Click Track Now button
    * Verify that Product Detail page is opened

  Scenario: TC_03 When the user enters an invalid "Order Tracking Number" they should receive an error message.
    * Click Order Tracking Number textbox and Write "invalidOrderID"
    * Click Secret ID textBox and Write "invalidSecretID"
    * Click Track Now button
    * Verify that the error message is visible under Order Tracking Number textbox
    * Verify that the error message is visible under Secret ID Only For Guest User textbox

  Scenario: TC_04 Order Tracking Number textbox should be required
    * Click Secret ID textbox and Write "SecretID"
    * Click Track Now button
    * Verify that the message is visible

  @US03
  Scenario: TC_05 Secret ID (Only For Guest User) textbox should be required
    * Click Order Tracking Number textbox and Write "OrderID"
    * Click Track Now button
    * Verify that the message is not Displayed
    * Close the page

