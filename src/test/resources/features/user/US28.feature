Feature: US_28 As a registered user, I would like to organize notifications from the site and have a page where I can see incoming notifications.

  Background:
    * Go to "loginUrl"
    * Login by entering valid "customerEmailGamze" and "password" on the SignIn page.
    * Click on the Notification on the sidebar

  Scenario: TC_01 Dashboard sidebar da Notification menu process
    * Verify that Notification title is visible
    * Verify that displays Title and Date information of incoming notifications
    * Clicks view on the notification and  verify that  the relevant page opens

  Scenario:  TC_02 Dashboard sidebar da Notification menu process
    * Click Setting button on the Notifications and displays the Setting list displays by title <<Notifications Setting>>
    * Updates the Types of Events in the Setting list and verify that the successful message appears