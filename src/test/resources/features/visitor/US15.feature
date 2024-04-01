@wip
Feature: US015 As a user,I would like to be able to see the categories and products of the electronics menu on the home page.

  Background:
    * Go to "url"

  Scenario: TC01 User enters into the home page

    * Home page body section Electronics category window is visible.
    * Click on the Electronics window and verify that subcategories appear.
    * Click on the Telephone heading in the subcategory and verify that the relevant products appear.
    * Click on the subcategory TV&Picture&Sound and verify that the relevant products appear.
    * Adding to the basket can be done on the products on the relevant category page Verify.
    * Selecting products for comparison on the products in the relevant category page verify that it can be done.
    * Verify that Warning Please Login First appears because you cannot add to the likes list on the products on the relevant category page.
    * In the Electronics window, click on more products to verify that additional products appear.