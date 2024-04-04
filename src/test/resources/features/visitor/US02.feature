

@US02
Feature: As a user, I want easily accessible links on the homepage's top bar to perform site operations.

  Background:
    * Go to "url"

  @US02TC01
    Scenario: TC01 Display und click  of links
      * Displays und click the headings (Track Your Order) on the top right side
      * Displays und click the headings ( Compare) on the top right side
      * Displays und click the headings ( Wishlist) on the top right side. Click the BuyCell logo
      * Displays und click the headings (Cart) on the top right side
      * Displays und click the headings (New User Zone ) on the top right side
      * Displays und click the headings ( Daily Deals) on the top right side
      * Close the page
  @US02TC02
      Scenario: TC02 Display and click on the site logo
      * The site logo is displayed on the top left of the page
      * Click on the site logo and refresh the page
      * Close the page
   @US02TC03
        Scenario: TC03 Displaying the search box and searching
       * The site logo is displayed und enabled on the top left of the page
       * Close the page




