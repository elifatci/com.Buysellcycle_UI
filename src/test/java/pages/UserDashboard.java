package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserDashboard extends Base{

    @FindBy(xpath = "(//*[@name='login'])[2]")
    public WebElement textBoxLogin;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement textBoxPassword;

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

        textBoxLogin.sendKeys(email);
        textBoxPassword.sendKeys(password);
    }

}
