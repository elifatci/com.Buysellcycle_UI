package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UserDashboard extends Base{

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
    @FindBy (xpath = "//table//tr/th")
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


    //----------------------------------
    @FindBy(xpath = "(//*[@href='https://qa.buysellcycle.com/wallet/customer/my-wallet-index'])[2]")
    public WebElement linkMyWallet;

    @FindBy(xpath = "//body/div[3]//div[2]/div/div[2]/div")
    public List<WebElement> linkListMyWallet;

    //Homepage>> LoginLink>> Email Text Box ||
    @FindBy(xpath = "(//*[@data-bs-target='#recharge_wallet'])[2]")
    public WebElement linkRechargeWallet;

    @FindBy(xpath = "//*[@name='recharge_amount']")
    public WebElement textBoxRechargeAmount;

    @FindBy(xpath = "//*[text()='Add Fund']")
    public WebElement addFundButton;

    @FindBy(xpath = "//*[@class='wallet_elemnt active']")
    public WebElement linkPaymentType;

    @FindBy(xpath = "(//*[text()='Stripe Payment'])[2]")
    public WebElement labelPaymentType;

    @FindBy(id = "email")
    public WebElement textBoxEmail;

    @FindBy(id = "card_number")
    public WebElement textBoxCardNumber;

    @FindBy(id = "cc-exp")
    public WebElement textBoxExpirationDate;

    @FindBy(id = "cc-csc")
    public WebElement textBoxCsc;

    @FindBy(xpath = "//*[@class='iconTick']")
    public WebElement payButton;

    @FindBy(xpath = "(//thead)[1]/tr/th")
    public List<WebElement> rowListWalletHistory;

    @FindBy(xpath = "(//*[@href='https://qa.buysellcycle.com/my-wishlist'])[2]")
    public WebElement linkMyWishlist;

    @FindBy(xpath = "//*[@class='font_14 f_w_400 flex-fill mb-0']")
    public WebElement labelResults;

    @FindBy(xpath = "//*[@name='sort_by']")
    public WebElement dropDownSortBy;

    @FindBy(xpath = "//*[@name='paginate_by']")
    public WebElement dropDownShowItems;

    @FindBy(xpath = "(//*[@title='Compare'])[1]")
    public WebElement iconCompare;

    @FindBy(xpath = "(//*[@title='Compare'])[2]")
    public WebElement iconCompare2;

    @FindBy(xpath = "//*[@href='https://qa.buysellcycle.com/compare']")
    public WebElement linkCompare;

    @FindBy(xpath = "//div/div[2]/div/div[1]/div/div[1]/a")
    public WebElement linkFirstProduct;

    @FindBy(xpath = "//div/div[2]/div/div[2]/div/div[1]/a")
    public WebElement linkSecondProduct;

    @FindBy(xpath = "(//*[@title='Delete'])[1]")
    public WebElement iconDelete;

    @FindBy(xpath = "//*[text()='Delete Wishlist Product']")
    public WebElement labelDeleteWishlist;

    @FindBy(id = "dataDeleteBtn")
    public WebElement deleteButton;

    @FindBy(xpath = "(//*[@title='Add to Cart'])[1]")
    public WebElement iconAddToCart;

    @FindBy(xpath = "(//*[text()='Item added to your cart'])[1]")
    public WebElement labelItemAddedConfirmation;
    //----------------------------------








    //===========USER SUPPORT TİCKET >> US26===========

    @FindBy(xpath = "(//a[@class='position-relative d-flex align-items-center '])[2]")
    public WebElement linkUserSupportTicket;

    @FindBy(xpath = "//h4[@class='font_24 f_w_700 flex-fill m-0']")
    public WebElement labelAllSubmittedTicket;

    @FindBy(xpath = "//div[contains(@class, 'amaz_select4')]")
    public WebElement dropDownAllTicketPlaceholder;

    @FindBy(xpath = "/html/body/div[3]//tbody/tr[1]/td[1]")
    public WebElement rowBodyTicketSubjectPriority;//alt bilgilerin ilki

    @FindBy(xpath = "/html/body/div[3]//thead/tr/th[1]")
    public WebElement rowHeaderTicketSubjectPriority; //başlık bilgilerinin ilki

    @FindBy(xpath = "/html/body/div[3]//tbody/tr[1]/td[6]")
    public WebElement linkView;// view linkinin ilki

    @FindBy(xpath = "(//span[@class='font_14 f_w_500'])[1]")
    public WebElement labelStatus;//view e girince status texti

    @FindBy(xpath = "(//span[@class='font_14 f_w_500'])[3]")
    public WebElement labelPriority;//view e girince Priority texti

    @FindBy(xpath = "(//span[@class='font_14 f_w_500'])[5]")
    public WebElement labelCategory;//view e girince status texti

    @FindBy(xpath = "(//a[@class='amaz_badge_btn7 d-inline-flex align-items-center'])[1]")
    public WebElement linkStatusInfo;

    @FindBy(xpath = "(//a[@class='amaz_badge_btn7 d-inline-flex align-items-center'])[2]")
    public WebElement linkPriorityInfo;

    @FindBy(xpath = "(//a[@class='amaz_badge_btn7 d-inline-flex align-items-center'])[3]")
    public WebElement linkCategoryInfo;

    @FindBy(xpath = "//div[contains(@class, 'amaz_select4')]")
    public WebElement divAllTicketPendingGoing;

    //===================================================================================

    public void loginUser(String email, String password){

        labelBoxLogin.sendKeys(email);
        labelBoxPassword.sendKeys(password);
        visitorHomePage.buttonSignIn.click();
    }

    public void tableCellDisplayed(int number){
        for (int i = 0; i < number; i++) {
            tablePurchaseHistory.get(number).isDisplayed();
        }
    }

    public void verifyIcon(){
        iconBurgerPurchase.isDisplayed();
        iconBurgerPurchase.isEnabled();
        iconDownload.isDisplayed();
        iconDownload.isEnabled();
    }

}
