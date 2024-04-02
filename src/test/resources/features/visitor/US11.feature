@US11
Feature:Verify the visibility and functionality of the "New User Zone" menu item on the homepage navigation bar

  Background:
    * Go to "url"
    * Verify  for the presence of the New User Zone menu item
    * Click on the New User Zone menu item


  Scenario: TC_01 Test of the "New User Zone" link

    * verify that New User Zone link should redirect the user to the New-user-zone page
    * Close the page

  Scenario: TC_02 Functionality of the "For You," "Exclusive Price," and "Coupon" sections

    * Verify that For You section is active
    * Click on the Exclusive Price section
    * verify that products display with special discount on Exclusive Price
    * Click on the Coupon section and verify that Coupon is visible

  Scenario: TC_03 Perform operations on products like adding to cart, selecting products for comparison  on "For You" sections

    * Click on the chart icon of the first product
    * verify that the message Item added to your cart on the modal
    * Close the modal window that opened
    * Click on the compare icon of the first product
    * verify that the message Product added to compare list successfully is display

  Scenario: TC_04 Perform operations on products like quick view and adding wish list on "For You" section

    * Click  on the Quick view icon of the first product and verify that the modal window appear
    * Close the modal window that opened
    * Click on the Wish list icon of the first product and verify that the product is added

  Scenario: TC_05 Perform operations on products like adding to cart, selecting products for comparison, adding to favorites list and viewing  on "Exclusive Price" section

    * Click on the Exclusive Price section
    * verify that products display with special discount on Exclusive Price
    * Click on the chart icon of the first product for adding to cart and verify that the message Item added to your cart on the modal
    * Close the modal window that opened
    * Click on the compare icon of the first product  and verify that the message Product added to compare list successfully is display

  Scenario: TC_06 Perform operations on products like quick view and adding wish list on "Exclusive Price" section

    * Click on the Exclusive Price section
    * verify that products display with special discount on Exclusive Price
    * Click on the Click on the Quick view icon of the first product and verify that the modal window appear
    * Close the modal window that opened on Exclusive Price
    * Click on the Wish list icon of the first product and verify that the product is added