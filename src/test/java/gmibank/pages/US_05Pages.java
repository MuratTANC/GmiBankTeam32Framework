package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_05Pages {
    public US_05Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[@class='alert alert-warning fade show'])[1]")
    public WebElement resetPasswordButonu;


    @FindBy(xpath = "//span[text()='Registration']")
    public WebElement registirationSayfasi;

    @FindBy(xpath = "//span[text()='Did you forget your password?']")
    public WebElement forgetPasswordLinki;

    @FindBy(linkText= "Register a new account")
    public  WebElement accountOlusturLinki;



}
