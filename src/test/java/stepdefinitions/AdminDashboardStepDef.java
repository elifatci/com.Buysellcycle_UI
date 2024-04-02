package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.Base;
import pages.UserDashboard;
import utils.ConfigReader;
import utils.ReusableMethods;
import org.openqa.selenium.JavascriptExecutor;
import utils.Driver;

import java.io.File;

import static org.junit.Assert.*;

public class AdminDashboardStepDef extends Base {


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
        userDashboard.checkListELements(adminDashboard.rowListProductList, 7);
    }

    //US39 ---> TC03
    @Given("User clicks on -Quick Search- and enters a product {string}.")
    public void user_clicks_on_quick_search_and_enters_a_product_name(String product) {
        userDashboard.checkSendKeysBox(adminDashboard.textBoxQuickSearch, product);
    }

    @Given("User verifies that he-she displays the result.")
    public void user_verifies_that_he_she_displays_the_result() {
        ReusableMethods.wait(3);
        assertEquals(ConfigReader.getProperty("productName"), adminDashboard.labelSearchedProduct.getText());
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
        adminDashboard.iconCloseSuccessMessage.click();
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

    @Given("Verify that the information can be updated")
    public void verify_that_the_information_can_be_updated() {
        adminDashboard.textBoxfirstName.clear();
        adminDashboard.textBoxfirstName.sendKeys("Elif");
        adminDashboard.textBoxPhoneNumber.sendKeys("4");
        adminDashboard.buttonUpdate.click();
        ReusableMethods.wait(2);
        assertTrue(adminDashboard.labelSuccessMessage.isDisplayed());
    }

    //US36 TC03
    @Given("Click on the Change password button and verify that you are directed to the relevant page.")
    public void click_on_the_change_password_button_and_verify_that_you_are_directed_to_the_relevant_page() {
        ReusableMethods.wait(2);
        adminDashboard.buttonChangePassword.click();
        //adminDashboard.clickVerification(adminDashboard.buttonChangePassword, adminDashboard.labelChangePassword);
        ReusableMethods.wait(3);
        assertTrue(adminDashboard.labelChangePassword.isDisplayed());
    }

    @Given("Verify that the CURRENT PASSWORD, NEW PASSWORD, RE ENTER NEW PASSWORD textboxes are visible")
    public void verify_that_the_current_password_new_password_re_enter_new_password_textboxes_are_visible() {
        assertTrue(adminDashboard.textBoxCurrentPassword.isDisplayed());
        assertTrue(adminDashboard.textBoxNewPassword.isDisplayed());
        assertTrue(adminDashboard.textBoxRePassword.isDisplayed());
        ReusableMethods.wait(2);
    }

    @Given("Verify that the password can be updated")
    public void verify_that_the_password_can_be_updated() {
        adminDashboard.textBoxCurrentPassword.sendKeys(ConfigReader.getProperty("password"));
        adminDashboard.textBoxNewPassword.sendKeys("123123124");
        adminDashboard.textBoxRePassword.sendKeys("123123124");
        adminDashboard.buttonUpdateChangePassword.click();
    }

    //US36 TC04
    @Given("Click on the Address button")
    public void click_on_the_address_button() {
        adminDashboard.buttonAddress.click();
    }

    @Given("Verify that the Add new address button is visible and active")
    public void verify_that_the_add_new_address_button_is_visible_and_active() {
        adminDashboard.verifyVisibleActive(adminDashboard.buttonAddNewAddress);
    }

    @Given("Verify that the Address page opens")
    public void verify_that_the_address_page_opens() {
        assertTrue(adminDashboard.linkAddNewProduct.isDisplayed());
    }

    @Given("Verify that address information is visible")
    public void verify_that_address_information_is_visible() {
        assertTrue(adminDashboard.tableAddressInformation.isDisplayed());
    }

    @Given("Click the Add new address button")
    public void click_the_add_new_address_button() {
        adminDashboard.buttonAddNewAddress.click();
    }

    @Given("Verify that the save button is visible")
    public void verify_that_the_save_button_is_visible() {
        assertTrue(adminDashboard.buttonSaveAddress.isDisplayed());
    }

    @Given("Fill in the starred fields and click the save button.")
    public void fill_in_the_starred_fields_and_click_the_save_button() {
        adminDashboard.addAddress();
    }

    @Given("Verify that the address has been added")
    public void verify_that_the_address_has_been_added() {
        assertTrue(adminDashboard.labelSuccessMessage.isDisplayed());
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

    //***********************US_34/TC_01/TC_02*********************************


    @Given("At the top of the Admin Dashboard page appears in the Search TextBox section Verify that it is.")
    public void at_the_top_of_the_admin_dashboard_page_appears_in_the_search_text_box_section_verify_that_it_is() {

    }

    @Given("Using Search TextBox, type Dashboard in the search box within the site and verify that the results are displayed correctly.")
    public void using_search_text_box_type_dashboard_in_the_search_box_within_the_site_and_verify_that_the_results_are_displayed_correctly() {

    }

    @Given("Click the Menu icon on the Admin Dashboard home page and verify that the SideBar collapses and expands.")
    public void click_the_menu_icon_on_the_admin_dashboard_home_page_and_verify_that_the_side_bar_collapses_and_expands() {

    }

    @Given("Username of the site from Admin Dashboard redirected to the interface verify.")
    public void username_of_the_site_from_admin_dashboard_redirected_to_the_interface_verify() {

    }

    @Given("Click on the Today button and select verify that the data changes to the selected value.")
    public void click_on_the_today_button_and_select_verify_that_the_data_changes_to_the_selected_value() {

    }

    @Given("Click on the This Week button and select verify that the data changes to the selected value.")
    public void click_on_the_this_week_button_and_select_verify_that_the_data_changes_to_the_selected_value() {

    }

    @Given("Click on the This Year button and select verify that the data changes to the selected value.")
    public void click_on_the_this_year_button_and_select_verify_that_the_data_changes_to_the_selected_value() {

    }

    @Given("Total Product from the links in the Summary section verify that clicking on the link redirects to the relevant page.")
    public void total_product_from_the_links_in_the_summary_section_verify_that_clicking_on_the_link_redirects_to_the_relevant_page() {

    }

    @Given("TotalCustomer from the links in the Summary section verify that clicking on the link redirects to the relevant page.")
    public void total_customer_from_the_links_in_the_summary_section_verify_that_clicking_on_the_link_redirects_to_the_relevant_page() {

    }

    @Given("Visitor from the links in the Summary section verify that clicking on the link redirects to the relevant page.")
    public void visitor_from_the_links_in_the_summary_section_verify_that_clicking_on_the_link_redirects_to_the_relevant_page() {

    }

    @Given("Total Order from the links in the Summary section verify that clicking on the link redirects to the relevant page.")
    public void total_order_from_the_links_in_the_summary_section_verify_that_clicking_on_the_link_redirects_to_the_relevant_page() {

    }

    @Given("Total Pending Order from the links in the Summary section verify that clicking on the link redirects to the relevant page.")
    public void total_pending_order_from_the_links_in_the_summary_section_verify_that_clicking_on_the_link_redirects_to_the_relevant_page() {

    }

    @Given("Total Completed Order from the links in the Summary section verify that clicking on the link redirects to the relevant page.")
    public void total_completed_order_from_the_links_in_the_summary_section_verify_that_clicking_on_the_link_redirects_to_the_relevant_page() {

    }

    @Given("Total Sale from the links in the Summary section verify that clicking on the link redirects to the relevant page.")
    public void total_sale_from_the_links_in_the_summary_section_verify_that_clicking_on_the_link_redirects_to_the_relevant_page() {

    }

    @Given("Total Review from the links in the Summary section verify that clicking on the link redirects to the relevant page.")
    public void total_review_from_the_links_in_the_summary_section_verify_that_clicking_on_the_link_redirects_to_the_relevant_page() {

    }

    @Given("Total Revenue from the links in the Summary section verify that clicking on the link redirects to the relevant page.")
    public void total_revenue_from_the_links_in_the_summary_section_verify_that_clicking_on_the_link_redirects_to_the_relevant_page() {

    }

    @Given("Active Customer from the links in the Summary section verify that clicking on the link redirects to the relevant page.")
    public void active_customer_from_the_links_in_the_summary_section_verify_that_clicking_on_the_link_redirects_to_the_relevant_page() {

    }

    @Given("Total Subscriber from the links in the Summary section verify that clicking on the link redirects to the relevant page.")
    public void total_subscriber_from_the_links_in_the_summary_section_verify_that_clicking_on_the_link_redirects_to_the_relevant_page() {

    }

    //US38 Nazime >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //TC01
    @Given("Clicks the product link in the admin dashboard sidebar")
    public void clicks_the_product_link_in_the_admin_dashboard_sidebar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Clicks the  add new product link in the admin dashboard sidebar")
    public void clicks_the_add_new_product_link_in_the_admin_dashboard_sidebar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();

    }

    //TC02
    @Given("Add new Productin titles\\(General Information, Related Product, Up Sale, Cross sale) display")
    public void add_new_productin_titles_general_information_related_product_up_sale_cross_sale_display() {


    }

    //TC03
    @Given("select variant type")
    public void select_variant_type() {
    }
    //TC04
    @Given("Display Name, Product SKU, Model Number, Category, Brand, Unit, Barcode Type,Minimum Order QTY, Max Order QTY, Tags \\(Comma Separated) Text Boxes in Product Information Section")
    public void display_name_product_sku_model_number_category_brand_unit_barcode_type_minimum_order_qty_max_order_qty_tags_comma_separated_text_boxes_in_product_information_section() {

    }
    //TC05
    @Given("Enter the information in the Weight Height Info section")
    public void enter_the_information_in_the_weight_height_info_section() {

    }
    //TC06
    @Given("Information is entered in Price Info and Stock section")
    public void information_is_entered_in_price_info_and_stock_section() {

    }
    //TC07
    @Given("Picture is added to Description section")
    public void picture_is_added_to_description_section() {

    }
    //TC08
    @Given("the necessary information is entered and a new product is added to the site")
    public void the_necessary_information_is_entered_and_a_new_product_is_added_to_the_site() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Save & Publish and Save buttons are visible and their activation is confirmed")
    public void save_publish_and_save_buttons_are_visible_and_their_activation_is_confirmed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("a new product is added to the site")
    public void a_new_product_is_added_to_the_site() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    //TC09
    @Given("On the Add New Product page, related products are determined for the product to be added")
    public void on_the_add_new_product_page_related_products_are_determined_for_the_product_to_be_added() {
    }
    //TC10
    @Given("On the Add New Product page, select the products up sale")
    public void on_the_add_new_product_page_select_the_products_up_sale() {

    }
    //TC11




}
