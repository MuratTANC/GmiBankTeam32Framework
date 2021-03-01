package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_07_Page {

    public US_07_Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "account-menu")
    public WebElement accountMenuButonu;

    @FindBy(id = "login-item")
    public WebElement signIn;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement signUserName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement signPassword;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement signInSignIn;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[3]")
    public WebElement user_infoButonu;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//select[@id='langKey']")
    public WebElement language;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButonu;
}

