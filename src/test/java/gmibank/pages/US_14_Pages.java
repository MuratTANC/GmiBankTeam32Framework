
package gmibank.pages;

import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_14_Pages {

    public US_14_Pages(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement accountMenu;

    @FindBy(id = "login-item")
    public WebElement ilkSignIn;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement signIn;

    @FindBy(xpath = "//span[text()='My Operations']")
    public WebElement myOperationsMenu;

    @FindBy(xpath = "//span[text()='Manage Accounts']")
    public WebElement manageAccount;

    @FindBy(xpath = "//*[text()='Create a new Account']")
    public WebElement createNewAccountButton;

    @FindBy(id = "tp-account-description")
    public WebElement descriptionTextBox;

    @FindBy(id = "tp-account-balance")
    public WebElement balanceTextBox;

    @FindBy(id = "tp-account-createDate")
    public WebElement createDateTextBox;

    @FindBy(id = "tp-account-closedDate")
    public WebElement closedDateTextBox;

    @FindBy(xpath = "//select[@id='tp-account-employee']")
    public WebElement employeeDropDown;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(id="tp-account-heading")
    public WebElement hesapOlusturulduYazisi;



}
