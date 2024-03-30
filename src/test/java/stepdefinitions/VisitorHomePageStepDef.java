package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
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
//=======================================================================================================
}
