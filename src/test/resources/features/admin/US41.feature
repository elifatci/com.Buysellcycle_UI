@US41
  Feature:As an administrator, I want to have a page where I can add a new employee to the company and manage employees

    Background:
      * Go to "adminUrl"
      * Login by entering valid "adminEmailZehra" and "password" on the SignIn page.
      * Click on Human Resource DDM in the navbar on the left
      * Clicks the Staff link

      Scenario: TC_01 The Staff page should be accessible from the Dashboard Side Bar.
       * It is verified that he went to the Staff page
       * Close the page

      Scenario: TC_02 Staff List (with titles SL, Name, Email, Phone, Role, Status, Department, Registered Date, Action) should be displayed on the Staff page.
       * It is verified that the Staff List titles are seen
       * Close the page

    Scenario: TC_03 The status of the desired employee in the Staff List should be able to be changed
       * The status of the desired employee is changed by clicking on the Status checkbox.
       * Close the page

    Scenario: TC_04 It should be possible to access the detailed information of the desired employee from the Staff List.
       * Slect DDM clicks on the desired employee
       * Clicks the View link
       * Close the page

    Scenario: TC_05 It should be possible to access the desired employee's information editing page from the Staff List.
        * Slect DDM clicks on the desired employee
        * Clicks the Edit link
        * Close the page

    Scenario: TC_06 Any employee can be deleted from the Staff List.
        * Slect DDM clicks on the desired employee
        * Clicks the Delete link
        * Close the page

    Scenario: TC_07 It should be possible to search within the Staff List with the Quick Search TextBox.
        * Clicks the 'Quick Search TextBox'
        * Type the name of the desired employee and press enter.
        * Close the page

    Scenario: TC_08 Filtering within the Staff List should be possible via Staff List headings.
        * Staff filters the List titles by clicking on the desired title.
        * Close the page


    Scenario: TC_09 A new employee record must be created by filling in the information on the Add New Staff page.
        * Clicks the Add New Staff button
        * Fills in the necessary information
        * Clicks the Save button
        * Close the page

    Scenario: TC_10 Negative Senario
        * Fills in the required information incompletely
        * Clicks the Save button
        * Gets an error message
        * Close the page











