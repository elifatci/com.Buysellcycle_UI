@US09
Feature: US09 As a user, I would like the site to have a blog page where I can get different information and opinions about products or shopping.

  Background:
    * Go to "url"

  Scenario:TC_01 Blog menuLink appears on the home page navBar and tests to be active

   * Verify that the "Blog" menu title is visible in the home page navBar
   * Verify that the Blog link is active on the home page
   * Click on the "blog menu"
   * Verify that it redirects to the blog page
   * Closes page


   Scenario: TC_02 Testing whether the functions on the blog page are visible and active
   * Click on the blog menu
   * Verify that the read more link in blog posts is visible
   * Click on the Read more link
   * Verify that you are redirected to the relevant page
   * Search for a keyword in the "Search Post" box
   * Verify that the search results match the relevant keyword
   * Verify that titles are visible in the Category section
   * Select a category from the "Category" section
   * Verify that relevant blogs are listed
   * Verify that the popular post section is visible and blogs are displayed
   * Verify that the Keyword section is visible
   * Select a keyword from the "Keyword" section and verify that relevant blogs are listed


