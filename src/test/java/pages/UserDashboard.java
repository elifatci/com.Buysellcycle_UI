package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;
import java.util.List;
import java.util.logging.XMLFormatter;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
    @FindBy(xpath = "//*[@class='font_20 f_w_700 mb-0 ']")
    public WebElement labelPurchaseHistory;

    //Purchase History Page>> Purchase History Table
    @FindBy(xpath = "//table//tr/th")
    public List<WebElement> tablePurchaseHistory;

    //Purchase History Page>> Purchase History Table>> burger icon
    @FindBy(xpath = "//*[@class='amazy_status_btn purchase_show']")
    public WebElement iconBurgerPurchase;

    //Purchase History Page>> Purchase History Table>> Download icon
    @FindBy(xpath = "(//*[@class='amazy_status_btn'])[3]")
    public WebElement iconDownload;

    //------SideBar------------------
    @FindBy(xpath = "(//a[@href='https://qa.buysellcycle.com/my-wishlist'])[2]")
    public WebElement linkWishList_sidebar;

    //-----> US20 locates: User Dashboard > My Order Menu
    //-----> TC01:
    @FindBy(xpath = "(//*[@class='close_modal'])[1]")
    public WebElement closeSubscribe;
    @FindBy(xpath = "(//*[@class='position-relative d-flex align-items-center'])[3]")
    public WebElement linkMyOrder;
    //-----> TC02:
    @FindBy(xpath = "//*[@class='nav-link  active ']")
    public WebElement linkAll;
    @FindBy(xpath = "//*[@id='Pay-tab']")
    public WebElement linkToPay;
    @FindBy(xpath = "//*[@id='Ship-tab']")
    public WebElement linkToShip;
    @FindBy(xpath = "//*[@id='Receive-tab']")
    public WebElement linkToRecieve;
    @FindBy(xpath = "(//*[@class='d-flex align-items-center flex-wrap gap_5'])[1]")
    public WebElement labelOrderID;
    @FindBy(xpath = "(//*[@class='d-flex align-items-center flex-wrap gap_5'])[2]")
    public WebElement labelOrderDate;
    @FindBy(xpath = "(//*[@class='d-flex align-items-center flex-wrap gap_5'])[3]")
    public WebElement labelStatus;
    @FindBy(xpath = "(//*[@class='d-flex align-items-center flex-wrap gap_5'])[4]")
    public WebElement labelOrderAmount;
    @FindBy(xpath = "(//*[@class='d-flex align-items-center flex-wrap gap_5'])[5]")
    public WebElement labelPaidBy;
    @FindBy(xpath = "(//*[@class='amaz_primary_btn style2 text-nowrap '])[1]")
    public WebElement orderDetailsButton;
    @FindBy(xpath = "//*[@class='nice-select amaz_select5']")
    public WebElement dropDownLast5Orders;
    //-----> TC03:
    @FindBy(xpath = "//*[@class='amaz_primary_btn gray_bg_btn min_200 radius_3px ml_10 order_cancel_by_id']")
    public WebElement cancelOrderButton;
    @FindBy(xpath = "//*[@class='nice-select primary_input3 radius_3px style6']")
    public WebElement dropDownReason;
    @FindBy(xpath = "(//*[@class='home10_primary_btn2 text-center f_w_700'])[1]")
    public WebElement sendCancelOrderButton;
    //-----> TC04:
    @FindBy(xpath = "(//*[@class='dashboard_white_box_body'])[1]")
    public WebElement labelPending;
    @FindBy(xpath = "(//*[@class='dashboard_white_box_body'])[2]")
    public WebElement labelProcessing;
    @FindBy(xpath = "(//*[@class='dashboard_white_box_body'])[1]")
    public WebElement labelShipped;
    @FindBy(xpath = "(//*[@class='dashboard_white_box_body'])[1]")
    public WebElement labelReceived;
    @FindBy(xpath = "(//*[@class='dashboard_white_box_body'])[1]")
    public WebElement labelDelivered;
    @FindBy(xpath = "(//*[@class='font_16 f_w_700 m-0'])[1]")
    public WebElement labelPackage;
    @FindBy(xpath = "(//*[@class='font_16 f_w_700 m-0'])[2]")
    public WebElement labelSoldBy;
    @FindBy(xpath = "(//*[@class='font_16 f_w_700 m-0'])[3]")
    public WebElement labelPrice;
    @FindBy(xpath = "(//*[@class='summery_lists flex-fill'])[1]")
    public WebElement labelShippingInfo;
    @FindBy(xpath = "(//*[@class='summery_lists flex-fill'])[2]")
    public WebElement labelBillingPaymentInfo;
    @FindBy(xpath = "//*[@class='amaz_primary_btn gray_bg_btn radius_3px order_cancel_by_id']")
    public WebElement cancelOrderButtonUS20;



    public void loginUser(String email, String password){

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
        //iconBurgerPurchase.isDisplayed();
        //iconBurgerPurchase.isEnabled();
        //iconDownload.isDisplayed();
        //iconDownload.isEnabled();
    }

    @FindBy(xpath = "(//a[@href='https://qa.buysellcycle.com/profile/dashboard'])[1]")
    public WebElement linkHeaderDashboard;

    @FindBy(xpath = "//a[@href='https://qa.buysellcycle.com/profile']")
    public WebElement columnProfileInformation;

    @FindBy(xpath = "//p[@id='total_balance']")
    public WebElement columnTotalBalance;

    @FindBy (xpath = "//*[text()='Last transaction']")
    public WebElement labelLastTransaction;

    @FindBy(xpath = "//div[3]/div//div[2]/div/div[1]/div/div")
    public List<WebElement> labelListSummaryInformationBoard;

    @FindBy(xpath = "(//*[text()='My Wishlist'])[2]")
    public WebElement labelMyWishList;

    @FindBy(xpath = "//*[text()='Recent Order']")
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
  
   //-------------------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "(//*[@class='position-relative d-flex align-items-center '])[1]")
    public WebElement linkMyWallet;

    @FindBy(xpath = "//body/div[3]//div[2]/div/div[2]/div")
    public List<WebElement> linkListMyWallet;

    @FindBy(xpath = "(//*[@data-bs-target='#recharge_wallet'])[2]")
    public WebElement linkRechargeWallet;

    @FindBy(xpath = "//*[@name='recharge_amount']")
    public WebElement textBoxRechargeAmount;

    @FindBy(xpath = "//*[text()='Add Fund']")
    public WebElement addFundButton;

    @FindBy(xpath = "//*[@class='wallet_elemnt']")
    public WebElement linkPaymentType;

    @FindBy(xpath = "(//*[text()='Stripe Payment'])[2]")
    public WebElement labelPaymentType;

    @FindBy(xpath = "//*[@name='stripe_checkout_app']")
    public WebElement labelIframe;

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

    @FindBy(xpath = "(//tbody)[1]/tr[1]/td[3]")
    public WebElement labelFirstAmount;

    @FindBy(xpath = "(//*[@href='https://qa.buysellcycle.com/my-wishlist'])[2]")
    public WebElement linkMyWishlist;

    @FindBy(id = "productShow")
    public WebElement labelResults;

    @FindBy(xpath = "//*[@name='sort_by']")
    public WebElement dropDownSortBy;

    @FindBy(id = "paginate_by")
    public WebElement dropDownShowItems;

    @FindBy(xpath = "//*[@class='nice-select amaz_select4']")
    public WebElement dropDownShowItems2;

    @FindBy(xpath = "(//*[@title='Compare'])[1]")
    public WebElement iconCompare;

    @FindBy(xpath = "(//*[@title='Compare'])[2]")
    public WebElement iconCompare2;

    @FindBy(xpath = "//*[@href='https://qa.buysellcycle.com/compare']")
    public WebElement linkCompare;

    @FindBy(id = "compare_list_div")
    public WebElement labelCompareList;

    @FindBy(xpath = "(//*[@title='Quick View'])[1]")
    public WebElement iconQuickView;

    @FindBy(xpath = "//*[@class='product_quick_view ']")
    public WebElement labelQuickViewPage;

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
    //==================================================================================================================

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

    //Purchase History page>>All History filter
    @FindBy(xpath = "//*[@class='nice-select amaz_select3']")
    public WebElement dropdownAllHistory;
   
    //********************US_24/TC_01,TC_02********************************************

    //UserDasboard/Side Bar /My Account
    @FindBy(xpath = "(//a[@href='https://qa.buysellcycle.com/profile'])[2]")
    public WebElement linkHeaderMyAccount;

    //UserDasboard/Side Bar /My Account
    @FindBy(xpath = "//label[@class='primary-btn small fix-gr-bg']")
    public WebElement imageProfileBrowse;

    //UserDasboard/Side Bar /My Account
    @FindBy(xpath = "//label[@class='primary-btn small fix-gr-bg']")
    public WebElement buttonBrowse;

    //UserDasboard/Side Bar /My Account
    @FindBy(xpath = "//button[@id='Info-tab']")
    public WebElement buttonBasicInfo;

    //UserDasboard/Side Bar /My Account
    @FindBy(xpath = "//form[@id='basic_info']")
    public WebElement textboxBasicInfo;

    //UserDasboard/Side Bar /My Account
    @FindBy(xpath = "//input[@id='first_name']")
    public  WebElement textBoxFistName;

    //UserDasboard/Side Bar /My Account
    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement textBoxLastName;

    //UserDasboard/Side Bar /My Account
    @FindBy(xpath = "//input[@id='email']")
    public WebElement textBoxEmailBasicInfo;

    //UserDasboard/Side Bar /My Account
    @FindBy(xpath = "//button[@id='update_info']")
    public WebElement buttonUpdateNow;
