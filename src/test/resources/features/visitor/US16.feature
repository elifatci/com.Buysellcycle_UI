@US16

  Feature: As a user, I would like to have a footer section to view useful links and site access.

    Background:
      * Go to "url"
      * Goes to Footer section
      Scenario: TC_01 The footer section should be displayed on the home page.

        * Verify that the footer section is displayed at the bottom of the site

      Scenario: TC_02  Useful links (About Us, Blog, Dashboard, My Profile, My Order,
                       Help&Contact, Track Order, Return&Exchange) appear in the footer section and must be active


        * "About Us" text is displayed and it is confirmed that it is active
        * "The blog" text is displayed and it is confirmed that it is active
        * "Dashboard" text is displayed and it is confirmed that it is active
        * "My Profile" text is displayed and it is confirmed that it is active
        * "My Order" text is displayed and it is confirmed that it is active
        * "Help&Contact" text is displayed and it is confirmed that it is active
        * "Track Order" text is displayed and it is confirmed that it is active
        * "Return&Exchange" text is displayed and it is confirmed that it is active

      Scenario: TC_03  Useful Links verification test

        * Click on "About Us" and the "About" page opens
        * Click on "The blog" and the "blog" page opens
        * Click on "Dashboard" and the "Dashboard" page opens
        * Click on "My Profile" and the "My Profile" page opens
        * Click on "My Order" and the "My Order" page opens
        * Click on "Help&Contact" and the "Help&Contact" page opens
        * Click on "Track Order" and the "Track Order" page opens
        * Click on "Return&Exchange" and the "Return&Exchange" page opens

      Scenario: TC_04  You can subscribe to newsletters from the subscriber section in the footer.

        * Verify that the "Enter email address" text box is visible and active under the "GET A QUICK QUOTE" text
        * Verify that the "SUBSCRIBE" button is visible and active under the "Enter email address" text box.
        * When the correct email is entered into the textbox and the SUBSCRIBE button is pressed, "You Are Already Subscribed." It is confirmed that the message appeared.

      Scenario: TC_05  NEGATIVE TEST: It should be possible to subscribe to newsletters from the subscriber section in the footer.

        * It is verified that when the wrong email as "@name" is entered into the textbox, "!Please enter a part followed by @" appears when the SUBSCRIBE button is pressed.
        * It is verified that when the wrong email as "name@" is entered into the textbox, "!Please enter a part following @ " appears when the SUBSCRIBE button is pressed.
        * It is verified that when the wrong email as "name" is entered into the textbox, "!Please include an '@' in the email address" appears when the SUBSCRIBE button is pressed.
        * Leave the textbox blank and press the button to read "Please Fill With Valid Email." It must be verified that the message appears.

      Scenario: TC_06  To obtain the Site application in the footer section of the home page, the relevant app market links must be visible and active.

        * "Google Play" text is displayed and it is confirmed that it is active
        * "Apple Store" text is displayed and it is confirmed that it is active

      Scenario: TC_07  Verification test of the relevant app market links to obtain the Site application in the footer section of the home page.

        * Click on "Google Play" and the "Google Play" page opens
        * Click on "Apple Store" and the "Apple Store" page opens

      Scenario: TC_08 Social media icons (YouTube, LinkedIn, Instagram, Facebook) appear and verify that they are active

        * Verify that the "YouTube" icon is visible and active
        * Verify that the "LinkedIn" icon is visible and active
        * Verify that the "Instagram" icon is visible and active
        * Verify that the "Facebook" icon is visible and active

      Scenario: TC_09  Social media icons verification test

        * Click on the "YouTube" icon and verify that the "Youtube" page is opened.
        * Click on the "LinkedIn" icon and verify that the "LinkedIn" page is opened.
        * Click on the "Instagram" icon and verify that the "Instagram" page is opened.
        * Click on the "Facebook" icon and verify that the "Facebook" page is opened.

      Scenario: TC_10  In the footer section "Copyright © 2024. All rights reserved." The text must be visible.

        * At the bottom left, "Copyright © 2024. All rights reserved." The text must be visible.

      Scenario: TC_11  Quick access to the top of the home page should be possible from the footer section

        * The up icon appears at the bottom right and should be active.
        * It should be verified that when the up icon is clicked, it goes to the top of the site.
