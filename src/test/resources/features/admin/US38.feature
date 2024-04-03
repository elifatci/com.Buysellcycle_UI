Feature: As an administrator I would like to have a page to add a new product to the site.
  Background:
    * Go to "adminUrl"
    * Login by entering valid "adminEmailNazime" and "password" on the SignIn page.

    Scenario: TC01 Access to Add New Product page
      * Clicks the product link in the admin dashboard sidebar
      * Clicks the  add new product link in the admin dashboard sidebar
      * Close the page


  Scenario: TC02 Add new Productins titles display
        * Clicks the product link in the admin dashboard sidebar
        * Clicks the  add new product link in the admin dashboard sidebar
        * Add new Productin titles(General Information, Related Product, Up Sale, Cross sale) display
        * Close the page

  Scenario: TC03 Displaying and selecting type options und enable
    * Clicks the product link in the admin dashboard sidebar
          * Clicks the  add new product link in the admin dashboard sidebar
          * select variant type
          * Close the page

  Scenario: TC04 Display of the product information fields
            * Clicks the product link in the admin dashboard sidebar
            * Clicks the  add new product link in the admin dashboard sidebar
            * Display Name, Product SKU, Model Number, Category, Brand, Unit, Barcode Type,Minimum Order QTY, Max Order QTY, Tags (Comma Separated) Text Boxes in Product Information Section
            * Close the page

  Scenario: TC05 input information into physical products
            * Clicks the product link in the admin dashboard sidebar
            * Clicks the  add new product link in the admin dashboard sidebar
            * Enter the information in the Weight Height Info section
            * Close the page

            Scenario: TC06 Ability to enter price info and stock information
            * Clicks the product link in the admin dashboard sidebar
            * Clicks the  add new product link in the admin dashboard sidebar
            * Information is entered in Price Info and Stock section

            Scenario: TC07 image upload for new product
              * Clicks the product link in the admin dashboard sidebar
              * Clicks the  add new product link in the admin dashboard sidebar
              * Picture is added to Description section

              Scenario: TC08 add products to the site
               * Clicks the product link in the admin dashboard sidebar
              * Clicks the  add new product link in the admin dashboard sidebar
              * the necessary information is entered and a new product is added to the site
              * Save & Publish and Save buttons are visible and their activation is confirmed
              * a new product is added to the site

                Scenario: TC09 related product identification
                  * Clicks the product link in the admin dashboard sidebar
                  *  Clicks the  add new product link in the admin dashboard sidebar
                  * On the Add New Product page, related products are determined for the product to be added

                  Scenario: TC10 Selecting Up Sale product
                    * Clicks the product link in the admin dashboard sidebar
                    * Clicks the  add new product link in the admin dashboard sidebar
                    * On the Add New Product page, select the products up sale

                    Scenario: TC11 Cross Sale product
                      * Clicks the product link in the admin dashboard sidebar
                      * Clicks the  add new product link in the admin dashboard sidebar
                      * On the Add New Product page, select the products cross  sale

                      Scenario: TC12 view warning message
                      * Clicks the product link in the admin dashboard sidebar
                      * Clicks the  add new product link in the admin dashboard sidebar
                      * Add New Product sayfasinda "Save After Fillup All General Information & Related Product, Up Sale, Cross Sale" uyari mesaji goruntulenir

                        Scenario:  TC13  Redirect to add category page ,Brand Page and Unit Page

                          * Clicks the product link in the admin dashboard sidebar
                          * Display Category und clicks
                          * Display Brand  Page und clicks
                          * Display Unit  Page und clicks












