package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ReusableMethods;

import java.util.List;

import static org.junit.Assert.assertTrue;


public class VisitorHomePage extends Base{

   
    @FindBy(xpath = "//*[text()='Login']")
    public WebElement linkLogin;

    @FindBy(xpath = "(//i[@class='ti-close'])[2]")
    public WebElement buttonPopUpClose;

    @FindBy(xpath = "//img[@class='img-fluid']")
    public WebElement iconLoginPage;

    @FindBy(xpath = "//h4[text()='Turn your ideas into reality..']")
    public WebElement labelLoginText;

    @FindBy(xpath = "//div[@class='amazy_login_form']")
    public WebElement formSignIn;

    @FindBy(xpath = "//button[@id='sign_in_btn']")
    public WebElement buttonSignIn;

    @FindBy(xpath = "//a[text()='Click Here']")
    public WebElement linkForgotPassword;

    @FindBy(xpath = "//a[text()='Sign Up']")
    public WebElement linkDontHaveAnAccount;

    @FindBy(xpath = "//input[@id='text']")
    public WebElement textBoxMail;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement textBoxPassword;

    @FindBy(xpath = "//span[text()='These credentials do not match our records.']")
    public WebElement textErrorLogin;


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

    @FindBy(xpath = "//*[text()='/ Register']")
    public WebElement linkRegister;
    @FindBy(xpath = "//*[@src='https://qa.buysellcycle.com/public/frontend/amazy/img/banner/login_img.png']")
    public WebElement logoBuySell;
    @FindBy(xpath = "//*[text() = 'Turn your ideas into reality.']")
    public WebElement labelPictureText;
    @FindBy(xpath = "//*[@class='amazy_login_form']")
    public WebElement tableRegisterForm;
    @FindBy(id = "first_name")
    public WebElement textBoxFirstName;
    @FindBy(id = "last_name")
    public WebElement textBoxLastName;
    @FindBy(id = "email")
    public WebElement textBoxEmail;
    @FindBy(id = "password-confirm")
    public WebElement textBoxPasswordConfirm;
    @FindBy(id = "sign_in_btn")
    public WebElement signUpButton;
    @FindBy(xpath = "//*[@href='https://qa.buysellcycle.com/login']")
    public WebElement linkSignIn;
    @FindBy(xpath = "//*[text()='Registration successfull, Please wait for active your account']")
    public WebElement labelRegistrationAlert;
    @FindBy(xpath = "(//*[@class='text-danger'])[1]")
    public WebElement labelNameError;
    @FindBy(xpath = "(//*[@class='text-danger'])[3]")
    public WebElement labelEmailError;
    @FindBy(xpath = "(//*[@class='text-danger'])[5]")
    public WebElement labelPasswordError;
    @FindBy(xpath = "(//*[text()='Contact'])[1]")
    public WebElement linkHeaderContact;
    @FindBy(xpath = "//*[text()='Call or WhatsApp:']")
    public WebElement labelContactCallOrWhatsapp;
    @FindBy(xpath = "//*[text()='Get in touch:']")
    public WebElement labelContactGetInTouch;
    @FindBy(xpath = "//*[text()='Social Media:']")
    public WebElement labelContactSocialMedia;
    @FindBy(xpath = "//*[text()='Head office:']")
    public WebElement labelContactHeadOffice;
    @FindBy(xpath = "(//*[@class='contact_box_desc mb-0'])[1]")
    public WebElement labelContactWhatsappNumber;
    @FindBy(xpath = "(//*[@class='contact_box_desc mb-0'])[2]")
    public WebElement labelContactEmail;
    @FindBy(xpath = "(//*[@class='contact_box_desc mb-0'])[3]")
    public WebElement labelContactAddress;
    @FindBy(xpath = "//a[@href='http://facebook.com']")
    public WebElement iconContactFacebook;
    @FindBy(xpath = "//a[@href='http://x.com']")
    public WebElement iconContactTwitter;
    @FindBy(xpath = "//a[@href='http://linkedin.com']")
    public WebElement iconContactLinkedin;
    @FindBy(xpath = "//a[@href='http://instagram.com']")
    public WebElement iconContactInstagram;
    @FindBy(xpath = "//*[text()='Get in touch']")
    public WebElement labelFormGetInTouch;
    @FindBy(id = "name")
    public WebElement textBoxName;
    @FindBy(id = "message")
    public WebElement textBoxMessage;
    @FindBy(xpath = "//select[@name='query_type']")
    public WebElement dropDownOrder;
    @FindBy(id = "contactBtn")
    public WebElement sendMessageButton;

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

//**********************US_06/TC_01*****US_15/TC_01********************************
    //HomePage>>AllCategories
    @FindBy(xpath = "//div[@class='dropdown show category_menu']")
    public WebElement DropDownAllCateg;

