@US20
Feature: US_20 My Order menu should be active and displayed in the User Dashboard panel

  Background:
    * Go to "url"

  Scenario: TC_01 My Order link in the Dashboard sidebar menu should be visible and should be active

    * Clicks the Login buttonLink on the home page
    * Login by entering valid "customerEmailKevser" and "password" on the SignIn page.
    * Clicks My Order link in the User Dashboard panel
    * Verify that expected page is opened

  Scenario: TC_02 Registered users should be able to access order details through the My Order menu in the Dashboard panel.

    * All, To Pay, To Ship, To Receive links should be visible and active
    * Order ID, Order Date, Status, Order amount, Paid Bay links should be visible and active
    * Order Details button should be visible and active
    * Last 5 orders link should be visible and active