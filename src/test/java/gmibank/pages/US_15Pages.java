package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_15Pages {

    public US_15Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Manage Accounts']")
    public WebElement manageAccountLnki;

    @FindBy(xpath = "//table//tbody//tr[1]//td[3][text()='16000'] ")
    public WebElement balanceIlkKayit;

    @FindBy(xpath = "//table//tbody//tr[1]//td[4]/span[text()='CREDIT_CARD']")
    public WebElement accountTypeIlkKayit;

    @FindBy(xpath = "(//a[@class='btn btn-info btn-sm'])[1]")
    public WebElement viewButonu;

    @FindBy(xpath = "//span[text()='Account']")
    public WebElement accountDogrulama;
}
