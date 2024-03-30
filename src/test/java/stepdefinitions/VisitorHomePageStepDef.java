package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Base;
import pages.VisitorHomePage;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

import java.util.Properties;

import static org.junit.Assert.assertTrue;


public class VisitorHomePageStepDef extends Base {


    // US05 ---- TC01
    @Given("The user clicks on the LOGIN button at the top right corner of the page")
    public void the_user_clicks_on_the_login_button_at_the_top_right_corner_of_the_page() {
        visitorHomePage.linkLogin.click();
    }
    @Given("It is checked whether the login page is opened")
    public void it_is_checked_whether_the_login_page_is_opened() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.buysellcycle.com/login";
        Assert.assertEquals(expectedUrl,actualUrl);
    }
    @Given("{int} seconds pause")
    public void seconds_pause(Integer seconds) throws InterruptedException {
    Thread.sleep(seconds*1000);
    }
    @Given("The user closes the page")
    public void the_user_closes_the_page() {
        Driver.quitDriver();
    }


    // US05 ---- TC02
    @Given("It is checked if there is a picture displayed on the right side of the page")
    public void it_is_checked_if_there_is_a_picture_displayed_on_the_right_side_of_the_page() {
    assertTrue(visitorHomePage.iconLoginPage.isDisplayed());
    }
    @Given("It is checked if there is a TURN YOUR IDEAS INTO REALITY quote on the right side of the page")
    public void it_is_checked_if_there_is_a_turn_your_ideas_into_reality_quote_on_the_right_side_of_the_page() {
    assertTrue(visitorHomePage.labelLoginText.isDisplayed());
    }
    @Given("It is checked if there is a sign-in form on the left side of the page")
    public void it_is_checked_if_there_is_a_sign_in_form_on_the_left_side_of_the_page() {
        assertTrue(visitorHomePage.formSignIn.isDisplayed());
    }
    @Given("It is checked if there is a SIGN IN button below the sign-in form")
    public void it_is_checked_if_there_is_a_sign_in_button_below_the_sign_in_form() {
        assertTrue(visitorHomePage.buttonSignIn.isDisplayed());
    }
    @Given("It is checked if there is a link below the sign-in form for those who forget their password")
    public void it_is_checked_if_there_is_a_link_below_the_sign_in_form_for_those_who_forget_their_password() {
        assertTrue(visitorHomePage.linkForgotPassword.isDisplayed());
    }
    @Given("It is checked if there is a link below the sign-in form for those who want to sign up")
    public void it_is_checked_if_there_is_a_link_below_the_sign_in_form_for_those_who_want_to_sign_up() {
        assertTrue(visitorHomePage.linkDontHaveAnAccount.isDisplayed());
    }

    // US05 ---- TC03
    @Given("The user types in the valid mail address to the mail textbox inside the sign-in form")
    public void the_user_types_in_the_valid_mail_address_to_the_mail_textbox_inside_the_sign_in_form() {
        visitorHomePage.textBoxMail.click();
        visitorHomePage.textBoxMail.sendKeys(ConfigReader.getProperty("customerEmailAhmed"));
    }
    @Given("The user types in the valid password to the password textbox inside the sign-in form")
    public void the_user_types_in_the_valid_password_to_the_password_textbox_inside_the_sign_in_form() {
        visitorHomePage.textBoxPassword.click();
        visitorHomePage.textBoxPassword.sendKeys(ConfigReader.getProperty("password"));
    }
    @Given("The user clicks on the SIGN IN button")
    public void the_user_clicks_on_the_sign_in_button() {
        visitorHomePage.buttonSignIn.click();
    }
    @Given("It is checked if the shown page is User dashboard")
    public void it_is_checked_if_the_shown_page_is_user_dashboard() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.buysellcycle.com/profile/dashboard";
        Assert.assertEquals(expectedUrl,actualUrl);
    }


    // US05 ---- TC04
    @Given("The user types in the invalid mail address to the mail textbox inside the sign-in form")
    public void the_user_types_in_the_invalid_mail_address_to_the_mail_textbox_inside_the_sign_in_form() {
        String invalidMail = "ahmed@muftu.com";
        visitorHomePage.textBoxMail.click();
        visitorHomePage.textBoxMail.sendKeys(invalidMail);
    }
    @Given("The user types in the invalid password to the password textbox inside the sign-in form")
    public void the_user_types_in_the_invalid_password_to_the_password_textbox_inside_the_sign_in_form() {
        String invalidPassword = "asd! ?fgh";
        visitorHomePage.textBoxPassword.click();
        visitorHomePage.textBoxPassword.sendKeys(invalidPassword);
    }
    @Given("It is checked if the error message is displayed")
    public void it_is_checked_if_the_error_message_is_displayed() {
        assertTrue(visitorHomePage.textErrorLogin.isDisplayed());
    }

