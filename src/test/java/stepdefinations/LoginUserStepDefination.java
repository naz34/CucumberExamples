package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginUserPage;
import utilities.ReusableMethods;

public class LoginUserStepDefination {

    LoginUserPage loginUserPage = new LoginUserPage();

    @Then("user verifies {string} text is visible")
    public void user_verifies_text_is_visible(String expectedText) {

        if(expectedText.equals("Login to your account")){
            ReusableMethods.verifyElementIsVisible(loginUserPage.logintoYourAccount);
        }else if(expectedText.equals("Logged in as username")){
            ReusableMethods.verifyElementIsVisible(loginUserPage.LoggedinasText);
        }else if (expectedText.equals("Your email or password is incorrect!")){
            ReusableMethods.verifyElementIsVisible(loginUserPage.yourEmailIncorrect);
        }else {
            throw new RuntimeException("Unexpected text: " + expectedText);
        }



    }

    @When("user enters <email> and <password>")
    public void user_enters_email_and_password() {

        loginUserPage.loginEmailField.sendKeys("testuser234@example.com");
        loginUserPage.loginPasswordField.sendKeys("password123");

    }

    @When("user clicks on {string} button")
    public void user_clicks_on_button(String string) {

        ReusableMethods.clickElement(loginUserPage.loginButton);

    }


    @When("user enters invalid <email> and <password>")
    public void userEntersInvalidEmailAndPassword() {
        loginUserPage.loginEmailField.sendKeys("deneme@deneme.com");
        loginUserPage.loginPasswordField.sendKeys("asdf");
    }
}
