package StepDefinitions;


import Pages.Dialog;
import Pages.Navigation;
import Utilities.DriverClass;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _01_LoginSteps {

    Dialog dialog = new Dialog();
    Navigation navigation = new Navigation();
    WebDriverWait wait = new WebDriverWait(DriverClass.getDriver(), Duration.ofSeconds(5));

    @Given("Navigate to Campus Web Site")
    public void navigate_to_campus_web_site() {
        //System.out.println("Navigating to Campus");
        DriverClass.getDriver().get("https://test.mersys.io/");
    }

    @Given("Enter username and password")
    public void enter_username_and_password() {
        //System.out.println("Entering username and password");
        wait.until(ExpectedConditions.visibilityOf(dialog.getUsername()));
        dialog.getUsername().sendKeys("turkeyts");
        dialog.getPassword().sendKeys("TechnoStudy123");
    }

    @When("Click on Login Button")
    public void click_on_login_button() {
        //System.out.println("Clicking on Login Button");
        dialog.getLoginButton().click();
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        //System.out.println("User is logged in");
        wait.until(ExpectedConditions.visibilityOf(navigation.getDashBoardTitle()));
        Assert.assertTrue(navigation.getDashBoardTitle().isDisplayed());
    }
}
