package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
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
//**************************************US_06/TC_01*********************************************************

    @Given("{string} in the nav bar on the home page that the drop-down menu is visible verify.")
    public void in_the_nav_bar_on_the_home_page_that_the_drop_down_menu_is_visible_verify(String string) {

    }
    @Given("Go to the {string} dropdown menu click.")
    public void go_to_the_dropdown_menu_click(String string) {

    }
    @Given("All items in the drop-down menu category titles of verify that it is visible.")
    public void all_items_in_the_drop_down_menu_category_titles_of_verify_that_it_is_visible() {

    }
    @Given("Click on the Electronics main category and select the subcategories it's confirmed to appear.")
    public void click_on_the_electronics_main_category_and_select_the_subcategories_it_s_confirmed_to_appear() {

    }
    @Given("Subcategories within the Electronics category randomly click on {int} headings and move to the right place that it is directed.")
    public void subcategories_within_the_electronics_category_randomly_click_on_headings_and_move_to_the_right_place_that_it_is_directed(Integer int1) {

    }
    @Given("Click on the Fashion main category and select the subcategories it's confirmed to appear.")
    public void click_on_the_fashion_main_category_and_select_the_subcategories_it_s_confirmed_to_appear() {

    }
    @Given("Subcategories within the Fashion category randomly click on {int} headings and move to the right place that it is directed.")
    public void subcategories_within_the_fashion_category_randomly_click_on_headings_and_move_to_the_right_place_that_it_is_directed(Integer int1) {

    }
    @Given("Click on the Baby main category and select the subcategories it's confirmed to appear.")
    public void click_on_the_baby_main_category_and_select_the_subcategories_it_s_confirmed_to_appear() {

    }
    @Given("Subcategories within the Baby category randomly click on {int} headings and move to the right place that it is directed.")
    public void subcategories_within_the_baby_category_randomly_click_on_headings_and_move_to_the_right_place_that_it_is_directed(Integer int1) {

    }


    //**************************************US_15/TC_01*********************************************************
    @Given("Home page body section {string} category window is visible.")
    public void home_page_body_section_category_window_is_visible(String string) {

    }
    @Given("Click on the {string} window and verify that subcategories appear.")
    public void click_on_the_window_and_verify_that_subcategories_appear(String string) {

    }
    @Given("Click on the {string} heading in the subcategory and verify that the relevant products appear.")
    public void click_on_the_heading_in_the_subcategory_and_verify_that_the_relevant_products_appear(String string) {

    }
    @Given("Click on the subcategory {string} and verify that the relevant products appear.")
    public void click_on_the_subcategory_and_verify_that_the_relevant_products_appear(String string) {

    }
    @Given("Adding to the basket can be done on the products on the relevant category page Verify.")
    public void adding_to_the_basket_can_be_done_on_the_products_on_the_relevant_category_page_verify() {

    }
    @Given("Selecting products for comparison on the products in the relevant category page verify that it can be done.")
    public void selecting_products_for_comparison_on_the_products_in_the_relevant_category_page_verify_that_it_can_be_done() {

    }
    @Given("Verify that {string} appears because you cannot add to the likes list on the products on the relevant category page.")
    public void verify_that_appears_because_you_cannot_add_to_the_likes_list_on_the_products_on_the_relevant_category_page(String string) {

    }
    @Given("In the {string} window, click on {string} to verify that additional products appear.")
    public void in_the_window_click_on_to_verify_that_additional_products_appear(String string, String string2) {

    }

    //**************************************US_24/TC_01*********************************************************

    @Given("In SideBar, the menu item {string} appears.")
    public void in_side_bar_the_menu_item_appears(String string) {

    }
    @Given("Go to the {string} page.")
    public void go_to_the_page(String string) {

    }
    @Given("Upload a new profile picture by clicking on the {string} button and verify that it has been uploaded.")
    public void upload_a_new_profile_picture_by_clicking_on_the_button_and_verify_that_it_has_been_uploaded(String string) {

    }
    //**************************************US_24/TC_02*********************************************************

    @Given("Go to the {string} tab.")
    public void go_to_the_tab(String string) {

    }
    @Given("Verify that the TextBoxes on the {string} tab are visible.")
    public void verify_that_the_text_boxes_on_the_tab_are_visible(String string) {

    }
    @Given("Verify that {string},{string} are displayed correctly.")
    public void verify_that_are_displayed_correctly(String string, String string2) {

    }
    @Given("Verify that the {string} textbox is empty")
    public void verify_that_the_textbox_is_empty(String string) {

    }
    @Given("Profile by entering new information in TextBoxes update and save their information.")
    public void profile_by_entering_new_information_in_text_boxes_update_and_save_their_information() {

    }

}
