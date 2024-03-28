package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.Random;

public abstract class Base {

    public Base(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public static AdminDashboard adminDashboard;
    public static UserDashboard userDashboard;
    public static VisitorHomePage visitorHomePage;
    public static Faker faker;
    public static Actions actions;
    public static Random random;

    public static void initialize(){

        adminDashboard = new AdminDashboard();
        userDashboard = new UserDashboard();
        visitorHomePage=new VisitorHomePage();
        faker = new Faker();
        actions = new Actions(Driver.getDriver());
        random = new Random();
    }
}
