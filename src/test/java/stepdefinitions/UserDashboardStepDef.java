package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.Base;
import pages.UserDashboard;
import pages.VisitorHomePage;
import utils.ConfigReader;
import utils.Driver;

public class UserDashboardStepDef extends Base {
/*
    VisitorHomePage visitorHomePage=new VisitorHomePage();
    UserDashboard userDashboard=new UserDashboard();

 */

    @Given("Go to {string}")
    public void go_to(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
    @Given("Clicks the Login buttonLink on the home page")
    public void clicks_the_login_button_link_on_the_home_page() {
            visitorHomePage.linkLogin.click();
    }
    @Given("Login by entering valid {string} and {string} on the SignIn page.")
    public void login_by_entering_valid_email_and_password_on_the_sign_in_page(String email ,String password) {
        userDashboard.loginUser(ConfigReader.getProperty("adminEmailElif"),ConfigReader.getProperty("password"));
    }


}
