package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class CommonStepDefination {

    HomePage homePage = new HomePage();

    @Given("User navigates to the {string} page")
    public void userNavigatesToThePage(String urlKey) {
        String url = ConfigReader.getProperty(urlKey);
        Driver.getDriver().get(url);
    }

    @Then("User verifies {string} button is visible")
    public void userVerifiesButtonIsVisible(String buttonName) {
        ReusableMethods.verifyElementIsVisible(homePage.signupLoginButton);
    }

    @When("User clicks on {string} button")
    public void userClicksOnButton(String buttonName) {
        ReusableMethods.clickElement(homePage.signupLoginButton);
    }
}
