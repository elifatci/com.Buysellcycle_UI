package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VisitorHomePage extends Base {


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


}
