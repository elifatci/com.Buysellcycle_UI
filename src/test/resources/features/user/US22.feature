Feature: As a registered user, I would like to have a page on my dashboard
  where I can display my coupons / perform coupon transactions
  Background:
        * Go to "loginUrl"
        * Login by entering valid "customerEmailNazime" and "password" on the SignIn page.
        * Click the MyCoupons menu Title

  Scenario: My Coupons Menu Header Visibility and Activation
        * Dashboard side bar displays My Coupons Menu Title
        * Close the page

  Scenario: Viewing the Add Coupons window
        * displays the add coupon button on the page
        * Close the page

  Scenario: Add a new coupon
        * a new coupon is added in the add coupon section
        * Close the page

  Scenario: List of Collected Coupons
        * Displays the user's previously collected coupons listed as Collected Coupons list
        * Close the page

  Scenario: copying   and delete the coupon
        * Click on the copy icon to copy the coupon from the Collected Coupons list
        * Click the delete icon to delete the coupon in the Collected Coupons list
        * Close the page