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
    public void user_verifies_text_is_visible(String string) {

        ReusableMethods.verifyElementIsVisible(loginUserPage.logintoYourAccount);

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

    @Then("user verifies that {string} text is visible")
    public void user_verifies_that_text_is_visible(String string) {
        ReusableMethods.verifyElementIsVisible(loginUserPage.LoggedinasText);


    }

}
