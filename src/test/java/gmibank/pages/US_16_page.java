package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_16_page {


    public US_16_page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//a[@class='btn btn-success btn-sm'][1]")
    public WebElement firstCustomer;

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "middleInitial")
    public WebElement middleInitial;

    @FindBy(id = "email")
    public WebElement e_mail;

    @FindBy(id = "mobilePhoneNumber")
    public WebElement mobilePhone;

    @FindBy(id = "phoneNumber")
    public WebElement phone;

    @FindBy(id = "zipCode")
    public WebElement zipCode;

    @FindBy(id = "address")
    public WebElement address;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "ssn")
    public WebElement ssnNumber;

    @FindBy(id = "createDate")
    public WebElement createDate;

    @FindBy(id = "zelleEnrolled")
    public WebElement zelleEnrolled;

    @FindBy(xpath = "//*[.='Country'][1]")
    public WebElement country;

    @FindBy(xpath = "//*[.='State'][1]")
    public WebElement state;

    @FindBy(xpath = "//*[.='User'][1]")
    public WebElement userNo;

    @FindBy(xpath = "//*[.='Account'][1]")
    public WebElement account;
    @FindBy(xpath = "//select[@name='fromAccountId']")
    public  WebElement frombutton;
    @FindBy(xpath = "//select[@name='toAccountId']")
    public WebElement tobutton;
    @FindBy(xpath ="//input[@name='balance']")
    public WebElement balance;
    @FindBy(xpath ="//textarea[@name='description']")
    public WebElement aciklama;
    @FindBy(id = "make-transfer")
    public WebElement maketransferbutton;
    @FindBy(xpath = "//div[@style='pointer-events: none;']")
    public WebElement basariliyazisi;

    @FindBy(xpath = "//*[text()='Transfer Money']")
    public WebElement moneytransfer;




}










