package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class VisitorHomePage extends Base{


    @FindBy(linkText = "Login")
    public WebElement linkLogin;



    //==============VisitorHomePage >> Footer >>US16 ==============
    @FindBy(xpath = "//i[@class='fab fa-youtube']")
    public WebElement iconFooterYoutube;


    @FindBy(xpath = "//i[@class='fab fa-linkedin']")
    public WebElement iconFooterLinkedin;


    @FindBy(xpath = "//i[@class='fab fa-instagram']")
    public WebElement iconFooterInstagram;

    @FindBy(xpath = "//i[@class='fab fa-facebook-square']")
    public WebElement iconFooterFacebook;

    @FindBy(xpath = "//div[@class='copyright_area p-0']")
    public WebElement labelCopyrightAll;

    @FindBy(xpath = "//*[@id='subscription_email_id']")
    public WebElement textBoxFooterEmail;

    @FindBy(xpath = "//*[@id='subscribeBtn']")
    public WebElement buttonSubscribe;

    @FindBy(xpath = "//div[@class='main_footer_wrap']")
    public WebElement footer;

    @FindBy(xpath = "(//ul[@class='footer_links']/li)[1]")
    public WebElement linkFooterAboutUs;

    @FindBy(xpath = "(//ul[@class='footer_links']/li)[2]")
    public WebElement linkFooterBlog;

    @FindBy(xpath = "(//ul[@class='footer_links']/li)[3]")
    public WebElement linkFooterDashboard;

    @FindBy(xpath = "(//ul[@class='footer_links']/li)[4]")
    public WebElement linkFooterMyProfile;

    @FindBy(xpath = "(//ul[@class='footer_links']/li)[5]")
    public WebElement linkFooterMyOrder;

    @FindBy(xpath = "(//div[@class='apps_boxs']/a)[1]")
    public WebElement buttonGooglePlayFooter;

    @FindBy(xpath = "(//div[@class='apps_boxs']/a)[2]")
    public WebElement buttonAppStoreFooter;

    @FindBy(xpath = "(//div[@class='footer_list_links']/a)[1]")
    public WebElement linkHelpContact;

    @FindBy(xpath = "(//div[@class='footer_list_links']/a)[2]")
    public WebElement linkTrackOrder;

    @FindBy(xpath = "(//div[@class='footer_list_links']/a)[3]")
    public WebElement linkReturnExchange;
   //===================================================================



    //============= New Product Deals >> Best Deals >>US07===========
    @FindBy(xpath = "//div[contains(@class, 'd-md-block')]")
    public WebElement dropDownShowItem;

    @FindBy(xpath = "//div[@class='shorting_box']")
    public WebElement dropDownSortingNew;

    @FindBy(xpath = "//div[@class='course_category_inner']")
    public WebElement checkBoxFilter;//Filitre kutusunun tamamı

    @FindBy(xpath = "//*[@id='refresh_btn']")
    public WebElement buttonRefresh;

    @FindBy(xpath = "(//ul[@id='mobile-menu']/li)[2]")
    public WebElement linkNewProductDeals;

    @FindBy(xpath = "//h3[@class='branding_text']")
    public WebElement labelBestDeals;

    @FindBy(xpath = "(//label[@class='primary_checkbox d-flex'])[1]")
    public WebElement checkBoxWomensApparel;//soldaki kategorilerden ilki

    @FindBy(xpath = "(//*[@class='stock_text'])[2]")
    public WebElement labelCategory;//urunun içine girildiğinde category yazısı
    @FindBy(xpath = "(//div[@class='product__meta text-center'])[1]")
    public WebElement linkProducktText;//gösterilen ürünlerin text kısmının ilki

    @FindBy(xpath = "(//ul[@class='Check_sidebar mb_35'])[1]")
    public WebElement checkBoxFilterProducts;//Fashion kategorisi

    public void control() {
        String expectedResult = visitorHomePage.linkProducktText.getText();
        visitorHomePage.buttonRefresh.click();
        ReusableMethods.wait(5);

       // WebElement actualWebE = ReusableMethods.s(visitorHomePage.linkProducktText);
        String actualResult = visitorHomePage.linkProducktText.getText();
        assertTrue(actualResult.contains(expectedResult));

    }
    //======================================================================





}
