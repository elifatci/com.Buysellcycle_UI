Feature:US21 As a user, I would like to have a contact page on the site so that I can communicate with the administrators of the site where I shop.
  Background:
    * Go to "loginUrl"
    * Login by entering valid "customerEmailIhsan" and "password" on the SignIn page.
    * User clicks on -My Wallet- and displays the My Wallet "myWalletUrl".

    Scenario:TC01 Registered user accesses the My Wallet page and views wallet information.
      * User verifies the visibility of information boards.
      * Close the page

    Scenario:TC02 Registered user accesses the My Wallet page and makes a deposit to the wallet.
      * User clicks on -Recharge Wallet- and enters "fundChange".
      * User chooses a payment method.
      * User enters credit card information "customerEmailIhsan" "ccNumber" "expDate" "csc".
      * User displays the -Wallet Recharge History- table.
      * User verifies the "fundChange".
      * Close the page