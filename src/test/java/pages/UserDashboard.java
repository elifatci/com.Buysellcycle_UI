package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserDashboard extends Base{

    @FindBy(xpath = "(//*[@name='login'])[2]")
    public WebElement textBoxLogin;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement textBoxPassword;


    public void loginUser(String email, String password){

        textBoxLogin.sendKeys(email);
        textBoxPassword.sendKeys(password);
    }

}
