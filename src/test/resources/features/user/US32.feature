
  @US32
  Feature:As a user, I want to have a checkout page before paying for the products I am considering purchasing (throwing them into the cart).

    Background:
      * Go to "adminUrl"
      * Login by entering valid "adminEmailZehra" and "password" on the SignIn page.
      * I click on the CART link in the header section.

    Scenario: TC_01 There must be access to the payment page for the products specified on the cart page.
      * Verifies that the 'Proceed To Checkout' button is visible and active on the right side under the specified products

      Scenario: TC_02 On the checkout page, the number of products to be purchased, the number of each product to be purchased, and the pricing should be clearly displayed.
      * Click on the 'Proceed To Checkout' button on the right side under the specified products
      * Verifies that QUANTITY and PRICE titles are visible on the opened page
      * Verifies that the number and price of the products are visible under these headings.

      Scenario: TC_03 The amount to be paid must be displayed on the checkout page.
      * Click on the 'Proceed To Checkout' button on the right side under the specified products
      * Verify that the total price is visible under the ORDER SUMMARY section on the right side of the page that opens.

      Scenario: TC_04 Contact Information should be visible on the Checkout page.
      * Belirlenen ürünlerin altında sağ tarafta 'Proceed To Checkout' butonuna tıklar
      * Açılan sayfada Contact Informatiın başlığının görünür olduğunu doğrular
      * Shipping Address başlığı altında Name, Adress, Email,Phone;Postal Code Bilgilerinin görüldüğünü doğrular


      Scenario: TC_05 You must enter a note for your order on the checkout page.
      * Click on the 'Proceed To Checkout' button on the right side under the specified products
      * Verifies that the Note text is visible under the Address information under the Contact Information heading.
      * Verifies that the Textbox below the Note text is visible and active
      * Verifies that the placeholder inside the textbox is visible
      * Verifies that information can be entered into the textbox

      Scenario: TC_06 Subscriber registration should be possible on the checkout page.



      Scenario: TC_07 On the checkout page I agree with the terms and conditions. There should be a requirement to check the checkBox.
      * Click on the 'Proceed To Checkout' button on the right side under the specified products
      * Verifies that the 'checkbox' under the Contact Information heading is clickable
      * Verifies that the 'Please Agree With Terms' warning appears when the CONTINUE TO SHOPING button is clicked without clicking the checkbox


      Scenario: TC_08 On the Checkout page, the Continue To Shipping and Return To Cart options appear and must be active.
      * Click on the 'Proceed To Checkout' button on the right side under the specified products
      * On the page that opens, the Continue To Shipping and Return To Cart buttons appear under the Shipping Address section and it is verified that they are active.

