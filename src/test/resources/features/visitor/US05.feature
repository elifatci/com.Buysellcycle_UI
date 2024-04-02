@US05
Feature: US05 As a user, I would like to be able to log in with the email and password I registered with the site.

  Background:
    * Go to "url"
    * The user closes the pop-up window

  @ahmed5
  Scenario: TC01 User should be able to access the login page

    * The user clicks on the LOGIN button at the top right corner of the page
    * It is checked whether the login page is opened
    * 2 seconds pause
    * Close the page
  @ahmed5
  Scenario: TC02 The content of the login page should be checked

    * The user clicks on the LOGIN button at the top right corner of the page
    * It is checked if there is a picture displayed on the right side of the page
    * It is checked if there is a TURN YOUR IDEAS INTO REALITY quote on the right side of the page
    * It is checked if there is a sign-in form on the left side of the page
    * It is checked if there is a SIGN IN button below the sign-in form
    * It is checked if there is a link below the sign-in form for those who forget their password
    * It is checked if there is a link below the sign-in form for those who want to sign up
    * Close the page
  @ahmed5
  Scenario: TC03 User should be able to log into the system with valid credentials

    * The user clicks on the LOGIN button at the top right corner of the page
    * The user types in the valid mail address to the mail textbox inside the sign-in form
    * The user types in the valid password to the password textbox inside the sign-in form
    * The user clicks on the SIGN IN button
    * It is checked if the shown page is User dashboard
    * Close the page

  @ahmed5
  Scenario: TC04 error message should be displayed when invalid credentials is entered

    * The user clicks on the LOGIN button at the top right corner of the page
    * The user types in the invalid mail address to the mail textbox inside the sign-in form
    * The user types in the invalid password to the password textbox inside the sign-in form
    * The user clicks on the SIGN IN button
    * It is checked if the error message is displayed
    * Close the page
















