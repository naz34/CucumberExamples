package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.RegisterUserPage;
import utilities.ConfigReader;
import utilities.Driver;

import org.openqa.selenium.JavascriptExecutor;
import utilities.ReusableMethods;

import java.time.Duration;

public class RegisterUserStepDefination {

    RegisterUserPage registerUserPage= new RegisterUserPage();

    @Given("User navigates to the {string} page")
    public void userNavigatesToThePage(String urlKey) {
        String url = ConfigReader.getProperty(urlKey);
        Driver.getDriver().get(url);
    }

    @Then("User verifies {string} button is visible")
    public void userVerifiesButtonIsVisible(String buttonName) {
        ReusableMethods.verifyElementIsVisible(registerUserPage.signupLoginButton);
    }

    @When("User clicks on {string} button")
    public void userClicksOnButton(String buttonName) {
        ReusableMethods.clickElement(registerUserPage.signupLoginButton);
    }

    @Then("User verifies {string} text is visible")
    public void userVerifiesTextIsVisible(String expectedText) {
        ReusableMethods.verifyElementIsVisible(registerUserPage.newUserSignupText);


    }

    @When("User enters name {string} and email {string}")
    public void userEntersNameAndEmail(String name, String email) {
        String uemail = "testuser" + System.currentTimeMillis() + "@example.com";
        String uname = "Test User" + System.currentTimeMillis();
        registerUserPage.nameField.sendKeys(uname);
        registerUserPage.emailField.sendKeys(uemail);
    }

    @And("User clicks on Signup button")
    public void userClicksOnSignupButton() {
        ReusableMethods.clickElement(registerUserPage.signupButton);
    }

    @And("User verifies that {string} text is visible")
    public void userVerifiesThatTextIsVisible(String expectedText) {
        ReusableMethods.verifyElementIsVisible(registerUserPage.enterAccountInformation);

    }

    @When("User fills out account information")
    public void userFillsOutAccountInformation() {

        registerUserPage.passwordField.sendKeys("password123");
        registerUserPage.dayDropdown.sendKeys("10");
        registerUserPage.monthDropdown.sendKeys("June");
        registerUserPage.yearDropdown.sendKeys("1992");
        registerUserPage.firstNameField.sendKeys("test");
        registerUserPage.lastNameField.sendKeys("user");
        registerUserPage.address1Field.sendKeys("test adress");
        registerUserPage.stateField.sendKeys("Test State");
        registerUserPage.cityField.sendKeys("Test City");
        registerUserPage.zipcodeField.sendKeys("12345");
        registerUserPage.mobileNumberField.sendKeys("1234567890");
    }

    @Then("User clicks on Create Button button")
    public void userClicksOnCreateButtonButton() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", registerUserPage.createAccountButton);

    }

    @And("User verifies that ACCOUNT CREATED! text is visible")
    public void userVerifiesThatACCOUNTCREATEDTextIsVisible() {
        ReusableMethods.verifyElementIsVisible(registerUserPage.accountCreatedText);
    }

    @And("User clicks on Continue button")
    public void userClicksOnContinueButton() {
        ReusableMethods.clickElement(registerUserPage.continueButton);
    }

    @And("User verifies that Logged in as username is visible")
    public void userVerifiesThatLoggedInAsUsernameIsVisible() {
        ReusableMethods.verifyElementIsVisible(registerUserPage.loggedInAsText);
    }



}
