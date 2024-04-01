
Feature: US_34 As an administrator, I would like to have an admin panel to access site data,
  organise the site, respond to customer requests

  Background:
    * Go to the admin "adminUrl"
    * Clicks the Login button
    * Login by entering valid "adminEmailReyyan" and "password" on the SignIn page.

  Scenario:

    * TC_01 Admin Panel Access and Dashboard Functionality
    * At the top of the Admin Dashboard page appears in the Search TextBox section Verify that it is.
    * Using Search TextBox, type "Dashboard" in the search box within the site and verify that the results are displayed correctly.
    * Click the Menu icon on the Admin Dashboard home page and verify that the SideBar collapses and expands.
    * Username of the site from Admin Dashboard redirected to the interface verify.
    * Click on the Today button and select verify that the data changes to the selected value.
    * Click on the This Week button and select verify that the data changes to the selected value.
    * Click on the This Year button and select verify that the data changes to the selected value.