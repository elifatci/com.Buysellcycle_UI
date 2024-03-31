package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.Base;
import pages.UserDashboard;
import utils.ConfigReader;
import utils.ReusableMethods;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.JavascriptExecutor;
import utils.Driver;
import java.io.File;

public class AdminDashboardStepDef extends Base {


    //******************US_34/TC_01*************************

    // US39 ---> TC01
    @Given("User clicks on -Products menu- then clicks on -Product List- and displays {string} the Product List page.")
    public void user_clicks_on_products_menu_then_clicks_on_product_list_and_displays_the_product_list_page(String url) {
        userDashboard.checkClickElement(adminDashboard.dropDownProducts);
        ReusableMethods.wait(1);
        userDashboard.checkClickElement(adminDashboard.linkProductList);
        userDashboard.checkUrl(url);
        ReusableMethods.wait(1);
    }
    @Given("User clicks on -Seller Request Product- and displays the page.")
    public void user_clicks_on_seller_request_product_and_displays_the_page() {
        userDashboard.checkClickElement(adminDashboard.linkSellerRequestProduct);
        ReusableMethods.wait(1);
        assertTrue(adminDashboard.labelSellerRequestProduct.isDisplayed());
    }
    @Given("User clicks on -Disabled Product List- and displays the page.")
    public void user_clicks_on_disabled_product_list_and_displays_the_page() {
        userDashboard.checkClickElement(adminDashboard.linkDisabledProduct);
        ReusableMethods.wait(1);
        assertTrue(adminDashboard.labelDisabledProduct.isDisplayed());
    }
    @Given("User clicks on -Product By SKU- and displays the page.")
    public void user_clicks_on_product_by_sku_and_displays_the_page() {
        userDashboard.checkClickElement(adminDashboard.linkProductBySKU);
        ReusableMethods.wait(1);
        assertTrue(adminDashboard.labelProductBySKU.isDisplayed());
    }

    //US39 ---> TC02
    @Given("User verifies that Product List headings are visible.")
    public void user_verifies_that_product_list_headings_are_visible() {
        userDashboard.checkListELements(adminDashboard.rowListProductList , 7);
    }

    //US39 ---> TC03
    @Given("User clicks on -Quick Search- and enters a product {string}.")
    public void user_clicks_on_quick_search_and_enters_a_product_name(String product) {
        userDashboard.checkSendKeysBox(adminDashboard.textBoxQuickSearch , product);
    }
    @Given("User verifies that he-she displays the result.")
    public void user_verifies_that_he_she_displays_the_result() {
        ReusableMethods.wait(3);
        assertEquals(ConfigReader.getProperty("productName") , adminDashboard.labelSearchedProduct.getText());
    }

    //US39 ---> TC04
    @Given("User clicks on -Status toggle-.")
    public void user_clicks_on_status_toggle() {
        userDashboard.checkClickElement(adminDashboard.radioButtonStatus);
    }
    @Given("User verifies that status is changed.")
    public void user_verifies_that_status_is_changed() {
        ReusableMethods.wait(1);
        assertTrue(adminDashboard.labelStatusConfirm.isDisplayed());
    }

    //US39 ---> TC05
    @Given("User clicks on -Select-.")
    public void user_clicks_on_select() {
        userDashboard.checkClickElement(adminDashboard.dropDownSelect);
    }
    @Given("User clicks on -View- and displays the product information's.")
    public void user_clicks_on_view_and_displays_the_product_informations() {
        userDashboard.checkClickElement(adminDashboard.linkViewProduct);
    }

    //US39 ---> TC06
    @Given("User clicks on -Edit- and displays {string} the Edit Product page.")
    public void user_clicks_on_edit_and_displays_the_edit_product_page(String string) {
        userDashboard.checkClickElement(adminDashboard.linkEditProduct);
    }

    //US39 ---> TC07
    @Given("User clicks on -Clone- and displays {string} the Clone Product page.")
    public void user_clicks_on_clone_and_displays_the_edit_product_page(String string) {
        userDashboard.checkClickElement(adminDashboard.linkCloneProduct);
    }

    //US39 ---> TC08
    @Given("User clicks on -Delete- and confirms deletion.")
    public void user_clicks_on_delete_and_confirms_deletion() {
        userDashboard.checkClickElement(adminDashboard.linkDeleteProduct);
        ReusableMethods.wait(1);
        userDashboard.checkClickElement(adminDashboard.buttonDeleteProduct);
    }
    @Given("User verifies that the product is deleted.")
    public void user_verifies_that_the_product_is_deleted() {
        ReusableMethods.wait(1);
        assertTrue(adminDashboard.labelDeleteSuccess.isDisplayed());
    }

    //US39 ---> TC09
    @Given("User clicks on -Add New Product- and displays {string} the Add New Product page.")
    public void user_clicks_on_add_new_product_and_displays_the_contact_page(String string) {
        userDashboard.checkClickElement(adminDashboard.linkAddNewProduct);
    }

