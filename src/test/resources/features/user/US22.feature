Feature: As a registered user, I would like to have a page on my dashboard
  where I can display my coupons / perform coupon transactions
  Background:
        * Go to "loginUrl"
        * Login by entering valid "customerEmailNazime" and "password" on the SignIn page.

  Scenario: My Coupons Menu Header Visibility and Activation
        * Dashboard side bar displays My Coupons Menu Title

  Scenario: Viewing the Add Coupons window
        * Click the MyCoupons menu Title
        * displays the add coupon button on the page

  Scenario: Add a new coupon
        * Click the MyCoupons menu Title
        * a new coupon is added in the add coupon section

  Scenario: List of Collected Coupons
        * Click the MyCoupons menu Title
        * Displays the user's previously collected coupons listed as Collected Coupons list

    Scenario: copying   and delete the coupon
        * Click the MyCoupons menu Title
        * Click on the copy icon to copy the coupon from the Collected Coupons list
        * Click the delete icon to delete the coupon in the Collected Coupons list
