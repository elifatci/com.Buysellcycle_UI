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
        userDashboard.dropdownAllHistory.click();
        //Assert.assertTrue();

    }

    @Given("Verify that the hamburger icon and download icon next to purchases are visible and functional")
    public void verify_that_the_hamburger_icon_and_download_icon_next_to_purchases_are_visible_and_functional() {
        userDashboard.verifyIcon();
    }

    @Given("Click on the Dowload icon to verify that the invoice has been downloaded.")
    public void click_on_the_dowload_icon_to_verify_that_the_invoice_has_been_downloaded() {
        userDashboard.iconDownload.click();
        ReusableMethods.wait(2);
        String filePath = "\"C:\\Users\\Elif\\Downloads\\Documents\\20240323000047.pdf\"";
        Assert.assertTrue(Files.exists(Paths.get(filePath)));
    }

    @Given("Verify that Order code, Package code, Delivery Process, Order Details, Order Summary, Payment Type information is visible in the invoice information.")
    public void verify_that_order_code_package_code_delivery_process_order_details_order_summary_payment_type_information_is_visible_in_the_invoice_information() throws IOException {
        String filePath = "\"C:\\Users\\Elif\\Downloads\\Documents\\20240323000046.pdf\"";
        String fileContent = new String(Files.readAllBytes(Paths.get(filePath)));
        Assert.assertTrue(fileContent.contains("Invoice"));
        Assert.assertTrue(fileContent.contains("Cash On Delivery"));
        Assert.assertTrue(fileContent.contains("Details"));
        Assert.assertTrue(fileContent.contains("Name"));
        Assert.assertTrue(fileContent.contains("Package"));
        Assert.assertTrue(fileContent.contains("Delivery Process"));
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
        Assert.assertEquals(expectedUrl, actualUrl);
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
}

