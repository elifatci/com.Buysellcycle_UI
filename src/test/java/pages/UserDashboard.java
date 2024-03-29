package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserDashboard extends Base{

    @FindBy(xpath = "(//*[@name='login'])[2]")
    public WebElement textBoxLogin;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement textBoxPassword;

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

        textBoxLogin.sendKeys(email);
        textBoxPassword.sendKeys(password);
    }

}
