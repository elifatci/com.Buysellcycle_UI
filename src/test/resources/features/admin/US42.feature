@US42
Feature: As an administrator I would like to have a page where I can open a support ticket.

  Background:
    * Go to "adminUrl"
    * Login by entering valid "adminEmailSenayda" and "password" on the SignIn page.

  Scenario: TC01 Administrator creates support ticket
    * User can open Support Ticket menu from Dashboard Side Bar
    * The user clicks on the My Ticket page under Support Ticket from the Dashboard Side Bar
    * On the My Ticket page, user sees the Category tab, Select One, Installation, Technical, Others and clicks Technical button
    * User sees the Select One, High, Medium, Low options from the Priority tab on the My Ticket page and clicks the High button
    * User sees Select One, Pending, On Going, Completed, Closed options from the Status tab on the My Ticket page and clicks the Pending button
    * User clicks the Search button to create the Ticket List according to the filtering made from Category, Priority and Status tabs
    * User verifies that Tickets in Ticket List are listed under Subject, Category, User Name, priority, User Agent, Status, Action
    * Close the page