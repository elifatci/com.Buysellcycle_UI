package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Base;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;
import java.util.Properties;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;
import static utils.Driver.getDriver;


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
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Given("{int} seconds pause")
    public void seconds_pause(Integer seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);
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
    @Given("The user types in the valid mail address to the mail text box inside the sign-in form")
    public void the_user_types_in_the_valid_mail_address_to_the_mail_text_box_inside_the_sign_in_form() {
        visitorHomePage.textBoxMail.click();
        visitorHomePage.textBoxMail.sendKeys(ConfigReader.getProperty("customerEmailReyyan"));
    }

    @Given("The user types in the valid password to the password text box inside the sign-in form")
    public void the_user_types_in_the_valid_password_to_the_password_text_box_inside_the_sign_in_form() {
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
        Assert.assertEquals(expectedUrl, actualUrl);
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

    // US12 ---- TC03
    @Given("It is checked if the Daily deals link is displayed and enabled")
    public void it_is_checked_if_the_daily_deals_link_is_displayed_and_enabled() {

        webElementReturner(userDashboard.linkDailyDeals);
        // Assert.assertTrue(userDashboard.linkDailyDeals.isDisplayed());
        // Assert.assertTrue(userDashboard.linkDailyDeals.isEnabled());
    }
    @Given("The user clicks on the Daily Deals link")
    public void the_user_clicks_on_the_daily_deals_link() {
        userDashboard.linkDailyDeals.click();
    }
    @Given("It is checked if there is a countdown on the page")
    public void it_is_checked_if_there_is_a_countdown_on_the_page() {
        Assert.assertTrue(userDashboard.CountDownDailyDeals.isDisplayed());
    }
    @Given("It is checked if there are products on sale on the page")
    public void it_is_checked_if_there_are_products_on_sale_on_the_page() {
        Assert.assertTrue(userDashboard.firstProductDailyDeals.isDisplayed());
    }
    @Given("It is checked if there is a button to compare products")
    public void it_is_checked_if_there_is_a_button_to_compare_products() {
        actions.moveToElement(userDashboard.buttonCompare).perform();
        Assert.assertTrue(userDashboard.buttonCompare.isDisplayed());
        Assert.assertTrue(userDashboard.buttonCompare.isEnabled());
    }
    @Given("It is checked if there is a button to review the products")
    public void it_is_checked_if_there_is_a_button_to_review_the_products() {
        Assert.assertTrue(userDashboard.buttonReview.isDisplayed());
        Assert.assertTrue(userDashboard.buttonReview.isEnabled());
    }
    @Given("It is checked if there is a button to add the products to the cart")
    public void it_is_checked_if_there_is_a_button_to_add_the_products_to_the_cart() {
        Assert.assertTrue(userDashboard.buttonCart.isDisplayed());
        Assert.assertTrue(userDashboard.buttonCart.isEnabled());
    }
    @Given("It is checked if there is a button to add the products to the wishlist")
    public void it_is_checked_if_there_is_a_button_to_add_the_products_to_the_wishlist() {
        Assert.assertTrue(userDashboard.buttonWishlist.isDisplayed());
        Assert.assertTrue(userDashboard.buttonWishlist.isEnabled());
    }


    //===================US_07==========================
    @Given("Verifies that the New Product Deals menu title is visible and active")
    public void verifies_that_the_menu_title_is_visible_and_active() {
        assertTrue(visitorHomePage.linkNewProductDeals.isDisplayed());
        assertTrue(visitorHomePage.linkNewProductDeals.isEnabled());

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
    @Given("User clicks on -Register button- and displays {string} the Sign Up page.")
    public void user_clicks_on_register_button_and_displays_the_sign_up_page(String url) {
        userDashboard.checkClickElement(visitorHomePage.linkRegister);
        assertTrue(visitorHomePage.logoBuySell.isDisplayed());
        assertTrue(visitorHomePage.labelPictureText.isDisplayed());
        userDashboard.checkUrl(url);
        assertEquals(ConfigReader.getProperty("registerUrl"), Driver.getDriver().getCurrentUrl());
        assertTrue(visitorHomePage.tableRegisterForm.isDisplayed());
    }

    @Given("User enters a valid {string} on -First Name box-.")
    public void user_enters_a_valid_on_first_name_box(String name) {
        userDashboard.checkSendKeysBox(visitorHomePage.textBoxFirstName, name);
    }

    @Given("User enters a valid {string} on -Last Name box-.")
    public void user_enters_a_valid_on_last_name_box(String lastName) {
        userDashboard.checkSendKeysBox(visitorHomePage.textBoxLastName, lastName);
    }

    @Given("User enters a valid {string} clicks on -Email or Phone box-.")
    public void user_enters_a_valid_clicks_on_email_or_phone_box(String email) {
        userDashboard.checkSendKeysBox(visitorHomePage.textBoxEmail, email);
    }

    @Given("User enters a valid {string} on -Password box-.")
    public void user_enters_a_valid_on_password_box(String password) {
        userDashboard.checkSendKeysBox(visitorHomePage.textBoxPassword, password);
    }

    @Given("User enters a valid {string} on -Confirm Password- box.")
    public void user_enters_a_valid_on_confirm_password_box(String password) {
        userDashboard.checkSendKeysBox(visitorHomePage.textBoxPasswordConfirm, password);
    }

    @Given("User clicks on Sign Up button.")
    public void user_clicks_on_sign_up_button() {
        userDashboard.checkClickElement(visitorHomePage.signUpButton);
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

    @Given("User clicks on -Contact button- and displays {string} the Contact page.")
    public void user_clicks_on_contact_button_and_displays_the_contact_page(String url) {
        userDashboard.checkClickElement(visitorHomePage.linkHeaderContact);
        userDashboard.checkUrl(url);
    }

    @Given("User clicks on -Contact button- and displays the Contact page.")
    public void user_clicks_on_contact_button_and_displays_the_contact_page() {
        assertTrue(visitorHomePage.linkHeaderContact.isDisplayed());
        assertTrue(visitorHomePage.linkHeaderContact.isEnabled());
        visitorHomePage.linkHeaderContact.click();
        assertEquals(ConfigReader.getProperty("contactUrl"), Driver.getDriver().getCurrentUrl());
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
        userDashboard.checkClickElement(visitorHomePage.iconContactFacebook);
    }

    @Given("User verifies that he-she accesses the {string}.")
    public void user_verifies_that_he_she_accesses_the(String url) {
        userDashboard.checkUrl(url);
    }

    @Given("User clicks on -Twitter icon-.")
    public void user_clicks_on_twitter_icon() {
        userDashboard.checkClickElement(visitorHomePage.iconContactTwitter);
    }

    @Given("User clicks on -LinkedIn icon-.")
    public void user_clicks_on_linked_in_icon() {
        userDashboard.checkClickElement(visitorHomePage.iconContactLinkedin);
    }

    @Given("User clicks on -Instagram icon-.")
    public void user_clicks_on_instagram_icon() {
        userDashboard.checkClickElement(visitorHomePage.iconContactInstagram);
    }

    //US10 ---> TC06
    @Given("User confirms that Get in touch form is visible.")
    public void user_confirms_that_get_in_touch_form_is_visible() {
        assertTrue(visitorHomePage.labelFormGetInTouch.isDisplayed());
    }

    @Given("User fills out the name section {string}.")
    public void user_fills_out_the_name_section(String name) {
        userDashboard.checkSendKeysBox(visitorHomePage.textBoxName, name);
    }

    @Given("User fills out the email section {string}.")
    public void user_fills_out_the_email_section(String email) {
        userDashboard.checkSendKeysBox(visitorHomePage.textBoxEmail, email);
    }

    @Given("User chooses an option {int}.")
    public void user_chooses_an_option(int index) {
        Select selectOption = new Select(visitorHomePage.dropDownOrder);
        selectOption.selectByIndex(index);
    }

    @Given("User fills out the message section {string}.")
    public void user_fills_out_the_message_section(String message) {
        userDashboard.checkSendKeysBox(visitorHomePage.textBoxMessage, message);
    }

    @Given("User clicks on -Send Message button-")
    public void user_clicks_on_send_message_button() {
        userDashboard.checkClickElement(visitorHomePage.sendMessageButton);
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
        ReusableMethods.clickWithJS(visitorHomePage.linkReadMoreFour);
    }

    @Given("Verify that you are redirected to the relevant page")
    public void verify_that_you_are_redirected_to_the_relevant_page() {
        Assert.assertTrue(visitorHomePage.labelCommerceContent.isDisplayed());
    }

    @Given("Search for a keyword in the {string} box")
    public void search_for_a_keyword_in_the_box(String string) {

    }

    @Given("Search for a keyword in the Search Post box")
    public void search_for_a_keyword_in_the_box() {
        visitorHomePage.searchBoxPost.sendKeys("shopping", Keys.ENTER);
    }

    @Given("Verify that the search results match the relevant keyword")
    public void verify_that_the_search_results_match_the_relevant_keyword() {
        assertTrue(Driver.getDriver().getCurrentUrl().contains("shopping"));
    }

    @Given("Verify that titles are visible in the Category section")
    public void verify_that_titles_are_visible_in_the_category_section() {
        assertTrue(visitorHomePage.labelBlogCategory.isDisplayed());
    }

    @Given("Select a category from the {string} section")
    public void select_a_category_from_the_section(String string) {

    }

    @Given("Select a category from the Category section")
    public void select_a_category_from_the_section() {
        visitorHomePage.linkBlogShopping.click();
    }

    @Given("Verify that relevant blogs are listed")
    public void verify_that_relevant_blogs_are_listed() {
        assertTrue(Driver.getDriver().getCurrentUrl().contains("shopping"));
    }

    @Given("Verify that the popular post section is visible and blogs are displayed")
    public void verify_that_the_popular_post_section_is_visible_and_blogs_are_displayed() {
        assertTrue(visitorHomePage.labelPopularPost.isDisplayed());
    }

    @Given("Verify that the Keyword section is visible")
    public void verify_that_the_keyword_section_is_visible() {
        assertTrue(visitorHomePage.labelKeywords.isDisplayed());
    }

    @Given("Select a keyword from the {string} section and verify that relevant blogs are listed")
    public void select_a_keyword_from_the_section_and_verify_that_relevant_blogs_are_listed(String string) {
    }

    @Given("Select a keyword from the Keyword section and verify that relevant blogs are listed")
    public void select_a_keyword_from_the_section_and_verify_that_relevant_blogs_are_listed() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.clickWithJS(visitorHomePage.buttonBlogShopping);
        assertTrue(Driver.getDriver().getCurrentUrl().contains("shopping"));
    }

//**************************************US_06/TC_01*********************************************************

    @Given("All Categories in the nav bar on the home page that the drop-down menu is visible verify.")
    public void all_categories_in_the_nav_bar_on_the_home_page_that_the_drop_down_menu_is_visible_verify() {
        assertTrue(visitorHomePage.dropDownAllCategories.isDisplayed());
    }

    @Given("Go to the All Categories dropdown menu click.")
    public void go_to_the_all_categories_dropdown_menu_click() {
        visitorHomePage.dropDownAllCategories.click();
    }

    @Given("All items in the drop-down menu category titles of verify that it is visible.")
    public void all_items_in_the_drop_down_menu_category_titles_of_verify_that_it_is_visible() {

        assertTrue(visitorHomePage.subDropdownAllCategories.isDisplayed());
    }

    @Given("Click on the Electronics main category and select the subcategories it's confirmed to appear.")
    public void click_on_the_electronics_main_category_and_select_the_subcategories_it_s_confirmed_to_appear() {
        assertTrue(visitorHomePage.buttonElectronicsIcon.isDisplayed());
        visitorHomePage.buttonElectronicsIcon.click();

    }

    //============================= US_16 =========================================

    @Given("Verify that the footer section is displayed at the bottom of the site")
    public void verify_that_the_footer_section_is_displayed_at_the_bottom_of_the_site() {
        ReusableMethods.wait(3);
        ReusableMethods.scrollIntoViewJS(visitorHomePage.footer);
        assertTrue(visitorHomePage.footer.isDisplayed());
    }

    @Given("Goes to Footer section")
    public void goes_to_footer_section() {
       // ReusableMethods.wait(5);
       // visitorHomePage.buttonPopUpClose.click();
        //ReusableMethods.wait(3);
        ReusableMethods.scrollIntoViewJS(visitorHomePage.footer);

    }

    @Given("{string} text is displayed and it is confirmed that it is active")
    public void text_is_displayed_and_it_is_confirmed_that_it_is_active(String link) {
        // ReusableMethods.wait(3);
        ReusableMethods.scrollIntoViewJS(visitorHomePage.footer);
        assertTrue(ReusableMethods.footerLinkleri(link).isDisplayed());
        assertTrue(ReusableMethods.footerLinkleri(link).isEnabled());

    }

    @Given("Click on {string} and the {string} page opens")
    public void click_on_and_the_opens(String link, String string2) {
        ReusableMethods.wait(1);
        ReusableMethods.scrollIntoViewJS(visitorHomePage.footer);
        ReusableMethods.clickFooterLinkleri(link);

    }

    @Given("Verify that the {string} text box is visible and active under the {string} text")
    public void verify_that_the_text_box_is_visible_and_active_under_the_text(String link, String string2) {
        ReusableMethods.wait(3);
        ReusableMethods.scrollIntoViewJS(visitorHomePage.footer);
        assertTrue(ReusableMethods.footerLinkleri(link).isDisplayed());
        assertTrue(ReusableMethods.footerLinkleri(link).isEnabled());
    }

    @Given("Verify that the {string} button is visible and active under the {string} text box.")
    public void verify_that_the_button_is_visible_and_active_under_the_text_box(String link, String string2) {
        ReusableMethods.wait(3);
        ReusableMethods.scrollIntoViewJS(visitorHomePage.footer);
        assertTrue(ReusableMethods.footerLinkleri(link).isDisplayed());
        assertTrue(ReusableMethods.footerLinkleri(link).isEnabled());
    }

    @Given("When the correct email is entered into the textbox and the SUBSCRIBE button is pressed, {string} It is confirmed that the message appeared.")
    public void when_the_correct_email_is_entered_into_the_textbox_and_the_subscribe_button_is_pressed_it_is_confirmed_that_the_message_appeared(String message) {
        ReusableMethods.wait(3);
        ReusableMethods.scrollIntoViewJS(visitorHomePage.footer);
        visitorHomePage.textBoxFooterEmail.sendKeys(ConfigReader.getProperty("customerEmailZehra"));
        visitorHomePage.buttonSubscribe.click();
        // String expectedMessage = message;
        String actualMessage = visitorHomePage.labelMessageFooter.getText();
        assertEquals(message, actualMessage);

    }

    @Given("It is verified that when the wrong email as {string} is entered into the textbox, {string} appears when the SUBSCRIBE button is pressed.")
    public void it_is_verified_that_when_the_wrong_email_as_is_entered_into_the_textbox_appears_when_the_subscribe_button_is_pressed(String name, String expected) {

        visitorHomePage.textBoxFooterEmail.click();
        visitorHomePage.textBoxFooterEmail.clear();
        visitorHomePage.textBoxFooterEmail.sendKeys(name+Keys.ENTER);
       assertTrue(visitorHomePage.labelMessageFooter.isDisplayed());
        String actualWarning = visitorHomePage.textWarning.getText();
        assertEquals(expected, actualWarning);

    }

    @Given("Leave the textbox blank and press the button to read {string} It must be verified that the message appears.")
    public void leave_the_textbox_blank_and_press_the_button_to_read_it_must_be_verified_that_the_message_appears(String expected) {
        visitorHomePage.textBoxFooterEmail.click();
        visitorHomePage.textBoxFooterEmail.clear();
        visitorHomePage.textBoxFooterEmail.sendKeys(Keys.ENTER);
        String actualWarning = visitorHomePage.textWarning.getText();
        assertEquals(expected, actualWarning);
    }

    @Given("Verify that the {string} icon is visible and active")
    public void verify_that_the_icon_is_visible_and_active(String link) {
        ReusableMethods.wait(3);
        ReusableMethods.scrollIntoViewJS(visitorHomePage.footer);
        assertTrue(ReusableMethods.footerLinkleri(link).isDisplayed());
        assertTrue(ReusableMethods.footerLinkleri(link).isEnabled());
    }

    @Given("Click on the {string} icon and verify that the {string} page is opened.")
    public void click_on_the_icon_and_verify_that_the_page_is_opened(String link, String string2) {
        ReusableMethods.wait(3);
        ReusableMethods.scrollIntoViewJS(visitorHomePage.footer);
        ReusableMethods.clickFooterLinkleri(link);
    }

    @Given("At the bottom left, {string} The text must be visible.")
    public void at_the_bottom_left_the_text_must_be_visible(String link) {
        ReusableMethods.wait(3);
        ReusableMethods.scrollIntoViewJS(visitorHomePage.footer);
        assertTrue(ReusableMethods.footerLinkleri(link).isDisplayed());

    }

    @Given("The up icon appears at the bottom right and should be active.")
    public void the_up_icon_appears_at_the_bottom_right_and_should_be_active() {
        ReusableMethods.wait(3);
        assertTrue(visitorHomePage.iconGoToTop.isDisplayed());
        assertTrue(visitorHomePage.iconGoToTop.isEnabled());
    }

    @Given("It should be verified that when the up icon is clicked, it goes to the top of the site.")
    public void ıt_should_be_verified_that_when_the_up_icon_is_clicked_it_goes_to_the_top_of_the_site() {
        visitorHomePage.iconGoToTop.click();
        ReusableMethods.wait(3);
        assertTrue(visitorHomePage.imageHeader.isDisplayed());
    }

//=====================================================================================================

    @Given("Subcategories within the Electronics category one title clicked on the right place  that it is directed.")
    public void subcategories_within_the_electronics_category_one_title_clicked_on_the_right_place_that_it_is_directed() {
        ReusableMethods.wait(1);
        actions.moveToElement(visitorHomePage.linkmobilePhone).click().perform();
        ReusableMethods.wait(1);
        assertTrue(visitorHomePage.linkmobilePhone.isEnabled());
    }


    @Given("Click on the Baby main category and select the subcategories it's confirmed to appear.")
    public void click_on_the_baby_main_category_and_select_the_subcategories_it_s_confirmed_to_appear() {
        ReusableMethods.wait(1);
        actions.moveToElement(visitorHomePage.dropDownAllCategories).click().perform();
        ReusableMethods.wait(1);
        assertTrue(visitorHomePage.buttonbabyClickView.isDisplayed());
        actions.moveToElement(visitorHomePage.buttonbabyClickView).click().perform();
    }

    @Given("Subcategories within the Baby category two title clicked on the right place  that it is directed.")
    public void subcategories_within_the_baby_category_two_title_clicked_on_the_right_place_that_it_is_directed() {
        ReusableMethods.wait(2);
        assertTrue(visitorHomePage.linkBabyStrollerPushchair.isDisplayed());
        actions.moveToElement(visitorHomePage.linkBabyStrollerPushchair).click().perform();
        ReusableMethods.wait(3);
        actions.moveToElement(visitorHomePage.dropDownAllCategories).click().perform();
        ReusableMethods.wait(3);
        actions.moveToElement(visitorHomePage.buttonbabyClickView).click().perform();
        assertTrue(visitorHomePage.linkBabyBad.isDisplayed());
        actions.moveToElement(visitorHomePage.linkBabyBad).click().perform();
        ReusableMethods.wait(3);


    }


    //**************************************US_15/TC_01*********************************************************
    @Given("Verify that the Electronics category window is displayed in the Home page body section.")
    public void verify_that_the_electronics_category_window_is_displayed_in_the_home_page_body_section() {
        visitorHomePage.bodyElectronics.isDisplayed();
    }

    @Given("Click the Telephone heading in the subcategory and verify that the related products are displayed.")
    public void click_the_telephone_heading_in_the_subcategory_and_verify_that_the_related_products_are_displayed() {
       ReusableMethods.clickWithJS(visitorHomePage.buttonTelephone);
       visitorHomePage.imageProductTelephone.isDisplayed();

    }
    @Given("Click the TV&Picture&Sound heading in the subcategory and verify that the related products are displayed.")
    public void click_the_tv_picture_sound_heading_in_the_subcategory_and_verify_that_the_related_products_are_displayed() {
        ReusableMethods.clickWithJS(visitorHomePage.buttonTvPicSound);
        visitorHomePage.imageProductTvPicSound.isDisplayed();

    }
    @Given("Verify that the products on the relevant category page have been added to the basket.")
    public void verify_that_the_products_on_the_relevant_category_page_have_been_added_to_the_basket() {
        ReusableMethods.clickWithJS(visitorHomePage.iconBascetAppleIphone15Pro128Gb);
        visitorHomePage.buttonViewCard.isDisplayed();
        ReusableMethods.clickWithJS(visitorHomePage.buttonCloseIcon1);
        ReusableMethods.clickWithJS(visitorHomePage.buttonTi_CloseIcon2);

    }
    @Given("Verify that you have selected products for comparison on the products in the relevant category page.")
    public void verify_that_you_have_selected_products_for_comparison_on_the_products_in_the_relevant_category_page() {
        ReusableMethods.clickWithJS(visitorHomePage.iconCompareBascetAppleIphone15Pro128Gb);
        ReusableMethods.clickWithJS(visitorHomePage.buttonCompareHomePage);
        visitorHomePage.textProductCompare.isDisplayed();
        ReusableMethods.wait(2);
        visitorHomePage.logoBuysell.click();
    }

    @Given("Verify that the products on the relevant category page have been added to the likes list.")
    public void verify_that_the_products_on_the_relevant_category_page_have_been_added_to_the_likes_list() {
        ReusableMethods.wait(2);
        ReusableMethods.clickWithJS(visitorHomePage.iconWishListAppleIphone15Pro128Gb);


    }
    @Given("Verify that Warning Please Login First appears on the products in the relevant category page because it is not possible to add to the likes list.")
    public void verify_that_warning_please_login_first_appears_on_the_products_in_the_relevant_category_page_because_it_is_not_possible_to_add_to_the_likes_list() {
        visitorHomePage.textWarningFirstLogin.isDisplayed();
        ReusableMethods.wait(3);
    }
    @Given("Verify that additional products are displayed by clicking more products in the Electronics window.")
    public void verify_that_additional_products_are_displayed_by_clicking_more_products_in_the_electronics_window() {
        ReusableMethods.clickWithJS(visitorHomePage.buttonMoreDealsProduct);
        ReusableMethods.wait(1);
        visitorHomePage.textMoreDealsProductList.isDisplayed();
        Driver.quitDriver();
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

    //US02 TC02
    @Given("The site logo is displayed on the top left of the page")
    public void the_site_logo_is_displayed_on_the_top_left_of_the_page() {
        assertTrue(visitorHomePage.logoBuysell.isDisplayed());

    }

    @Given("Click on the site logo and refresh the page")
    public void click_on_the_site_logo_and_refresh_the_page() {
        visitorHomePage.logoBuysell.click();
        assertTrue(visitorHomePage.logoBuysell.isDisplayed());
    }

    //US TC03
    @Given("The search box  is displayed")
    public void the_search_box_is_displayed() {
        assertTrue(visitorHomePage.searchBoxHomePage.isDisplayed());
    }

    @Given("search by typing Baby in the search bar")
    public void search_by_typing_baby_in_the_search_bar() {


    }
// ===================US08 > TC01==================================

    @Given("User clicks on the About Us link and displays About Us page")
    public void user_clicks_on_the_about_us_link_and_displays_about_us_page() {
        visitorHomePage.linkHeaderAboutUs.click();
        assertTrue(visitorHomePage.labelAboutUs.isDisplayed());
    }

    @Given("User confirms that the displayed  Client Worldwide, Successful Project, Work Employed,Planning Services boards matches the expected details on about page.")
    public void user_confirms_that_the_displayed_client_worldwide_successful_project_work_employed_planning_services_boards_matches_the_expected_details_on_about_page() {
        assertTrue(visitorHomePage.labelClientWorlwide.isDisplayed());
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
    @Given("Verify  for the presence of the New User Zone menu item")
    public void verify_for_the_presence_of_the_menu_item() {
        visitorHomePage.verifyVisible(visitorHomePage.linkNewUserZone);

    }

    @Given("Click on the New User Zone menu item")
    public void click_on_the_menu_item() {
        visitorHomePage.linkNewUserZone.click();
    }

    @Given("verify that New User Zone link should redirect the user to the New-user-zone page")
    public void verify_that_clicking_on_the_menu_item_should_redirect_the_user_to_the_new_user_zone_page() {
        String expectedUrl = "https://qa.buysellcycle.com/new-user-zone/welcome-buysellcycle!-u7dzv";
        assertEquals(expectedUrl,Driver.getDriver().getCurrentUrl());
    }

    @Given("Verify that For You section is active")
    public void verify_that_section_is_active() {
        ReusableMethods.scrollWithPixelsJS(0, 350);
        ReusableMethods.wait(1);
        visitorHomePage.verifyActive(visitorHomePage.buttonForYou);
    }

    @Given("Click on the Exclusive Price section")
    public void click_on_the_section() {
       visitorHomePage.buttonExclusivePrice.click();
    }

    @Given("verify that products display with special discount on Exclusive Price")
    public void verify_that_section_is_active_and_products_display_with_special_discount_on_for_you() {
        ReusableMethods.scrollWithPixelsJS(0, 250);
        ReusableMethods.wait(1);
       visitorHomePage.verifyVisible(visitorHomePage.labelExclusivePrice);
    }

    @Given("Click on the Coupon section and verify that Coupon is visible")
    public void click_on_the_section_and_verify_that_coupon_section_is_active() {
        visitorHomePage.buttonCoupon.click();
        ReusableMethods.wait(1);
        visitorHomePage.verifyVisible(visitorHomePage.linkGetCoupon);
    }

    @Given("Click on the chart icon of the first product")
    public void click_on_the_chart_icon_of_the_first_product() {
        ReusableMethods.scrollWithPixelsJS(0, 700);
        ReusableMethods.wait(1);
        visitorHomePage.iconCart_ForYou.click();
    }

    @Given("verify that the message Item added to your cart on the modal")
    public void verify_that_the_message_on_the_modal() {
        ReusableMethods.wait(1);
        visitorHomePage.verifyVisible(visitorHomePage.labelMessageForYou);
    }

    @Given("Close the modal window that opened")
    public void close_the_modal_window_that_opened() {
        visitorHomePage.buttonCloseForYou.click();
        ReusableMethods.wait(1);
    }

    @Given("Click on the compare icon of the first product")
    public void click_on_the_compare_icon_of_the_first_product() {
        ReusableMethods.scrollWithPixelsJS(0, -200);
        ReusableMethods.wait(1);
        ReusableMethods.hover(visitorHomePage.imageProductFirstForYou);
        visitorHomePage.iconCompareForYou.click();
    }

    @Given("verify that the message Product added to compare list successfully is display")
    public void verify_that_the_message_is_display() {
        assertTrue(userDashboard.popUpWishlist.isDisplayed());
    }

    @Given("Click  on the Quick view icon of the first product and verify that the modal window appear")
    public void click_on_the_quick_view_icon_of_the_first_product_and_verify_that_the_modal_window_appear() {
        ReusableMethods.scrollWithPixelsJS(0, 150);
        ReusableMethods.hover(visitorHomePage.imageProductFirstForYou);
        visitorHomePage.iconQuickView.click();
        ReusableMethods.wait(1);
        assertTrue(visitorHomePage.buttonAddCartModalForYou.isDisplayed());
    }

    @Given("Click on the Wish list icon of the first product and verify that the product is added")
    public void click_on_the_wish_list_icon_of_the_first_product_and_verify_that_the_product_is_added() {
        ReusableMethods.scrollWithPixelsJS(0, -150);
        ReusableMethods.wait(1);
        ReusableMethods.hover(visitorHomePage.imageProductFirstForYou);
        visitorHomePage.iconWishList.click();
        assertTrue(visitorHomePage.popUpWishListForYou.getText().contains("Product is added"));
    }

    @Given("Click on the chart icon of the first product for adding to cart and verify that the message Item added to your cart on the modal")
    public void click_on_the_chart_icon_of_the_first_product_for_adding_to_cart_and_verify_that_the_message_on_the_modal() {
        ReusableMethods.scrollWithPixelsJS(0, 600);
        ReusableMethods.wait(1);
        visitorHomePage.iconCart_ExclusivePrice.click();
        ReusableMethods.wait(1);
        visitorHomePage.verifyVisible(visitorHomePage.labelMessageForYou);
    }

    @Given("Click on the compare icon of the first product  and verify that the message Product added to compare list successfully is display")
    public void click_on_the_compare_icon_of_the_first_product_and_verify_that_the_message_is_display() {
        ReusableMethods.scrollWithPixelsJS(0, -300);
        ReusableMethods.wait(1);
        ReusableMethods.hover(visitorHomePage.imageProductFirstExclusivePrice);
        visitorHomePage.iconCompare_ExclusivePrice.click();
    }

    @Given("Click on the Click on the Quick view icon of the first product and verify that the modal window appear")
    public void click_on_the_click_on_the_quick_view_icon_of_the_first_product_and_verify_that_the_modal_window_appear() {
       // ReusableMethods.scrollWithPixelsJS(0, -300);
        ReusableMethods.hover(visitorHomePage.imageProductFirstExclusivePrice);
        ReusableMethods.wait(1);
        visitorHomePage.iconQuickView_ExclusivePrice.click();
    }

    @Given("Close the modal window that opened on Exclusive Price")
    public void close_the_modal_window_that_opened_on_exclusive_price() {
        ReusableMethods.wait(1);
        visitorHomePage.buttonCloseExclusivePrice.click();
    }
//US13<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<nazime


    //US13 TC01
    @Given("images in the slider are visible on the homepage")
    public void images_in_the_slider_are_visible_on_the_homepage() {
       assertTrue( visitorHomePage.imageProduct1.isDisplayed());

    }

    //US13 TC02
    @Given("scrolling between slider images and Verifies that the displayed image changes in scrolls")
    public void scrolling_between_slider_images_and_verifies_that_the_displayed_image_changes_in_scrolls() {
        ReusableMethods.wait(2);
        visitorHomePage.icon2.click();
        ReusableMethods.wait(2);
        assertTrue( visitorHomePage.imageProduct2.isDisplayed());
        ReusableMethods.wait(2);
        ReusableMethods.waitAndClick(visitorHomePage.icon3);
        ReusableMethods.wait(5);
        assertTrue( visitorHomePage.imageProduct3.isDisplayed());

    }

   //US13 TC03<<<<<<
   @Given("Slider images are expected to automatically switch after a certain period of time Verifies that images are automatically displayed in a loop")
   public void slider_images_are_expected_to_automatically_switch_after_a_certain_period_of_time_verifies_that_images_are_automatically_displayed_in_a_loop() {

       ReusableMethods.waitForVisibility(visitorHomePage.imageProduct1,3);
       assertTrue(visitorHomePage.imageProduct2.isDisplayed());
       ReusableMethods.waitForVisibility(visitorHomePage.imageProduct2,3);
       assertTrue(visitorHomePage.imageProduct3.isDisplayed());
       ReusableMethods.waitForVisibility(visitorHomePage.imageProduct3,3);
   }

    @Given("Verifies that the displayed image changes in scrolls")
    public void verifies_that_the_displayed_image_changes_in_scrolls() {
        assertTrue(visitorHomePage.imageProduct2.isDisplayed());
        assertTrue(visitorHomePage.imageProduct3.isDisplayed());

    }

    //US13 TC04<<<<<<
    @Given("Click on a slider image and Verifies that the relevant page has been opened")
    public void click_on_a_slider_image_and_verifies_that_the_relevant_page_has_been_opened() {

        ReusableMethods.waitAndClick(visitorHomePage.imageProduct1);
        ReusableMethods.switchToWindow("Fashion");
        visitorHomePage.logoBuysell.click();
        visitorHomePage.icon2.click();
        ReusableMethods.waitAndClick(visitorHomePage.imageProduct2);
        ReusableMethods.wait(2);
        visitorHomePage.logoBuysell.click();
        visitorHomePage.icon3.click();
        ReusableMethods.wait(2);
        ReusableMethods.waitAndClick(visitorHomePage.imageProduct3);

    }

    // ---> kevser_US03_TC01
    @Given("Click Track Your Order link")
    public void click_track_your_order_link() {
        visitorHomePage.linkHeaderTrackYourOrder.click();
    }
    @Given("Verify that correct page is opened")
    public void verify_that_correct_page_is_opened() {
        String expectedURl = "https://qa.buysellcycle.com/track-order";
        String actualURL = Driver.getDriver().getCurrentUrl();
        assertEquals(expectedURl,actualURL);
    }
    @Given("Verify that Order Tracking Number textbox is visible")
    public void verify_that_order_tracking_number_textbox_is_visible() {
        assertTrue(visitorHomePage.textBoxOrderTrackingNumber.isDisplayed());
    }
    @Given("Verify that Secret ID textBox is visible")
    public void verify_that_secret_id_only_for_guest_user_textBox_is_visible() {
        assertTrue(visitorHomePage.textBoxSecretID.isDisplayed());
    }
    // ---> kevser_US03_TC02
    @Given("Click Order Tracking Number textbox and Write {string}")
    public void click_order_tracking_number_textbox_and_write(String orderIDNumber) {
        visitorHomePage.textBoxOrderTrackingNumber.click();
        visitorHomePage.textBoxOrderTrackingNumber.sendKeys(ConfigReader.getProperty(orderIDNumber));
    }
    @Given("Click Secret ID textbox and Write {string}")
    public void click_secret_id_only_for_guest_user_textbox_and_write(String secretIDNumber) {
        visitorHomePage.textBoxSecretID.click();
        visitorHomePage.textBoxSecretID.sendKeys(ConfigReader.getProperty(secretIDNumber));
    }
    @Given("Click Track Now button")
    public void click_track_now_button() {
        visitorHomePage.buttonTrackNow.click();
    }
    @Given("Verify that Product Detail page is opened")
    public void verify_that_product_detail_page_is_opened() {
        visitorHomePage.labelOrderID.isDisplayed();
    }
    // ---> kevser_US03_TC03
    @Given("Click Order Tracking Number textBox and Write {string}")
    public void click_order_tracking_number_text_box_and_write(String invalidOrderNumber) {
        visitorHomePage.textBoxOrderTrackingNumber.click();
        visitorHomePage.textBoxOrderTrackingNumber.sendKeys(ConfigReader.getProperty(invalidOrderNumber));
    }
    @Given("Click Secret ID textBox and Write {string}")
    public void click_secret_id_only_for_guest_user_text_box_and_write(String invalidSecretNumber) {
        visitorHomePage.textBoxSecretID.click();
        visitorHomePage.textBoxSecretID.sendKeys(ConfigReader.getProperty(invalidSecretNumber));
    }
    @Given("Verify that the error message is visible under Order Tracking Number textbox")
    public void verify_that_the_is_visible_under_order_tracking_number_textbox() {
        visitorHomePage.labelOrderIDError.isDisplayed();
    }
    @Given("Verify that the error message is visible under Secret ID (Only For Guest User) textbox")
    public void verify_that_the_is_visible_under_secret_id_only_for_guest_user_textbox() {
        visitorHomePage.labelSecretIDError.isDisplayed();
    }
    // ---> kevser_US03_TC04
    @Given("Verify that the message is visible")
    public void verify_that_is_visible() {
        assertTrue(visitorHomePage.labelOrderIDRequired.isDisplayed());
    }
    // ---> kevser_US03_TC05
    @Given("Verify that the message is not Displayed")
    public void verify_that_the_message_is_not_displayed() {
        ReusableMethods.wait(2);
        String expectedRequiredMessage = "The Secret ID Number field is required.";
        String actualMessage = visitorHomePage.labelSecretIDRequired.getText();
        assertNotEquals(expectedRequiredMessage,actualMessage);
    }

    // -----> kevser_US14_TC01 HomePage_Body
    @Given("Verify that Best Deals text is visible")
    public void verify_that_best_deals_text_is_visible() {
        ReusableMethods.wait(3);
        assertTrue(visitorHomePage.labelBestDeals_US14.isDisplayed());
    }
    @Given("Click View All button")
    public void click_view_all_button() {
        ReusableMethods.clickWithJS(visitorHomePage.viewAllBestDealsButton);
    }
    @Given("Verify that all the products are visible")
    public void verify_that_all_the_products_are_visible() {
        ReusableMethods.wait(2);
        assertTrue(visitorHomePage.labelAllProductsNumber.isDisplayed());
    }
    //---- US14_TC02
    @Given("Verify that Compare and Quick View links are active")
    public void verify_that_compare_and_quick_view_links_are_active() {
        ReusableMethods.clickWithJS(visitorHomePage.buttonCompare);
        ReusableMethods.wait(2);
        visitorHomePage.linkAddToCompare.click();
        ReusableMethods.wait(2);
        assertTrue(visitorHomePage.textWarningFirstLogin.isDisplayed());
        ReusableMethods.wait(2);
        ReusableMethods.clickWithJS(visitorHomePage.buttonQuickView);
        ReusableMethods.wait(2);
        assertTrue(visitorHomePage.quickViewProductPage.isDisplayed());
    }
    @Given("Verify that Wishlist link is active")
    public void verify_that_wishlist_link_is_active() {
        ReusableMethods.wait(2);
        ReusableMethods.clickWithJS(visitorHomePage.buttonWishList);
        ReusableMethods.wait(3);
        assertTrue(visitorHomePage.textWarningFirstLogin.isDisplayed());
    }
    @Given("Verify that Add To Cart link is active")
    public void verify_thar_add_to_cart_link_is_active() {

        ReusableMethods.wait(2);
        ReusableMethods.clickWithJS(visitorHomePage.buttonAddToCart);
        ReusableMethods.wait(2);
        //assertTrue(visitorHomePage.addToCartBox.isDisplayed());
    }
    //---- US14_TC03
    @Given("Verify that Feature Categories text is visible")
    public void verify_that_feature_categories_text_is_visible() {
        ReusableMethods.wait(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(2);
        ReusableMethods.scrollIntoViewJS(visitorHomePage.labelFeatureCategories);
        assertTrue(visitorHomePage.labelFeatureCategories.isDisplayed());
    }
    @Given("Verify that product box are visible under the Feature Categories text")
    public void verify_that_product_box_are_visible_under_the_feature_categories_text() {
        userDashboard.checkListELements(visitorHomePage.featureCategoriesProdBox,8);
    }

    //---- US14_TC04
    @Given("Click Shop Now link")
    public void click_shop_now_link() {
        visitorHomePage.linkShopNow.click();
    }

    //---- US14_TC05
    @Given("Verify that Top Rating text is visible")
    public void verify_that_top_rating_text_is_visible() {
        assertTrue(visitorHomePage.labelTopRating.isDisplayed());
    }
    @Given("Verify that product box are visible under the Top Rating link")
    public void verify_that_product_box_are_visible_under_the_top_rating_link() {
        assertTrue(visitorHomePage.prodTopRating.isDisplayed());
    }
    @Given("Verify that right and left buttons are active")
    public void verify_that_right_and_left_buttons_are_active() {
        assertTrue(visitorHomePage.buttonLeftAngle.isEnabled());
        assertTrue(visitorHomePage.buttonRightAngle.isEnabled());
    }

    //---- US14_TC06
    @Given("Verify that Compare and Quick View links under the Top Rating menu are active")
    public void verify_that_compare_and_quick_view_links_under_the_top_rating_menu_are_active() {


    }

    @Given("Verify that Wishlist link under the Top Rating menu is active")
    public void verify_that_wishlist_link_under_the_top_rating_menu_is_active() {

    }

    @Given("Verify that Add To Cart link under the Top Rating menu is active")
    public void verify_that_add_to_cart_link_under_the_top_rating_menu_is_active() {

    }
    //---- US14_TC07
    //---- US14_TC08
    //---- US14_TC09
    //---- US14_TC10
    //---- US14_TC11
    //---- US14_TC12
    //---- US14_TC13
    //---- US14_TC14
    //---- US14_TC15
    //---- US14_TC16








}

