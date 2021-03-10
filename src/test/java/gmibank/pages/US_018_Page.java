package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_018_Page {
    @FindBy(id = "account-menu")
    public WebElement firstenterancebuttonu;
    @FindBy(id = "login-item")
    public WebElement signInGirisButonu;
    @FindBy(id = "username")
    public WebElement usernameButtonu;
    @FindBy(id = "password")
    public WebElement passwordButtonu;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInsubmitButonu;

    @FindBy(id = "entity-menu")
    public WebElement myOperationButton;

    @FindBy(xpath = "//a[@class='dropdown-item']")
    public WebElement ManageCustomerButton;

    @FindBy(xpath = "(//a[@class='btn btn-info btn-sm'])[1]")
    public WebElement viewButton;
    @FindBy(xpath = "(//*[text()='Edit'])[1]")
    public WebElement editButton;
    @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm'])[1]")
    public WebElement deleteButton;
    @FindBy(xpath = "//div[@class='modal-content']")
    public WebElement deleteAlertText;

    public US_018_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