//****************************************************************************************************************************
    // US_22 My Coupons link
    @FindBy(xpath = "(//*[@class='position-relative d-flex align-items-center'])[5]")
    public WebElement linkMyCoupons;

    // US_22 Search Box add Coupons

    //@FindBy(className= "primary_input3 rounded-0 style2  flex-fill")
    //public WebElement searchBoxAddCoupon;

   // @FindBy(className= "primary_input3 rounded-0 style2  flex-fill")
   // public WebElement searchBoxAddCoupon;


    // US_22 table Collected Coupons
    //@FindBy(className= "table_border_whiteBox mb_30")
    //public WebElement tableCollectedCoupons;

    // US_22 icon Copy
    @FindBy(xpath= "(//*[@id='Layer_1'])[2]")
    public WebElement iconCopy;

    // US_22 icon delete
    @FindBy(xpath= "(//*[@id='Layer_1'])[1]")
    public WebElement iconCouponDelete;

    // US_29 Logout Buton
    @FindBy(xpath= "//*[@class='log_out']")
    public WebElement buttonLogout;

    // US_29 DashBOard side bar Log OUt
    @FindBy(xpath= "(/html/body/div[3]/div/div/div[1]/div/div[2]/div/ul/li[16]/a")
    public WebElement buttonLogOutSideBar;

    //************************US_24/TC_03********************************************************************

    //MyDasboard/MyAccount/ChangePassword
    @FindBy(xpath = "//button[@id='Password-tab']")
    public WebElement buttonChangePassword;

    //MyDasboard/MyAccount/ChangePassword
    @FindBy(xpath = "//input[@id='currentPassword']")
    public WebElement textBoxCurrentPassword;

    //MyDasboard/MyAccount/ChangePassword
    @FindBy(xpath = "//input[@id='newPass']")
    public WebElement textBoxNewPassword;

    //MyDasboard/MyAccount/ChangePassword
    @FindBy(xpath = "//input[@id='rePass']")
    public WebElement textBoxRenewPassword;

    //MyDasboard/MyAccount/ChangePassword
    @FindBy(xpath = "(//div[@class='col-12'])[5]")
    public WebElement buttonUpdateNowClick;

    //MyDasboard/MyAccount/ChangePassword
    @FindBy(xpath = "//span[@class='validation-old-pass-error text-danger error']")
    public WebElement labelNotMatchOldPasswordMessage;

    //MyDasboard/MyAccount/ChangePassword
    @FindBy(xpath = "//span[@class='validation-new-pass-confirm-error text-danger error']")
    public WebElement labelNotMuchNewPasswordMessage;

    //MyDasboard/MyAccount/Address
    @FindBy(xpath = "//button[@id='Address-tab']")
    public WebElement buttonAddressMyAccountClick;

    //MyDasboard/MyAccount/Address
    @FindBy(xpath = "//table[@id='address_table']")
    public WebElement tableAddresMyAccount;

    //MyDasboard/MyAccount/Address
    @FindBy(xpath = "(//button[@class='amazy_status_btn edit_address'])[1]")
    public WebElement iconEditAddress;

    //MyDasboard/MyAccount/Address
    @FindBy(xpath = "(//button[@class='amazy_status_btn delete_address_btn mt_10'])[1]")
    public WebElement iconDeleteAddress;

    //MyDasboard/MyAccount/AddNewAddress
    @FindBy(xpath = "//a[@class='add_new_address amaz_primary_btn style2 rounded-0 text-uppercase text-center min_200']")
    public WebElement buttonAddNewAddressClick;

    //MyDasboard/MyAccount/AddNewAddress
    @FindBy(xpath = "//input[@name='shipping_address']")
    public WebElement textBoxShippingAddressClick;

    //MyDasboard/MyAccount/AddNewAddress
    @FindBy(xpath = "//input[@name='billing_address']")
    public WebElement textBoxBillingAddressClick;

    //MyDasboard/MyAccount/AddNewAddress
    @FindBy(xpath = "//input[@id='address_name']")
    public WebElement checkBoxAddressName;

    @FindBy(xpath = "//button[@class='amaz_primary_btn style2 radius_5px w-100 text-center  text-uppercase  text-center min_200']")
    public WebElement buttonCreateAddNewAddress;

