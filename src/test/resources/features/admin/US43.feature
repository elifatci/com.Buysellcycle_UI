@US43
Feature:US43 As an administrator, I would like to have a support ticket page so that I can take action on the opened support tickets.

  Background:
    * Go to "url"
    * Login by entering valid "adminEmailElif" and "password" on the SignIn page.

  @US43TC01
  Scenario:TC_01 Testing accessing the Support Ticket page from the Dashboard Side Bar

    * Verify that the Support Ticket link is visible in the side bar
    * Click on the support ticket link
    * Click on the support ticket link below.
    * Verify that it redirects to the relevant page

  @US43TC02
  Scenario: TC_02 Testing how to create a new ticket on the support ticket page

    * Click on the support ticket link
    * Click on the support ticket link below.
    * Click on the Add new button and verify that you are directed to the relevant page.
    * Verify that the Subject, Description, Category List, Priority and Status textboxes are visible
    * Verify that the add new buttons are active
    * Fill in the starred fields with valid information
    * Verify that more than one file can be attached to the Attach file section
    * Click on the Create ticket button and verify that the ticket has been created successfully.

  @US43TC03
  Scenario: TC_03 Testing the functions in the support ticket section on the support ticket page

    * Click on the support ticket link
    * Click on the support ticket link below.
    * Verify that PRIORITY, STATUS, CATEGORY information is selectable on the Support Ticket page
    * Click the search button from the Category, Priority and Status tabs.
    * Verify that the relevant filtering results are returned

  @US43TC04
  Scenario: TC_04 Testing the functions in the ticket list section on the support ticket page

    * Click on the support ticket link
    * Click on the support ticket link below.
    * click on the plus icon
    * Verify that the Agent assign field and action section are visible
    * If assigned, verify that the assignee's name is visible
    * Click a ticket's Select button and verify that the show edit delete options are visible
    * Click the Show button. Verify that the Ticket page is opened.
    * Go back, click on the select button and select the edit option.
    * Verify that the update ticket page is opened
