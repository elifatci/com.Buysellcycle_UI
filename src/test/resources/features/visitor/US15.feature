
Feature: US015 As a user,I would like to be able to see the categories and products of the electronics menu on the home page.

  Background:
    * Go to "url"

  Scenario: TC01 User enters into the home page

  * Verify that the Electronics category window is displayed in the Home page body section.
  * Click the Telephone heading in the subcategory and verify that the related products are displayed.
  * Click the TV&Picture&Sound heading in the subcategory and verify that the related products are displayed.
  * Verify that the products on the relevant category page have been added to the basket.
  * Verify that you have selected products for comparison on the products in the relevant category page.
  * Verify that the products on the relevant category page have been added to the likes list.
  * Verify that Warning Please Login First appears on the products in the relevant category page because it is not possible to add to the likes list.
  * Verify that additional products are displayed by clicking more products in the Electronics window.