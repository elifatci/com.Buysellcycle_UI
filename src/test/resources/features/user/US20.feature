@US20
Feature: US_20 My Order menu should be active and displayed in the User Dashboard panel

  Scenario: TC_01 My Order link in the Dashboard sidebar menu should be visible and should be active
    * Go to "loginUrl"
    * Login by entering valid "customerEmailKevser" and "password" on the SignIn page.
    * Clicks My Order link in the User Dashboard panel
    * Verify that expected page is opened

  Scenario: TC_02 Registered users should be able to access order details through the My Order menu in the Dashboard panel.

    * All, To Pay, To Ship, To Receive links should be visible and active
    * Order ID, Order Date, Status, Order amount, Paid Bay links should be visible and active
    * Order Details button should be visible and active
    * Last 5 orders link should be visible and active

  Scenario: TC_03 Registered users should be able to cancel their orders using the Cancel Order button located in the product window.

    * Clicks Cancel Order button
    * Clicks Personal issue dropdown menu
    * Choose the preference
    * Clicks Send button
    * Verify that the Order is Cancelled

  Scenario: TC_04 Order details should be visible on the product detail page.

    * Verify that Pending, Processing, Shipped, Received, Delivered status information is visible
    * Verify that Package, Sold By, Price, Shipping Info,Billing Info, Payment Info details are visible
    * Close the page