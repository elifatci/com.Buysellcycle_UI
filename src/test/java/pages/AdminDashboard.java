package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AdminDashboard extends Base{
    //----------------------------------
    @FindBy(xpath = "(//li[@class])[8]")
    public WebElement dropDownProducts;

    @FindBy(xpath = "(//li/ul)[6]/li[6]")
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

    @FindBy(xpath = " (//thead)[1]/tr[1]/th")
    public List<WebElement> rowListProductList;

    @FindBy(xpath = "(//*[@type='search'])[1]")
    public WebElement textBoxQuickSearch;

    @FindBy(xpath = "(//tbody)[1]/tr[1]/td[2]")
    public WebElement labelSearchedProduct;

    @FindBy(xpath = "(//*[@class='slider round'])[1]")
    public WebElement radioButtonStatus;

    @FindBy(xpath = "(//*[@id='dropdownMenu2'])[1]")
    public WebElement dropDownSelect;

    @FindBy(xpath = "(//*[@data-id='438'])[2]")
    public WebElement linkViewProduct;

    @FindBy(xpath = "//*[@href='https://qa.buysellcycle.com/products/438/edit ']")
    public WebElement linkEditProduct;
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
    @FindBy(className= "select2-selection__rendered")
    public WebElement searchBoxCategory;

    //US_38 Add new Brand Box
    @FindBy(xpath= "//*[@id='select2-brand_id-container']")
    public WebElement searchBoxBrand;

    //US_38 Add new Unit Box
    @FindBy(xpath= "//*[@id='error_unit_type']")
    public WebElement searchBoxUnit;

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


}
