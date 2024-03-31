package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.Base;
import pages.UserDashboard;
import utils.ConfigReader;
import utils.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
}
