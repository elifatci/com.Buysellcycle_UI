Feature: US30 As a user, I want the products I like to be listed on a page for later evaluation and perhaps purchase.
  Background:
    * Go to "loginUrl"
    * Login by entering valid "customerEmailIhsan" and "password" on the SignIn page.
    * User clicks on -My Wishlist- and displays "myWishlistUrl" the My Wishlist page.
    * User verifies the visibility of products.

    Scenario:TC01 Registered user accesses the My Wishlist page, lists the products, and adds them to the cart.
      * User clicks on -Add To Cart icon- and adds an item.
      * User verifies the visibility of Success Alert.
      * Close the page

    Scenario:TC02 Registered user accesses the My Wishlist page, lists the products, and deletes them.
      * User clicks on -Delete icon- and deletes an item.
      * Close the page

    Scenario:TC03 Registered user accesses the My Wishlist page and compares the products with each other.
      * User clicks on -Compare icon- for the first and second item.
      * User clicks on -Compare- and displays "compareUrl" the Compare page.
      * User verifies the comparison of those items.
      * Close the page

    Scenario:TC04 Registered user accesses the My Wishlist page and views the details of the products.
      * User clicks on -Quick View icon- and displays the details of the product.
      * User verifies the visibility of details of the product.
      * Close the page

    Scenario:TC05 Registered user accesses the My Wishlist page and changes the number of products to be displayed.
      * User clicks on -number of products dropdown menu- and chooses an option "itemCountFilter".
      * User confirms that only the amount "itemCountFilter" of the filtered number of products is visible.
      * Close the page

    Scenario:TC06 Registered user accesses the My Wishlist page and filters the products.
      * User clicks on -number of products dropdown menu- and chooses an option "itemFilter".
      * User confirms that only the amount "itemFilter" of the filtered number of products is visible.
      * Close the page