    //HomePage>>AllCategoriesButton
    @FindBy(xpath = "//*[@class='dropdown_menu catdropdown_menu dropdown_menu_active']")
    public WebElement buttonAllCateg;

    //HomePage>>AllCategories>>subDropdown
    @FindBy(xpath = "//*[@class='dropdown_menu catdropdown_menu dropdown_menu_active']")
    public WebElement subDropdownAllCateg;

    //HomePage>>AllCategories>>electronics
    @FindBy(xpath = "(//ul[@class='mega_width_menu'])[1]")
    public WebElement buttonElectClickView;

    //HomePage>>AllCategories>>electronics>>subcategories
    @FindBy(xpath = "//a[@href='https://qa.buysellcycle.com/category/mobile-phone-?item=category']")
    public WebElement linkmobilePhone;

    //HomePage>>AllCategories>>Fashion>>subcategories
    @FindBy(xpath = "(//ul[@class='mega_width_menu'])[2]")
    public WebElement buttonFashionClickView;

    //HomePage>>AllCategories>>Fashion>>subcategories
    @FindBy(xpath = "//a[@href='https://qa.buysellcycle.com/category/w-dress?item=category']")
    public WebElement linkWomanDress;

    //HomePage>>AllCategories>>Baby>>subcategories
    @FindBy(xpath = "(//ul[@class='mega_width_menu'])[3]")
    public WebElement babyClickView;

    //HomePage>>AllCategories>>Baby>>subcategories
    @FindBy(xpath = "//a[@href='https://qa.buysellcycle.com/category/baby-credle?item=category']")
    public WebElement linkbabyCredle;

    //HomePage>>Body>>Elektronics
    @FindBy(xpath = "(//h4[@id='filter_category_title'])[1]")
    public WebElement BodyElectronics;

    //HomePage>>Body>>Elektronics>>subCategories
    @FindBy(xpath = "(//ul[@role='tablist'])[1]")
    public WebElement bodyElecSubCat;

    //HomePage>>Body>>Elektronics>>subCategories
    @FindBy(xpath = "(//img[@title='APPLE iPhone 15 Pro 128 GB'])[1]")
    public WebElement imageProductTelephone;

    //HomePage>>Body>>Elektronics>>subCategories
    @FindBy(xpath = "(//img[@title='LG 55QNED816RE 55-inch 139 Screen'])[1]")
    public WebElement imageProductTvPicSound;
  //***************************************************************************************************
    @FindBy (xpath = "(//*[text()='About Us'])[1]")
    public WebElement linkHeaderAboutUs;

    @FindBy (xpath = "(//*[text()='About Us'])[3]")
    public WebElement labelAboutUs;

    @FindBy (xpath = "//*[text()='Client Worldwide']")
    public WebElement labelClientWorlwide;

    @FindBy (xpath = "//*[text()='Successful Project']")
    public WebElement labelSuccessfulProject;

    @FindBy (xpath = "//*[text()='Work Employed']")
    public WebElement labelWorkEmployed;

    @FindBy (xpath = "//*[text()='Planning Services']")
    public WebElement labelPlanningServices;

    @FindBy (xpath = "(//span[@class='d-block font_14 f_w_500 text-uppercase secondary_text lh-1 mb_23'])[3]")
    public WebElement labelTeamMember;

    @FindBy (xpath = "//*[text()='Avery Collins']")
    public WebElement imageProfileAveryCollins;

    @FindBy (xpath = "//*[text()='Emily Pattinson']")
    public WebElement imageProfileEmilyPattinson;

