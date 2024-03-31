@US29
Feature: As a logged in user, I want to be able to logout from the site.

  Background:
    * Go to "Url"
    * Clicks the Login buttonLink on the home page
    * Login by entering valid "customerEmailNazime" and "password" on the SignIn page.

  Scenario:TC01 Display the Logout link on Home Page
    * Displays Logout in the upper right corner of the homepage

  Scenario: TC02  Logging out of account on Home Page
    * Clicks Logout link
    * Displays Login title

  Scenario:TC03 Display the Logout link on Dashboard Side Bar
 * Logout link is displayed in the Dashboard Sidebar

  Scenario: TC04   Logging out of account on Dashboard Side Bar
    * Clicks Logout link on Dashboard Side Bar
    * Displays Login in the upper right corner of the homepage