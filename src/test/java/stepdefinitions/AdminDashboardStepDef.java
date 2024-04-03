package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Base;
import pages.UserDashboard;
import utils.ConfigReader;
import utils.ReusableMethods;
import org.openqa.selenium.JavascriptExecutor;
import utils.Driver;
import java.io.File;
import java.util.List;
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
    // ================================== US42 TC01==================================================================
    @Given("User can open Support Ticket menu from Dashboard Side Bar")
    public void user_can_open_support_ticket_menu_from_dashboard_side_bar() {
        userDashboard.checkClickElement(adminDashboard.dropDownSupportTicket);
        adminDashboard.dropDownSupportTicket.click();
        assertTrue(adminDashboard.dropDownSupportTicket.isDisplayed());
    }
    @Given("The user clicks on the My Ticket page under Support Ticket from the Dashboard Side Bar")
    public void the_user_clicks_on_the_my_ticket_page_under_support_ticket_from_the_dashboard_side_bar() {
    adminDashboard.labelMyTicket.click();
    assertTrue(adminDashboard.labelMyTicket.isDisplayed());
    }
    @Given("On the My Ticket page, user sees the Category tab, Select One, Installation, Technical, Others and clicks Technical button")
    public void on_the_my_ticket_page_user_sees_the_category_tab_select_one_installation_technical_others_and_clicks_technical_button() {
        adminDashboard.dropDownCategory.click();
        for (int i = 5; i < 7; i++) {

            assertTrue(adminDashboard.dropDownCategoryList.get(i).isDisplayed());
        }
        adminDashboard.labelTechnical.click();
    }

    @Given("User sees the Select One, High, Medium, Low options from the Priority tab on the My Ticket page and clicks the High button")
    public void user_sees_the_select_one_high_medium_low_options_from_the_priority_tab_on_the_my_ticket_page_and_clicks_the_high_button() {
        adminDashboard.dropDownPriority.click();
        userDashboard.checkListELements(adminDashboard.dropDownPriortiyList,4);
        adminDashboard.labelPriority.click();

    }
    @Given("User sees Select One, Pending, On Going, Completed, Closed options from the Status tab on the My Ticket page and clicks the Pending button")
    public void user_sees_select_one_pending_on_going_completed_closed_options_from_the_status_tab_on_the_my_ticket_page_and_clicks_the_pending_button() {
        adminDashboard.dropDownStatus.click();
        userDashboard.checkListELements(adminDashboard.dropDownStatusList,5);
        adminDashboard.labelStatus.click();
    }
    @Given("User clicks the Search button to create the Ticket List according to the filtering made from Category, Priority and Status tabs")
    public void user_clicks_the_search_button_to_create_the_ticket_list_according_to_the_filtering_made_from_category_priority_and_status_tabs() {
    adminDashboard.buttonSearch.click();
    }
    @Given("User verifies that Tickets in Ticket List are listed under Subject, Category, User Name, priority, User Agent, Status, Action")
    public void user_verifies_that_tickets_in_ticket_list_are_listed_under_subject_category_user_name_priority_user_agent_status_action() {
        for (int i = 0; i < 8; i++) {
            assertTrue(adminDashboard.dropDownTicketList.get(i).isDisplayed());
        }
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

    //US38 Nazime >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //TC01
    @Given("Clicks the product link in the admin dashboard sidebar")
    public void clicks_the_product_link_in_the_admin_dashboard_sidebar() {
       adminDashboard.linkProducts.click();

    }

    @Given("Clicks the  add new product link in the admin dashboard sidebar")
    public void clicks_the_add_new_product_link_in_the_admin_dashboard_sidebar() {
        adminDashboard.linkAddNewProduct.click();
    }

    //TC02
    @Given("Add new Productin titles\\(General Information, Related Product, Up Sale, Cross sale) display")
    public void add_new_productin_titles_general_information_related_product_up_sale_cross_sale_display() {
     ReusableMethods.wait(3);
     userDashboard.checkListELements(adminDashboard.linkAddNewProductList,4);

    }

    //TC03
    @Given("select variant type")
    public void select_variant_type() {
        ReusableMethods.wait(1);
       adminDashboard.linkAddNewProduct.click();
       ReusableMethods.waitAndClick(adminDashboard.radioButtonVariant);
    }
    //TC04
    @Given("Display Name, Product SKU, Model Number, Category, Brand, Unit, Barcode Type,Minimum Order QTY, Max Order QTY, Tags \\(Comma Separated) Text Boxes in Product Information Section")
    public void display_name_product_sku_model_number_category_brand_unit_barcode_type_minimum_order_qty_max_order_qty_tags_comma_separated_text_boxes_in_product_information_section() {
        ReusableMethods.wait(3);
        for (int i = 2; i < 6; i++) {
            assertTrue(adminDashboard.searchBoxProductInformation.get(i).isDisplayed());
        }
        for (int i = 7; i < 15; i++) {
            assertTrue(adminDashboard.searchBoxProductInformation.get(i).isDisplayed());
        }

    }
    //TC05
    @Given("Enter the information in the Weight Height Info section")
    public void enter_the_information_in_the_weight_height_info_section() {
        ReusableMethods.wait(3);
        userDashboard.checkListELements(adminDashboard.searchBoxPriceInfo,4);

    }
    //TC06
    @Given("Information is entered in Price Info and Stock section")
    public void information_is_entered_in_price_info_and_stock_section() {
        ReusableMethods.wait(3);
        for (int i = 2; i < 6; i++) {
            assertTrue(adminDashboard.searchBoxProductInformation.get(i).isDisplayed());
        }

    }
    //TC07
    @Given("Picture is added to Description section")
    public void picture_is_added_to_description_section() {
        adminDashboard.buttonPicture.click();


    }
    //TC08
    @Given("the necessary information is entered and a new product is added to the site")
    public void the_necessary_information_is_entered_and_a_new_product_is_added_to_the_site() {

    }

    @Given("Save & Publish and Save buttons are visible and their activation is confirmed")
    public void save_publish_and_save_buttons_are_visible_and_their_activation_is_confirmed() {

    }

    @Given("a new product is added to the site")
    public void a_new_product_is_added_to_the_site() {

    }
    //TC09
    @Given("On the Add New Product page, related products are determined for the product to be added")
    public void on_the_add_new_product_page_related_products_are_determined_for_the_product_to_be_added() {
        adminDashboard.verifyVisibleActive(adminDashboard.linkRelatedProduct);


    }
    //TC10
    @Given("On the Add New Product page, select the products up sale")
    public void on_the_add_new_product_page_select_the_products_up_sale() {
        adminDashboard.verifyVisibleActive(adminDashboard.linkUpSale);
    }
    //TC11
    @Given("On the Add New Product page, select the products cross  sale")
    public void on_the_add_new_product_page_select_the_products_cross_sale() {
        adminDashboard.verifyVisibleActive(adminDashboard.linkCrossSale);
    }
        //TC12
        @Given("Add New Product sayfasinda {string} uyari mesaji goruntulenir")
        public void add_new_product_sayfasinda_uyari_mesaji_goruntulenir(String string) {
       assertTrue( adminDashboard.labelWarningText.isDisplayed());

        }
        //TC13
        @Given("Display Category und clicks")
        public void display_category_und_clicks() {


        }
        @Given("Display Brand  Page und clicks")
        public void display_brand_page_und_clicks() {


        }
        @Given("Display Unit  Page und clicks")
         public void display_unit_page_und_clicks() {

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
    @Given("Verify that it redirects to the Support Ticket page")
    public void verify_that_it_redirects_to_the_support_ticket_page() {

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

    //================ USS 41 ============================

    @Given("Click on Human Resource DDM in the navbar on the left")
    public void click_on_human_resource_ddm_in_the_navbar_on_the_left() {
          adminDashboard.dorpDownHumanResource.click();
          ReusableMethods.wait(2);
    }
    @Given("Clicks the {string}")
    public void clicks_the(String info) {
        ReusableMethods.wait(1);
         adminDashboard.linkStaff.click();
          ReusableMethods.wait(2);
    }
    @Given("It is verified that he went to the Staff page")
    public void it_is_verified_that_he_went_to_the_staff_page() {
          assertEquals("https://qa.buysellcycle.com/hr/staffs",Driver.getDriver().getCurrentUrl());
    }


    @Given("It is verified that the Staff List titles are seen")
    public void it_is_verified_that_the_staff_list_titles_are_seen() {
         assertTrue(adminDashboard.rowStaffListBasliklar.get(1).isDisplayed());
    }

    @Given("The status of the desired employee is changed by clicking on the Status checkbox.")
    public void the_status_of_the_desired_employee_is_changed_by_clicking_on_the_status_checkbox() {
         adminDashboard.checkboxStatusStaff.click();
         ReusableMethods.wait(2);
    }
    @Given("Slect DDM clicks on the desired employee")
    public void slect_ddm_clicks_on_the_desired_employee() {
        adminDashboard.ikonSayıStaff.click();
        adminDashboard.dropDownSelectStaff.click();
    }

    @Given("Type the name of the desired employee and press enter.")
    public void type_the_name_of_the_desired_employee_and_press_enter() {
        adminDashboard.textBoxQuickSearchStaff.click();
        adminDashboard.textBoxQuickSearchStaff.sendKeys("Zehra");
    }


    @Given("Staff filters the List titles by clicking on the desired title.")
    public void staff_filters_the_list_titles_by_clicking_on_the_desired_title() {
        adminDashboard.rowStaffListBasliklar.get(2).click();
        ReusableMethods.wait(2);
        adminDashboard.rowStaffListBasliklar.get(1).click();
    }




    @Given("Fills in the necessary information")
    public void fills_in_the_necessary_information() {

    }



    @Given("Fills in the required information incompletely")
    public void fills_in_the_required_information_incompletely() {

    }

    @Given("Gets an error message")
    public void gets_an_error_message() {

    }


    @Given("It is verified that the new staff record created appears in the staff list.")
    public void it_is_verified_that_the_new_staff_record_created_appears_in_the_staff_list() {

    }

    //US_044 TC01

    @Given("clicks on the Order Manage menu link")
    public void clicks_on_the_order_manage_menu_link() {
        adminDashboard.linkOrderManage.click();
    }

    @Given("clicks on the Total Order submenu link")
    public void clicks_on_the_total_order_submenu_link() {
       adminDashboard.subLinkTotalOrder.click();
    }
    @Given("verifies that the Total Order page is accessible")
    public void verifies_that_the_total_order_page_is_accessible() {
        assertEquals("https://qa.buysellcycle.com/ordermanage/total-sales-list", Driver.getDriver().getCurrentUrl());
    }

    //US_044 TC02
    @Given("verifies that lists for Pending Orders, Confirmed Orders, Completed Orders, Pending Payment Orders, Refused and Cancelled Orders, and Inhouse Orders are displayed")
    public void verifies_that_lists_for_pending_orders_confirmed_orders_completed_orders_pending_payment_orders_refused_and_cancelled_orders_and_ınhouse_orders_are_displayed() {
        System.out.println(adminDashboard.totalOrderLists.getText());
        assertTrue(adminDashboard.totalOrderLists.getText().contains("PENDING PAYMENT ORDERS"));
    }

    //US_044 TC03
    @Given("clicks on the pending Details option to view detailed information")
    public void clicks_on_the_pending_details_option_to_view_detailed_information() {
        ReusableMethods.clickWithJS(adminDashboard.buttonpendingAction);
        ReusableMethods.clickWithJS(adminDashboard.buttonpendingSelect);
        ReusableMethods.clickWithJS(adminDashboard.pendingconfirmedOrder);
    }
    @Given("verifies that detailed information of the selected pending order is displayed")
    public void verifies_that_detailed_information_of_the_selected_pending_order_is_displayed() {
        assertTrue(adminDashboard.labelConfirmedOrderConfirm.isDisplayed());
    }
    //US_044 TC04
    @Given("updates the order confirmation, payment status, and completion status randomly")
    public void updates_the_order_confirmation_payment_status_and_completion_status_randomly() {
        ReusableMethods.clickWithJS(adminDashboard.dropDownOrderConfirmationSelect);
        ReusableMethods.clickWithJS(adminDashboard.subupdateRandomSelect);

    }

    @Given("clicks on the Update button to save the changes")
    public void clicks_on_the_update_button_to_save_the_changes() {
        ReusableMethods.clickWithJS(adminDashboard.buttonConfirmUpdate);
    }

    @Given("verifies that the changes are saved successfully")
    public void verifies_that_the_changes_are_saved_successfully() {
        assertEquals("Updated successfully!", adminDashboard.labelupdateSuccesfully.getText());
    }

    //US_044 TC05
    @Given("verifies that the order status is updated to confirmed")
    public void verifies_that_the_order_status_is_updated_to_confirmed() {
        ReusableMethods.clickWithJS(adminDashboard.pendingconfirmedOrder);
        assertEquals("Status Updated successfully!", adminDashboard.labelupdateSuccesfully.getText());
    }
    //US_044 TC06
    @Given("enters a search query in the Quick Search text box in the Pending Orders List")
    public void enters_a_search_query_in_the_quick_search_text_box_in_the_pending_orders_list() {
        ReusableMethods.clickWithJS(adminDashboard.searchBoxPendingQuickSearch);
        adminDashboard.searchBoxPendingQuickSearch.sendKeys("nobady" + Keys.ENTER);
    }

    @Given("verifies that results matching the search query are displayed")
    public void verifies_that_results_matching_the_search_query_are_displayed() {
        System.out.println(adminDashboard.searchBoxQuickSearchResultText.getText());
        assertTrue(adminDashboard.searchBoxQuickSearchResultText.getText().contains("nobady"));
    }
    //US_044 TC07
    @Given("selects the Confirmed Orders option")
    public void selects_the_confirmed_orders_option() {
        ReusableMethods.clickWithJS(adminDashboard.buttonLinkconfirmedOrder);

    }

    @Given("enters a search query3 in the Quick Search text box in the Confirmed Orders List")
    public void enters_a_search_query3_in_the_quick_search_text_box_in_the_confirmed_orders_list() {
        ReusableMethods.clickWithJS(adminDashboard.searchBoxConfirmedQuickSearch);
        adminDashboard.searchBoxConfirmedQuickSearch.sendKeys("......." + Keys.ENTER);

    }

    @Given("verifies that results matching the search query3 are displayed")
    public void verifies_that_results_matching_the_search_query3_are_displayed() {

    }
    //US_044 TC08
    @Given("clicks on the confirmed Details option to view detailed information")
    public void clicks_on_the_confirmed_details_option_to_view_detailed_information() {
        ReusableMethods.clickWithJS(adminDashboard.buttonLinkconfirmedOrder);
        ReusableMethods.clickWithJS(adminDashboard.buttonconfirmedAction);
        ReusableMethods.clickWithJS(adminDashboard.buttonconfirmedSelect);
        ReusableMethods.clickWithJS(adminDashboard.dropDownconfirmedDetailsSelect);
    }
    @Given("verifies that detailed information is displayed")
    public void verifies_that_detailed_information_is_displayed() {
        assertTrue(adminDashboard.labelConfirmedOrderConfirm.isDisplayed());
    }
    //US_044 TC09
    @Given("selects the Completed Orders option")
    public void selects_the_completed_orders_option() {
        ReusableMethods.clickWithJS(adminDashboard.buttonLinkcompletedOrder);
    }

    @Given("enters a search query in the Quick Search text box in the Completed Orders List")
    public void enters_a_search_query_in_the_quick_search_text_box_in_the_completed_orders_list() {
        ReusableMethods.clickWithJS(adminDashboard.searchBoxCompletedQuickSearch);
        adminDashboard.searchBoxCompletedQuickSearch.sendKeys("......." + Keys.ENTER);
    }

    @Given("verifies that results matching the search query2 are displayed")
    public void verifies_that_results_matching_the_search_query2_are_displayed() {

    }

    //US_044 TC10

    @Given("selects a completed order from the list")
    public void selects_a_completed_order_from_the_list() {
        ReusableMethods.clickWithJS(adminDashboard.buttonLinkcompletedOrder);
        ReusableMethods.clickWithJS(adminDashboard.buttonCompletedAction);


    }

    @Given("clicks on the completed Details option to view detailed information")
    public void clicks_on_the_completed_details_option_to_view_detailed_information() {
        ReusableMethods.clickWithJS(adminDashboard.buttonconfirmedSelect);
        ReusableMethods.clickWithJS(adminDashboard.completedDetail);
    }

    //US_044 TC11
    @Given("selects the Pending Payment Orders option")
    public void selects_the_pending_payment_orders_option() {
        ReusableMethods.clickWithJS(adminDashboard.buttonLinkpaymentOrder);
    }

    @Given("enters a search query in the Quick Search text box in the Pending Payment Orders List")
    public void enters_a_search_query_in_the_quick_search_text_box_in_the_pending_payment_orders_list() {
        ReusableMethods.clickWithJS(adminDashboard.serchBoxPayment);
        adminDashboard.serchBoxPayment.sendKeys("ugur" + Keys.ENTER);
    }
    @Given("verifies that payment results matching the search query are displayed")
    public void verifies_that_payment_results_matching_the_search_query_are_displayed() {

    }
    //US_044 TC12
    @Given("selects a pending payment order from the list")
    public void selects_a_pending_payment_order_from_the_list() {
        ReusableMethods.clickWithJS(adminDashboard.buttonLinkpaymentOrder);
        ReusableMethods.clickWithJS(adminDashboard.buttonPaymentAction);
    }

    @Given("clicks on the payment Details option to view detailed information")
    public void clicks_on_the_payment_details_option_to_view_detailed_information() {
        ReusableMethods.clickWithJS(adminDashboard.buttonPaymentSelect);
        ReusableMethods.clickWithJS(adminDashboard.linkPaymentDetails);
    }
    //US_044 TC13

    @Given("selects the RefusedCancelled Orders option")
    public void selects_the_refused_cancelled_orders_option() {
        ReusableMethods.clickWithJS(adminDashboard.buttonLinkRefusedCancelled);
    }

    @Given("enters a search query in the Quick Search text box in the RefusedCancelled Orders List")
    public void enters_a_search_query_in_the_quick_search_text_box_in_the_refused_cancelled_orders_list() {
        ReusableMethods.clickWithJS(adminDashboard.searchBoxQuickRefused);
        adminDashboard.searchBoxQuickRefused.sendKeys("ugur" + Keys.ENTER);

    }
    @Given("verifies that results matching the search RefusedCancelled Orders query are displayed")
    public void verifies_that_results_matching_the_search_refused_cancelled_orders_query_are_displayed() {

    }
    //US_044 TC14
    @Given("Click on RefusedCancelled Orders at the top")
    public void click_on_refused_cancelled_orders_at_the_top() {
        ReusableMethods.clickWithJS(adminDashboard.buttonLinkRefusedCancelled);
    }
    @Given("Clicks any Action in the RefusedCancelled Orders List")
    public void clicks_any_action_in_the_refused_cancelled_orders_list() {
        ReusableMethods.clickWithJS(adminDashboard.buttonRefusedCancelledAction);
    }
    @Given("Clicks Select buttonLink under refusedAction")
    public void clicks_select_button_link_under_refused_action() {
        ReusableMethods.clickWithJS(adminDashboard.buttonRefusedCancelledSelect);
        ReusableMethods.clickWithJS(adminDashboard.linkRefusedCancelledDetails);
    }
    @Given("Click on Details to view the results")
    public void click_on_details_to_view_the_results() {
        assertTrue(adminDashboard.orderCancelledText.isDisplayed());
    }
    @Given("selects a refusedcancelled order from the list")
    public void selects_a_refused_cancelled_order_from_the_list() {
        tableStr = ReusableMethods.strListeOlustur(adminDashboard.adminTable);

    }
    @Given("verifies that detailed information of the selected refusedcancelled order is displayed")
    public void verifies_that_detailed_information_of_the_selected_refused_cancelled_order_is_displayed() {
        System.out.println(tableStr.contains("admin"));
    }



}
