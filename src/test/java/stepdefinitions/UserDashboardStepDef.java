package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.Base;
import pages.UserDashboard;
import pages.VisitorHomePage;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;
import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserDashboardStepDef extends Base {

    // US17 TC01
    @Given("User clicks to the Dashboard Page and and displays Dashboard Page")
    public void user_clicks_to_the_dashboard_page_and_and_displays_dashboard_page() {
        userDashboard.linkHeaderDashboard.click();
        assertTrue(userDashboard.linkHeaderDashboard.isDisplayed());
    }

    @Given("User displays user profile information on the Dashboard page")
    public void user_displays_user_profile_information_on_the_dashboard_page() {
        assertTrue(userDashboard.columnProfileInformation.isDisplayed());

    }

    @Given("User displays user balance information on the Dashboard page")
    public void user_displays_user_balance_information_on_the_dashboard_page() {
        assertTrue(userDashboard.columnTotalBalance.isDisplayed());

    }

    @Given("User displays the user's last transaction information on the Dashboard page")
    public void user_displays_the_user_s_last_transaction_information_on_the_dashboard_page() {
        assertTrue(userDashboard.labelLastTransaction.isDisplayed());

    }

    //US17 TC02
    @Given("User verifies that there is a summary information board specific to the user on the Dashboard page")
    public void user_verifies_that_there_is_a_summary_information_board_specific_to_the_user_on_the_dashboard_page() {
        for (int i = 0; i < 6; i++) {
            userDashboard.labelListSummaryInformationBoard.get(i).isDisplayed();
        }
    }

    @Given("User should verifies the information of the related transactions \\(Purchase History, My Wishlist, Recent Order, Product in Cart) in the body section of the Dashboard page.")
    public void user_should_verifies_the_information_of_the_related_transactions_purchase_history_my_wishlist_recent_order_product_in_cart_in_the_body_section_of_the_dashboard_page() {
        assertTrue(userDashboard.labelPurchaseHistory.isDisplayed());
        assertTrue(userDashboard.labelMyWishList.isDisplayed());
        ReusableMethods.scrollIntoViewJS(userDashboard.labelRecentOrder);
        assertTrue(userDashboard.labelRecentOrder.isDisplayed());
        assertTrue(userDashboard.labelProductInCart.isDisplayed());

    }


    // US18 TC01
    @Given("Go to {string}")
    public void go_to(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Given("Clicks the Login buttonLink on the home page")
    public void clicks_the_login_button_link_on_the_home_page() {
        visitorHomePage.buttonPopUpClose.click();
        visitorHomePage.linkLogin.click();
        ReusableMethods.wait(2);
    }

    @Given("Login by entering valid {string} and {string} on the SignIn page.")
    public void login_by_entering_valid_email_and_password_on_the_sign_in_page(String email, String password) {
        userDashboard.loginUser(ConfigReader.getProperty(email), ConfigReader.getProperty(password));
    }

    @Given("Displays Purchase History banner in Dashboard sideBar")
    public void displays_purchase_history_banner_in_dashboard_side_bar() {
        ReusableMethods.wait(2);
        //actions.sendKeys(Keys.PAGE_DOWN).perform();
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

    @Given("Verify filtering by payment status")
    public void verify_filtering_by_payment_status() {
        ReusableMethods.clickWithJS(userDashboard.dropdownAllHistory);
        ReusableMethods.clickWithJS(userDashboard.dropdownAllHistoryCompleted);
        assertTrue(userDashboard.labelPaidPurchase.isDisplayed());

    }

    @Given("Verify that the hamburger icon and download icon next to purchases are visible and functional")
    public void verify_that_the_hamburger_icon_and_download_icon_next_to_purchases_are_visible_and_functional() {
        userDashboard.verifyIcon();
    }

    @Given("Click on the Download icon to verify that the invoice has been downloaded.")
    public void click_on_the_dowload_icon_to_verify_that_the_invoice_has_been_downloaded() {
        ReusableMethods.wait(2);
        ReusableMethods.clickWithJS(userDashboard.iconDownload);
        ReusableMethods.wait(2);
        String filePath = "C:\\Users\\Elif\\Downloads\\Documents\\20240323000047.pdf";
        assertTrue(Files.exists(Paths.get(filePath)));
    }

    //US18 TC03
    @Given("Click on the icon to view invoice details")
    public void click_on_the_icon_to_view_invoice_details() {
        ReusableMethods.wait(2);
        userDashboard.iconBurgerPurchase.click();
    }

    @Given("Verify that Order code, Package code, Delivery Process, Order Details, Order Summary, Payment Type information is visible in the invoice information.")
    public void verify_that_order_code_package_code_delivery_process_order_details_order_summary_payment_type_information_is_visible_in_the_invoice_information() throws IOException {
        ReusableMethods.wait(2);
        ReusableMethods.clickWithJS(userDashboard.iconBurgerPurchase);
        assertTrue(userDashboard.labelInvoicePageText.getText().contains("Order code"));
        assertTrue(userDashboard.labelInvoicePageText.getText().contains("Package code"));
        assertTrue(userDashboard.labelInvoicePageText.getText().contains("Order Details"));
        assertTrue(userDashboard.labelInvoicePageText.getText().contains("Order Summary"));
        assertTrue(userDashboard.labelInvoicePageText.getText().contains("Delivered"));
        assertTrue(userDashboard.imageCashOnDelivery.isDisplayed());

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
        assertEquals(expectedUrl, actualUrl);
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

    // US29  TC01
    @Given("Displays Logout in the upper right corner of the homepage")
    public void displays_logout_in_the_upper_right_corner_of_the_homepage() {
        ReusableMethods.wait(2);
        assertTrue(userDashboard.buttonLogout.isDisplayed());

    }

    // US29  TC02
    @Given("Clicks Logout link")
    public void clicks_logout_link() {
        userDashboard.buttonLogout.click();

    }

    // US29  TC02
    @Given("Displays Login title")
    public void displays_login_title() {
        assertTrue(userDashboard.buttonLogin.isDisplayed());

    }

    // US29  TC02
    @Given("Logout link is displayed in the Dashboard Sidebar")
    public void logout_link_is_displayed_in_the_dashboard_sidebar() {
        assertTrue(userDashboard.buttonLogout.isDisplayed());
    }
    //==========================US_25=====TC01=======================================
    @Given("User verifies that the Referral menu title is visible and active in Dashboard sideBar")
    public void user_verifies_that_the_referral_menu_title_is_visible_and_active_in_dashboard_side_bar() {
    ReusableMethods.clickWithJS(userDashboard.linkRefferal);
    assertTrue(userDashboard.linkRefferal.isDisplayed());
    }
    @Given("User confirms that the My referral code and User List windows are visible on the Referral page")
    public void user_confirms_that_the_my_referral_code_and_user_list_windows_are_visible_on_the_referral_page() {
        assertTrue(userDashboard.labelMyRefferalCode.isDisplayed());
        assertTrue(userDashboard.labelUserList.isDisplayed());

    }
    @Given("User verifies the duplicability of the user-specific referral code in the My referral code textBox")
    public void user_verifies_the_duplicability_of_the_user_specific_referral_code_in_the_my_referral_code_text_box() {
    userDashboard.copyCodeButton.click();
    assertTrue(userDashboard.copyCodeButton.isDisplayed());
    }

    //==========================US_25=====TC02=======================================
    @Given("User lists \\(SL,User,Date,Status,Discount Amount,Action information) in User List for users coming with referral code on Referral page")
    public void user_lists_sl_user_date_status_discount_amount_action_information_in_user_list_for_users_coming_with_referral_code_on_referral_page() {
    ReusableMethods.wait(5);
        ReusableMethods.clickWithJS(userDashboard.linkRefferal);
        userDashboard.checkListELements(userDashboard.rowUserList ,6);
    }

    @Given("User displays Empty List text if User List is empty.")
    public void user_displays_empty_list_text_if_user_list_is_empty() {
    assertTrue(userDashboard.labelEmptyList.isDisplayed());
    }

//==============================US_26=============================================

    @Given("Login by entering valid {string} and {string} on the SignIn page JS")
    public void login_by_entering_valid_email_and_password_on_the_sign_in_page_JS(String email, String password) {
       ReusableMethods.clickWithJS(userDashboard.labelBoxLogin);
        userDashboard.loginUserWithJS(email,password);
}


    //==============================US_26=============================================
    @Given("I click on the {string} link in the header section.")
    public void i_click_on_the_link_in_the_header_section(String string) {


    }

    @Given("Goes to the Support Ticket page")
    public void goes_to_the_support_ticket_page() throws InterruptedException {
       Thread.sleep(2000);
       actions.sendKeys(Keys.PAGE_DOWN).perform();
       Thread.sleep(2000);
       userDashboard.linkUserSupportTicket.click();
       // ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", userDashboard.linkUserSupportTicket);
       // ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", userDashboard.linkUserSupportTicket);

        //actions.click(userDashboard.linkUserSupportTicket).perform();
      // ReusableMethods.clickWithJS(userDashboard.linkUserSupportTicket);
    }

    @Given("Verify that the {string} menu title is visible in the SideBar.")
    public void verify_that_the_menu_title_is_visible_in_the_side_bar(String element) {
        userDashboard.checkClickElement(userDashboard.linkUserSupportTicket);
    }

    @Given("Verify that the {string} menu title is clickable")
    public void verify_that_the_menu_title_is_clickable(String link) {

    }

    @Given("Verify that when the {string} menu title is clicked, the User is directed to the {string} page.")
    public void verify_that_when_the_menu_title_is_clicked_the_user_is_directed_to_the_page(String link, String link1) {
        ReusableMethods.clickFooterLinkleri(link);
    }

    @Given("Verify that {string} text is visible")
    public void verify_that_text_is_visible(String string) {
        assertTrue(userDashboard.labelAllSubmittedTicket.isDisplayed());
    }

    @Given("Verify that {string} in the list are visible.")
    public void verify_that_in_the_list_are_visible(String string) {
       userDashboard.checkListELements(userDashboard.tableAllSupportList,userDashboard.tableAllSupportList.size());
    }


    @Given("Verify that {string}, {string}, {string}, {string} headers are visible")
    public void verify_that_ticket_id_subject_priority_last_update_headers_are_visible(String name1,String name2,String name3,String name4) {
        userDashboard.checkListELements(userDashboard.rowHeaderTicketSubjectPriority,userDashboard.rowHeaderTicketSubjectPriority.size());
    }

    @Given("Verify that the tickets in the list contain Ticket ID, Subject, Priority, Last Update information.")
    public void verify_that_the_tickets_in_the_list_contain_ticket_id_subject_priority_last_update_information() {
        userDashboard.checkListELements(userDashboard.rowBodyTicketSubjectPriority,userDashboard.rowBodyTicketSubjectPriority.size());
    }

    @Given("Click on the {string} link under the action heading of the selected ticket to open its detail page.")
    public void click_on_the_link_under_the_action_heading_of_the_selected_ticket_to_open_its_detail_page(String string) {
        userDashboard.linkView.click();
    }

    @Given("Verifies that {string} information is displayed on the ticket's detail page")
    public void verifies_that_information_is_displayed_on_the_ticket_s_detail_page(String info) {
        assertTrue(ReusableMethods.supportTicketLinkleri(info).isDisplayed());
    }

    @Given("Verifies that the message information returned by the Admin is displayed.")
    public void verifies_that_the_message_information_returned_by_the_admin_is_displayed() {

    }

    @Given("Verifies that the REPLY button is visible and active under the message boxes")
    public void verifies_that_the_reply_button_is_visible_and_active_under_the_message_boxes() {
          userDashboard.checkElement(userDashboard.buttonReply);
    }

    @Given("When the REPLY button is clicked, it is verified that the {string} text is visible.")
    public void when_the_reply_button_is_clicked_it_is_verified_that_the_text_is_visible(String string) {
          userDashboard.buttonReply.click();

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

//********************US_24/TC_03***********************************

    //======================================================================================================================
    //US21 ---> TC01
    @Given("User clicks on -My Wallet- and displays the My Wallet {string}.")
    public void user_clicks_on_my_wallet_and_displays_the_my_wallet(String url) {
        userDashboard.checkClickElement(userDashboard.linkMyWallet);
        userDashboard.checkUrl(url);
    }

    @Given("User verifies the visibility of information boards.")
    public void user_verifies_the_visibility_of_information_boards() {
        userDashboard.checkListELements(userDashboard.linkListMyWallet, 2);
    }

    //US21 ---> TC02
    @Given("User clicks on -Recharge Wallet- and enters {string}.")
    public void user_clicks_on_recharge_wallet_and_enters(String amount) {
        userDashboard.checkClickElement(userDashboard.linkRechargeWallet);
        ReusableMethods.wait(1);
        userDashboard.checkSendKeysBox(userDashboard.textBoxRechargeAmount , amount);
        userDashboard.checkClickElement(userDashboard.addFundButton);
    }

    @Given("User chooses a payment method.")
    public void user_chooses_a_payment_method() {
        userDashboard.checkClickElement(userDashboard.linkPaymentType);
        ReusableMethods.wait(1);
        Driver.getDriver().switchTo().frame(userDashboard.labelIframe);
        assertTrue(userDashboard.labelPaymentType.isDisplayed());
    }

    @Given("User enters credit card information {string} {string} {string} {string}.")
    public void user_enters_credit_card_informations(String email, String ccNumber, String expDate, String csc) {
        userDashboard.checkSendKeysBox(userDashboard.textBoxEmail, email);
        userDashboard.checkSendKeysBox(userDashboard.textBoxCardNumber, ccNumber);
        userDashboard.checkSendKeysBox(userDashboard.textBoxExpirationDate, expDate);
        userDashboard.checkSendKeysBox(userDashboard.textBoxCsc, csc);
        userDashboard.checkClickElement(userDashboard.payButton);
    }

    @Given("User displays the -Wallet Recharge History- table.")
    public void user_displays_the_wallet_recharge_history_table() {
        userDashboard.checkListELements(userDashboard.rowListWalletHistory, 6);
    }

    @Given("User verifies the {string}.")
    public void user_verifies_the(String amount) {
        assertEquals(ConfigReader.getProperty(amount), userDashboard.labelFirstAmount.getText());
    }

    //US30 ---> TC01
    @Given("User clicks on -My Wishlist- and displays {string} the My Wishlist page.")
    public void user_clicks_on_my_wishlist_and_displays_the_my_wishlist_page(String url) {
        userDashboard.checkClickElement(userDashboard.linkMyWishlist);
        userDashboard.checkUrl(url);
    }

    @Given("User verifies the visibility of products.")
    public void user_verifies_the_visibility_of_products() {
        assertTrue(userDashboard.labelResults.isDisplayed());
    }

    @Given("User clicks on -Add To Cart icon- and adds an item.")
    public void user_clicks_on_add_to_cart_icon_and_adds_an_item() {
        userDashboard.checkClickElement(userDashboard.iconAddToCart);
    }

    @Given("User verifies the visibility of Success Alert.")
    public void user_verifies_the_visibility_of_success_alert() {
        ReusableMethods.wait(1);
        assertTrue(userDashboard.labelItemAddedConfirmation.isDisplayed());
    }

    //US30 ---> TC02
    @Given("User clicks on -Delete icon- and deletes an item.")
    public void user_clicks_on_delete_icon_and_deletes_an_item() {
        ReusableMethods.hover(userDashboard.iconDelete);
        ReusableMethods.wait(1);
        userDashboard.checkClickElement(userDashboard.iconDelete);
        ReusableMethods.wait(1);
        assertTrue(userDashboard.labelDeleteWishlist.isDisplayed());
        userDashboard.checkClickElement(userDashboard.deleteButton);
    }

    //US30 ---> TC03
    @Given("User clicks on -Compare icon- for the first and second item.")
    public void user_clicks_on_compare_icon_for_the_first_and_second_item() {
        ReusableMethods.hover(userDashboard.iconCompare);
        ReusableMethods.wait(1);
        userDashboard.checkClickElement(userDashboard.iconCompare);
        ReusableMethods.hover(userDashboard.iconCompare2);
        ReusableMethods.wait(1);
        userDashboard.checkClickElement(userDashboard.iconCompare2);
    }

    @Given("User clicks on -Compare- and displays {string} the Compare page.")
    public void user_clicks_on_compare_and_displays_the_compare_page(String url) {
        userDashboard.checkClickElement(userDashboard.linkCompare);
        userDashboard.checkUrl(url);
    }

    @Given("User verifies the comparison of those items.")
    public void user_verifies_the_comparison_of_those_items() {
        assertTrue(userDashboard.labelCompareList.isDisplayed());
    }

    //US30 ---> TC04
    @Given("User clicks on -Quick View icon- and displays the details of the product.")
    public void user_clicks_on_quick_view_icon_and_displays_the_details_of_the_product() {
        ReusableMethods.hover(userDashboard.iconQuickView);
        ReusableMethods.wait(1);
        userDashboard.checkClickElement(userDashboard.iconQuickView);
    }

    @Given("User verifies the visibility of details of the product.")
    public void user_verifies_the_visibility_of_details_of_the_product() {
        ReusableMethods.wait(1);
        assertTrue(userDashboard.labelQuickViewPage.isDisplayed());
    }

    //US30 ---> TC05
    @Given("User clicks on -number of products dropdown menu- and chooses an option {string}.")
    public void user_clicks_on_number_of_products_dropdown_menu_and_chooses_an_option(String string) {
        Select select = new Select(userDashboard.dropDownShowItems);
        select.selectByValue(ConfigReader.getProperty(string));
    }

    @Given("User confirms that only the amount {string} of the filtered number of products is visible.")
    public void user_confirms_that_only_the_amount_of_the_filtered_number_of_products_is_visible(String string) {
        Select select = new Select(userDashboard.dropDownSortBy);
        select.selectByValue(ConfigReader.getProperty(string));
    }


    @Given("Click the {string} tab.")
    public void click_the_tab(String string) {

    }

    @Given("{string} TextBox contains the current password, {string} and {string} TextBoxes contain the current password.enter the new password and click the Updatenow button..")
    public void text_box_contains_the_current_password_and_text_boxes_contain_the_current_password_enter_the_new_password_and_click_the_updatenow_button(String string, String string2, String string3) {

    }

    @Given("{string} TextBox enter the invalid password.{string} and \"Re-enter New Password\"Enter the new password in the TextBoxes. And Updatenow Click button.")
    public void text_box_enter_the_invalid_password_and_re_enter_new_password_enter_the_new_password_in_the_text_boxes_and_updatenow_click_button(String string, String string2) {

    }

    @Given("{string} message appears")
    public void message_appears(String string) {

    }

    @Given("Enter the updated password in the {string} TextBox.  {string} and {string} Enter different passwords in the TextBoxes. And Updatenow Click on the button.")
    public void enter_the_updated_password_in_the_text_box_and_enter_different_passwords_in_the_text_boxes_and_updatenow_click_on_the_button(String string, String string2, String string3) {

    }

    @Given("{string} message appears Verify")
    public void message_appears_verify(String string) {

    }

    @Given("The updated password in the {string} TextBox,{string} and {string} Enter the old password in the TextBoxes and update it.")
    public void the_updated_password_in_the_text_box_and_enter_the_old_password_in_the_text_boxes_and_update_it(String string, String string2, String string3) {

    }

    //***************************US_24/TC_04************************************

    @Given("Click the Address tab.")
    public void click_the_address_tab() {

    }

    @Given("{string}, {string}, {string},{string}, {string} information Verify that it matches the user's information.")
    public void information_verify_that_it_matches_the_user_s_information(String string, String string2, String string3, String string4, String string5) {

    }

    @Given("Edit icon and delete icon is displayed and active verify.")
    public void edit_icon_and_delete_icon_is_displayed_and_active_verify() {

    }

    @Given("Make sure the new address registration button is visible and active.verify that")
    public void make_sure_the_new_address_registration_button_is_visible_and_active_verify_that() {

    }

    @Given("In a new address registration window {string} and {string} Verify type is clickable")
    public void in_a_new_address_registration_window_and_verify_type_is_clickable(String string, String string2) {

    }

    @Given("Verify that the \"Name,email Address,Phone Number,fields are visible and information has been entered.")
    public void verify_that_the_name_email_address_phone_number_fields_are_visible_and_information_has_been_entered() {

    }

    @Given("Press the {string} button.")
    public void press_the_button(String string) {

    }


    // US29  TC02
    @Given("Clicks Logout link on Dashboard Side Bar")
    public void clicks_logout_link_on_dashboard_side_bar() {
        userDashboard.buttonLogOutSideBar.click();

    }

    // US29  TC02
    @Given("Displays Login in the upper right corner of the homepage")
    public void displays_login_in_the_upper_right_corner_of_the_homepage() {
        assertTrue(userDashboard.buttonLogin.isDisplayed());
    }


    // US22 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><nazime
    //TC01
    @Given("Dashboard side bar displays My Coupons Menu Title")
    public void dashboard_side_bar_displays_my_coupons_menu_title() {
        ReusableMethods.wait(3);
        actions.moveToElement(userDashboard.linkMyCoupons).perform();
        assertTrue(userDashboard.linkMyCoupons.isDisplayed());

    }

    @Given("clicks on title to verify title's activation")
    public void clicks_on_title_to_verify_title_s_activation() {
       assertTrue(userDashboard.linkMyCoupons.isEnabled());
    }
    // TC02

    @Given("Click the MyCoupons menu Title")
    public void click_the_my_coupons_menu_title() {
        ReusableMethods.waitAndClick(userDashboard.linkMyCoupons);
    }

    @Given("displays the add coupon button on the page")
    public void displays_the_add_coupon_button_on_the_page() {
        ReusableMethods.wait(3);
        assertTrue(userDashboard.searchBoxAddCoupon.isDisplayed());
    }

    //TC03
    @Given("a new coupon is added in the add coupon section")
    public void a_new_coupon_is_added_in_the_add_coupon_section() {


    }

    //TC04
        @Given("Displays the user's previously collected coupons listed as Collected Coupons list")
        public void displays_the_user_s_previously_collected_coupons_listed_as_collected_coupons_list() {



    }
    //TC05
    @Given("Click on the copy icon to copy the coupon from the Collected Coupons list")
    public void click_on_the_copy_icon_to_copy_the_coupon_from_the_collected_coupons_list() {

    }

    @Given("Click the delete icon to delete the coupon in the Collected Coupons list")
    public void click_the_delete_icon_to_delete_the_coupon_in_the_collected_coupons_list() {

    }

    // US23 ---- TC03
    @Given("The user closes the pop-up window")
    public void the_user_closes_the_pop_up_window() {
        visitorHomePage.buttonPopUpClose.click();
    }
    @Given("It is checked if the Refund % Dispute link on the sidebar is displayed and enabled")
    public void it_is_checked_if_the_refund_dispute_link_on_the_sidebar_is_displayed_and_enabled() {
       ReusableMethods.hover(userDashboard.linkRefundDispute);

        Assert.assertTrue(userDashboard.linkRefundDispute.isDisplayed());
        Assert.assertTrue(userDashboard.linkRefundDispute.isEnabled());

    }
    @Given("The user clicks on the Refund & Dispute link on the sidebar")
    public void the_user_clicks_on_the_refund_dispute_link_on_the_sidebar() {
        ReusableMethods.wait(10);
        userDashboard.linkRefundDispute.click();
    }
    @Given("It is checked if the shown page is Refund and Dispute page")
    public void it_is_checked_if_the_shown_page_is_refund_and_dispute_page() {
        ReusableMethods.wait(3);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.buysellcycle.com/refund/my-refund-list";
        assertEquals(expectedUrl,actualUrl);
    }
    //a[@class='']
    // US23 ---- TC04
    @Given("The user should be able to see the Refund list")
    public void the_user_should_be_able_to_see_the_refund_list() {
        Assert.assertTrue(userDashboard.tableRefundList.isDisplayed());
    }
    @Given("The user should be able to see the Order ID, Order Date, Status, Request Sent Date and Order Amount details")
    public void the_user_should_be_able_to_see_the_order_id_order_date_status_request_sent_date_and_order_amount_details() {
        for (int i = 0; i <5 ; i++) {
            Assert.assertTrue(userDashboard.labelRefundDetails.get(i).isDisplayed());
        }
    }
    @Given("When clicked on the View Details button, further details about the refund should be displayed")
    public void when_clicked_on_the_view_details_button_further_details_about_the_refund_should_be_displayed() {
        userDashboard.buttonRefundViewDetails.click();

        String actualUrl = Driver.getDriver().getCurrentUrl();
        String istenenIcerik = "my-refund-details";
        Assert.assertTrue(actualUrl.contains(istenenIcerik));
    }
    @Given("It is checked if at least one status is active on the details page")
    public void it_is_checked_if_at_least_one_status_is_active_on_the_details_page() {
        Assert.assertTrue(userDashboard.LogoRefundstart.isDisplayed());
    }
    @Given("It is checked if the status text's are shown on the details page")
    public void it_is_checked_if_the_status_text_s_are_shown_on_the_details_page() {
        for (int i = 0; i <3 ; i++) {
            Assert.assertTrue(userDashboard.textboxesRefund.get(i).isDisplayed());
        }
    }
    @Given("It is checked if the pick up info is being displayed on the details page")
    public void it_is_checked_if_the_pick_up_info_is_being_displayed_on_the_details_page() {
        Assert.assertTrue(userDashboard.tableRefundPickUpInfo.isDisplayed());
    }

   }


