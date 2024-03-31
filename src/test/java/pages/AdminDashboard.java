package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AdminDashboard extends Base{
    //------------------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//*[text()='Products']")
    public WebElement dropDownProducts;

    @FindBy(xpath = "//*[text()='Product List']")
    public WebElement linkProductList;

    @FindBy(xpath = "//*[@href='#order_complete_data']")
    public WebElement linkSellerRequestProduct;

    @FindBy(xpath = "//*[@href='#product_disabled_data']")
    public WebElement linkDisabledProduct;

    @FindBy(xpath = "//*[@href='#product_sku_data']")
    public WebElement linkProductBySKU;

    @FindBy(xpath = "(//*[@class='mb-0 mr-30 mb_xs_15px mb_sm_20px'])[1]")
    public WebElement labelProductList;

    @FindBy(xpath = "(//*[@class='mb-0 mr-30 mb_xs_15px mb_sm_20px'])[2]")
    public WebElement labelSellerRequestProduct;

    @FindBy(xpath = "(//*[@class='mb-0 mr-30 mb_xs_15px mb_sm_20px'])[3]")
    public WebElement labelDisabledProduct;

    @FindBy(xpath = "(//*[@class='mb-0 mr-30 mb_xs_15px mb_sm_20px'])[4]")
    public WebElement labelProductBySKU;

    @FindBy(xpath = "(//thead)[1]/tr[1]/th")
    public List<WebElement> rowListProductList;

    @FindBy(xpath = "(//*[@type='search'])[1]")
    public WebElement textBoxQuickSearch;

    @FindBy(xpath = "(//tbody)[1]/tr[1]/td[2]")
    public WebElement labelSearchedProduct;

    @FindBy(xpath = "(//*[@class='slider round'])[1]")
    public WebElement radioButtonStatus;

    @FindBy(xpath = "//*[text()='Updated successfully!']")
    public WebElement labelStatusConfirm;

    @FindBy(xpath = "(//*[@id='dropdownMenu2'])[1]")
    public WebElement dropDownSelect;

    @FindBy(xpath = "(//*[text()='View'])[2]")
    public WebElement linkViewProduct;

    @FindBy(xpath = "(//*[text()='Edit'])[1]")
    public WebElement linkEditProduct;

    @FindBy(xpath = "(//*[text()='Clone'])[1]")
    public WebElement linkCloneProduct;

    @FindBy(xpath = "(//*[text()='Delete'])[1]")
    public WebElement linkDeleteProduct;

    @FindBy(xpath = "(//*[@id='dataDeleteBtn'])[2]")
    public WebElement buttonDeleteProduct;

    @FindBy(xpath = "//*[text()='Deleted successfully!']")
    public WebElement labelDeleteSuccess;


    //------------Nazime----------------------

    //US_38 dashboardside bar Add New Product link
    @FindBy(xpath = "//*[@id=\"sidebar_menu\"]/li[8]/ul/li[5]/a")
    public WebElement linkAddNewProduct;


    //US_38 dashboardside bar Add New Product link-General Information
    @FindBy(xpath = "(//*[@class='nav-item'])[1]")
    public WebElement linkGeneralInformation;

    //US_38 dashboardside bar Add New Product link-RelatedProduct;
    @FindBy(xpath = "(//*[@class='nav-item'])[2]")
    public WebElement linkRelatedProduct;

    //US_38 dashboardside bar Add New Product link-UpSaLE
    @FindBy(xpath = "(//*[@class='nav-item'])[3]")
    public WebElement linkUpSale;

    //US_38 dashboardside bar Add New Product link-CrossSale
    @FindBy(xpath = "(//*[@class='nav-item'])[4]")
    public WebElement linkCrossSale;

    //US_38 dashboardside bar Single radio button
    @FindBy(xpath = "//*[@id='single_prod']")
    public WebElement radioButtonSingle;

    //US_38 Add new Product variant radio button
    @FindBy(xpath = "//*[@id=\"variant_prod\"]")
    public WebElement radioButtonVariant;

    //US_38 Add new Product Name Box
    @FindBy(xpath = "(//*[@class='primary_input_field'])[1]")
    public WebElement searchBoxName;


    //US_38 Add new SubTitle  Box
    @FindBy(xpath = "//*[@id='subtitle_1']")
    public WebElement searchBoxSubTitle1;

    //US_38 Add new SubTitle2  Box
    @FindBy(xpath = "//*[@id='subtitle_2']")
    public WebElement searchBoxSubTitle2;

    //US_38 Add new Variant SKU  Box
    @FindBy(xpath = "//*[@id='variant_sku_prefix']")
    public WebElement searchBoxVariantSKU;

    //US_38 Add new Model Nummer Box
    @FindBy(xpath = "//*[@id='model_number']")
    public WebElement searchBoxModelNummer;

    //US_38 Add new Category Box

    //@FindBy(className= "/select2-selection select2-selection--multiple")
    //public WebElement searchBoxCategory;

   //@FindBy(className= "/select2-selection select2-selection--multiple")
   //public WebElement searchBoxCategory;

    //US_38 Add new Brand Box
    @FindBy(xpath= "//*[@id='select2-brand_id-container']")
    public WebElement searchBoxBrand;

    //US_38 Add new Unit Box
    //@FindBy(className= "nice-select primary_select mb-15 unit")
    //public WebElement searchBoxUnit;

    //US_38 Add new MINIMUM ORDER QTY  Box
    @FindBy(xpath= "//*[@id='minimum_order_qty']")
    public WebElement searchBoxMinimumOrderQty;

    //US_38 Add new Maximum ORDER QTY  Box
    @FindBy(xpath= "//*[@id='max_order_qty']")
    public WebElement searchBoxMaximumOrderQty;

    //US_38 Add new tags Box
    @FindBy(className= "bootstrap-tagsinput")
    public WebElement searchBoxTags;

    //US_38 Products dropdown Category link
    @FindBy(xpath= "//*[@id=\"sidebar_menu\"]/li[8]/ul/li[1]/a")
    public WebElement linkCategory;

    //US_38 Products dropdown Brand link
    @FindBy(xpath= "//*[@id=\"sidebar_menu\"]/li[8]/ul/li[2]/a/text()")
    public WebElement linkBrand;

    //US_38 Products dropdown Units link
    @FindBy(xpath= "//*[@id=\"sidebar_menu\"]/li[8]/ul/li[4]/a/text()")
    public WebElement linkUnits;
    //-----------------------------------------
//***********************US_34/TC_01******************************************

    //Admin/Dashboard/SearchTextBox
    @FindBy(xpath = "//input[@id='search']")
    public WebElement searchBoxAdminClick;

    //Admin/Dashboard/SearchTextBox(dashbord yazısı girilecek)
    @FindBy(xpath = "(//div[@class='nav_title'])[1]")
    public WebElement textBoxDashboard;

    //Admin/Dashboard/MenüİconSideBar
    @FindBy(xpath = "//div[@class='collaspe_icon open_miniSide']")
    public WebElement iconMenuMiniSideBar;

    //Admin/Dashboard/CustomerInterface
    @FindBy(xpath = "(//div[@class='nav_title'])[4]")
    public WebElement buttonCustomerInterfaceClick;

    //Admin/Dashboard/AllCustomerInterface
    @FindBy(xpath = "//*[@class='mm-collapse mm-show']")
    public WebElement buttonAllCustomerInterfaceClick;


    //Dashboard>> Profile image
    @FindBy(className = "user_avatar_div")
    public WebElement imageProfile;

    //Dashboard>>Profile image>>subTitle
    @FindBy(className = "profile_info_iner")
    public WebElement subMenuProfile;

    //Dashboard>>Profile image>>My Profile link
    @FindBy(xpath = "//*[text()='My Profile']")
    public WebElement linkMyProfile;

    //Dashboard>> Close successful login message
    @FindBy(xpath = "//*[@class='toast-close-button']")
    public WebElement iconCloseSuccessMessage;

    //My profile page>> Basic Info text
    @FindBy(xpath = "//*[text()='Basic Info']")
    public WebElement labelBasicInfo;

    //My profile page>> FirstName text
    @FindBy(xpath = "(//*[@class='primary_input_label'])[1]")
    public WebElement labelFirstNameText;

    //My profile page>> LastName text
    @FindBy(xpath = "(//*[@class='primary_input_label'])[2]")
    public WebElement labelLastNameText;

    //My profile page>> Email text
    @FindBy(xpath = "(//*[@class='primary_input_label'])[3]")
    public WebElement labelEmailText;

    //My profile page>> PhoneNumber text
    @FindBy(xpath = "(//*[@class='primary_input_label'])[4]")
    public WebElement labelPhoneNumberText;

    //My profile page>> Date Of Birth text
    @FindBy(xpath = "(//*[@class='primary_input_label'])[5]")
    public WebElement labelDateOfBirthText;

    //My profile page>> Avatar button
    @FindBy(xpath = "//*[@class='primary-btn small fix-gr-bg']")
    public WebElement buttonAvatar;

    //My profile page>> Update button
    @FindBy(xpath = "//*[@id='update_info']")
    public WebElement buttonUpdate;
    public void verifyVisible(WebElement element){
        element.isDisplayed();
    }

    public void verifyVisibleActive(WebElement element){
        element.isDisplayed();
        element.isEnabled();
    }
}
