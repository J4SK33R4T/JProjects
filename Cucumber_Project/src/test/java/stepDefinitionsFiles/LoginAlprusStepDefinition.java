package stepDefinitionsFiles;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAlprusStepDefinition {

    public WebDriver drv;

    @Given("User should have Valid Username and Password")
    public void user_should_have_valid_username_and_password() {

        // Valid_Username = JAS001
        // Valid_Password = garry123
        // Invalid_Username = xxx001
        // Invalid_Password = xxx123

        drv = new ChromeDriver();
    }

    @Then("User enter URL of Application")
    public void user_enter_url_of_application() {

        drv.get("http://182.76.176.205/BTES");
    }

    @Then("Enter Valid Username")
    public void enter_valid_username() {

        drv.findElement(By.id("mod_login_username")).sendKeys("JAS001");
    }

    @Then("Enter Valid Password")
    public void enter_valid_password() {

        drv.findElement(By.id("mod_login_password")).sendKeys("garry123");
    }

    @When("User click Login Button")
    public void user_click_login_button() {

        drv.findElement(By.name("Submit")).click();
    }

    @Then("User is on HomePage")
    public void user_is_on_home_page() {

        drv.findElement(By.linkText("HOME"));
        System.out.println("U S E R   I S   O N   H O M E P A G E");
    }

    // =====================================================================================================

    @Given("User should have Invalid Username and Valid Password")
    public void user_should_have_invalid_username_and_valid_password() {

        // Invalid_Username = xxx001
        // Valid_Password = garry123
    }

    @Then("Enter Invalid Username")
    public void enter_invalid_username() {

        drv.findElement(By.id("mod_login_username")).sendKeys("xxx001");
    }

    @When("User is not Logged In to Application")
    public void user_is_not_logged_in_to_application() {

        drv.findElement(By.id("mod_login_password")).sendKeys("garry123");
    }

    // =====================================================================================================

    @Given("User should have Valid Username and Invalid Password")
    public void user_should_have_valid_username_and_invalid_password() {

        // Valid_Username = JAS001
        // Invalid_Password = xxx123
    }

    @Then("Enter Invalid Password")
    public void enter_invalid_password() {

        drv.findElement(By.id("mod_login_password")).sendKeys("xxx123");
    }

}