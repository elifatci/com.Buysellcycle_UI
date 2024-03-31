package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;
import pages.Base;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;
import static org.junit.Assert.assertEquals;
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
    //US01
    @Then("Verify that the title is {string}")
    public void verify_that_the_title_is(String title) {
        String actualResult = Driver.getDriver().getTitle();
        assertEquals(title, actualResult);
     
    }
//=======================================================================================================

    //US04 ---> TC01 + TC02 + TC03 + TC04 + TC05 + TC06
    @Given("User clicks on -Register button- and displays the Sign Up page.")
    public void user_clicks_on_register_button_and_displays_the_sign_up_page() {
        assertTrue(visitorHomePage.linkRegister.isDisplayed());
        assertTrue(visitorHomePage.linkRegister.isEnabled());
        visitorHomePage.linkRegister.click();
        assertTrue(visitorHomePage.logoBuySell.isDisplayed());
        assertTrue(visitorHomePage.labelPictureText.isDisplayed());
        assertEquals(ConfigReader.getProperty("registerUrl") , Driver.getDriver().getCurrentUrl());
        assertTrue(visitorHomePage.tableRegisterForm.isDisplayed());
    }
    @Given("User enters a valid {string} on -First Name box-.")
    public void user_enters_a_valid_on_first_name_box(String name) {
        assertTrue(visitorHomePage.textBoxFirstName.isEnabled());
        visitorHomePage.textBoxFirstName.sendKeys(ConfigReader.getProperty(name));
    }
    @Given("User enters a valid {string} on -Last Name box-.")
    public void user_enters_a_valid_on_last_name_box(String lastName) {
        assertTrue(visitorHomePage.textBoxLastName.isEnabled());
        visitorHomePage.textBoxLastName.sendKeys(ConfigReader.getProperty(lastName));
    }
    @Given("User enters a valid {string} clicks on -Email or Phone box-.")
    public void user_enters_a_valid_clicks_on_email_or_phone_box(String email) {
        assertTrue(visitorHomePage.textBoxEmail.isEnabled());
        visitorHomePage.textBoxEmail.sendKeys(ConfigReader.getProperty(email));
    }
    @Given("User enters a valid {string} on -Password box-.")
    public void user_enters_a_valid_on_password_box(String password) {
        assertTrue(visitorHomePage.textBoxPassword.isEnabled());
        visitorHomePage.textBoxPassword.sendKeys(ConfigReader.getProperty(password));
    }
    @Given("User enters a valid {string} on -Confirm Password- box.")
    public void user_enters_a_valid_on_confirm_password_box(String password) {
        assertTrue(visitorHomePage.textBoxPasswordConfirm.isEnabled());
        visitorHomePage.textBoxPasswordConfirm.sendKeys(ConfigReader.getProperty(password));
    }
    @Given("User clicks on Sign Up button.")
    public void user_clicks_on_sign_up_button() {
        ReusableMethods.scrollIntoViewJS(visitorHomePage.linkSignIn);
        ReusableMethods.wait(1);
        assertTrue(visitorHomePage.signUpButton.isDisplayed());
        assertTrue(visitorHomePage.signUpButton.isEnabled());
        visitorHomePage.signUpButton.click();
    }
    @Given("User verifies that he-she registered.")
    public void user_verifies_that_he_she_registered() {
        assertTrue(visitorHomePage.labelRegistrationAlert.isDisplayed());
    }
    @Given("User verifies that he-she could not register without name.")
    public void user_verifies_that_he_she_could_not_register_without_name() {
        assertTrue(visitorHomePage.labelNameError.isDisplayed());
    }
    @Given("User verifies that he-she could not register without mobile.")
    public void user_verifies_that_he_she_could_not_register_without_mobile() {
        assertTrue(visitorHomePage.labelEmailError.isDisplayed());
    }
    @Given("User verifies that he-she could not register without email.")
    public void user_verifies_that_he_she_could_not_register_without_email() {
        assertTrue(visitorHomePage.labelEmailError.isDisplayed());
    }
    @Given("User verifies that he-she could not register without valid password.")
    public void user_verifies_that_he_she_could_not_register_without_valid_password() {
        assertTrue(visitorHomePage.labelPasswordError.isDisplayed());
    }
    @Given("User verifies that he-she could not register without entering the same password.")
    public void user_verifies_that_he_she_could_not_register_without_entering_the_same_password() {
        assertTrue(visitorHomePage.labelPasswordError.isDisplayed());
    }
    //US10 ---> TC01
    @Given("User clicks on -Contact button- and displays the Contact page.")
    public void user_clicks_on_contact_button_and_displays_the_contact_page() {
        assertTrue(visitorHomePage.linkHeaderContact.isDisplayed());
        assertTrue(visitorHomePage.linkHeaderContact.isEnabled());
        visitorHomePage.linkHeaderContact.click();
        assertEquals(ConfigReader.getProperty("contactUrl") , Driver.getDriver().getCurrentUrl());
    }
    @Given("User verifies that -Call or WhatsApp title- and the information about it is visible.")
    public void user_verifies_that_call_or_whats_app_title_and_the_information_about_it_is_visible() {
        assertTrue(visitorHomePage.labelContactCallOrWhatsapp.isDisplayed());
        assertTrue(visitorHomePage.labelContactWhatsappNumber.isDisplayed());
    }
    @Given("User verifies that -Get in touch title- and the information about it is visible.")
    public void user_verifies_that_get_in_touch_title_and_the_information_about_it_is_visible() {
        assertTrue(visitorHomePage.labelContactGetInTouch.isDisplayed());
        assertTrue(visitorHomePage.labelContactEmail.isDisplayed());
    }
    @Given("User verifies that -Social Media title- is visible.")
    public void user_verifies_that_social_media_title_is_visible() {
        assertTrue(visitorHomePage.labelContactSocialMedia.isDisplayed());
    }
    @Given("User verifies that -Head office title- and the information about it is visible.")
    public void user_verifies_that_head_office_title_and_the_information_about_it_is_visible() {
        assertTrue(visitorHomePage.labelContactHeadOffice.isDisplayed());
        assertTrue(visitorHomePage.labelContactAddress.isDisplayed());
    }
    //US10 ---> TC02-03-04-05
    @Given("User clicks on -Facebook icon-.")
    public void user_clicks_on_facebook_icon() {
        assertTrue(visitorHomePage.iconContactFacebook.isDisplayed());
        assertTrue(visitorHomePage.iconContactFacebook.isEnabled());
        visitorHomePage.iconContactFacebook.click();
    }
    @Given("User verifies that he-she accesses the {string}.")
    public void user_verifies_that_he_she_accesses_the(String string) {
        assertEquals(ConfigReader.getProperty(string) , Driver.getDriver().getCurrentUrl());
    }
    @Given("User clicks on -Twitter icon-.")
    public void user_clicks_on_twitter_icon() {
        assertTrue(visitorHomePage.iconContactTwitter.isDisplayed());
        assertTrue(visitorHomePage.iconContactTwitter.isEnabled());
        visitorHomePage.iconContactTwitter.click();
    }
    @Given("User clicks on -LinkedIn icon-.")
    public void user_clicks_on_linked_in_icon() {
        assertTrue(visitorHomePage.iconContactLinkedin.isDisplayed());
        assertTrue(visitorHomePage.iconContactLinkedin.isEnabled());
        visitorHomePage.iconContactLinkedin.click();
    }
    @Given("User clicks on -Instagram icon-.")
    public void user_clicks_on_instagram_icon() {
        assertTrue(visitorHomePage.iconContactInstagram.isDisplayed());
        assertTrue(visitorHomePage.iconContactInstagram.isEnabled());
        visitorHomePage.iconContactInstagram.click();
    }
    //US10 ---> TC06
    @Given("User confirms that Get in touch form is visible.")
    public void user_confirms_that_get_in_touch_form_is_visible() {
        assertTrue(visitorHomePage.labelFormGetInTouch.isDisplayed());
    }
    @Given("User fills out the name section {string}.")
    public void user_fills_out_the_name_section(String string) {
        assertTrue(visitorHomePage.textBoxName.isEnabled());
        visitorHomePage.textBoxName.sendKeys(ConfigReader.getProperty(string));
    }
    @Given("User fills out the email section {string}.")
    public void user_fills_out_the_email_section(String string) {
        assertTrue(visitorHomePage.textBoxEmail.isEnabled());
        visitorHomePage.textBoxEmail.sendKeys(ConfigReader.getProperty(string));
    }
    @Given("User chooses an option {int}.")
    public void user_chooses_an_option(int index) {
        Select selectOption = new Select(visitorHomePage.dropDownOrder);
        selectOption.selectByIndex(index);
    }
    @Given("User fills out the message section {string}.")
    public void user_fills_out_the_message_section(String string) {
        assertTrue(visitorHomePage.textBoxMessage.isEnabled());
        visitorHomePage.textBoxMessage.sendKeys(ConfigReader.getProperty(string));
    }
    @Given("User clicks on -Send Message button-")
    public void user_clicks_on_send_message_button() {
        assertTrue(visitorHomePage.sendMessageButton.isEnabled());
        visitorHomePage.sendMessageButton.click();
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
    //------------------------ Nazime-------------------------------
    //US02 TC01
    @Given("Displays und click the headings \\(Track Your Order) on the top right side")
    public void displays_und_click_the_headings_track_your_order_on_the_top_right_side() {
        ReusableMethods.wait(5);
        assertTrue(visitorHomePage.linkTrackOrder.isDisplayed());
        assertTrue(visitorHomePage.linkTrackOrder.isEnabled());
    }

    @Given("Displays und click the headings \\( Compare) on the top right side")
    public void displays_und_click_the_headings_compare_on_the_top_right_side() {
        assertTrue(visitorHomePage.linkHeaderCompare.isDisplayed());
        assertTrue(visitorHomePage.linkHeaderCompare.isEnabled());
    }

    @Given("Displays und click the headings \\( Wishlist) on the top right side. Click the BuyCell logo")
    public void displays_und_click_the_headings_wishlist_on_the_top_right_side_click_the_buy_cell_logo() {
        assertTrue(visitorHomePage.linkHeaderWishList.isDisplayed());
        assertTrue(visitorHomePage.linkHeaderWishList.isEnabled());
    }

    @Given("Displays und click the headings \\(Cart) on the top right side")
    public void displays_und_click_the_headings_cart_on_the_top_right_side() {
        assertTrue(visitorHomePage.linkHeaderCart.isDisplayed());
        assertTrue(visitorHomePage.linkHeaderCart.isEnabled());
    }

    @Given("Displays und click the headings \\(New User Zone ) on the top right side")
    public void displays_und_click_the_headings_new_user_zone_on_the_top_right_side() {
        assertTrue(visitorHomePage.linkNewUserZone.isDisplayed());
        assertTrue(visitorHomePage.linkNewUserZone.isEnabled());
    }

    @Given("Displays und click the headings \\( Daily Deals) on the top right side")
    public void displays_und_click_the_headings_daily_deals_on_the_top_right_side() {
        assertTrue(visitorHomePage.linkDailyDeals.isDisplayed());
        assertTrue(visitorHomePage.linkDailyDeals.isEnabled());

    }

    @Given("The site logo is displayed on the top left of the page")
    public void the_site_logo_is_displayed_on_the_top_left_of_the_page() {
        assertTrue(visitorHomePage.logoBuysell.isDisplayed());

    }
    @Given("Click on the site logo and refresh the page")
    public void click_on_the_site_logo_and_refresh_the_page() {
        visitorHomePage.logoBuysell.click();
        assertTrue(visitorHomePage.logoBuysell.isDisplayed());
        }

    @Given("The search box  is displayed")
    public void the_search_box_is_displayed() {
        assertTrue(visitorHomePage.searchBoxHomePage.isDisplayed());

    }

// ===================US08 > TC01==================================

    @Given("User clicks on the About Us link and displays About Us page")
    public void user_clicks_on_the_about_us_link_and_displays_about_us_page() {
        visitorHomePage.linkHeaderAboutUs.click();
        assertTrue(visitorHomePage.labelAboutUs.isDisplayed());
    }
    @Given("User confirms that the displayed  Client Worldwide, Successful Project, Work Employed,Planning Services boards matches the expected details on about page.")
    public void user_confirms_that_the_displayed_client_worldwide_successful_project_work_employed_planning_services_boards_matches_the_expected_details_on_about_page() {assertTrue(visitorHomePage.labelClientWorlwide.isDisplayed());
        ReusableMethods.scrollIntoViewJS(visitorHomePage.labelClientWorlwide);
    assertTrue(visitorHomePage.labelSuccessfulProject.isDisplayed());
    assertTrue(visitorHomePage.labelWorkEmployed.isDisplayed());
    assertTrue(visitorHomePage.labelPlanningServices.isDisplayed());

    }
    @Given("User confirms the Team Members section")
    public void user_confirms_the_team_members_section() {
        ReusableMethods.scrollIntoViewJS(visitorHomePage.labelTeamMember);
        assertTrue(visitorHomePage.labelTeamMember.isDisplayed());

    }
    @Given("User confirms that On the About Us page, the characters, statuses and pictures of Avery Collins, Emily Pattinson, Jason Statham, Jaxon Westwood should be visible on the page")
    public void user_confirms_that_on_the_about_us_page_the_characters_statuses_and_pictures_of_avery_collins_emily_pattinson_jason_statham_jaxon_westwood_should_be_visible_on_the_page() {
    ReusableMethods.scrollIntoViewJS(visitorHomePage.imageProfileAveryCollins);
        assertTrue(visitorHomePage.imageProfileAveryCollins.isDisplayed());
    assertTrue(visitorHomePage.imageProfileEmilyPattinson.isDisplayed());
    assertTrue(visitorHomePage.imageProfileJasonStatham.isDisplayed());
    assertTrue(visitorHomePage.imageProfileJaxonWestwood.isDisplayed());

    }
    //----US-11--All step the test cases----------------------------------------------
    @Given("Verify  for the presence of the {string} menu item")
    public void verify_for_the_presence_of_the_menu_item(String string) {

    }
    @Given("Click on the {string} menu item")
    public void click_on_the_menu_item(String string) {

    }
    @Given("verify that clicking on the {string} menu item should redirect the user to the New-user-zone page")
    public void verify_that_clicking_on_the_menu_item_should_redirect_the_user_to_the_new_user_zone_page(String string) {

    }

    @Given("Verify that {string} section is active")
    public void verify_that_section_is_active(String string) {

    }
    @Given("Click on the {string} section")
    public void click_on_the_section(String string) {

    }
    @Given("verify that {string} section is active and products display with special discount")
    public void verify_that_section_is_active_and_products_display_with_special_discount(String string) {

    }
    @Given("Click on the {string} section\" and verify that \"Coupon\" section is active")
    public void click_on_the_section_and_verify_that_coupon_section_is_active(String string) {

    }

    @Given("Click on the chart icon of the first product")
    public void click_on_the_chart_icon_of_the_first_product() {

    }
    @Given("verify that the message {string} on the modal")
    public void verify_that_the_message_on_the_modal(String string) {

    }
    @Given("Close the modal window that opened")
    public void close_the_modal_window_that_opened() {

    }
    @Given("Click on the compare icon of the first product")
    public void click_on_the_compare_icon_of_the_first_product() {

    }
    @Given("verify that the message {string} is display")
    public void verify_that_the_message_is_display(String string) {

    }

    @Given("Click  on the Quick view icon of the first product and verify that the modal window appear")
    public void click_on_the_quick_view_icon_of_the_first_product_and_verify_that_the_modal_window_appear() {

    }

    @Given("Click on the Wish list icon of the first product and verify that the product is added")
    public void click_on_the_wish_list_icon_of_the_first_product_and_verify_that_the_product_is_added() {

    }

    @Given("Click on the chart icon of the first product for adding to cart and verify that the message {string} on the modal")
    public void click_on_the_chart_icon_of_the_first_product_for_adding_to_cart_and_verify_that_the_message_on_the_modal(String string) {

    }

    @Given("Click on the compare icon of the first product  and verify that the message {string} is display")
    public void click_on_the_compare_icon_of_the_first_product_and_verify_that_the_message_is_display(String string) {

    }

    @Given("Click on the Click on the Quick view icon of the first product and verify that the modal window appear")
    public void click_on_the_click_on_the_quick_view_icon_of_the_first_product_and_verify_that_the_modal_window_appear() {

    }




}

