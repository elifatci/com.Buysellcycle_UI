package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.Base;
import pages.VisitorHomePage;
import utils.ConfigReader;
import utils.Driver;

import java.util.Properties;


public class VisitorHomePageStepDef extends Base {

    VisitorHomePage visitorHomePage = new VisitorHomePage();

    // US05 ---- TC01
    @Given("The user clicks on the LOGIN button at the top right corner of the page")
    public void the_user_clicks_on_the_login_button_at_the_top_right_corner_of_the_page() {
        visitorHomePage.linkLogin.click();
    }
    @Given("It is checked whether the login page is opened")
    public void it_is_checked_whether_the_login_page_is_opened() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.buysellcycle.com/login";
        Assert.assertEquals(expectedUrl,actualUrl);
    }
    @Given("{int} seconds pause")
    public void seconds_pause(Integer seconds) throws InterruptedException {
    Thread.sleep(seconds*1000);
    }
    @Given("The user closes the page")
    public void the_user_closes_the_page() {
        Driver.quitDriver();
    }


    // US05 ---- TC02
    @Given("It is checked if there is a picture displayed on the right side of the page")
    public void it_is_checked_if_there_is_a_picture_displayed_on_the_right_side_of_the_page() {
    Assert.assertTrue(visitorHomePage.iconLoginPage.isDisplayed());
    }
    @Given("It is checked if there is a TURN YOUR IDEAS INTO REALITY quote on the right side of the page")
    public void it_is_checked_if_there_is_a_turn_your_ideas_into_reality_quote_on_the_right_side_of_the_page() {
    Assert.assertTrue(visitorHomePage.labelLoginText.isDisplayed());
    }
    @Given("It is checked if there is a sign-in form on the left side of the page")
    public void it_is_checked_if_there_is_a_sign_in_form_on_the_left_side_of_the_page() {
        Assert.assertTrue(visitorHomePage.formSignIn.isDisplayed());
    }
    @Given("It is checked if there is a SIGN IN button below the sign-in form")
    public void it_is_checked_if_there_is_a_sign_in_button_below_the_sign_in_form() {
        Assert.assertTrue(visitorHomePage.buttonSignIn.isDisplayed());
    }
    @Given("It is checked if there is a link below the sign-in form for those who forget their password")
    public void it_is_checked_if_there_is_a_link_below_the_sign_in_form_for_those_who_forget_their_password() {
        Assert.assertTrue(visitorHomePage.linkForgotPassword.isDisplayed());
    }
    @Given("It is checked if there is a link below the sign-in form for those who want to sign up")
    public void it_is_checked_if_there_is_a_link_below_the_sign_in_form_for_those_who_want_to_sign_up() {
        Assert.assertTrue(visitorHomePage.linkDontHaveAnAccount.isDisplayed());
    }



    // US05 ---- TC03
    @Given("The user types in the valid mail address to the mail textbox inside the sign-in form")
    public void the_user_types_in_the_valid_mail_address_to_the_mail_textbox_inside_the_sign_in_form() {
        visitorHomePage.textBoxMail.click();
        visitorHomePage.textBoxMail.sendKeys(ConfigReader.getProperty("customerEmailAhmed"));
    }
    @Given("The user types in the valid password to the password textbox inside the sign-in form")
    public void the_user_types_in_the_valid_password_to_the_password_textbox_inside_the_sign_in_form() {
        visitorHomePage.textBoxPassword.click();
        visitorHomePage.textBoxPassword.sendKeys(ConfigReader.getProperty("password"));
    }
    @Given("The user clicks on the SIGN IN button")
    public void the_user_clicks_on_the_sign_in_button() {
        visitorHomePage.buttonSignIn.click();
    }
    @Given("It is checked if the shown page is User dashboard")
    public void it_is_checked_if_the_shown_page_is_user_dashboard() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.buysellcycle.com/profile/dashboard";
        Assert.assertEquals(expectedUrl,actualUrl);
    }


    // US05 ---- TC04
    @Given("The user types in the invalid mail address to the mail textbox inside the sign-in form")
    public void the_user_types_in_the_invalid_mail_address_to_the_mail_textbox_inside_the_sign_in_form() {
        String invalidMail = "ahmed@muftu.com";
        visitorHomePage.textBoxMail.click();
        visitorHomePage.textBoxMail.sendKeys(invalidMail);
    }
    @Given("The user types in the invalid password to the password textbox inside the sign-in form")
    public void the_user_types_in_the_invalid_password_to_the_password_textbox_inside_the_sign_in_form() {
        String invalidPassword = "asd! ?fgh";
        visitorHomePage.textBoxPassword.click();
        visitorHomePage.textBoxPassword.sendKeys(invalidPassword);
    }
    @Given("It is checked if the error message is displayed")
    public void it_is_checked_if_the_error_message_is_displayed() {
        Assert.assertTrue(visitorHomePage.textErrorLogin.isDisplayed());
    }
}
