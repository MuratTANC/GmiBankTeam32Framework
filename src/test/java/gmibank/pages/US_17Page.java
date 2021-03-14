package gmibank.pages;

        import gmibank.utilities.Driver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;

public class US_17Page {

    public US_17Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement girisButton;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement signInEnterens;



    @FindBy(xpath = "//input[@name='username']")
    public WebElement username_Alani;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password_Alani;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButonu;

    @FindBy(xpath = "(//a[@class='d-flex align-items-center dropdown-toggle nav-link'])[2]")

    public WebElement administration;


    @FindBy(xpath = "//span[text()='User management']")
    public WebElement userManagementButton ;

    //@FindBy(xpath = "(//table//tbody//tr[2]//td[10]//span[@class='d-none d-md-inline'])[2]")
    //public WebElement editButonu;

    @FindBy(xpath = "//span[text()='Edit'])[1]")
    public  WebElement editButonu;

    @FindBy(xpath = "//span[text()='Create or edit a user']")
    public WebElement editText;

    @FindBy(id = "authorities")
    public WebElement profiles;

    @FindBy(xpath ="//button[@type='submit']")
    public WebElement save;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement allert;

    @FindBy(xpath = "(//table//tbody//tr[2]//td[10]//span[@class='d-none d-md-inline'])[1]")
    public WebElement view;

    @FindBy(xpath = "//span[text()='User']")
    public WebElement viewTex;

    @FindBy(xpath="(//table//tbody//tr[2]//td[10]//span[@class='d-none d-md-inline'])[3]")
    public WebElement delete;

    @FindBy (xpath = "(//button[@class='btn btn-danger'])[3]")
    public WebElement deleteTextBox;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement internolServerError;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement userisdeletedAlert;




















}
