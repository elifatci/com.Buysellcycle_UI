@US31
Feature: US31 As a user, I would like to have a cart page where I can throw the products I intend to buy while shopping and then I can do my shopping transactions.

  Background:
    * Go to "url"
    * Clicks the Login buttonLink on the home page
    * Login by entering valid "customerEmailElif" and "password" on the SignIn page.

  @US31TC01
  Scenario: TC01  Registered user should be able to access the Cart page

    * Click on the user site logo
    * Clicks on the product titled Orange Balloon in the Best Deals section
    * Clicks the Add to card button
    * Clicks the View card button
    * Verify that it redirects to the Cart page

  @US31TC02
  Scenario:  TC04 Registered user should be able to use the functions of the Cart page

    * Clicks on the Cart link on the header section
    * Increase the product quantity by one in the product detail section
    * Verify that subtotal information is updated
    * Verify that the Continue Shopping, Proceed To Checkout buttons are visible and clickable
    * Verify that the Order summary section is visible
    * Verify that the discount amount of the product is visible in the product detail section.
    * Delete the product in the product detail section
    * Verify that the product has been deleted









