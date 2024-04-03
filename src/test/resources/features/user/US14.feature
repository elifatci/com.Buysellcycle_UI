@US14
Feature: As a user, I would like to have various functions in the home page body section
  to make shopping easier.

  Scenario: TC_01 Products should be listed in the body section of the home page, under the Best Deals menu.
    * Go to "url"
    * Verify that Best Deals text is visible
    * Click View All button
    * Verify that all the products are visible

  Scenario: TC_02 It should be possible to perform actions on products in the Best Deals menu
    * Go to "url"
    * Verify that Compare and Quick View links are active
    * Verify that Wishlist link is active
    * Verify that Add To Cart link is active

  Scenario: TC_03 All products belonging to the Feature Categories menu should be visible.
    * Go to "url"
    * Verify that Feature Categories text is visible
    * Verify that product box are visible under the Feature Categories text
    * Click View All button
    * Verify that all the products are visible


  Scenario: TC_04 In the Feature Categories menu it should be possible to perform operations on the products.
    * Go to "url"
    * Verify that Feature Categories text is visible
    * Click Shop Now link
    * Verify that Compare and Quick View links are active
    * Verify that Wishlist link is active
    * Verify that Add To Cart link is active
    * Close the page

  Scenario: TC_05 Products should be listed under the Top Rating menu in the body section of the home page.
    * Verify that Top Rating text is visible
    * Verify that product box are visible under the Top Rating link
    * Verify that right and left buttons are active


   # Scenario: TC_06 It should be possible to perform operations on the products in the Top Rating menu
   # * Verify that Compare and Quick View links under the Top Rating menu are active
   # * Verify that Wishlist link under the Top Rating menu is active
   # * Verify that Add To Cart link under the Top Rating menu is active
