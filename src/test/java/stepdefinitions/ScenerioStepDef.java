package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.Base;
import utils.Driver;
import utils.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class ScenerioStepDef extends Base {

    @Given("The user clicks on the Login button at the top right corner of the page")
    public void the_user_clicks_on_the_login_button_at_the_top_right_corner_of_the_page() {
        visitorHomePage.linkLogin.click();
    }
    @Given("Verify that the Electronics category window is displayed in the Home page body section")
    public void verify_that_the_electronics_category_window_is_displayed_in_the_home_page_body_section() {
        visitorHomePage.dropDownAllCategories.click();
        ReusableMethods.wait(1);
        ReusableMethods.hover(visitorHomePage.buttonElectronicsIcon);
        ReusableMethods.wait(1);
        visitorHomePage.linkmobilePhone.click();
    }
    @Given("Click on the compare icon to make a price performance comparison between two products from Apple and Huawei")
    public void click_on_the_compare_icon_to_make_a_price_performance_comparison_between_two_products_from_apple_and_huawei() {
        ReusableMethods.hover(visitorHomePage.iphone);
        ReusableMethods.wait(2);
        visitorHomePage.iphone.click();

        ReusableMethods.wait(2);

        ReusableMethods.hover(visitorHomePage.huawei);
        ReusableMethods.wait(1);
        visitorHomePage.huawei.click();
    }
    @Given("Click on the wishlist icon of the first product in the Top Rating section")
    public void click_on_the_wishlist_icon_of_the_first_product_in_the_top_rating_section() {
        visitorHomePage.dropDownAllCategories.click();
        ReusableMethods.wait(1);
        visitorHomePage.buttonbabyClickView.click();
        ReusableMethods.wait(1);
        visitorHomePage.linkBabyStrollerPushchair.click();
        ReusableMethods.wait(1);
        ReusableMethods.hover(visitorHomePage.wishlistItem);
        ReusableMethods.wait(1);
        visitorHomePage.wishlistItem.click();


    }
    @Given("User clicks on -Compare- and displays {string} the Compare page")
    public void user_clicks_on_compare_and_displays_the_compare_page(String string) {
        userDashboard.linkCompare.click();
        ReusableMethods.wait(1);
    }
    @Given("User clicks on -Add To Cart icon- and adds an item")
    public void user_clicks_on_add_to_cart_icon_and_adds_an_item() {
        userDashboard.checkClickElement(userDashboard.iconAddToCart);
    }
    @Given("Close the modal window that openen.")
    public void close_the_modal_window_that_openen() {
        ReusableMethods.wait(1);
        visitorHomePage.buttonCloseIcon1.click();
    }
    @Given("Closes the cart section")
    public void closes_the_cart_section() {
        userDashboard.checkClickElement(visitorHomePage.buttonTi_CloseIcon2);
        ReusableMethods.wait(2);
    }
    @Given("Clicks on wishlist link")
    public void clicks_on_wishlist_link() {
        userDashboard.checkClickElement(visitorHomePage.linkHeaderWishList);
        ReusableMethods.wait(4);
    }
    @Given("Clicks on the product image to go to the product details page")
    public void clicks_on_the_product_image_to_go_to_the_product_details_page() {
        visitorHomePage.wishlistItemClick.click();
        ReusableMethods.wait(2);
    }
    @Given("Clicks the Add to card button.")
    public void clicks_the_add_to_card_button() {
        userDashboard.buttonAddToCartProduct.click();
    }
    @Given("Clicks the View card button.")
    public void clicks_the_view_card_button() {
        userDashboard.buttonViewCardProduct.click();
    }
    @Given("Click on the {string} button on the right side under the specified products.")
    public void click_on_the_button_on_the_right_side_under_the_specified_products(String string) {
        userDashboard.buttonProceedTOCheckout.click();
    }
    @Given("Write {string} in the notes section")
    public void write_in_the_notes_section(String string) {
        ReusableMethods.wait(3);
        userDashboard.checkSendKeysBox(userDashboard.textboxNoteCart , string);
        ReusableMethods.wait(2);
    }
    @Given("Clicks on the Continue to Shipping button")
    public void clicks_on_the_continue_to_shipping_button() {
        userDashboard.buttonContinueShiping.click();
        ReusableMethods.wait(1);
    }
    @Given("Click on the Pay Now button")
    public void click_on_the_pay_now_button() {
        userDashboard.checkClickElement(userDashboard.orderNowButton);
        ReusableMethods.wait(2);
    }
    @Given("View the message confirming that the order has been successfully placed")
    public void view_the_message_confirming_that_the_order_has_been_successfully_placed() {
        assertTrue(visitorHomePage.confirmation.isDisplayed());
    }
    @Given("Clicks Logout link.")
    public void clicks_logout_link() {
        userDashboard.buttonLogout.click();
    }


}
