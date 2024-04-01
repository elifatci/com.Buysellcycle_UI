@US26

  Feature: As a user, I would like to have a page where I can open support tickets to resolve the problems I encounter on the site and see the status of the tickets I act

    Background:
      * Go to "loginUrl"
      * Login by entering valid "customerEmailZehra" and "password" on the SignIn page.
      * Goes to the Support Ticket page

    Scenario: TC_01 The Support Ticket menu title appears in the Dashboard sideBar and must be active.

      * Verify that the "Support Ticket" menu title is visible in the SideBar.
      * Verify that the "Support Ticket" menu title is clickable
      * Verify that when the "Support Ticket" menu title is clicked, the User is directed to the 'supportTicketUrl' page.


    Scenario: TC_02  All Submitted Ticket List must be visible on the Support Ticket page.

      * Verify that "All Submitted Ticket" text is visible
      * Verify that "all support requests" in the list are visible.

    Scenario: TC_03 Tickets should be listed in the All Submitted Ticket List with Ticket ID, Subject, Priority and Last Update information.

     * Verify that "Ticket ID", "Subject", "Priority", "Last Update" headers are visible
     * Verify that the tickets in the list contain Ticket ID, Subject, Priority, Last Update information.

    Scenario: TC_04 Access to the detailed information (Status, Priority, Category) of the relevant Ticket in the All Submitted Ticket List must be provided.

     * Click on the "View" link under the action heading of the selected ticket to open its detail page.
     * Verifies that "Status" information is displayed on the ticket's detail page
     * Verifies that "Priority" information is displayed on the ticket's detail page
     * Verifies that "Category" information is displayed on the ticket's detail page

    Scenario: TC_05 The message information returned to the ticket by the authorized person must be displayed.

     * Click on the "View" link under the action heading of the selected ticket to open its detail page.
     * Verifies that the message information returned by the Admin is displayed.

    Scenario: TC_06  It should be possible to message the authorized person from within the ticket

     * Click on the "View" link under the action heading of the selected ticket to open its detail page.
     * Verifies that the REPLY button is visible and active under the message boxes
     * When the REPLY button is clicked, it is verified that the "Description" text is visible.
     * Verifies that the required information can be entered in the textbox opened under the Description text.
     * Verifies that the "REPLY NOW" button is displayed and active.
     * When he clicks on the REPLY NOW button, he confirms that the information he sent is also displayed on his own page.

    Scenario: TC_07 Tickets shown in the All Submitted Ticket List should be filtered and listed according to the information All Ticket, Pending, On Going, Completed, Closed.

     * When All Ticket DDM is clicked on the page that opens, it verifies that the All Ticket, Pending, On Going, Completed, Closed links are visible.
     * When the "Pending" link is clicked, it confirms that the ticket with "pending" status is listed.
     * When the "On Going" link is clicked, it verifies that the ticket with "On Going" status is listed.
     * When the "Completed" link is clicked, it verifies that the ticket with "Completed" status is listed.
     * When the "Closed" link is clicked, it verifies that the ticket with "Closed" status is listed.

    Scenario: TC_08  A new Ticket should be created on the page (by entering Subject, Category, Priority and Description information).

     * Verifies that the "ADD NEW" button is displayed and active.
     * When you click on the ADD NEW button, it is confirmed that you go to the "Create new ticket" page.
     * It is verified that the Subject, Category, Priority and Description headings are visible.
     * It is verified that the textboxes under the Subject and Description headings are visible and active.
     * Verify that the holders are visible
     * It is verified that the DDM menu is visible and active under the Category and Priority headings.
     * Necessary information is entered in the Subject and Description text boxes.
     * Click on the necessary links for Category and Priority DDM.
     * Verifies that the "CREATE NOW" button is displayed and active.
     * When you click on the "CREATE NOW" button, it is confirmed that you are directed to the All Submitted Ticket page and the entered ticket is seen at the bottom.

     Scenario: TC_09  NEGATIVE TEST: A new Ticket should be able to be created on the page (by entering Subject, Category, Priority and Description information).

      * Clicks the ADD NEW button
      * It is confirmed that a 'field is required' warning is given when the Subject and Description textboxes are left blank.
      * It is verified that when the necessary links are not clicked due to Category and Priority DDM, a 'field is required' warning is given.
      * Verifies that the "logout" link has been clicked.