//======================================================================================================================
    public void checkClickElement(WebElement element){
        assertTrue(element.isDisplayed());
        assertTrue(element.isEnabled());
        ReusableMethods.clickWithJS(element);
    }
    public void checkSendKeysBox(WebElement element, String propertiesValue){
        assertTrue(element.isDisplayed());
        assertTrue(element.isEnabled());
        element.clear();
        element.sendKeys(ConfigReader.getProperty(propertiesValue));
    }
    public void checkUrl(String propertiesUrl){
        assertEquals(ConfigReader.getProperty(propertiesUrl) , Driver.getDriver().getCurrentUrl());
    }
    public void checkListELements(List<WebElement> element , int count){
        for (int i = 0; i < count; i++) {
            assertTrue(element.get(i).isDisplayed());
        }
    }

    //Purchase History page>> table
    @FindBy(xpath = "//*[@class='summery_modal_body']")
    public WebElement labelInvoicePageText;

    //Purchase History page>> invoice
    @FindBy(xpath = "//*[@title='Cash On Delivery']")
    public WebElement imageCashOnDelivery;

    //Purchase History page>> All History dropdown
    @FindBy(xpath = "//*[@class='option selected focus']")
    public WebElement dropdownAllHistoryCompleted;

    //Purchase History page>> Completed Page
    @FindBy(xpath = "(//*[@class='table_badge_btn style4 text-nowrap'])[2]")
    public WebElement labelPaidPurchase;


}