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
            String filePath="C:\\Users\\Elif\\Downloads\\Documents\\20240323000047.pdf";
            Assert.assertTrue(Files.exists(Paths.get(filePath)));
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
        userDashboard.checkListELements(userDashboard.linkListMyWallet , 2);
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
        userDashboard.checkSendKeysBox(userDashboard.textBoxEmail , email);
        userDashboard.checkSendKeysBox(userDashboard.textBoxCardNumber , ccNumber);
        userDashboard.checkSendKeysBox(userDashboard.textBoxExpirationDate , expDate);
        userDashboard.checkSendKeysBox(userDashboard.textBoxCsc , csc);
        userDashboard.checkClickElement(userDashboard.payButton);
    }
    @Given("User displays the -Wallet Recharge History- table.")
    public void user_displays_the_wallet_recharge_history_table() {
        userDashboard.checkListELements(userDashboard.rowListWalletHistory , 6);
    }
    @Given("User verifies the {string}.")
    public void user_verifies_the(String amount) {
        assertEquals(ConfigReader.getProperty(amount) , userDashboard.labelFirstAmount.getText());
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


}
