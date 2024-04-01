@US01TC01
Feature: As a user, I want to be able to access the site home page

  Scenario: TC_01 Visitor should access to the home page

    Given Go to "url"
    Then  Verify that the title is "BuySellCycle | Multivendor Marketplace"
    And  Close the page
