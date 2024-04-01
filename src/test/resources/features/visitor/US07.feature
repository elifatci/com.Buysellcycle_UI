
  @US07
  Feature: US07 As a user, I would like to have a page where I can follow the current products on the site where I shop.
    Background:
      * Go to "url"

    Scenario: TC_01 When the user enters the home page, verify that the 'New Product Deals' menu title is visible in the NavBar.

    * Verifies that the New Product Deals menu title is visible and active
    * Click on the New Product Deals menu title
    * Verifies that you are directed to the page where current product offers are listed
    * Close the pagepage

    Scenario: TC_02 Filters for filtering operations appear in the left section of the Best Deals page and must be functional.

    * Click on the New Product Deals menu title
    * Verifies that each filter option is visible on the Best Deals page that opens.
    * Selects and applies a filter option.
    * After the filter is applied, it verifies that the product list is updated according to this filtering.
    * Try different filter combinations and check that the results are updated correctly each time.
    * Verifies that all products are listed again when the filters are reset.
    * Close the pagepage

    Scenario: TC_03 Current products should be listed on the Best Deals page.

    * Click on the New Product Deals menu title
    * On the Best Deals page that opens, it verifies that the listing order of the products is sorted according to the newest date.
    * Checks the up-to-date status of product information by going to the detail page of each product.
    * By checking the products in different categories, it verifies that the most up-to-date products are listed in each category.
    * Refresh the page and verify that the product list has been updated
    * Close the pagepage

    Scenario: TC_04 Listing and display settings should be able to be changed while listing the products on the Best Deals page.

    * Click on the New Product Deals menu title
    * 'Show 9 item's' DDM verifies that it is visible
    * 'Sorting by' confirms that DDM is visible
    * Clicks on the 'Show 9 item's' DDM menu and selects one of the options in the list
    * Verifies that the page has changed according to the selected view
    * Clicks on the 'Sorting by' DDM menu and verifies that the new, old, name, price options are seen in the list.
    * Verifies that the page changes correctly when one of the options is clicked
    * Close the pagepage

      Scenario: TC_05 The refresh button on the Best Deals page should be visible and functional.

      * Click on the New Product Deals menu title
      * Verifies that the Refresh button is visible and active
      * Clicks the Refresh button
      * Verifies that the page has been refreshed and the content has been updated
      * Close the pagepage
