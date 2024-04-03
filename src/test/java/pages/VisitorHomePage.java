package pages;

import io.cucumber.java.zh_cn.假如;
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
    @FindBy(xpath = "//a[@href='https://www.youtube.com']")
    public WebElement iconFooterYoutube;


    @FindBy(xpath = "//a[@href='https://www.linkedin.com/']")
    public WebElement iconFooterLinkedin;


    @FindBy(xpath = "//a[@href='https://www.instagram.com']")
    public WebElement iconFooterInstagram;

    @FindBy(xpath = "//a[@href='https://www.facebook.com']")
    public WebElement iconFooterFacebook;

    @FindBy(xpath = "//div[@class='copyright_area p-0']")
    public WebElement labelCopyrightAll;

    @FindBy(xpath = "//*[@id='subscription_email_id']")
    public WebElement textBoxFooterEmail;

    @FindBy(xpath = "//*[@id='subscribeBtn']")
    public WebElement buttonSubscribe;

    @FindBy(xpath = "//div[@class='main_footer_wrap']")
    public WebElement footer;

    @FindBy(xpath = "(//a[@href='https://qa.buysellcycle.com/about-us'])[3]")
    public WebElement linkFooterAboutUs;

    @FindBy(xpath = "(//a[@href='https://qa.buysellcycle.com/blog'])[3]")
    public WebElement linkFooterBlog;

    @FindBy(xpath = "//a[@href='https://qa.buysellcycle.com/profile/dashboard']")
    public WebElement linkFooterDashboard;

    @FindBy(xpath = "//a[@href='https://qa.buysellcycle.com/profile']")
    public WebElement linkFooterMyProfile;

    @FindBy(xpath = "//a[@href='https://qa.buysellcycle.com/my-purchase-orders']")
    public WebElement linkFooterMyOrder;

    @FindBy(xpath = "(//a[@href='https://play.google.com/'])[2]")
    public WebElement buttonGooglePlayFooter;

    @FindBy(xpath = "//a[@href='https://apps.apple.com']")
    public WebElement buttonAppStoreFooter;

    @FindBy(xpath = "(//a[@href='https://qa.buysellcycle.com/contact-us'])[3]")
    public WebElement linkHelpContact;

    @FindBy(xpath = "(//a[@href='https://qa.buysellcycle.com/track-order'])[2]")
    public WebElement linkTrackOrder;

    @FindBy(xpath = "//a[@href='https://qa.buysellcycle.com/return-exchange']")
    public WebElement linkReturnExchange;

    @FindBy(xpath = "//a[@title='Go to Top']")
    public WebElement iconGoToTop;

    @FindBy(xpath = "(//*[@title='woman fashion'])[2]")
    public WebElement imageHeader;

    @FindBy(xpath = "//div[@class='message_div error_color']")
    public WebElement labelMessageFooter;

    @FindBy(className = "toast-message")
    public WebElement textWarning;


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
    @FindBy(xpath = "//button[@id='pills-home-tab']")
    public WebElement buttonForYou;
    @FindBy(linkText = "Products")
    public WebElement labelProducts;
    @FindBy(xpath = "(//div[@class='product_badge'])[3]")
    public WebElement labelDiscount_ForYou;
    @FindBy(xpath = "(//a[@data-product-sku='342'])[2]")
    public WebElement iconCart_ForYou;
    @FindBy(xpath = "//a[@class='addToCompareFromThumnail']")
    public WebElement iconCompareForYou;
    @FindBy(xpath = "//i[@title='Wishlist']")
    public WebElement iconWishList;
    @FindBy(xpath = "(//*[@class='ti-eye'])[1]")
    public WebElement iconQuickView;
    @FindBy(xpath = "//h4[text()='Item added to your cart']")
    public WebElement labelMessageForYou;
    @FindBy(xpath = "(//i[@class='ti-close'])[5]")
    public WebElement buttonCloseForYou;
    @FindBy(xpath = "//img[@class='lazyload']")
    public WebElement imageProductFirstForYou;
    @FindBy(xpath = "//a[@id='add_to_cart_btn_modal']")
    public WebElement buttonAddCartModalForYou;
    @FindBy(xpath = "//i[@title='Wishlist']")
    public WebElement popUpWishListForYou;
    //---Exclusive Price---
    @FindBy(xpath = "//button[@id='pills-profile-tab']")
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
    @FindBy(xpath = "(//img[@class='lazyload'])[3]")
    public WebElement imageProductFirstExclusivePrice;
    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement popUpExclusivePrice;
    @FindBy(xpath = "(//i[@class='ti-close'])[6]")
    public WebElement buttonCloseExclusivePrice;

    //---Coupon----------
    @FindBy(xpath = "//button[@id='pills-contact-tab']")
    public WebElement buttonCoupon;
    @FindBy(xpath = "//img[@class='img-fluid']")
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
    public WebElement dropDownAllCategories;

    //HomePage>>AllCategories>>subDropdown
    @FindBy(xpath = "//*[@class='dropdown_menu catdropdown_menu dropdown_menu_active']")
    public WebElement subDropdownAllCategories;

    //HomePage>>AllCategories>>electronics
    @FindBy(xpath = "//i[@class='fas fa-mobile-alt']")
    public WebElement buttonElectronicsIcon;

    //HomePage>>AllCategories>>electronics>>subcategories
    @FindBy(xpath = "//a[@href='https://qa.buysellcycle.com/category/mobile-phone-?item=category']")
    public WebElement linkmobilePhone;

    //@FindBy(xpath = "//h3[@class='branding_text']")
    //public WebElement textMobilPhone;

    //HomePage>>AllCategories>>Baby>>subcategories
    @FindBy(xpath = "//a[@href='https://qa.buysellcycle.com/category/park-bed?item=category']")
    public WebElement linkBabyBad;

    //HomePage>>AllCategories>>Baby>>subcategories
    @FindBy(xpath = "//i[@class='far fa-grin-squint']")
    public WebElement buttonbabyClickView;

    //HomePage>>AllCategories>>Baby>>subcategories
    @FindBy(xpath = "//a[@href='https://qa.buysellcycle.com/category/baby-stroller?item=category']")
    public WebElement linkBabyStrollerPushchair;

    //@FindBy(xpath = "/html/body/div[3]/div/div/div")
    //public WebElement textBabyChair;

    //HomePage>>Body>>Elektronics
    @FindBy(xpath = "(//h4[@id='filter_category_title'])[1]")
    public WebElement bodyElectronics;//elek.kategori pencere blog olarak locate

    @FindBy(xpath = "//button[@id='tab_link_33']")
    public WebElement buttonTelephone;//electronics body'sindeki button

    //HomePage>>Body>>Elektronics>>subCategories
    @FindBy(xpath = "(//img[@title='APPLE iPhone 15 Pro 128 GB'])[1]")
    public WebElement imageProductTelephone;//urun

    @FindBy(xpath = "//button[@id='tab_link_34']")
    public WebElement buttonTvPicSound;//electronics body'sindeki button

    //HomePage>>Body>>Elektronics>>subCategories
    @FindBy(xpath = "(//img[@title='LG 55QNED816RE 55-inch 139 Screen'])[1]")
    public WebElement imageProductTvPicSound;//urun

    @FindBy(xpath = "(//a[@data-base-price='1450'])[1]")
    public WebElement iconBascetAppleIphone15Pro128Gb;//ürün sepete ekle/click

    @FindBy(xpath = "(//a[@href='https://qa.buysellcycle.com/cart'])[4]")
    public WebElement buttonViewCard;//sepet/ekleme/görüntüleyerek doğrulama

    @FindBy(xpath = "(//i[@title='Compare'])[25]")
    public WebElement iconCompareBascetAppleIphone15Pro128Gb;//ürün/compare/click

    @FindBy(xpath = "//span[@class='compare_count']")
    public WebElement buttonCompareHomePage;//anasayfanın sağ üstünde yer alan compare

    @FindBy(xpath = "//h3[@class='fs-4 fw-bold mb_30']")
    public WebElement textProductCompare;//ürün/compare/yazı görüntülüyerek doğrulama



    @FindBy(xpath = "//button[@class='close_modal_icon']")
    public WebElement buttonCloseIcon1;//view cart'ı çarpıicanuna basarak kapatma

    @FindBy(xpath = "(//i[@class='ti-close'])[4]")
    public WebElement buttonTi_CloseIcon2;//view cartdan sonra açılmış viewshoppingcart penceresini kapatma

    @FindBy(xpath = "(//i[@title='Wishlist'])[25]")
    public WebElement iconWishListAppleIphone15Pro128Gb;//ürün/wislist/click

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement textWarningFirstLogin;//ürünü beğeni listesine eklemeye çalışıldıgında çıkan mesaj

    @FindBy(xpath = "(//a[@href='https://qa.buysellcycle.com/category/electronics?item=category'])[1]")
    public WebElement buttonMoreDealsProduct;//daha fazla ürün listelemek için click

    @FindBy(xpath = "//h5[@class='font_16 f_w_500 mr_10 mb-0']")
    public WebElement textMoreDealsProductList;//listelenen ürün yazısı üzerinden doğrulama

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
    @FindBy(xpath = "//*[@class='logo_img']")
    public WebElement logoBuysell;

    //US_02 HomePage Search Box Kutusu
    @FindBy(xpath = "(//*[@id='inlineFormInputGroup'])[1]")
    public WebElement searchBoxHomePage;

    //US_13 HomePage Icon1
    @FindBy(xpath = "(//div[@class='owl-dot active']")
    public WebElement icon1;

    //US_13 HomePage image1
    @FindBy(xpath = "/html/body/div[3]/div[1]/div/div[3]/a/img")
    public WebElement imageProduct1;


    //US_13 HomePage Icon2
    @FindBy(xpath = "(//*[@class='owl-dot'])[1]")
    public WebElement icon2;

    //US_13 HomePage image2
    @FindBy(xpath = "(//*[@title='sport'])[2]")
    public WebElement imageProduct2;

    //US_13 HomePage image3
    @FindBy(xpath = "(//*[@title='Electronics'])[2]")
    public WebElement imageProduct3;

    //US_13 HomePage Icon3
    @FindBy(xpath = "(//*[@class='owl-dot'])[2]")
    public WebElement icon3;

    //US_13 HomePage title fashion
    @FindBy(className = "branding_text")
    public WebElement labelFashion;

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

    //----->kevser_US03_--> Track Your Order
    @FindBy(xpath = "(//*[@class='primary_input3 rounded-0 style2'])[1]")
    public WebElement textBoxOrderTrackingNumber;
    @FindBy(xpath = "(//*[@class='primary_input3 rounded-0 style2'])[2]")
    public WebElement textBoxSecretID;
    @FindBy(xpath = "//*[@class='amaz_primary_btn  rounded-0  w-100 text-uppercase  text-center']")
    public WebElement buttonTrackNow;
    @FindBy(xpath = "(//*[@class='d-flex align-items-center flex-wrap gap_5'])[1]")
    public WebElement labelOrderID;
    @FindBy(xpath = "//*[text()='The selected order number is invalid.']")
    public WebElement labelOrderIDError;
    @FindBy(xpath = "//*[text()='The selected secret id is invalid.']")
    public WebElement labelSecretIDError;
    @FindBy(xpath = "//*[text()='The order number field is required.']")
    public WebElement labelOrderIDRequired;
    @FindBy(xpath = "/html/body/div[3]/div/div/div/div/form/div/div[2]/label/span")
    public WebElement labelSecretIDRequired;

    // ----> kevser_US14 => HomePage => Body Part
    @FindBy(xpath = "(//*[@class='m-0 flex-fill'])[1]")
    public WebElement labelBestDeals_US14;
    @FindBy(xpath = "(//*[@class='title_link d-flex align-items-center lh-1'])[1]")
    public WebElement viewAllBestDealsButton;
    @FindBy(xpath = "//*[@class='font_16 f_w_500 mr_10 mb-0']")
    public WebElement labelAllProductsNumber;
    @FindBy(xpath = "//*[@class='trending_product_active owl-carousel owl-loaded owl-drag']")
    public WebElement imageProductBestDeals;
    @FindBy(xpath = "(//a[@class='addToCompareFromThumnail'])[1]")
    public WebElement buttonCompare;
    @FindBy(xpath = "//*[@class='single_wish_compare']")
    public WebElement linkAddToCompare;
    @FindBy(xpath = "//*[@class='compare_count']")
    public WebElement linkCompareCount;
    @FindBy(xpath = "(//*[@title='Quick View'])[1]")
    public WebElement buttonQuickView;
    @FindBy(xpath = "//*[@class='product_quick_view ']")
    public WebElement quickViewProductPage;
    @FindBy(xpath = "(//*[@class='add_to_wishlist '])[1]")
    public WebElement buttonWishList;
    @FindBy(xpath = "(//a[@title='Add to Cart'])[1]")
    public WebElement buttonAddToCart;
    @FindBy(xpath = "//*[@class='product_quick_view ']")
    public WebElement addToCartBox;

    @FindBy(xpath = "//*[@id='feature_categories_title']")
    public WebElement labelFeatureCategories;
    @FindBy(xpath = "//*[@id='feature_categories']/div/div[2]/div")
    public List<WebElement> featureCategoriesProdBox;


    @FindBy(xpath = "(//*[@class='shop_now_text'])[1]")
    public WebElement linkShopNow;

    @FindBy(xpath = "//*[@id='top_rating_title']")
    public WebElement labelTopRating;
    @FindBy(xpath = "(//*[@class='owl-stage-outer'])[3]")
    public WebElement prodTopRating;
    @FindBy(xpath = "(//*[@class='ti-angle-left'])[3]")
    public WebElement buttonLeftAngle;
    @FindBy(xpath = "(//*[@class='ti-angle-right'])[3]")
    public WebElement buttonRightAngle;
    @FindBy(xpath = "//*[@id='people_choice_title']")
    public WebElement labelPeopleChoices;
    @FindBy(xpath = "//*[@id='top_picks_title']")
    public WebElement labelTopPicks;
    @FindBy(xpath = "//*[@class='mb-0']")
    public WebElement labelMoreProductsThatYouMayLove;
    @FindBy(xpath = "//*[@id='top_brands_title']")
    public WebElement labelTopBrands;
    @FindBy(xpath = "//*[@class='section__title d-flex align-items-center gap-3 mb_20']")
    public WebElement labelAbout;
    @FindBy(xpath = "//*[@class='amaz_mazing_text']")
    public WebElement labelAboutText;



}
