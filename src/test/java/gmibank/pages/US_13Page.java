package gmibank.pages;


import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_13Page {

    public US_13Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement girisButton;

    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement signInGirisButon;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy (xpath = "//a[@id='jh-create-entity']")
    public WebElement createAccountButton;

    @FindBy (xpath = "//span[contains(text(),'Create or edit a Account')]")
    public WebElement creaateOrEditACustomerYazisi;

    @FindBy (xpath = "//input[@name='description']")
    public WebElement descriptionTextBox;

    @FindBy (xpath = "//input[@name='balance']")
    public WebElement balanceTextBox;

    @FindBy (xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]")
    public WebElement thisFieldIsRequiredForDescription;

    @FindBy (xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]")
    public WebElement thisFieldIsRequiredForBalance;

    @FindBy (id = "tp-account-accountType")
    public WebElement accountTypeDropdown;

    @FindBy (id = "tp-account-accountStatusType")
    public WebElement accountStatusDropdown;

    @FindBy (id = "tp-account-employee")
    public WebElement employeeDropdown;

    @FindBy (id = "save-entity")
    public WebElement saveButton;

    @FindBy(xpath = "//span[.='My Operations']")
    public WebElement myOperationsDropdown;

    @FindBy(xpath = "//a[@href='/tp-account']")
    public WebElement manageAccount;

    @FindBy(name = "firstName")
    public WebElement firstName;

    @FindBy(name = "lastName")
    public WebElement lastName;

    @FindBy(id = "tp-customer-account")
    public WebElement account;
}
