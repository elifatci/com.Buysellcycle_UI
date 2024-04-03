@US27
Feature: U27 As a registered user, I would like to be able to view the sellers I follow on one page.

  Background:
    * Go to "url"
    * Clicks the Login buttonLink on the home page
    * Login by entering valid "customerEmailElif" and "password" on the SignIn page.

  @US27TC01
  Scenario:TC_01 The Follow menu title appears in the Dashboard sideBar and must be active.
    * Verify that the Follow banner is visible in the Dashboard sideBar
    * Click on the Follow menu
    * Verify that it redirects to the Follow page

  @US27TC02
  Scenario: TC_02 Testing the functions on the Follow page
    * Scroll down the page until visible the Follow link
    * Click on the Follow menu
    * Verify that the SL,Name,Total Product,Total Followers,Action headers are displayed
    * Test that the unfollow button is visible and clickable
