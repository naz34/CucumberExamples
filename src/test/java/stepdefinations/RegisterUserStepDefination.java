package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.RegisterUserPage;
import utilities.ConfigReader;
import utilities.Driver;

import org.openqa.selenium.JavascriptExecutor;
import utilities.DynamicEmail;
import utilities.ReusableMethods;

import java.time.Duration;

public class RegisterUserStepDefination {

    RegisterUserPage registerUserPage= new RegisterUserPage();
    HomePage homePage = new HomePage();


    @Then("User verifies {string} text is visible")
    public void userVerifiesTextIsVisible(String expectedText){
        if(expectedText.equals("New User Signup!")){
            ReusableMethods.verifyElementIsVisible(registerUserPage.newUserSignupText);
        } else if (expectedText.equals("Email Address already exist!")) {
            ReusableMethods.verifyElementText(registerUserPage.emailAddressIsText, expectedText.trim());
        } else if (expectedText.equals("ENTER ACCOUNT INFORMATION")) {
            ReusableMethods.verifyElementText(registerUserPage.enterAccountInformation, expectedText.trim());
        } else if (expectedText.equals("ACCOUNT CREATED!")) {
            ReusableMethods.verifyElementText(registerUserPage.accountCreatedText, expectedText.trim());
        } else {
            throw new RuntimeException("Unexpected text: " + expectedText);
        }

    }


    @When("User enters name {string} and email {string}")
    public void userEntersNameAndEmail(String name, String email) {
        String uemail = "testuser" + System.currentTimeMillis() + "@example.com";
        String uname = "Test User" + System.currentTimeMillis();

        DynamicEmail.email = uemail;
        DynamicEmail.name = uname;
        registerUserPage.nameField.sendKeys(uname);
        registerUserPage.emailField.sendKeys(uemail);
    }

    @When("User enters email {string} and password {string}")
    public void userEntersEmailAndPassword(String email, String password) {
        // Önceden oluşturulan e-posta adresini kullan
        String previouslyUsedEmail = DynamicEmail.email;
        String previouslyUsedName =  DynamicEmail.name;
        registerUserPage.nameField.sendKeys(previouslyUsedName);
        registerUserPage.emailField.sendKeys(previouslyUsedEmail);
    }




    @And("User clicks on Signup button")
    public void userClicksOnSignupButton() {
        ReusableMethods.clickElement(registerUserPage.signupButton);
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



    @And("User clicks on Continue button")
    public void userClicksOnContinueButton() {
        ReusableMethods.clickElement(registerUserPage.continueButton);
    }

    @And("User verifies that Logged in as username is visible")
    public void userVerifiesThatLoggedInAsUsernameIsVisible() {
        ReusableMethods.verifyElementIsVisible(registerUserPage.loggedInAsText);
    }



}