//===================US_07==========================
    @Given("Verifies that the New Product Deals menu title is visible and active")
    public void verifies_that_the_menu_title_is_visible_and_active() {
        assertTrue(visitorHomePage.linkNewProductDeals.isDisplayed());
        assertTrue(visitorHomePage.linkNewProductDeals.isEnabled());
        ReusableMethods.wait(5);
    }
    @Given("Click on the New Product Deals menu title")
    public void click_on_the_menu_title() {
         ReusableMethods.clickWithJS(visitorHomePage.linkNewProductDeals);
    }
    @Given("Verifies that you are directed to the page where current product offers are listed")
    public void verifies_that_you_are_directed_to_the_page_where_current_product_offers_are_listed() {
         assertTrue(visitorHomePage.labelBestDeals.isDisplayed());
    }

    @Given("Verifies that each filter option is visible on the Best Deals page that opens.")
    public void verifies_that_each_filter_option_is_visible_on_the_best_deals_page_that_opens() {
        assertTrue(visitorHomePage.checkBoxFilterProducts.isDisplayed());

    }
    @Given("Selects and applies a filter option.")
    public void selects_and_applies_a_filter_option() {
         ReusableMethods.clickWithJS(visitorHomePage.checkBoxWomensApparel);
         ReusableMethods.wait(3);
    }
    @Given("After the filter is applied, it verifies that the product list is updated according to this filtering.")
    public void after_the_filter_is_applied_it_verifies_that_the_product_list_is_updated_according_to_this_filtering() {

    }
    @Given("Try different filter combinations and check that the results are updated correctly each time.")
    public void try_different_filter_combinations_and_check_that_the_results_are_updated_correctly_each_time() {

    }
    @Given("Verifies that all products are listed again when the filters are reset.")
    public void verifies_that_all_products_are_listed_again_when_the_filters_are_reset() {

    }

    @Given("On the Best Deals page that opens, it verifies that the listing order of the products is sorted according to the newest date.")
    public void on_the_best_deals_page_that_opens_it_verifies_that_the_listing_order_of_the_products_is_sorted_according_to_the_newest_date() {
       ReusableMethods.clickWithJS(visitorHomePage.dropDownSortingNew);

    }
    @Given("Checks the up-to-date status of product information by going to the detail page of each product.")
    public void checks_the_up_to_date_status_of_product_information_by_going_to_the_detail_page_of_each_product() {

    }
    @Given("By checking the products in different categories, it verifies that the most up-to-date products are listed in each category.")
    public void by_checking_the_products_in_different_categories_it_verifies_that_the_most_up_to_date_products_are_listed_in_each_category() {

    }
    @Given("Refresh the page and verify that the product list has been updated")
    public void refresh_the_page_and_verify_that_the_product_list_has_been_updated() {

    }


    @Given("'Show {int} item's' DDM verifies that it is visible")
    public void show_item_s_ddm_verifies_that_it_is_visible(Integer int1) {

    }
    @Given("{string} confirms that DDM is visible")
    public void confirms_that_ddm_is_visible(String string) {

    }
    @Given("Clicks on the 'Show {int} item's' DDM menu and selects one of the options in the list")
    public void clicks_on_the_show_item_s_ddm_menu_and_selects_one_of_the_options_in_the_list(Integer int1) {

    }
    @Given("Verifies that the page has changed according to the selected view")
    public void verifies_that_the_page_has_changed_according_to_the_selected_view() {

    }
    @Given("Clicks on the {string} DDM menu and verifies that the new, old, name, price options are seen in the list.")
    public void clicks_on_the_ddm_menu_and_verifies_that_the_new_old_name_price_options_are_seen_in_the_list(String string) {

    }
    @Given("Verifies that the page changes correctly when one of the options is clicked")
    public void verifies_that_the_page_changes_correctly_when_one_of_the_options_is_clicked() {

    }

    @Given("Verifies that the Refresh button is visible and active")
    public void verifies_that_the_refresh_button_is_visible_and_active() {
         assertTrue(visitorHomePage.buttonRefresh.isDisplayed());
         assertTrue(visitorHomePage.buttonRefresh.isEnabled());
    }
    @Given("Clicks the Refresh button")
    public void clicks_the_refresh_button() {
          visitorHomePage.buttonRefresh.click();
    }
    @Given("Verifies that the page has been refreshed and the content has been updated")
    public void verifies_that_the_page_has_been_refreshed_and_the_content_has_been_updated() {
          visitorHomePage.control();

    }
