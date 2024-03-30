@US17
Feature: As a registered user, I would like to have a dedicated dashboard page on the site
  to check my actions and settings on the site.

  Background:
    * Go to "url"
    * Clicks the Login buttonLink on the home page
    * Login by entering valid "customerEmailSenayda" and "password" on the SignIn page.


  Scenario: TC01 Registered user gets access to Profile, Balance, Transaction menus on Dashboard Page

    * User clicks to the Dashboard Page and and displays Dashboard Page
    * User displays user profile information on the Dashboard page
    * User displays user balance information on the Dashboard page
    * User displays the user's last transaction information on the Dashboard page
    * The user closes the page

  Scenario: TC02 Registered user tests the visibility of body sections

    * User verifies that there is a summary information board specific to the user on the Dashboard page
    * User should verifies the information of the related transactions (Purchase History, My Wishlist, Recent Order, Product in Cart) in the body section of the Dashboard page.

