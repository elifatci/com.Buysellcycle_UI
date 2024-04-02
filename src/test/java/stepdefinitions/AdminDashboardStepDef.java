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
        adminDashboard.clickVerification(adminDashboard.buttonChangePassword, adminDashboard.labelChangePassword);
        ReusableMethods.wait(3);
       // assertTrue(adminDashboard.labelChangePassword.isDisplayed());
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
        ReusableMethods.wait(2);
        adminDashboard.buttonAddress.click();
    }

    @Given("Verify that the Add new address button is visible and active")
    public void verify_that_the_add_new_address_button_is_visible_and_active() {
        adminDashboard.verifyVisibleActive(adminDashboard.buttonAddNewAddress);
    }

    @Given("Verify that the Address page opens")
    public void verify_that_the_address_page_opens() {
        ReusableMethods.wait(2);
        assertTrue(adminDashboard.buttonAddNewAddress.isDisplayed());
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
    @Given("Select the select from options option from Country dropdown")
    public void select_the_select_from_options_option_from_country_dropdown() {
            adminDashboard.dropDownCountry.click();
            ReusableMethods.wait(3);
            adminDashboard.subMenuSelectFromOptions.click();
    }

    @Given("Click on the save button")
    public void click_on_the_save_button() {
            adminDashboard.buttonSave.click();
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

    //US43 TC01
    @Given("Verify that the Support Ticket link is visible in the side bar")
    public void verify_that_the_support_ticket_link_is_visible_in_the_side_bar() {

    }
    @Given("Click on the support ticket link")
    public void click_on_the_support_ticket_link() {

    }
    @Given("Click on the support ticket link below.")
    public void click_on_the_support_ticket_link_below() {

    }
    @Given("Verify that it redirects to the relevant page")
    public void verify_that_it_redirects_to_the_relevant_page() {

    }

    //US43 TC02
    @Given("Click on the Add new button and verify that you are directed to the relevant page.")
    public void click_on_the_add_new_button_and_verify_that_you_are_directed_to_the_relevant_page() {

    }
    @Given("Verify that the Subject, Description, Category List, Priority and Status textboxes are visible")
    public void verify_that_the_subject_description_category_list_priority_and_status_textboxes_are_visible() {

    }
    @Given("Verify that the add new buttons are active")
    public void verify_that_the_add_new_buttons_are_active() {

    }
    @Given("Fill in the starred fields with valid information")
    public void fill_in_the_starred_fields_with_valid_information() {

    }
    @Given("Verify that more than one file can be attached to the Attach file section")
    public void verify_that_more_than_one_file_can_be_attached_to_the_attach_file_section() {

    }
    @Given("Click on the Create ticket button and verify that the ticket has been created successfully.")
    public void click_on_the_create_ticket_button_and_verify_that_the_ticket_has_been_created_successfully() {

    }

    //US43 TC03
    @Given("Verify that PRIORITY, STATUS, CATEGORY information is selectable on the Support Ticket page")
    public void verify_that_priority_status_category_information_is_selectable_on_the_support_ticket_page() {

    }
    @Given("Click the search button from the Category, Priority and Status tabs.")
    public void click_the_search_button_from_the_category_priority_and_status_tabs() {

    }
    @Given("Verify that the relevant filtering results are returned")
    public void verify_that_the_relevant_filtering_results_are_returned() {

    }

    //US43 TC04
    @Given("click on the plus icon")
    public void click_on_the_plus_icon() {

    }
    @Given("Verify that the Agent assign field and action section are visible")
    public void verify_that_the_agent_assign_field_and_action_section_are_visible() {

    }
    @Given("If assigned, verify that the assignee's name is visible")
    public void if_assigned_verify_that_the_assignee_s_name_is_visible() {

    }
    @Given("Click a ticket's Select button and verify that the show edit delete options are visible")
    public void click_a_ticket_s_select_button_and_verify_that_the_show_edit_delete_options_are_visible() {

    }
    @Given("Click the Show button. Verify that the Ticket page is opened.")
    public void click_the_show_button_verify_that_the_ticket_page_is_opened() {

    }
    @Given("Go back, click on the select button and select the edit option.")
    public void go_back_click_on_the_select_button_and_select_the_edit_option() {

    }
    @Given("Verify that the update ticket page is opened")
    public void verify_that_the_update_ticket_page_is_opened() {

    }

}
