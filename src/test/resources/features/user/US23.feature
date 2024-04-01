Feature: US23 As a user, I need to be able to access the Refund&Dispute page and use its functions for orders I want to return.

  Background:
    * Go to "url"
    * The user closes the pop-up window
    @ahmed23
    Scenario: TC01 User should be able to access the login page

      * The user clicks on the LOGIN button at the top right corner of the page
      * It is checked whether the login page is opened
      * 2 seconds pause
      * Close the page
    @ahmed23
    Scenario: TC02  User should be able to log into the system with valid credentials

      * The user clicks on the LOGIN button at the top right corner of the page
      * The user types in the valid mail address to the mail textbox inside the sign-in form
      * The user types in the valid password to the password textbox inside the sign-in form
      * The user clicks on the SIGN IN button
      * It is checked if the shown page is User dashboard
      * Close the page

    @ahmed2334
    Scenario: TC03  Registered user should be able to access the Refund & Dispute page

      * The user clicks on the LOGIN button at the top right corner of the page
      * The user types in the valid mail address to the mail textbox inside the sign-in form
      * The user types in the valid password to the password textbox inside the sign-in form
      * The user clicks on the SIGN IN button
      * It is checked if the Refund % Dispute link on the sidebar is displayed and enabled
      * The user clicks on the Refund & Dispute link on the sidebar
      * It is checked if the shown page is Refund and Dispute page
      * Close the page


  @ahmed2334
    Scenario: TC04  Registered user should be able to use the functions of the Refund & dispute page

      * The user clicks on the LOGIN button at the top right corner of the page
      * The user types in the valid mail address to the mail textbox inside the sign-in form
      * The user types in the valid password to the password textbox inside the sign-in form
      * The user clicks on the SIGN IN button
      * It is checked if the Refund % Dispute link on the sidebar is displayed and enabled
      * The user clicks on the Refund & Dispute link on the sidebar
      * The user should be able to see the Refund list
      * The user should be able to see the Order ID, Order Date, Status, Request Sent Date and Order Amount details
      * When clicked on the View Details button, further details about the refund should be displayed
      * It is checked if at least one status is active on the details page
      * It is checked if the status text's are shown on the details page
      * It is checked if the pick up info is being displayed on the details page
      * Close the page