    @FindBy (xpath = "//*[text()='Jason Statham']")
    public WebElement imageProfileJasonStatham;

    @FindBy (xpath = "//*[text()='Jaxon Westwood']")
    public WebElement imageProfileJaxonWestwood;

    //Homepage>>Header>> Blog menu link
    @FindBy(xpath = "(//*[text()='Blog'])[1]")
    public WebElement linkHeaderBlog;


    public void verifyVisible(WebElement element){
        Assert.assertTrue(element.isDisplayed());
    }

    public void verifyActive(WebElement element){
        Assert.assertTrue(element.isEnabled());
    }

    //Blog page>>Read More link
    @FindBy(className = "amazy_readMore_link")
    public List<WebElement> linkReadMore;

    //Blog page>> Read More link 4.
    @FindBy(xpath = "(//*[@class='amazy_readMore_link'])[4]")
    public WebElement linkReadMoreFour;

    //Blog page>>Keywords text
    @FindBy(xpath = "(//*[@class='font_18 f_w_700 mb_10'])[3]")
    public WebElement labelKeywords;

    //Blog page>> Read more>> blog content
    @FindBy(xpath = "//*[text()='E-commerce']")
    public WebElement labelCommerceContent;

    //Blog page>> search box
    @FindBy(xpath = "//*[@placeholder='Search Post']")
    public WebElement searchBoxPost;

    //US_02 HomePage TRACK YOUR ORDER link
    @FindBy(xpath = "//*[text()='Track Your Order']")
    public WebElement 	linkHeaderTrackYourOrder;
    //US_02 HomePage COMPARE link
    @FindBy(xpath = "//*[text()='Compare(']")
    public WebElement 	linkHeaderCompare;
    //US_02 HomePage WISHLIST link
    @FindBy(xpath = "//*[text()='Wishlist (']")
    public WebElement 	linkHeaderWishList;

    //US_02 HomePage CART link
    @FindBy(xpath = "//*[text()='Cart (']")
    public WebElement 	linkHeaderCart;

    //US_02 HomePage Daily deals link
    @FindBy(xpath = "//*[@id=\"sticky-header\"]/div[3]/div/div/div/div/div[4]/a[2]/span")
    public WebElement 	linkDailyDeals;

    //US_02 HomePage Buysell Logo
    @FindBy(xpath = "//*[text()='BuySellCycle']")
    public WebElement 	logoBuysell;

    //US_02 HomePage Search Box Kutusu
    @FindBy(xpath = "(//*[@id='inlineFormInputGroup'])[1]")
    public WebElement searchBoxHomePage;

    //US_13 HomePage Slider image
    @FindBy(xpath = "(//*[@class='img-fluid'])[1]")
    public WebElement imageProductSliderimage1;

    //US_13 HomePage Icon1
    @FindBy(xpath = "(//*[@class='owl-nav disabled'])[1]")
    public WebElement icon1;

    //US_13 HomePage image1
    @FindBy(xpath = "(//*[@class='img-fluid'])[1]")
    public WebElement imageProduct1;


    //US_13 HomePage Icon1
    @FindBy(xpath = "(//*[@class='owl-dot'])[1]")
    public WebElement icon2;

    //US_13 HomePage image2
    @FindBy(xpath = "(//*[@class='img-fluid'])[2]")
    public WebElement imageProduct2;

    //US_13 HomePage image3
    @FindBy(xpath = "(//*[@class='img-fluid'])[3]")
    public WebElement imageProduct3;

    //US_13 HomePage Icon1
    @FindBy(xpath = "(//*[@class='owl-dot active'])[1]")
    public WebElement icon3;

    //Blog page>> Category section
    @FindBy(xpath = "//*[@class='blog_sidebar_box mb_20']")
    public WebElement labelBlogCategory;

    //Blog page>> Category>> subCategory
    @FindBy(xpath = "(//*[@class='label_name f_w_400'])[3]")
    public WebElement linkBlogShopping;

    //Blog page>> Popular Post section
    @FindBy(xpath = "//*[@class='blog_sidebar_box mb_15']")
    public WebElement labelPopularPost;

    //Blog page>> Keywords section
    @FindBy(xpath = "//*[text()='shopping']")
    public WebElement buttonBlogShopping;

}
