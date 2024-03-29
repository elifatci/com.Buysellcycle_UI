package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VisitorHomePage extends Base {


    @FindBy(linkText = "Login")
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
}
