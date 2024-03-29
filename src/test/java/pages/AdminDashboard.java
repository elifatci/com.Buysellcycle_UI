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
    //----------------------------------
}
