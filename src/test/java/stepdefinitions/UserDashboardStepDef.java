package stepdefinitions;

import io.cucumber.java.en.Given;
import org.checkerframework.checker.units.qual.C;
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

import static org.junit.Assert.*;

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

    // ---> kevser_US20_TC01
    @Given("Clicks My Order link in the User Dashboard panel")
    public void clicks_link_in_the_user_dashboard_panel() {
        ReusableMethods.wait(4);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.clickWithJS(userDashboard.linkMyOrder);
    }
    @Given("Verify that expected page is opened")
    public void verify_that_expected_page_is_opened() {
        ReusableMethods.wait(2);
        String expectedUrl = "https://qa.buysellcycle.com/my-purchase-orders";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }

    // ---> kevser_US20_TC02
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
    @Given("click to Subscribe")
    public void click_to_subscribe() {
        userDashboard.closeSubscribe.click();
    }

    // ---> kevser_US20_TC03
    @Given("Clicks Cancel Order button")
    public void clicks_cancel_order_button() {
        userDashboard.cancelOrderButton.click();
    }
    @Given("Clicks Personal issue dropdown menu")
    public void clicks_personal_issue_dropdown_menu() {
        userDashboard.dropDownReason.click();
    }
    @Given("Choose the preference")
    public void choose_the_preference() {
        ReusableMethods.wait(2);
        userDashboard.highPrice.click();
    }
    @Given("Clicks Send button")
    public void clicks_send_button() {
        ReusableMethods.wait(2);
        userDashboard.sendCancelOrderButton.click();
    }
    @Given("Verify that the Order is Cancelled")
    public void verify_that_the_order_is_cancelled() {
        ReusableMethods.wait(2);
        userDashboard.orderDetailsButton.click();
        Assert.assertTrue(userDashboard.orderCancelledText.isDisplayed());
    }
    // ---> kevser_US20_TC04
    @Given("Verify that Pending, Processing, Shipped, Received, Delivered status information is visible")
    public void verify_that_pending_processing_shipped_received_delivered_status_information_is_visible() {
        assertTrue(userDashboard.labelPending.isDisplayed());
        assertTrue(userDashboard.labelProcessing.isDisplayed());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(2);
        //assertTrue(userDashboard.labelShipped.isDisplayed());
        assertTrue(userDashboard.labelReceived.isDisplayed());
        assertTrue(userDashboard.labelDelivered.isDisplayed());
    }
    @Given("Verify that Package, Sold By, Price, Shipping Info,Billing Info, Payment Info details are visible")
    public void verify_that_package_sold_by_price_shipping_info_billing_info_payment_info_details_are_visible() {

        actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.wait(2);
        assertTrue(userDashboard.labelPackage.isDisplayed());
        assertTrue(userDashboard.labelSoldBy.isDisplayed());
        assertTrue(userDashboard.labelPrice.isDisplayed());
        assertTrue(userDashboard.labelShippingInfo.isDisplayed());
        assertTrue(userDashboard.labelBillingPaymentInfo.isDisplayed());
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


    @Given("Goes to the Support Ticket page")
    public void goes_to_the_support_ticket_page() throws InterruptedException {
       Thread.sleep(2000);
       actions.sendKeys(Keys.PAGE_DOWN).perform();
       Thread.sleep(2000);
       userDashboard.linkUserSupportTicket.click();
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
       userDashboard.checkListELements(userDashboard.tableAllSupportList,3);
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
        ReusableMethods.wait(2);
        actions.moveToElement(userDashboard.linkCategoryInfo).perform();
        ReusableMethods.wait(2);
        assertTrue(userDashboard.linkStatusInfo.isDisplayed());
        assertTrue(userDashboard.linkStatusInfo.isEnabled());
        assert(userDashboard.linkStatusInfo.isEnabled());
        //userDashboard.linkStatusInfo.click();
    }

    @Given("Verifies that the message information returned by the Admin is displayed.")
    public void verifies_that_the_message_information_returned_by_the_admin_is_displayed() {
          ReusableMethods.wait(3);
          actions.moveToElement(userDashboard.buttonReply).perform();
           for (int i=1 ; i<=userDashboard.textTicketNames.size()-1;i++){
               if(userDashboard.textTicketNames.get(0)!=userDashboard.textTicketNames.get(i)){
                  assertTrue(userDashboard.textTicketInfo.get(i).isDisplayed());
               }
           }
    }

    @Given("Verifies that the REPLY button is visible and active under the message boxes")
    public void verifies_that_the_reply_button_is_visible_and_active_under_the_message_boxes() {
        ReusableMethods.wait(3);
        actions.moveToElement(userDashboard.buttonReply).perform();
        userDashboard.checkElement(userDashboard.buttonReply);
    }

    @Given("When the REPLY button is clicked, it is verified that the {string} text is visible.")
    public void when_the_reply_button_is_clicked_it_is_verified_that_the_text_is_visible(String string) {
        ReusableMethods.wait(2);
        actions.moveToElement(userDashboard.buttonReply).click().perform();
          userDashboard.checkElement(userDashboard.textboxDescription);
    }

    @Given("Verifies that the required information can be entered in the textbox opened under the Description text.")
    public void verifies_that_the_required_information_can_be_entered_in_the_textbox_opened_under_the_description_text() {
        userDashboard.textboxDescription.sendKeys("Merhaba....");
    }

    @Given("Verifies that the {string} button is displayed and active.")
    public void verifies_that_the_button_is_displayed_and_active(String info) {
        ReusableMethods.wait(2);
      // ReusableMethods.clickWithJS(ReusableMethods.supportTicketLinkleri(info));
       userDashboard.checkClickElement(ReusableMethods.supportTicketLinkleri(info));

    }
    @Given("Verifies that the CREATE NOW button is displayed and active.")
    public void verifies_that_the_button_is_displayed_and_active() {
        ReusableMethods.wait(2);
        ReusableMethods.clickWithJS(userDashboard.buttonCreateNow);


    }

    @Given("When he clicks on the REPLY NOW button, he confirms that the information he sent is also displayed on his own page.")
    public void when_he_clicks_on_the_reply_now_button_he_confirms_that_the_information_he_sent_is_also_displayed_on_his_own_page() {
        ReusableMethods.wait(2);
        actions.click(userDashboard.buttonReply).perform();
        ReusableMethods.wait(4);
        actions.moveToElement(userDashboard.textTicketNames.get(userDashboard.textTicketNames.size()-1));
        assertTrue(userDashboard.textTicketNames.get(userDashboard.textTicketNames.size()-1).getText().contains(ConfigReader.getProperty("customerZehraName")));

    }

    @Given("When All Ticket DDM is clicked on the page that opens, it verifies that the All Ticket, {string}, On Going, Completed, Closed links are visible.")
    public void when_all_ticket_ddm_is_clicked_on_the_page_that_opens_it_verifies_that_the_all_ticket_pending_on_going_completed_closed_links_are_visible(String info) {
        ReusableMethods.wait(3);
        userDashboard.dropDownAllTicketPlaceholder.click();
        assertTrue(userDashboard.dropDownAllTicketList.isDisplayed());

    }

    @Given("When the {string} link is clicked, it confirms that the ticket with {string} status is listed.")
    public void when_the_link_is_clicked_it_confirms_that_the_ticket_with_status_is_listed(String info, String string2) {
        userDashboard.dropDownAllTicket.click();
        ReusableMethods.wait(3);
        userDashboard.linkView.click();
        ReusableMethods.wait(3);
        assertTrue(userDashboard.linkStatusInfo.getText().contains(info));
    }

    @Given("When the {string} link is clicked, it verifies that the ticket with {string} status is listed.")
    public void when_the_link_is_clicked_it_verifies_that_the_ticket_with_status_is_listed(String string, String string2) {

    }

    @Given("When you click on the ADD NEW button, it is confirmed that you go to the {string} page.")
    public void when_you_click_on_the_add_new_button_it_is_confirmed_that_you_go_to_the_page(String string) {
        // userDashboard.buttonAddNewSTicket.click();
         userDashboard.checkUrl("creatSupportTiketUrl");

    }

    @Given("It is verified that the Subject, Category, Priority and Description headings are visible.")
    public void it_is_verified_that_the_subject_category_priority_and_description_headings_are_visible() {
         userDashboard.checkListELements(userDashboard.labelNewTicketTitle,4);
    }

    @Given("It is verified that the textboxes under the Subject and Description headings are visible and active.")
    public void it_is_verified_that_the_textboxes_under_the_subject_and_description_headings_are_visible_and_active() {
       userDashboard.textboxDescription.isDisplayed();
       userDashboard.textboxSubject.isDisplayed();
    }

    @Given("Verify that the holders are visible")
    public void verify_that_the_holders_are_visible() {
       assertTrue(userDashboard.textboxSubject.isEnabled());
       assertTrue(userDashboard.textboxDescription.isEnabled());

    }

    @Given("It is verified that the DDM menu is visible and active under the Category and Priority headings.")
    public void it_is_verified_that_the_ddm_menu_is_visible_and_active_under_the_category_and_priority_headings() {
        userDashboard.checkElement(userDashboard.dropDownCategory);
        userDashboard.checkElement(userDashboard.dropDownPriority);
    }

    @Given("Necessary information is entered in the Subject and Description text boxes.")
    public void necessary_information_is_entered_in_the_subject_and_description_text_boxes() {
        ReusableMethods.wait(2);
        userDashboard.textboxSubject.click();
        userDashboard.textboxSubject.sendKeys("merhaba");
        userDashboard.textboxDescription.click();
        userDashboard.textboxDescription.sendKeys("sıkıntı var");
    }

    @Given("Click on the necessary links for Category and Priority DDM.")
    public void click_on_the_necessary_links_for_category_and_priority_ddm() {
          ReusableMethods.wait(2);
          userDashboard.dropDownCategory.click();
          userDashboard.dropDownCategoryOtions.click();
          ReusableMethods.wait(2);
          userDashboard.dropDownPriority.click();
          userDashboard.dropDownPriorityOtions.click();
    }

    @Given("When you click on the {string} button, it is confirmed that you are directed to the All Submitted Ticket page and the entered ticket is seen at the bottom.")
    public void when_you_click_on_the_button_it_is_confirmed_that_you_are_directed_to_the_all_submitted_ticket_page_and_the_entered_ticket_is_seen_at_the_bottom(String info) {
       ReusableMethods.wait(2);
        //actions.click(userDashboard.buttonCreateNow).perform();
        assertTrue(userDashboard.labelAllSubmittedTicket.isDisplayed());
    }

    @Given("Clicks the ADD NEW button")
    public void clicks_the_add_new_button() {
           ReusableMethods.wait(2);
           userDashboard.buttonAddNewSTicket.click();
    }

    @Given("It is confirmed that a {string} warning is given when the Subject and Description textboxes are left blank.")
    public void it_is_confirmed_that_a_warning_is_given_when_the_subject_and_description_textboxes_are_left_blank(String string) {
           ReusableMethods.wait(1);
        userDashboard.dropDownCategory.click();
        userDashboard.dropDownCategoryOtions.click();
        ReusableMethods.wait(2);
        userDashboard.dropDownPriority.click();
        userDashboard.dropDownPriorityOtions.click();
        ReusableMethods.clickWithJS(userDashboard.buttonCreateNow);
        actions.moveToElement(userDashboard.labelWarningMessage).perform();
        assertEquals("The subject field is required.",userDashboard.labelWarningMessage.getText());
    }

    @Given("It is verified that when the necessary links are not clicked due to Category and Priority DDM, a {string} warning is given.")
    public void it_is_verified_that_when_the_necessary_links_are_not_clicked_due_to_category_and_priority_ddm_a_warning_is_given(String string) {
        ReusableMethods.wait(2);
        userDashboard.textboxSubject.click();
        userDashboard.textboxSubject.sendKeys("Sepetim görünmüyor");
        userDashboard.textboxDescription.click();
        userDashboard.textboxDescription.sendKeys("sıkıntı var");
        ReusableMethods.clickWithJS(userDashboard.buttonCreateNow);
        assertEquals("The category id field is required.",userDashboard.labelWarningMessage2.getText());

    }





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

//***********************************US_24/TC03*************************************
    @Given("Click the Change Password tab.")
    public void click_the_change_password_tab() {

    }
    @Given("{string} TextBox contains the current password, {string} and {string} TextBoxes contain the current password.enter the new password and click the Updatenow button..")
    public void text_box_contains_the_current_password_and_text_boxes_contain_the_current_password_enter_the_new_password_and_click_the_updatenow_button(String string, String string2, String string3) {

    }
    @Given("{string} TextBox enter the invalid password. {string} and {string} Enter the new password in the TextBoxes. And Updatenow Click button.")
    public void text_box_enter_the_invalid_password_and_enter_the_new_password_in_the_text_boxes_and_updatenow_click_button(String string, String string2, String string3) {

    }
    @Given("The current password is not match with Verify that the old password. message appears")
    public void the_current_password_is_not_match_with_verify_that_the_old_password_message_appears() {

    }
    @Given("Enter the updated password in the {string} TextBox. {string} and {string} Enter different passwords in the TextBoxes. And Updatenow Click on the button.")
    public void enter_the_updated_password_in_the_text_box_and_enter_different_passwords_in_the_text_boxes_and_updatenow_click_on_the_button(String string, String string2, String string3) {

    }
    @Given("The new password confirmation and new password must match. message appears Verify")
    public void the_new_password_confirmation_and_new_password_must_match_message_appears_verify() {

    }
    @Given("The updated password in the {string} TextBox,{string} and {string} Enter the old password in the TextBoxes and update it.")
    public void the_updated_password_in_the_text_box_and_enter_the_old_password_in_the_text_boxes_and_update_it(String string, String string2, String string3) {

    }

    //***************************US_24/TC_04************************************

    @Given("Click the Address tab.")
    public void click_the_address_tab() {

    }
    @Given("Full Name, Address, Region,E-mail, Phone Number information Verify that it matches the user's information.")
    public void full_name_address_region_e_mail_phone_number_information_verify_that_it_matches_the_user_s_information() {

    }

    @Given("Edit icon and delete icon is displayed and active verify.")
    public void edit_icon_and_delete_icon_is_displayed_and_active_verify() {

    }

    @Given("Make sure the new address registration button is visible and active.verify that")
    public void make_sure_the_new_address_registration_button_is_visible_and_active_verify_that() {

    }

    @Given("In a new address registration window Shipping Address and Billing address Verify type is clickable")
    public void in_a_new_address_registration_window_shipping_address_and_billing_address_verify_type_is_clickable() {

    }

    @Given("Verify that the Name,email Address,Phone Number,fields are visible and information has been entered.")
    public void verify_that_the_name_email_address_phone_number_fields_are_visible_and_information_has_been_entered() {

    }

    @Given("Press the create button.")
    public void press_the_create_button() {

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
        userDashboard.searchBoxAddCoupon.click();



    }

    //TC04
        @Given("Displays the user's previously collected coupons listed as Collected Coupons list")
        public void displays_the_user_s_previously_collected_coupons_listed_as_collected_coupons_list() {





    }
    //TC05
    @Given("Click on the copy icon to copy the coupon from the Collected Coupons list")
    public void click_on_the_copy_icon_to_copy_the_coupon_from_the_collected_coupons_list() {
        userDashboard.iconCopy.click();


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


    //=====================US 32=============================

    @Given("I click on the CART link in the header section.")
    public void i_click_on_the_cart_link_in_the_header_section() {
       userDashboard.linkCart.click();
    }
    @Given("Verifies that the {string} button is visible and active on the right side under the specified products")
    public void verifies_that_the_button_is_visible_and_active_on_the_right_side_under_the_specified_products(String string) {
        userDashboard.checkElement(userDashboard.buttonProceedTOCheckout);
    }

    @Given("Click on the {string} button on the right side under the specified products")
    public void click_on_the_button_on_the_right_side_under_the_specified_products(String string) {
        userDashboard.buttonProceedTOCheckout.click();
    }
    @Given("Verifies that QUANTITY and PRICE titles are visible on the opened page")
    public void verifies_that_quantity_and_price_titles_are_visible_on_the_opened_page() {
        userDashboard.checkElement(userDashboard.labelPrice1);
        userDashboard.checkElement(userDashboard.labelQuantity);
    }
    @Given("Verifies that the number and price of the products are visible under these headings.")
    public void verifies_that_the_number_and_price_of_the_products_are_visible_under_these_headings() {
         userDashboard.checkElement(userDashboard.tablePriceTOCheckout);
         userDashboard.checkElement(userDashboard.tableQuantityTOCheckout);
    }


    @Given("Verify that the total price is visible under the ORDER SUMMARY section on the right side of the page that opens.")
    public void verify_that_the_total_price_is_visible_under_the_order_summary_section_on_the_right_side_of_the_page_that_opens() {
         userDashboard.checkElement(userDashboard.textTotalPrice);
    }

    @Given("Belirlenen ürünlerin altında sağ tarafta {string} butonuna tıklar")
    public void belirlenen_ürünlerin_altında_sağ_tarafta_butonuna_tıklar(String string) {
        userDashboard.buttonProceedTOCheckout.click();
    }
    @Given("Açılan sayfada Contact Informatiın başlığının görünür olduğunu doğrular")
    public void açılan_sayfada_contact_informatiın_başlığının_görünür_olduğunu_doğrular() {
        assertTrue(userDashboard.labelContactInformation.isDisplayed());
    }
    @Given("Shipping Address başlığı altında Name, Adress, Email,Phone;Postal Code Bilgilerinin görüldüğünü doğrular")
    public void shipping_address_başlığı_altında_name_adress_email_phone_postal_code_bilgilerinin_görüldüğünü_doğrular() {
        assertTrue(userDashboard.labelAddressBasligi.isDisplayed());
    }


    @Given("Verifies that the Note text is visible under the Address information under the Contact Information heading.")
    public void verifies_that_the_note_text_is_visible_under_the_address_information_under_the_contact_information_heading() {

    }
    @Given("Verifies that the Textbox below the Note text is visible and active")
    public void verifies_that_the_textbox_below_the_note_text_is_visible_and_active() {

    }
    @Given("Verifies that the placeholder inside the textbox is visible")
    public void verifies_that_the_placeholder_inside_the_textbox_is_visible() {

    }
    @Given("Verifies that information can be entered into the textbox")
    public void verifies_that_information_can_be_entered_into_the_textbox() {

    }


    @Given("Verifies that the {string} under the Contact Information heading is clickable")
    public void verifies_that_the_under_the_contact_information_heading_is_clickable(String string) {

    }
    @Given("Verifies that the {string} warning appears when the CONTINUE TO SHOPING button is clicked without clicking the checkbox")
    public void verifies_that_the_warning_appears_when_the_continue_to_shoping_button_is_clicked_without_clicking_the_checkbox(String string) {

    }


    @Given("On the page that opens, the Continue To Shipping and Return To Cart buttons appear under the Shipping Address section and it is verified that they are active.")
    public void on_the_page_that_opens_the_continue_to_shipping_and_return_to_cart_buttons_appear_under_the_shipping_address_section_and_it_is_verified_that_they_are_active() {

    }


    //****************US24/TC01*****************************************


    @Given("In SideBar, the menu item My Account appears.")
    public void in_side_bar_the_menu_item_my_account_appears() {
        userDashboard.linkHeaderMyAccount.isDisplayed();
    }
    @Given("Go to the My Account page.")
    public void go_to_the_my_account_page() {
        ReusableMethods.clickWithJS(userDashboard.linkHeaderMyAccount);
    }
    @Given("Upload a new profile picture by clicking on the Browse button and verify that it has been uploaded.")
    public void upload_a_new_profile_picture_by_clicking_on_the_browse_button_and_verify_that_it_has_been_uploaded() {

    }
    //*************************US24/TC02*******************************************
    @Given("Go to the Basic Info tab.")
    public void go_to_the_basic_info_tab() {

    }
    @Given("Verify that the TextBoxes on the Basic Info tab are visible.")
    public void verify_that_the_text_boxes_on_the_basic_info_tab_are_visible() {

    }
    @Given("Verify that First Name,Email Address are displayed correctly.")
    public void verify_that_first_name_email_address_are_displayed_correctly() {

    }
    @Given("Verify that the last name textbox is empty")
    public void verify_that_the_last_name_textbox_is_empty() {

    }
    @Given("Profile by entering new information in TextBoxes update , save their information.")
    public void profile_by_entering_new_information_in_text_boxes_update_save_their_information() {
    }
    //US27 TC01
    @Given("Verify that the Follow banner is visible in the Dashboard sideBar")
    public void verify_that_the_follow_banner_is_visible_in_the_dashboard_side_bar() {

    }
    @Given("Click on the Follow menu")
    public void click_on_the_follow_menu() {

    }
    @Given("Verify that it redirects to the Follow page")
    public void verify_that_it_redirects_to_the_follow_page() {

    }

    //US27 TC02
    @Given("Verify that the SL,Name,Total Product,Total Followers,Action headers are displayed")
    public void verify_that_the_sl_name_total_product_total_followers_action_headers_are_displayed() {

    }
    @Given("Test that the unfollow button is visible and clickable")
    public void test_that_the_unfollow_button_is_visible_and_clickable() {

    }
    //***********US19 My WishList*****************
    @Given("Click on the My Wishlist on the sidebar")
    public void click_on_the_my_wishlist_on_the_sidebar() {
      userDashboard.linkWishList_sidebar.click();
    }
    @Given("Verify that the url is {string}")
    public void verify_that_the_url_is(String url) {
      assertEquals(url,Driver.getDriver().getCurrentUrl());
    }
    @Given("Click the New dropdown and click Price\\(Low to Height)")
    public void click_the_new_dropdown_and_click_price_low_to_height() {
       userDashboard.dropDownNewWishList.click();
       userDashboard.dropDownPriceLowToHighWishList.click();
    }
    @Given("Compare second and third price")
    public void compare_second_and_third_price() {
        double secondProductPrice = Double.parseDouble(userDashboard.textPriceSecondProductWishList.toString());
        double thirdProductPrice = Double.parseDouble(userDashboard.textPriceThirdProductWishList.toString());
        assertTrue("The price of the second product should be lower than the price of the third product.", secondProductPrice < thirdProductPrice);
    }

    @Given("Click on the chart icon of the first product on the Wishlist")
    public void click_on_the_chart_icon_of_the_first_product_on_the_wishlist() {
        ReusableMethods.scrollWithPixelsJS(0,400);
        ReusableMethods.wait(1);
        userDashboard.iconCart_Wishlist.click();
    }

    @Given("verify that  the modal appears on Wishlist")
    public void verify_that_the_message_item_added_to_your_cart_on_the_modal_on_wishlist() {
        ReusableMethods.wait(1);
        assertTrue(userDashboard.buttonAddToChartModalWishlist.isDisplayed());
    }
    @Given("Close the modal window that opened on Wishlist")
    public void close_the_modal_window_that_opened_on_wishlist() {
      userDashboard.buttonCloseModalWishlist.click();
    }
    @Given("Click on the compare icon of the first product on the Wishlist")
    public void click_on_the_compare_icon_of_the_first_product_on_the_wishlist() {
        ReusableMethods.scrollWithPixelsJS(0,-400);
        ReusableMethods.wait(1);
        ReusableMethods.hover(userDashboard.imageProductFirstWishlist);
        userDashboard.iconCompareWishlist.click();
    }

    @Given("Click on the quick view icon")
    public void click_on_the_quick_view_icon() {
        ReusableMethods.hover(userDashboard.imageProductFirstWishlist);
        userDashboard.iconQuickViewWishlist.click();
    }

    @Given("click on the delete icon and click delete on the confirmation modal")
    public void click_on_the_delete_icon_and_click_delete_on_the_confirmation_modal() {
        ReusableMethods.hover(userDashboard.imageProductFirstWishlist);
        userDashboard.iconDeleteWishlist.click();
        ReusableMethods.wait(1);
        userDashboard.buttonDeleteModalWishlist.click();
    }

    @Given("verify that successful message appears")
    public void verify_that_successful_message_appears() {
        assertTrue(userDashboard.popUpWishlist.isDisplayed());
    }

    //*******US28__Notifications Sidebar********************
    @Given("Click on the Notification on the sidebar")
    public void click_on_the_notification_on_the_sidebar() {
       ReusableMethods.scrollWithPixelsJS(0,400);
       ReusableMethods.wait(1);
       userDashboard.linkNotifications.click();
    }
    @Given("Verify that Notification title is visible")
    public void verify_that_notification_title_is_visible() {
        assertTrue(userDashboard.labelTitleNotifications.isDisplayed());
    }
    @Given("Verify that displays Title and Date information of incoming notifications")
    public void verify_that_displays_title_and_date_information_of_incoming_notifications() {
      assertTrue(userDashboard.labelTitleOrderNotificationFirst.isDisplayed());
      assertTrue(userDashboard.labelDateOrderNotificationFirst.isDisplayed());
    }
    @Given("Clicks view on the notification and  verify that  the relevant page opens")
    public void clicks_view_on_the_notification_and_verify_that_the_relevant_page_opens() {
       userDashboard.buttonViewOrderNotificationFirst.click();
       assertTrue(userDashboard.labelOrderIDNotification.isDisplayed());
    }
    @Given("Click Setting button on the Notifications and displays the Setting list displays by title <<Notifications Setting>>")
    public void click_setting_button_on_the_notifications_and_displays_the_setting_list_displays_by_title_notifications_setting() {
        userDashboard.buttonSettingNotification.click();
        assertTrue(userDashboard.labelNotificationSetting.isDisplayed());
    }
    @Given("Updates the Types of Events in the Setting list and verify that the successful message appears")
    public void updates_the_types_of_events_in_the_setting_list_and_verify_that_the_successful_message_appears() {
      userDashboard.checkboxNotificationSetting.click();
      ReusableMethods.wait(2);
      assertTrue(userDashboard.labelChangeSystemMessage.isDisplayed());
      //assertTrue(userDashboard.checkboxNotificationSetting.isSelected());
    }


}



