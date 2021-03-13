package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_12_Page {
    public US_12_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "password")
    public  WebElement password;

    @FindBy(id = "firstName")
    public WebElement firstNameHeader;

    @FindBy(id = "email")
    public WebElement emailHeader;

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement dropDownAccount;

    @FindBy(xpath = "//span[.='Sign in']")
    public WebElement accountSignIn;

    @FindBy(xpath = "//span[text()='View']")
    public  WebElement buttonWiew;

    @FindBy(xpath = "//span[.='My Operations']")
    public WebElement myOperations;

    @FindBy(xpath = "//span[.='Manage Customers']")
    public WebElement manageCostumer;

    @FindBy(xpath = "//thead//th")
    public List<WebElement> headList;

    @FindBy(xpath = "//tbody//tr[5]/td")
    public List<WebElement> rowList;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement buttonSignin;

    @FindBy(css = ".btn.btn-primary")
    public WebElement editButton;

    @FindBy(xpath = "/html/body/div/div/div/div[3]/div[1]/div/div/div/div/a[2]")
    public WebElement customerEdit;

    @FindBy(xpath = "/html/body/div/div/div/div[3]/div[1]/div/div/div/div/dl/dd[4]")
    public WebElement viewEmail;

    @FindBy(xpath ="//a[@class='btn btn-primary btn-sm']")
    public WebElement viewRightEdit;

    @FindBy(xpath = "/html/body/div/div/div/div[3]/div[1]/div/div/div/div/h2/span")
    public WebElement CustomerYazi;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement editEmail;

    @FindBy(xpath = "//label[@for='tp-customer-email']")
    public WebElement Emailtext;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement editCity;
    //@FindBy(id = "1 376.41 165.07 448 288 448s230.32-71.64 284.52-177.41a32.35 32.35 0 0 0 0-29.19zM288 400a144 144 0 1 1 144-144 143.93 143.93 0 0 1-144 144zm0-240a95.31 95.31 0 0 0-25.31 3.79 47.85 47.85 0 0 1-66.9 66.9A95.78 95.78 0 1 0 288 160z\"></path></svg> <span class=\"d-none d-md-inline\"><span>View</span></span></a><a class=\"btn btn-primary btn-sm\" href=\"/tp-customer/36524/edit?page=1&amp;sort=id,asc\"><svg aria-hidden=\"true\" focusable=\"false\" data-prefix=\"fas\" data-icon=\"pencil-alt\" class=\"svg-inline--fa fa-pencil-alt fa-w-16 \" role=\"img\" xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 512 512\"><path fill=\"currentColor\" d=\"M497.9 142.1l-46.1 46.1c-4.7 4.7-12.3 4.7-17 0l-111-111c-4.7-4.7-4.7-12.3 0-17l46.1-46.1c18.7-18.7 49.1-18.7 67.9 0l60.1 60.1c18.8 18.7 18.8 49.1 0 67.9zM284.2 99.8L21.6 362.4.4 483.9c-2.9 16.4 11.4 30.6 27.8 27.8l121.5-21.3 262.6-262.6c4.7-4.7 4.7-12.3 0-17l-111-111c-4.8-4.7-12.4-4.7-17.1 0zM124.1 339.9c-5.5-5.5-5.5-14.3 0-19.8l154-154c5.5-5.5 14.3-5.5 19.8 0s5.5 14.3 0 19.8l-154 154c-5.5 5.5-14.3 5.5-19.8 0zM88 424h48v36.3l-64.5 11.3-31.1-31.1L51.7 376H88v48z\"></path></svg> <span class=\"d-none d-md-inline\"><span>Edit</span></span></a><a class=\"btn btn-danger btn-sm\" href=\"/tp-customer/36524/delete?page=1&amp;sort=id,asc\"><svg aria-hidden=\"true\" focusable=\"false\" data-prefix=\"fas\" data-icon=\"trash\" class=\"svg-inline--fa fa-trash fa-w-14 \" role=\"img\" xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 448 512\"><path fill=\"currentColor\" d=\"M432 32H312l-9.4-18.7A24 24 0 0 0 281.1 0H166.8a23.72 23.72 0 0 0-21.4 13.3L136 32H16A16 16 0 0 0 0 48v32a16 16 0 0 0 16 16h416a16 16 0 0 0 16-16V48a16 16 0 0 0-16-16zM53.2 467a48 48 0 0 0 47.9 45h245.8a48 48 0 0 0 47.9-45L416 128H32z\"></path></svg> <span class=\"d-none d-md-inline\"><span>Delete</span></span></a></div></td></tr>")

    @FindBy(id = "tp-customer-heading")
    public WebElement rowspace;

    @FindBy(id="save-entity")
    public WebElement EditSaveBtn;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement succesEditedMessage;

    @FindBy(xpath = "/html/body/div/div/div/div[3]/div[1]/div/div/div/div[1]/div/table/tbody/tr[1]/td[10]/div/a[3]")
    public WebElement deleteButon;

    @FindBy(id="jhi-confirm-delete-tPCustomer")
    public WebElement confirmdelbtn;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div/div/div[1]")
    public WebElement succesdelmessage;

}


