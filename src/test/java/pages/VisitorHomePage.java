package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VisitorHomePage extends Base{


    @FindBy(linkText = "Login")
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

}
