package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Us_001_Page {
    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement girisButonu;
    @FindBy(xpath = "(//a[@role='menuitem'])[2]")
    public WebElement register;
    @FindBy(css = "input[name='ssn']")
    public WebElement SSNButton;
    @FindBy(css = "input[name='firstname']")
    public WebElement FirstnameButton;
    @FindBy(css = "input[name='lastname']")
    public WebElement lastNameButton;
    @FindBy(css = "input[name='address']")
    public WebElement addressButton;
    @FindBy(css = "input[name='mobilephone']")
    public WebElement mobilephoneButton;
    @FindBy(css = "input[name='username']")
    public WebElement usernameButton;
    @FindBy(css = "input[name='email']")
    public WebElement emailButton;
    @FindBy(css = "input[name='firstPassword']")
    public WebElement firstPasswordButton;
    @FindBy(css = "input[name='secondPassword']")
    public WebElement secondPasswordButton;
    @FindBy(id = "register-submit")
    public WebElement registerSubmitButton;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement ssnMesaji;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement firstNameMesaji;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement LastNameMesaji;

    @FindBy(xpath = "//*[text()='Your mobile phone number is invalid']")
    public WebElement MobilephoneNumberMesage;

    @FindBy(xpath = "//*[text()='Your username is required.']")
    public WebElement usernameNameMesaji;

    @FindBy(xpath = "//*[text()='Your email is required.']")
    public WebElement emailMesageblank;

    @FindBy(xpath = "//*[text()='This field is invalid']")
    public WebElement emailnothave;

    @FindBy(xpath = "//*[text()='Your email is required to be at least 5 characters.']")
    public WebElement emailnotenough;

    @FindBy(xpath = "//*[text()='Your password is required.']")
    public WebElement newpasswordmesage1;

    @FindBy(xpath = "//*[text()='Your password is required to be at least 4 characters.']")
    public WebElement newpasswordmesagenotenough;

    @FindBy(xpath = "//*[text()='Your confirmation password is required.']")
    public WebElement confirmationpasswordmesage;


    public Us_001_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
