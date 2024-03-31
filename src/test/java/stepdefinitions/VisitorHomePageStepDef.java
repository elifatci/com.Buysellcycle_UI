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
    @Given("Closes page")
    public void Closes_page() {
        Driver.quitDriver();
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



    //============================= US_16 =========================================

    @Given("Verify that the footer section is displayed at the bottom of the site")
    public void verify_that_the_footer_section_is_displayed_at_the_bottom_of_the_site() {
        ReusableMethods.wait(3);
        ReusableMethods.scrollIntoViewJS(visitorHomePage.footer);
        assertTrue(visitorHomePage.footer.isDisplayed());
    }
    @Given("Goes to Footer section")
    public void goes_to_footer_section() {
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
        String actualWarning =visitorHomePage.textWarning.getText();
        assertEquals(expected,actualWarning);

    }
    @Given("Leave the textbox blank and press the button to read {string} It must be verified that the message appears.")
    public void leave_the_textbox_blank_and_press_the_button_to_read_it_must_be_verified_that_the_message_appears(String expected) {
        visitorHomePage.textBoxFooterEmail.click();
        visitorHomePage.textBoxFooterEmail.clear();
        visitorHomePage.textBoxFooterEmail.sendKeys(Keys.ENTER);
        String actualWarning =visitorHomePage.textWarning.getText();
        assertEquals(expected,actualWarning);
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


}
