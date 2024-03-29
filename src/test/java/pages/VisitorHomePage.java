package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VisitorHomePage extends Base{

    //----------------------------------
    @FindBy(linkText = "Login")
    public WebElement linkLogin;

    @FindBy(xpath = "//*[text()='/ Register']")
    public WebElement linkRegister;

    @FindBy(xpath = "(//*[text() = 'Sign Up'])[1]")
    public WebElement labelSignUp;

    @FindBy(id = "first_name")
    public WebElement textBoxFirstName;

    @FindBy(id = "last_name")
    public WebElement textBoxLastName;

    @FindBy(id = "email")
    public WebElement textBoxEmail;

    @FindBy(id = "referral_code")
    public WebElement textBoxReferralCode;

    @FindBy(id = "password")
    public WebElement textBoxPassword;

    @FindBy(id = "password-confirm")
    public WebElement textBoxPasswordConfirm;

    @FindBy(xpath = "(//div/label/span)[5]")
    public WebElement checkBoxTermsOfService;

    @FindBy(id = "sign_in_btn")
    public WebElement signUpButton;

    @FindBy(xpath = "(//*[text()='Contact'])[1]")
    public WebElement linkHeaderContact;

    @FindBy(xpath = "//*[text()='Call or WhatsApp:']")
    public WebElement labelCallOrWhatsapp;

    @FindBy(xpath = "//*[text()='Get in touch:']")
    public WebElement labelGetInTouch;

    @FindBy(xpath = "//*[text()='Social Media:']")
    public WebElement labelSocialMedia;

    @FindBy(xpath = "//*[text()='Head office:']")
    public WebElement labelHeadOffice;

    @FindBy(xpath = "(//*[@class='contact_box_desc mb-0'])[1]")
    public WebElement labelWhatsappNumber;

    @FindBy(xpath = "(//*[@class='contact_box_desc mb-0'])[2]")
    public WebElement labelEmail;

    @FindBy(xpath = "(//*[@class='contact_box_desc mb-0'])[3]")
    public WebElement labelAddress;

    @FindBy(xpath = "//a[@href='http://facebook.com']")
    public WebElement iconFacebook;

    @FindBy(xpath = "//a[@href='http://x.com']")
    public WebElement iconTwitter;

    @FindBy(xpath = "//a[@href='http://linkedin.com']")
    public WebElement iconLinkedin;

    @FindBy(xpath = "//a[@href='http://instagram.com']'")
    public WebElement iconInstagram;

    @FindBy(xpath = "//*[text()='Get in touch']'")
    public WebElement labelFormGetInTouch;

    @FindBy(id = "name")
    public WebElement textBoxName;

    @FindBy(id = "message")
    public WebElement textBoxMessage;

    @FindBy(xpath = "//select[@name='query_type']")
    public WebElement dropDownOrder;

    @FindBy(id = "contactBtn")
    public WebElement sendMessageButton;
    //----------------------------------
}
