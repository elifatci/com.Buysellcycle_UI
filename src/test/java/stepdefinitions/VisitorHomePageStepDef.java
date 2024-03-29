package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Base;
import utils.ConfigReader;
import utils.Driver;

public class VisitorHomePageStepDef extends Base {

    @Given("go to {string}")
    public void go_to(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("Verify that the title is {string}")
    public void verify_that_the_title_is(String title) {
        String actualResult = Driver.getDriver().getTitle();
        Assert.assertEquals(title, actualResult);
    }

    @Then("Close the page")
    public void close_the_page() {
       // Driver.closeDriver();
    }
}
