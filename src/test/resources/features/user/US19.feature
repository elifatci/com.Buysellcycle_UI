Feature: US_19 As a registered user, I would like to have a My Wishlist page on my Dashboard dashboard where I can view the products I like.

  Background:
    * Go to "loginUrl"
    * Login by entering valid "customerEmailGamze" and "password" on the SignIn page.
    * Click on the My Wishlist on the sidebar

  Scenario: TC_01 Test of product by filtering on My Wish List
    * Verify that the url is "https://qa.buysellcycle.com/my-wishlist"
    * Click the New dropdown and click Price(Low to Height)
    * Compare second and third price

  Scenario:  TC_02 Test of adding to chart, compare on the Wish list
    * Click on the chart icon of the first product on the Wishlist
    * verify that  the modal appears on Wishlist
    * Close the modal window that opened on Wishlist
    * Click on the compare icon of the first product on the Wishlist
    * verify that the message Product added to compare list successfully is display

    Scenario: TC_03 Test of quick view and delete on the Wish list

