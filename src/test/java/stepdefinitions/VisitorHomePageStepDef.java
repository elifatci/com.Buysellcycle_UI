package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.Base;
import pages.VisitorHomePage;
import utils.Driver;
import utils.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class VisitorHomePageStepDef extends Base {


//===================US_07==========================
    @Given("Verifies that the New Product Deals menu title is visible and active")
    public void verifies_that_the_menu_title_is_visible_and_active() {
        assertTrue(visitorHomePage.linkNewProductDeals.isDisplayed());
        assertTrue(visitorHomePage.linkNewProductDeals.isEnabled());
        ReusableMethods.wait(5);
    }
    @Given("Click on the New Product Deals menu title")
    public void click_on_the_menu_title() {
         ReusableMethods.clickWithJS(visitorHomePage.linkNewProductDeals);
    }
    @Given("Verifies that you are directed to the page where current product offers are listed")
    public void verifies_that_you_are_directed_to_the_page_where_current_product_offers_are_listed() {
         assertTrue(visitorHomePage.labelBestDeals.isDisplayed());
    }
    @Given("Closes page")
    public void closes_page() {
        ReusableMethods.wait(3);
        Driver.quitDriver();
    }


    @Given("Verifies that each filter option is visible on the Best Deals page that opens.")
    public void verifies_that_each_filter_option_is_visible_on_the_best_deals_page_that_opens() {
        assertTrue(visitorHomePage.checkBoxFilterProducts.isDisplayed());

    }
    @Given("Selects and applies a filter option.")
    public void selects_and_applies_a_filter_option() {
         ReusableMethods.clickWithJS(visitorHomePage.checkBoxWomensApparel);
         ReusableMethods.wait(3);
    }
    @Given("After the filter is applied, it verifies that the product list is updated according to this filtering.")
    public void after_the_filter_is_applied_it_verifies_that_the_product_list_is_updated_according_to_this_filtering() {

    }
    @Given("Try different filter combinations and check that the results are updated correctly each time.")
    public void try_different_filter_combinations_and_check_that_the_results_are_updated_correctly_each_time() {

    }
    @Given("Verifies that all products are listed again when the filters are reset.")
    public void verifies_that_all_products_are_listed_again_when_the_filters_are_reset() {

    }

    @Given("On the Best Deals page that opens, it verifies that the listing order of the products is sorted according to the newest date.")
    public void on_the_best_deals_page_that_opens_it_verifies_that_the_listing_order_of_the_products_is_sorted_according_to_the_newest_date() {
       ReusableMethods.clickWithJS(visitorHomePage.dropDownSortingNew);



    }
    @Given("Checks the up-to-date status of product information by going to the detail page of each product.")
    public void checks_the_up_to_date_status_of_product_information_by_going_to_the_detail_page_of_each_product() {

    }
    @Given("By checking the products in different categories, it verifies that the most up-to-date products are listed in each category.")
    public void by_checking_the_products_in_different_categories_it_verifies_that_the_most_up_to_date_products_are_listed_in_each_category() {

    }
    @Given("Refresh the page and verify that the product list has been updated")
    public void refresh_the_page_and_verify_that_the_product_list_has_been_updated() {

    }


    @Given("'Show {int} item's' DDM verifies that it is visible")
    public void show_item_s_ddm_verifies_that_it_is_visible(Integer int1) {

    }
    @Given("{string} confirms that DDM is visible")
    public void confirms_that_ddm_is_visible(String string) {

    }
    @Given("Clicks on the 'Show {int} item's' DDM menu and selects one of the options in the list")
    public void clicks_on_the_show_item_s_ddm_menu_and_selects_one_of_the_options_in_the_list(Integer int1) {

    }
    @Given("Verifies that the page has changed according to the selected view")
    public void verifies_that_the_page_has_changed_according_to_the_selected_view() {

    }
    @Given("Clicks on the {string} DDM menu and verifies that the new, old, name, price options are seen in the list.")
    public void clicks_on_the_ddm_menu_and_verifies_that_the_new_old_name_price_options_are_seen_in_the_list(String string) {

    }
    @Given("Verifies that the page changes correctly when one of the options is clicked")
    public void verifies_that_the_page_changes_correctly_when_one_of_the_options_is_clicked() {

    }

    @Given("Verifies that the Refresh button is visible and active")
    public void verifies_that_the_refresh_button_is_visible_and_active() {
         assertTrue(visitorHomePage.buttonRefresh.isDisplayed());
         assertTrue(visitorHomePage.buttonRefresh.isEnabled());
    }
    @Given("Clicks the Refresh button")
    public void clicks_the_refresh_button() {
          visitorHomePage.buttonRefresh.click();
    }
    @Given("Verifies that the page has been refreshed and the content has been updated")
    public void verifies_that_the_page_has_been_refreshed_and_the_content_has_been_updated() {
          visitorHomePage.control();

    }
//======================================================================================================

}
