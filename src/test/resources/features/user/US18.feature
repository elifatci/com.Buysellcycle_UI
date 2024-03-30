@US18
Feature: US_18 Shopping history should be displayed in the User Dashboard panel

  Background:
    * Go to "url"
    * Clicks the Login buttonLink on the home page
    * Login by entering valid "customerEmailElif" and "password" on the SignIn page.

  @US18TC01
  Scenario: TC_01 The Purchase History menu title appears on the Dashboard sideBar and it is tested to be active.

    * Displays Purchase History banner in Dashboard sideBar
    * Clicking on the Purchase History link confirms that the relevant page has been accessed.

  @US18TC02
  Scenario: TC_02 Viewing the shopping history (with Details, Amount, Delivery Status, Payment Status, Action information) test on the Purchase History page

    * Click the Purchase History link in the Dashboard sideBar
    * Verify that the Details, Amount, Delivery Status, Payment Status, Action headers are visible
    * Verify filtering by payment status
    * Verify that the hamburger icon and download icon next to purchases are visible and functional
    * Click on the Dowload icon to verify that the invoice has been downloaded.
    * Verify that Order code, Package code, Delivery Process, Order Details, Order Summary, Payment Type information is visible in the invoice information.