//======================================================================================================
    @Then("Verify that the title is {string}")
    public void verify_that_the_title_is(String title) {
        String actualResult = Driver.getDriver().getTitle();
        Assert.assertEquals(title, actualResult);
    }
    //US09 TC01
    @Given("Verify that the Blog menu title is visible in the home page navBar")
    public void verify_that_the_blog_menu_title_is_visible_in_the_home_page_nav_bar() {
        visitorHomePage.verifyVisible(visitorHomePage.linkHeaderBlog);
    }
    @Given("Verify that the Blog link is active on the home page")
    public void verify_that_the_blog_link_is_active_on_the_home_page() {
            visitorHomePage.verifyActive(visitorHomePage.linkHeaderBlog);
    }
    @Given("Click on the blog menu")
    public void click_on_the_blog_menu() {
            visitorHomePage.buttonPopUpClose.click();
            visitorHomePage.linkHeaderBlog.click();
    }
    @Given("Verify that it redirects to the blog page")
    public void verify_that_it_redirects_to_the_blog_page() {
        String actualResult = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualResult.contains("blog"));
    }
    @Given("Close the page")
    public void close_the_page() {
        Driver.quitDriver();
    }

    //US09 TC02
    @Given("Verify that the read more link in blog posts is visible")
    public void verify_that_the_read_more_link_in_blog_posts_is_visible() {
        visitorHomePage.verifyVisible(visitorHomePage.linkReadMore.get(1));
    }
    @Given("Click on the Read more link")
    public void click_on_the_read_more_link() {
        //ReusableMethods.scrollIntoViewJS(visitorHomePage.labelKeywords);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        visitorHomePage.linkReadMoreFour.click();
    }
    @Given("Verify that you are redirected to the relevant page")
    public void verify_that_you_are_redirected_to_the_relevant_page() {
            Assert.assertTrue(visitorHomePage.labelCommerceContent.isDisplayed());
    }
    @Given("Search for a keyword in the {string} box")
    public void search_for_a_keyword_in_the_box(String string) {

    }
    @Given("Verify that the search results match the relevant keyword")
    public void verify_that_the_search_results_match_the_relevant_keyword() {

    }
    @Given("Verify that titles are visible in the Category section")
    public void verify_that_titles_are_visible_in_the_category_section() {

    }
    @Given("Select a category from the {string} section")
    public void select_a_category_from_the_section(String string) {

    }
    @Given("Verify that relevant blogs are listed")
    public void verify_that_relevant_blogs_are_listed() {

    }
    @Given("Verify that the popular post section is visible and blogs are displayed")
    public void verify_that_the_popular_post_section_is_visible_and_blogs_are_displayed() {

    }
    @Given("Verify that the Keyword section is visible")
    public void verify_that_the_keyword_section_is_visible() {

    }
    @Given("Select a keyword from the {string} section and verify that relevant blogs are listed")
    public void select_a_keyword_from_the_section_and_verify_that_relevant_blogs_are_listed(String string) {

    }

}
