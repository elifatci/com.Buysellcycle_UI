Feature: US10 As a user, I would like to have a contact page on the site so that I can communicate with the administrators of the site where I shop.
  Background:
    * Go to "url"
    * User clicks on -Contact button- and displays the Contact page.

  Scenario: TC01 User accesses the Contact page and views the company's information.
    * User verifies that -Call or WhatsApp title- and the information about it is visible.
    * User verifies that -Get in touch title- and the information about it is visible.
    * User verifies that -Social Media title- is visible.
    * User verifies that -Head office title- and the information about it is visible.

  Scenario: TC02 User accesses the relevant site via the Facebook icon.
    * User clicks on -Facebook icon-.
    * User verifies that he-she accesses the "facebookUrl".

  Scenario: TC03 User accesses the relevant site via the Twitter icon.
    * User clicks on -Twitter icon-.
    * User verifies that he-she accesses the "twitterUrl".

  Scenario: TC04 User accesses the relevant site via the LinkedIn icon.
    * User clicks on -LinkedIn icon-.
    * User verifies that he-she accesses the "linkedInUrl".

  Scenario: TC05 User accesses the relevant site via the Instagram icon.
    * User clicks on -Instagram icon-.
    * User verifies that he-she accesses the "instagramUrl".

  Scenario: TC06 User sends a message to the authorized personnel.
    * User confirms that Get in touch form is visible.
    * User fills out the name section "ihsanName".
    * User fills out the email section "customerEmailIhsan".
    * User chooses an option 2.
    * User fills out the message section "ihsanContactMessage".
    * User clicks on -Send Message button-
