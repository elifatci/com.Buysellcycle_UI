
@US13
Feature: As a user, I would like to have functional sliders on the home page
  where I can get information about the products.
  Background:
    * Go to "url"

            @US13TC01
            Scenario: TC01 Display of images in the Slider
            * images in the slider are visible on the homepage
             @US13TC02
             Scenario: TC02 Verification of the ability to switch between slider images.
              * scrolling between slider images
             * Verifies that the displayed image changes in scrolls

             @US13TC03
            Scenario: TC03 Display images in a slider in a loop in automatic order
            *  Slider images are expected to automatically switch after a certain period of time
            * Verifies that images are automatically displayed in a loop
            @US13TC04
            Scenario: TC04  Clicking on images in the slider takes you to the right Page
            *  Click on a slider image
            * Verifies that the relevant page has been opened