    //US36 TC01
    @Given("Verify that the profile icon is visible on the Dashboard page")
    public void verify_that_the_profile_icon_is_visible_on_the_dashboard_page() {
        adminDashboard.iconCloseSuccessMessage.click();
        adminDashboard.verifyVisible(adminDashboard.imageProfile);
    }

    @Given("Verify that subheadings are visible when hovering over the profile icon")
    public void verify_that_subheadings_are_visible_when_hovering_over_the_profile_icon() {
        actions.moveToElement(adminDashboard.imageProfile).perform();
        adminDashboard.verifyVisible(adminDashboard.subMenuProfile);
    }

    @Given("Hover over your profile icon and click on the My profile link.")
    public void hover_over_your_profile_icon_and_click_on_the_my_profile_link() {
        actions.moveToElement(adminDashboard.imageProfile).perform();
        ReusableMethods.wait(2);
        adminDashboard.linkMyProfile.click();
    }

    @Given("Confirm that the My profile page has been opened")
    public void confirm_that_the_my_profile_page_has_been_opened() {
        adminDashboard.verifyVisible(adminDashboard.labelBasicInfo);
    }

    //US36 TC02
    @Given("Hover over your profile icon click on the My profile link.")
    public void hover_over_your_profile_icon_click_on_the_my_profile_link() {
        adminDashboard.iconCloseSuccessMessage.click();
        actions.moveToElement(adminDashboard.imageProfile).perform();
        ReusableMethods.wait(2);
        adminDashboard.linkMyProfile.click();
    }

    @Given("Verify that First Name, Last Name, E-mail Address, Phone Number, Date of Bird information is visible in the Basic Info section.")
    public void verify_that_first_name_last_name_e_mail_address_phone_number_date_of_bird_information_is_visible_in_the_basic_info_section() {
        adminDashboard.verifyVisible(adminDashboard.labelFirstNameText);
        adminDashboard.verifyVisible(adminDashboard.labelLastNameText);
        adminDashboard.verifyVisible(adminDashboard.labelEmailText);
        adminDashboard.verifyVisible(adminDashboard.labelPhoneNumberText);
        adminDashboard.verifyVisible(adminDashboard.labelDateOfBirthText);
    }

    @Given("Verify that the update and avatar buttons are visible and functional")
    public void verify_that_the_update_and_avatar_buttons_are_visible_and_functional() {
        adminDashboard.verifyVisibleActive(adminDashboard.buttonAvatar);
        adminDashboard.verifyVisibleActive(adminDashboard.buttonUpdate);
    }

    @Given("Verify that the profile picture is updated")
    public void verify_that_the_profile_picture_is_updated() {
        adminDashboard.buttonAvatar.click();
        String filePath = "C:\\Users\\Elif\\OneDrive\\Resimler\\pexels-baskin-creative-studios-1766838.jpg";
        ReusableMethods.wait(3);
        adminDashboard.buttonAvatar.sendKeys(filePath);
        ReusableMethods.wait(2);


    }

    @Given("Verify that the information can be updated")
    public void verify_that_the_information_can_be_updated() {

    }

    //US36 TC03
    @Given("Click on the Change password button and verify that you are directed to the relevant page.")
    public void click_on_the_change_password_button_and_verify_that_you_are_directed_to_the_relevant_page() {

    }

    @Given("Verify that the CURRENT PASSWORD, NEW PASSWORD, RE ENTER NEW PASSWORD textboxes are visible")
    public void verify_that_the_current_password_new_password_re_enter_new_password_textboxes_are_visible() {

    }

    @Given("Verify that the password can be updated")
    public void verify_that_the_password_can_be_updated() {

    }

    //US36 TC04
    @Given("Click on the Address button")
    public void click_on_the_address_button() {

    }

    @Given("Verify that the Add new address button is visible and active")
    public void verify_that_the_add_new_address_button_is_visible_and_active() {

    }

    @Given("Verify that the Address page opens")
    public void verify_that_the_address_page_opens() {

    }

    @Given("Verify that address information is visible")
    public void verify_that_address_information_is_visible() {

    }

    @Given("Click the Add new address button")
    public void click_the_add_new_address_button() {

    }

    @Given("Verify that the save button is visible")
    public void verify_that_the_save_button_is_visible() {

    }

    @Given("Fill in the starred fields and click the save button.")
    public void fill_in_the_starred_fields_and_click_the_save_button() {

    }

    @Given("Verify that the address has been added")
    public void verify_that_the_address_has_been_added() {

    }

    //US36 TC05
    @Given("Leave the textboxes of the required fields empty and click on the save button.")
    public void leave_the_textboxes_of_the_required_fields_empty_and_click_on_the_save_button() {

    }

    @Given("Select the select from options option from Country dropdown")
    public void select_the_select_from_options_option_from_country_dropdown() {

    }

    @Given("Click on the save button")
    public void click_on_the_save_button() {

    }

}
