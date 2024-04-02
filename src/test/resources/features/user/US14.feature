@US14
  Feature: As a user, I would like to have various functions in the home page body section
    to make shopping easier.

    Background:
      * Go to "url"

  Scenario: TC_01 Products should be listed in the body section of the home page, under the Best Deals menu.
    * Verify that Best Deals text is visible
    * Click View All button
    * Verify that all the products are visible
    * Close the page


    Scenario: TC_02 It should be possible to perform actions on products in the Best Deals menu
      * Verify that Compare and Quick View links are active
      * Verify that Wishlist link is active
      * Verify thar Add To Cart link is active