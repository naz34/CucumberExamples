package pages;

import org.mortbay.log.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginUserPage {

    public LoginUserPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h2[normalize-space()='Login to your account']")
    public WebElement logintoYourAccount;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement loginEmailField;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement loginPasswordField;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//b[normalize-space()='Test+User']")
    public WebElement LoggedinasText;

    @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
    public WebElement yourEmailIncorrect;





}
