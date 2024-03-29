package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VisitorHomePage extends Base{


    @FindBy(xpath = "(//*[text()='Login'])[1]")
    public WebElement linkLogin;

    @FindBy(id = "sign_in_btn")
    public WebElement buttonSignIn;
}
