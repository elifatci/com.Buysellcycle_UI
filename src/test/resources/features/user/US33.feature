@US33
Feature: As a registered user, I want to have a payment page where
  I can pay for my orders that I control.



  Scenario: TC01 User selects the payment type of the products added to the cart and creates an order
    * Go to "loginUrl"
    * Login by entering valid "customerEmailSenayda" and "password" on the SignIn page.
    * Click on the user site logo
    * Clicks on the product titled Orange Balloon in the Best Deals section
    * Clicks the Add to card button
    * Clicks the View card button
    * Verifies that the 'Proceed To Checkout' button is visible and active on the right side under the specified products
    * Click on the 'Proceed To Checkout' button on the right side under the specified products
    * User verifies that they have switched from the Checkout page to the Checkout page
    * The user can view and edit Ship to, Contact information on the Payment page
    * User clicks on Continue to Shipping button
    * User verifies that the Payment and Billing address types are selectable on the Payment page
    * User correctly displays the Order Summary information on the Payment page
    * User can apply existing coupons on the Payment page
    * User sees the Order Now and Return To Information buttons on the Payment page and verifies that they are active
    * User clicks on the Order Now button confirms that have switched from the payment page to the complete order now page.
    * User sees Thank you for your purchase! on the pop-up page.


    Scenario: TC02 User displays the order page
      * User displays the Order Number specified for the order on the page
      * User, Displays order summary (purchased items) on the page


  Scenario: TC03 The user completes the order from the order page
    * User clicks on the View Order Button and verifies the Order Page
    * User returns to the site home page after the completed order
