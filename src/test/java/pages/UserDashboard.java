package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UserDashboard extends Base {

    //SignUp>> Email Text Box
    @FindBy(xpath = "(//*[@name='login'])[2]")
    public WebElement labelBoxLogin;

    //Homepage>> SignUp>> Password Text Box
    @FindBy(xpath = "//*[@name='password']")
    public WebElement labelBoxPassword;

    //Dashboard>> Purchase History page
    @FindBy(xpath = "(//*[@class='position-relative d-flex align-items-center'])[1]")
    public WebElement linkPurchaseHistory;

    //Purchase History Page>> Purchase History link
    @FindBy(css = ".font_20.f_w_700.mb-0 ")
    public WebElement labelPurchaseHistory;

    //Purchase History Page>> Purchase History Table
    @FindBy(xpath = "//table//tr/th")
    public List<WebElement> tablePurchaseHistory;

    //Purchase History Page>> Purchase History Table>> burger icon
    @FindBy(xpath = "Purchase History Table")
    public WebElement iconBurgerPurchase;

    //Purchase History Page>> Purchase History Table>> Download icon
    @FindBy(xpath = "(//*[@class='amazy_status_btn'])[1]")
    public WebElement iconDownload;

    //------SideBar------------------
    @FindBy(xpath = "(//a[@href='https://qa.buysellcycle.com/my-wishlist'])[2]")
    public WebElement linkWishList_sidebar;


    public void loginUser(String email, String password) {

        labelBoxLogin.sendKeys(email);
        labelBoxPassword.sendKeys(password);
        visitorHomePage.buttonSignIn.click();
    }

    public void tableCellDisplayed(int number) {
        for (int i = 0; i < number; i++) {
            tablePurchaseHistory.get(number).isDisplayed();
        }
    }

    public void verifyIcon() {
        iconBurgerPurchase.isDisplayed();
        iconBurgerPurchase.isEnabled();
        iconDownload.isDisplayed();
        iconDownload.isEnabled();
    }

    @FindBy(xpath = "(//a[@href='https://qa.buysellcycle.com/profile/dashboard'])[1]")
    public WebElement linkHeaderDashboard;

    @FindBy(xpath = "//a[@href='https://qa.buysellcycle.com/profile']")
    public WebElement columnProfileInformation;

    @FindBy(xpath = "//p[@id='total_balance']")
    public WebElement columnTotalBalance;

    @FindBy(xpath = "//div[3]/div//div[2]/div/div[1]/div/div")
    public List<WebElement> labelListSummaryInformationBoard;

    @FindBy(xpath = "(//*[text()='My Wishlist'])[2]")
    public WebElement labelMyWishList;

    @FindBy(xpath = "(//*[text()='Recent Order']")
    public WebElement labelRecentOrder;

    @FindBy(xpath = "//*[text()='Product in Cart']")
    public WebElement labelProductInCart;

    @FindBy(xpath = "//*[@href='https://qa.buysellcycle.com/profile/referral']")
    public WebElement linkRefferal;

    @FindBy(xpath = "//*[text()='My referral code']")
    public WebElement labelMyRefferalCode;

    @FindBy(id = "code")
    public WebElement textBoxReferralCode;

    @FindBy(id = "copyBtn")
    public WebElement copyCodeButton;

    @FindBy(xpath = "(//thead)[1]/tr/th")
    public List<WebElement> rowUserList;

    @FindBy(xpath = "//*[text()='Empty List.']")
    public WebElement labelEmptyList;

    @FindBy(xpath = "(//*[text()='Contact'])[3]")
    public WebElement labelContact;

    @FindBy(xpath = "//*[text()='Ship to']")
    public WebElement labelShipTo;

    @FindBy(xpath = "(//a[@href='https://qa.buysellcycle.com/checkout'])[1]")
    public WebElement changeContactButton;

    @FindBy(xpath = "(//a[@href='https://qa.buysellcycle.com/checkout'])[2]")
    public WebElement getChangeContactButton2;

    @FindBy(xpath = "(//span[@class='checkmark mr_10'])[1]")
    public WebElement radioButtonPayment1;

    @FindBy(xpath = "(//span[@class='checkmark mr_10'])[2]")
    public WebElement radioButtonPayment2;

    @FindBy(xpath = "(//span[@class='checkmark mr_10'])[3]")
    public WebElement radioButtonBillingAddress1;

    @FindBy(xpath = "(//span[@class='checkmark mr_10'])[4]")
    public WebElement radioButtonBillingAddress2;

    @FindBy(xpath = "//*[text()='Order Summary']")
    public WebElement labelOrderSummary;

    @FindBy(id = "coupon_code")
    public WebElement searchBoxCouponCode;

    @FindBy(xpath = "(//button[@type='button'])[1]")
    public WebElement applyCouponButton;

    @FindBy(id = "payment_btn_trigger")
    public WebElement orderNowButton;

    @FindBy(xpath = "//*[text()='Return to information']")
    public WebElement returnToInformationButton;

    @FindBy(xpath = "//*[text()='Thank you for your purchase!']")
    public WebElement labelThankYouForYourPurchase;
}