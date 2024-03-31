Feature: US04 As a user, I would like to be able to register on the site to take advantage of its functions.
  Background:
    * Go to "url"
    * User clicks on -Register button- and displays "registerUrl" the Sign Up page.

    Scenario: TC01 User registers to the sign up page by entering all the correct information in all fields.
      * User enters a valid "ihsanName" on -First Name box-.
      * User enters a valid "ihsanLastName" on -Last Name box-.
      * User enters a valid "ihsanEmail" clicks on -Email or Phone box-.
      * User enters a valid "ihsanValidPassword" on -Password box-.
      * User enters a valid "ihsanValidPassword" on -Confirm Password- box.
      * User clicks on Sign Up button.
      * User verifies that he-she registered.
      * Close the page

    Scenario: TC02 User cannot register to the sign up page without filling in the first name field.
      * User enters a valid "ihsanLastName" on -Last Name box-.
      * User enters a valid "ihsanEmail" clicks on -Email or Phone box-.
      * User enters a valid "ihsanValidPassword" on -Password box-.
      * User enters a valid "ihsanValidPassword" on -Confirm Password- box.
      * User clicks on Sign Up button.
      * User verifies that he-she could not register without name.
      * Close the page

    Scenario: TC03 User cannot register to the sign up page without filling in the mobile field.
      * User enters a valid "ihsanName" on -First Name box-.
      * User enters a valid "ihsanLastName" on -Last Name box-.
      * User enters a valid "ihsanValidPassword" on -Password box-.
      * User enters a valid "ihsanValidPassword" on -Confirm Password- box.
      * User clicks on Sign Up button.
      * User verifies that he-she could not register without mobile.
      * Close the page

    Scenario: TC04 User cannot register to the sign up page without filling in the email field.
      * User enters a valid "ihsanName" on -First Name box-.
      * User enters a valid "ihsanLastName" on -Last Name box-.
      * User enters a valid "ihsanValidPassword" on -Password box-.
      * User enters a valid "ihsanValidPassword" on -Confirm Password- box.
      * User clicks on Sign Up button.
      * User verifies that he-she could not register without email.
      * Close the page

    Scenario Outline: TC05 User cannot register with invalid password.
      * User enters a valid "ihsanName" on -First Name box-.
      * User enters a valid "ihsanLastName" on -Last Name box-.
      * User enters a valid "ihsanNewEmail" clicks on -Email or Phone box-.
      * User enters a valid "<password>" on -Password box-.
      * User enters a valid "<confirm password>" on -Confirm Password- box.
      * User clicks on Sign Up button.
      * User verifies that he-she could not register without valid password.
      * Close the page
      Examples:
        |       password        |   confirm password    |
        | ihsanInvalidPassword  | ihsanInvalidPassword  |
        | ihsanInvalidPassword2 | ihsanInvalidPassword2 |
        | ihsanInvalidPassword3 | ihsanInvalidPassword3 |
        | ihsanInvalidPassword4 | ihsanInvalidPassword4 |
        | ihsanInvalidPassword5 | ihsanInvalidPassword5 |

    Scenario: TC06 User cannot register without without entering the same password.
      * User enters a valid "ihsanName" on -First Name box-.
      * User enters a valid "ihsanLastName" on -Last Name box-.
      * User enters a valid "ihsanEmail" clicks on -Email or Phone box-.
      * User enters a valid "ihsanValidPassword" on -Password box-.
      * User enters a valid "ihsanValidPassword2" on -Confirm Password- box.
      * User clicks on Sign Up button.
      * User verifies that he-she could not register without entering the same password.
      * Close the page
