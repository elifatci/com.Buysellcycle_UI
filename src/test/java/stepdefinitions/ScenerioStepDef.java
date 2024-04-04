package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.Base;
import utils.Driver;
import utils.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class ScenerioStepDef extends Base {

    @Given("Click on the compare icon to make a price performance comparison between two products from Apple and Huawei.")
    public void click_on_the_compare_icon_to_make_a_price_performance_comparison_between_two_products_from_apple_and_huawei() {
        ReusableMethods.hover(visitorHomePage.iphone);
        ReusableMethods.wait(2);
        visitorHomePage.iphone.click();

        ReusableMethods.wait(2);

        ReusableMethods.hover(visitorHomePage.huawei);
        ReusableMethods.wait(1);
        visitorHomePage.huawei.click();
    }

    @Given("Continue browsing the site.")
    public void continue_browsing_the_site() {
        ReusableMethods.wait(1);
        ReusableMethods.scrollIntoViewJS(visitorHomePage.labelTopRating);
        ReusableMethods.wait(2);
    }

    @Given("Click on the wishlist icon of the first product in the Top Rating section.")
    public void click_on_the_wishlist_icon_of_the_first_product_in_the_top_rating_section() {
        ReusableMethods.hover(visitorHomePage.wishlistItem);
        ReusableMethods.wait(1);
        visitorHomePage.wishlistItem.click();
    }

    @Given("Closes the cart section.")
    public void closes_the_cart_section() {
        userDashboard.checkClickElement(visitorHomePage.buttonTi_CloseIcon2);
        ReusableMethods.wait(2);
    }

    @Given("Clicks on wishlist link.")
    public void clicks_on_wishlist_link() {
        userDashboard.checkClickElement(visitorHomePage.linkHeaderWishList);
        ReusableMethods.wait(2);
    }

    @Given("Clicks on the product image to go to the product details page.")
    public void clicks_on_the_product_image_to_go_to_the_product_details_page() {
        visitorHomePage.wishlistItemClick.click();
        ReusableMethods.wait(2);
    }

    @Given("Write {string} in the notes section.")
    public void write_in_the_notes_section(String string) {
        userDashboard.checkSendKeysBox(userDashboard.textboxNoteCart , string);
        ReusableMethods.wait(1);
    }

    @Given("Clicks on the Continue to Shipping button.")
    public void clicks_on_the_continue_to_shipping_button() {
        userDashboard.buttonContinueShiping.click();
        ReusableMethods.wait(1);
    }

    @Given("Choose Stripe from the payment methods.")
    public void choose_stripe_from_the_payment_methods() {
        visitorHomePage.stripe.click();
        ReusableMethods.wait(1);
    }

    @Given("Click on the Pay Now button.")
    public void click_on_the_pay_now_button() {
        userDashboard.checkClickElement(userDashboard.orderNowButton);
        ReusableMethods.wait(2);
    }

    @Given("User enters credit card information {string} {string} {string} {string} .")
    public void user_enters_credit_card_information(String email, String ccNumber, String expDate, String csc) {
        Driver.getDriver().switchTo().frame(userDashboard.labelIframe);
        ReusableMethods.wait(1);
        userDashboard.checkSendKeysBox(userDashboard.textBoxEmail, email);
        ReusableMethods.wait(1);
        userDashboard.checkSendKeysBox(userDashboard.textBoxCardNumber, ccNumber);
        ReusableMethods.wait(1);
        userDashboard.checkSendKeysBox(userDashboard.textBoxExpirationDate, expDate);
        ReusableMethods.wait(1);
        userDashboard.checkSendKeysBox(userDashboard.textBoxCsc, csc);
        ReusableMethods.wait(1);
        userDashboard.checkClickElement(userDashboard.payButton);
        ReusableMethods.wait(4);
    }

    @Given("View the message confirming that the order has been successfully placed.")
    public void view_the_message_confirming_that_the_order_has_been_successfully_placed() {
        assertTrue(visitorHomePage.confirmation.isDisplayed());
    }

}
