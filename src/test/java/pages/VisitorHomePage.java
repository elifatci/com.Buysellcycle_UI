package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ReusableMethods;
import static org.junit.Assert.assertTrue;
import java.util.List;


public class VisitorHomePage extends Base{

    //----------------------------------
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



    @FindBy(xpath = "//*[text()='/ Register']")
    public WebElement linkRegister;

    @FindBy(xpath = "(//*[text() = 'Sign Up'])[1]")
    public WebElement labelSignUp;

    @FindBy(id = "first_name")
    public WebElement textBoxFirstName;

    @FindBy(id = "last_name")
    public WebElement textBoxLastName;

    @FindBy(id = "email")
    public WebElement textBoxEmail;

    @FindBy(id = "referral_code")
    public WebElement textBoxReferralCode;

    @FindBy(id = "password")
    public WebElement textBoxPassword;

    @FindBy(id = "password-confirm")
    public WebElement textBoxPasswordConfirm;

    @FindBy(xpath = "(//div/label/span)[5]")
    public WebElement checkBoxTermsOfService;

    @FindBy(id = "sign_in_btn")
    public WebElement signUpButton;

    @FindBy(xpath = "(//*[text()='Contact'])[1]")
    public WebElement linkHeaderContact;

    @FindBy(xpath = "//*[text()='Call or WhatsApp:']")
    public WebElement labelCallOrWhatsapp;

    @FindBy(xpath = "//*[text()='Get in touch:']")
    public WebElement labelGetInTouch;

    @FindBy(xpath = "//*[text()='Social Media:']")
    public WebElement labelSocialMedia;

    @FindBy(xpath = "//*[text()='Head office:']")
    public WebElement labelHeadOffice;

    @FindBy(xpath = "(//*[@class='contact_box_desc mb-0'])[1]")
    public WebElement labelWhatsappNumber;

    @FindBy(xpath = "(//*[@class='contact_box_desc mb-0'])[2]")
    public WebElement labelEmail;

    @FindBy(xpath = "(//*[@class='contact_box_desc mb-0'])[3]")
    public WebElement labelAddress;

    @FindBy(xpath = "//a[@href='http://facebook.com']")
    public WebElement iconFacebook;

    @FindBy(xpath = "//a[@href='http://x.com']")
    public WebElement iconTwitter;

    @FindBy(xpath = "//a[@href='http://linkedin.com']")
    public WebElement iconLinkedin;

    @FindBy(xpath = "//a[@href='http://instagram.com']'")
    public WebElement iconInstagram;

    @FindBy(xpath = "//*[text()='Get in touch']'")
    public WebElement labelFormGetInTouch;

    @FindBy(id = "name")
    public WebElement textBoxName;

    @FindBy(id = "message")
    public WebElement textBoxMessage;

    @FindBy(xpath = "//select[@name='query_type']")
    public WebElement dropDownOrder;

    @FindBy(id = "contactBtn")
    public WebElement sendMessageButton;
    //----------------------------------

    @FindBy(xpath = "(//*[text()='Login'])[1]")
    public WebElement linkLogin;

    //------------ Main Menu- Right---------------------
    @FindBy(linkText = "New User Zone")
    public WebElement linkNewUserZone;

    //------------ New User Zone---------------------
    //---For You-------
    @FindBy(linkText = "For You")
    public WebElement buttonForYou;
    @FindBy(linkText = "Products")
    public WebElement labelProducts;
    @FindBy(xpath = "(//a[@data-product-id='341'])[2]")
    public WebElement iconCart_ForYou;
    @FindBy(xpath = "(//a[@data-product-id='341'])[1]")
    public WebElement iconCompare;
    @FindBy(xpath = "//a[@id='wishlistbtn_341']")
    public WebElement iconWishList;
    @FindBy(xpath = "(//*[@class='ti-eye'])[1]")
    public WebElement iconQuickView;

    //---Exclusive Price---
    @FindBy(linkText = "Exclusive Price")
    public WebElement buttonExclusivePrice;
    @FindBy(xpath = "//h3[text()='Exclusive Price']")
    public WebElement labelExclusivePrice;
    @FindBy(xpath = "(//a[@data-product-id='1373'])[2]")
    public WebElement iconCart_ExclusivePrice;
    @FindBy(xpath = "(//a[@data-product-id='1373'])[1]")
    public WebElement iconCompare_ExclusivePrice;
    @FindBy(xpath = "//a[@id='wishlistbtn_1373']")
    public WebElement iconWishList_ExclusivePrice;
    @FindBy(xpath = "(//a[@data-product_id='1373'])[2]")
    public WebElement iconQuickView_ExclusivePrice;
    @FindBy(xpath = "//button[@id='nav-All-tab']")
    public WebElement buttonAll_ExclusivePrice;
    @FindBy(xpath = "//button[@id='Category-tab_1']")
    public WebElement buttonElectronics_ExclusivePrice;
    @FindBy(xpath = "//button[@id='Category-tab_2']")
    public WebElement buttonHome_ExclusivePrice;

    //---Coupon----------
    @FindBy(linkText = "Coupon")
    public WebElement buttonCoupon;
    @FindBy(xpath = "//a[text()='Get Now']")
    public WebElement linkGetCoupon;
    @FindBy(xpath = "//h3[.='New User Gift!']")
    public WebElement labelNewUserGift;
    @FindBy(xpath = "(//a[@data-product-id='341'])[3]")
    public WebElement iconCompare_Coupon;
    @FindBy(xpath = "(//a[@data-product-id='341'])[4]")
    public WebElement iconCart_Coupon;
    @FindBy(xpath = "(//a[@id='wishlistbtn_341'])[2]")
    public WebElement iconWishList_Coupon;
    @FindBy(xpath = "(//a[@data-product_id='341'])[4]")
    public WebElement iconQuickView_Coupon;

    @FindBy(id = "sign_in_btn")
    public WebElement buttonSignIn;



}
