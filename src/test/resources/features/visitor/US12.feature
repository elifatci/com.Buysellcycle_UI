Feature: US12 As a user, I would like the site to have a page with daily specials and discounts.

  Background:
    * Go to "url"
    * The user closes the pop-up window

  @ahmed12
    Scenario: TC01 User should be able to access the login page

      * The user clicks on the LOGIN button at the top right corner of the page
      * It is checked whether the login page is opened
      * 2 seconds pause
      * The user closes the page
    @ahmed12
    Scenario: TC02  User should be able to log into the system with valid credentials

      * The user clicks on the LOGIN button at the top right corner of the page
      * The user types in the valid mail address to the mail textbox inside the sign-in form
      * The user types in the valid password to the password textbox inside the sign-in form
      * The user clicks on the SIGN IN button
      * It is checked if the shown page is User dashboard
      * The user closes the page

    @ahmed12
    Scenario: TC03  There should be a page dedicated to daily deals on the website

      * It is checked if the Daily deals link is displayed and enabled
      * The user clicks on the Daily Deals link
      * It is checked if there is a countdown on the page
      * It is checked if there are products on sale on the page
      * It is checked if there is a button to compare products
      * It is checked if there is a button to review the products
      * It is checked if there is a button to add the products to the cart
      * It is checked if there is a button to add the products to the wishlist
      * The user closes the page



