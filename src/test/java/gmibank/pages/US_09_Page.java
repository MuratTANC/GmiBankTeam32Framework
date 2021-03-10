package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_09_Page {

    public US_09_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement firstSignIn;

    @FindBy(xpath = "//*[.='Sign in']")
    public WebElement signIn;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[.='My Operations']")
    public WebElement myOperations;

    @FindBy(xpath = "//*[.='Manage Customers']")
    public WebElement manageCustomers;

    @FindBy(id = "jh-create-entity")
    public WebElement createNewCustomer;

    @FindBy(xpath = "//input[@name='search-ssn']")
    public WebElement ssn;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement searchButton;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement isim;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement soyisim;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(id = "tp-customer-country")
    public WebElement country;

    @FindBy(id = "tp-customer-state")
    public WebElement state;

    @FindBy(xpath = "//input[@name='createDate']")
    public WebElement date;

    @FindBy(id = "tp-customer-zelleEnrolled")
    public WebElement zelleEnrolled;
    @FindBy(xpath = "(//*[text()='Save'])[3]")
    public WebElement savebutton;
    @FindBy(xpath = "(//*[text()='This field is required.'])[4]")
    public WebElement hatayazisiadres;
    @FindBy(xpath ="(//div[@class='invalid-feedback'])[4]")
    public WebElement hatayazisicity ;
    @FindBy(xpath = "//input[@name='address']")
    public WebElement adress;
    @FindBy(xpath = "//input[@name='city']")
    public WebElement city;


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
    public WebElement sity;

    @FindBy(id = "ssn")
    public WebElement ssnNumber;

    @FindBy(id = "createDate")
    public WebElement createDate;

    @FindBy(id = "zelleEnrolled")
    public WebElement zelle;

    @FindBy(xpath = "//*[.='Country'][1]")
    public WebElement ulke;

    @FindBy(xpath = "//*[.='State'][1]")
    public WebElement ikincistate;

    @FindBy(xpath = "//*[.='User'][1]")
    public WebElement userNo;

    @FindBy(xpath = "//*[.='Account'][1]")
    public WebElement account;
    @FindBy(xpath = "//*[text()='Sign out']")
    public WebElement signOutButton;


    @FindBy(id = "tp-account-description")
    public WebElement descriptionTextbox;

    @FindBy(name = "balance")
    public WebElement balanceTextbox;

    @FindBy(id = "tp-account-accountType")
    public WebElement accountTypeDropdown;

    @FindBy(name = "accountStatusType")
    public WebElement accountStatusTypeDropdown;

    @FindBy(id = "save-entity")
    public WebElement save;






}










