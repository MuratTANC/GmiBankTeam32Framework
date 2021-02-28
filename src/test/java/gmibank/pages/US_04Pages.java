package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_04Pages {
    public US_04Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement girisButton;

    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement signInGirisButon;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement username_Alani;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password_Alani;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButonu;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement cancelButonu;

    @FindBy (xpath = "//span[text()='My Operations']")
    public WebElement myOperationsLinki;

    @FindBy (xpath = "//span[text()='Cancel']")
    public WebElement CancelButonu;

    @FindBy (xpath = "//div[@class='alert alert-danger fade show']")
    public WebElement HataMesaji;

}
