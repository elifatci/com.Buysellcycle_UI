@US25
Feature: As a registered user, I would like to have a page where
  I can create a referral code and perform related actions.

  Background:
    * Go to "loginUrl"
    * Login by entering valid "customerEmailSenayda" and "password" on the SignIn page.


  Scenario: TC01 Registered user makes transactions with referral code on dashboard page

    * User clicks to the Dashboard Page and and displays Dashboard Page
    * User verifies that the Referral menu title is visible and active in Dashboard sideBar
    * User confirms that the My referral code and User List windows are visible on the Referral page
    * User verifies the duplicability of the user-specific referral code in the My referral code textBox
    * The user closes the page



  Scenario: TC02 User makes edits on the referral page

    * User lists (SL,User,Date,Status,Discount Amount,Action information) in User List for users coming with referral code on Referral page
    * User displays Empty List text if User List is empty.
    * The user closes the page