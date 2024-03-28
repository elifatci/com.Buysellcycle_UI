package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.Base;
import utils.Driver;

public class AdminDashboardStepDef extends Base {


    @Given("user")
    public void user() {
        Driver.getDriver().get("https://qa.buysellcycle.com/");
    }
}
