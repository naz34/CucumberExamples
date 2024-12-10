package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterUserPage {

    public RegisterUserPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    public WebElement signupLoginButton;

    @FindBy(xpath = "//h2[text()='New User Signup!' ]")
    public WebElement newUserSignupText;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameField;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement emailField;

    @FindBy(xpath = "//button[normalize-space()='Signup']")
    public WebElement signupButton;

    @FindBy(xpath = "//b[normalize-space()='Enter Account Information']")
    public WebElement enterAccountInformation;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordField;

    @FindBy(xpath = "//select[@data-qa='days']")
    public WebElement dayDropdown;

    @FindBy(xpath = "//select[@data-qa='months']")
    public WebElement monthDropdown;

    @FindBy(xpath = "//select[@data-qa='years']" )
    public WebElement yearDropdown;

    @FindBy(xpath = "//input[@data-qa='first_name']")
    public WebElement firstNameField;

    @FindBy(xpath = "//input[@data-qa='last_name']")
    public WebElement lastNameField;

    @FindBy(xpath = "//input[@data-qa='company']")
    public WebElement companyField;

    @FindBy(xpath = "//input[@data-qa='address']")
    public WebElement address1Field;

    @FindBy(xpath = "//input[@data-qa='state']")
    public WebElement stateField;

    @FindBy(xpath = "//input[@data-qa='city']")
    public WebElement cityField;

    @FindBy(xpath = "//input[@data-qa='zipcode']")
    public WebElement zipcodeField;

    @FindBy(xpath = "//input[@data-qa='mobile_number']")
    public WebElement mobileNumberField;

    @FindBy(xpath = "//button[normalize-space()='Create Account']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//b[normalize-space()='Account Created!']")
    public WebElement accountCreatedText;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButton;

    @FindBy(xpath = "//a[contains(text(),'Logged in as')]")
    public WebElement loggedInAsText;














}
