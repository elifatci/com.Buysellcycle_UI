package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import pages.Base;
import pages.UserDashboard;
import pages.VisitorHomePage;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;
import javax.swing.*;
import static org.junit.Assert.assertTrue;

public class UserDashboardStepDef extends Base {

    // US18 TC01
    @Given("Go to {string}")
    public void go_to(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
  
    @Given("Clicks the Login buttonLink on the home page")
    public void clicks_the_login_button_link_on_the_home_page() {
        ReusableMethods.wait(2);
        visitorHomePage.linkLogin.click();
        ReusableMethods.wait(2);
    }
    @Given("Login by entering valid {string} and {string} on the SignIn page.")
    public void login_by_entering_valid_email_and_password_on_the_sign_in_page(String email, String password) {
        userDashboard.loginUser(ConfigReader.getProperty(email), ConfigReader.getProperty(password));
    }
    @Given("Displays Purchase History banner in Dashboard sideBar")
    public void displays_purchase_history_banner_in_dashboard_side_bar() {
        ReusableMethods.wait(5);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        userDashboard.linkPurchaseHistory.isDisplayed();
    }
    @Given("Clicking on the Purchase History link confirms that the relevant page has been accessed.")
    public void clicking_on_the_purchase_history_link_confirms_that_the_relevant_page_has_been_accessed() {
        userDashboard.linkPurchaseHistory.click();
        assertTrue(userDashboard.labelPurchaseHistory.isDisplayed());
    }

    //US18 TC02
    @Given("Click the Purchase History link in the Dashboard sideBar")
    public void click_the_purchase_history_link_in_the_dashboard_side_bar() {
        ReusableMethods.wait(5);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        userDashboard.linkPurchaseHistory.click();
    }
    @Given("Verify that the Details, Amount, Delivery Status, Payment Status, Action headers are visible")
    public void verify_that_the_details_amount_delivery_status_payment_status_action_headers_are_visible() {
        userDashboard.tableCellDisplayed(7);
    }
    @Given("Verify that the hamburger icon and download icon next to purchases are visible and functional")
    public void verify_that_the_hamburger_icon_and_download_icon_next_to_purchases_are_visible_and_functional() {
            userDashboard.verifyIcon();
    }
    @Given("Click on the Dowload icon to verify that the invoice has been downloaded.")
    public void click_on_the_dowload_icon_to_verify_that_the_invoice_has_been_downloaded() {
            userDashboard.iconDownload.click();
    }
    @Given("Verify that Order code, Package code, Delivery Process, Order Details, Order Summary, Payment Type information is visible in the invoice information.")
    public void verify_that_order_code_package_code_delivery_process_order_details_order_summary_payment_type_information_is_visible_in_the_invoice_information() {

        userDashboard.iconBurgerPurchase.click();
    }

    // ---> US20-kevser
    @Given("Clicks My Order link in the User Dashboard panel")
    public void clicks_link_in_the_user_dashboard_panel() {
        ReusableMethods.wait(2);

        //ReusableMethods.scrollIntoViewJS(userDashboard.linkMyOrder);
    }
    @Given("Verify that expected page is opened")
    public void verify_that_expected_page_is_opened() {
        ReusableMethods.wait(2);
        String expectedUrl = "https://qa.buysellcycle.com/my-purchase-orders";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
    @Given("All, To Pay, To Ship, To Receive links should be visible and active")
    public void all_to_pay_to_ship_to_receive_links_should_be_visible_and_active() {
        ReusableMethods.wait(2);
        userDashboard.linkAll.isDisplayed();
        userDashboard.linkAll.isEnabled();
        userDashboard.linkToPay.isDisplayed();
        userDashboard.linkToPay.isEnabled();
        userDashboard.linkToShip.isDisplayed();
        userDashboard.linkToShip.isEnabled();
        userDashboard.linkToRecieve.isDisplayed();
        userDashboard.linkToRecieve.isEnabled();
    }
    @Given("Order ID, Order Date, Status, Order amount, Paid Bay links should be visible and active")
    public void order_id_order_date_status_order_amount_paid_bay_links_should_be_visible_and_active() {
        ReusableMethods.wait(2);
        userDashboard.labelOrderID.isDisplayed();
        userDashboard.labelOrderID.isEnabled();
        userDashboard.labelOrderDate.isDisplayed();
        userDashboard.labelOrderDate.isEnabled();
        userDashboard.labelStatus.isDisplayed();
        userDashboard.labelStatus.isEnabled();
        userDashboard.labelOrderAmount.isDisplayed();
        userDashboard.labelOrderAmount.isEnabled();
        userDashboard.labelPaidBy.isDisplayed();
        userDashboard.labelPaidBy.isEnabled();
    }
    @Given("Order Details button should be visible and active")
    public void order_details_button_should_be_visible_and_active() {
        userDashboard.orderDetailsButton.isEnabled();
        userDashboard.orderDetailsButton.isDisplayed();
    }
    @Given("Last 5 orders link should be visible and active")
    public void last_orders_link_should_be_visible_and_active() {
        ReusableMethods.wait(2);
        userDashboard.dropDownLast5Orders.isEnabled();
    }

//==============================US_26=============================================
    @Given("I click on the {string} link in the header section.")
    public void i_click_on_the_link_in_the_header_section(String string) {

}
    @Given("Goes to the Support Ticket page")
    public void goes_to_the_support_ticket_page() {

    }
    @Given("Verify that the {string} menu title is visible in the SideBar.")
    public void verify_that_the_menu_title_is_visible_in_the_side_bar(String string) {

    }
    @Given("Verify that the {string} menu title is clickable")
    public void verify_that_the_menu_title_is_clickable(String string) {

    }
    @Given("Verify that when the {string} menu title is clicked, the User is directed to the {string} page.")
    public void verify_that_when_the_menu_title_is_clicked_the_user_is_directed_to_the_page(String string, String string2) {

    }

    @Given("Verify that {string} text is visible")
    public void verify_that_text_is_visible(String string) {

    }
    @Given("Verify that {string} in the list are visible.")
    public void verify_that_in_the_list_are_visible(String string) {

    }


    @Given("Verify that Ticket ID, Subject, Priority, Last Update headers are visible")
    public void verify_that_ticket_id_subject_priority_last_update_headers_are_visible() {

    }
    @Given("Verify that the tickets in the list contain Ticket ID, Subject, Priority, Last Update information.")
    public void verify_that_the_tickets_in_the_list_contain_ticket_id_subject_priority_last_update_information() {

    }

    @Given("Click on the {string} link under the action heading of the selected ticket to open its detail page.")
    public void click_on_the_link_under_the_action_heading_of_the_selected_ticket_to_open_its_detail_page(String string) {

    }
    @Given("Verifies that {string} information is displayed on the ticket's detail page")
    public void verifies_that_information_is_displayed_on_the_ticket_s_detail_page(String string) {

    }

    @Given("Verifies that the message information returned by the Admin is displayed.")
    public void verifies_that_the_message_information_returned_by_the_admin_is_displayed() {

    }

    @Given("Verifies that the REPLY button is visible and active under the message boxes")
    public void verifies_that_the_reply_button_is_visible_and_active_under_the_message_boxes() {

    }
    @Given("When the REPLY button is clicked, it is verified that the {string} text is visible.")
    public void when_the_reply_button_is_clicked_it_is_verified_that_the_text_is_visible(String string) {

    }
    @Given("Verifies that the required information can be entered in the textbox opened under the Description text.")
    public void verifies_that_the_required_information_can_be_entered_in_the_textbox_opened_under_the_description_text() {

    }
    @Given("Verifies that the {string} button is displayed and active.")
    public void verifies_that_the_button_is_displayed_and_active(String string) {

    }
    @Given("When he clicks on the REPLY NOW button, he confirms that the information he sent is also displayed on his own page.")
    public void when_he_clicks_on_the_reply_now_button_he_confirms_that_the_information_he_sent_is_also_displayed_on_his_own_page() {

    }

    @Given("When All Ticket DDM is clicked on the page that opens, it verifies that the All Ticket, Pending, On Going, Completed, Closed links are visible.")
    public void when_all_ticket_ddm_is_clicked_on_the_page_that_opens_it_verifies_that_the_all_ticket_pending_on_going_completed_closed_links_are_visible() {

    }
    @Given("When the {string} link is clicked, it confirms that the ticket with {string} status is listed.")
    public void when_the_link_is_clicked_it_confirms_that_the_ticket_with_status_is_listed(String string, String string2) {

    }
    @Given("When the {string} link is clicked, it verifies that the ticket with {string} status is listed.")
    public void when_the_link_is_clicked_it_verifies_that_the_ticket_with_status_is_listed(String string, String string2) {

    }

    @Given("When you click on the ADD NEW button, it is confirmed that you go to the {string} page.")
    public void when_you_click_on_the_add_new_button_it_is_confirmed_that_you_go_to_the_page(String string) {

    }
    @Given("It is verified that the Subject, Category, Priority and Description headings are visible.")
    public void it_is_verified_that_the_subject_category_priority_and_description_headings_are_visible() {

    }
    @Given("It is verified that the textboxes under the Subject and Description headings are visible and active.")
    public void it_is_verified_that_the_textboxes_under_the_subject_and_description_headings_are_visible_and_active() {

    }
    @Given("Verify that the holders are visible")
    public void verify_that_the_holders_are_visible() {

    }
    @Given("It is verified that the DDM menu is visible and active under the Category and Priority headings.")
    public void it_is_verified_that_the_ddm_menu_is_visible_and_active_under_the_category_and_priority_headings() {

    }
    @Given("Necessary information is entered in the Subject and Description text boxes.")
    public void necessary_information_is_entered_in_the_subject_and_description_text_boxes() {

    }
    @Given("Click on the necessary links for Category and Priority DDM.")
    public void click_on_the_necessary_links_for_category_and_priority_ddm() {

    }
    @Given("When you click on the {string} button, it is confirmed that you are directed to the All Submitted Ticket page and the entered ticket is seen at the bottom.")
    public void when_you_click_on_the_button_it_is_confirmed_that_you_are_directed_to_the_all_submitted_ticket_page_and_the_entered_ticket_is_seen_at_the_bottom(String string) {

    }

    @Given("Clicks the ADD NEW button")
    public void clicks_the_add_new_button() {

    }
    @Given("It is confirmed that a {string} warning is given when the Subject and Description textboxes are left blank.")
    public void it_is_confirmed_that_a_warning_is_given_when_the_subject_and_description_textboxes_are_left_blank(String string) {

    }
    @Given("It is verified that when the necessary links are not clicked due to Category and Priority DDM, a {string} warning is given.")
    public void it_is_verified_that_when_the_necessary_links_are_not_clicked_due_to_category_and_priority_ddm_a_warning_is_given(String string) {

    }
    @Given("Verifies that the {string} link has been clicked.")
    public void verifies_that_the_link_has_been_clicked(String string) {

    }
//======================================================================================================







}
