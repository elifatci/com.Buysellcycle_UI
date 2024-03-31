@dene
Feature:US39 As an administrator, I would like to have a product list page to access the product lists on the site.
  Background:
    * Go to "adminUrl"
    * Login by entering valid "adminEmailIhsan" and "password" on the SignIn page.
    * User clicks on -Products menu- then clicks on -Product List- and displays "productListUrl" the Product List page.

    Scenario:TC01 Admin accesses the Product List page and navigates to other headings.
      * User clicks on -Seller Request Product- and displays the page.
      * User clicks on -Disabled Product List- and displays the page.
      * User clicks on -Product By SKU- and displays the page.
      * Close the page

    Scenario:TC02 Admin accesses the Product List page and views the listing headings.
      * User verifies that Product List headings are visible.
      * Close the page

    Scenario:TC03 Admin accesses the Product List page and performs a product search.
      * User clicks on -Quick Search- and enters a product "productName".
      * User verifies that he-she displays the result.
      * Close the page

    Scenario:TC04 Admin accesses the Product List page and changes the product status.
      * User clicks on -Status toggle-.
      * User verifies that status is changed.
      * Close the page

    Scenario:TC05 Admin accesses the Product List page and views the product.
      * User clicks on -Select-.
      * User clicks on -View- and displays the product information's.
      * Close the page

    Scenario:TC06 Admin accesses the Product List page, edits the product, and confirms that the type cannot be changed.
      * User clicks on -Select-.
      * User clicks on -Edit- and displays "productListEditUrl" the Edit Product page.
      * Close the page

    Scenario:TC07 Admin accesses the Product List page and clones the product.
      * User clicks on -Select-.
      * User clicks on -Clone- and displays "productListCloneUrl" the Clone Product page.
      * Close the page

    Scenario:TC08 Admin accesses the Product List page and deletes the product.
      * User clicks on -Select-.
      * User clicks on -Delete- and confirms deletion.
      * User verifies that the product is deleted.
      * Close the page

    Scenario:TC09 Admin accesses the Product List page and adds a new product.
      * User clicks on -Add New Product- and displays "addNewProductUrl" the Add New Product page.
      * Close the page
