package gmibank.stepdefinitions;

import gmibank.pages.US_16_page;
import gmibank.pages.US_09_Page;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class US16_Stepdefinitions {

    US_09_Page page= new US_09_Page();
    US_16_page moneyPage= new US_16_page();

    @Given("kullanici gmi bank internet sayfasina gider")
    public void kullanici_gmi_bank_internet_sayfasina_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmibank_url"));
    }

    @Given("drop down menu tiklanir")
    public void drop_down_menu_tiklanir() {
        page.firstSignIn.click();

    }

    @And("Sign tikla")
    public void signTikla() {
        page.signIn.click();
    }


    @Given("valid  name girer")
    public void valid_name_girer() {
        page.userName.sendKeys(ConfigurationReader.getProperty("validname"));
    }

    @Given("valid  password girer")
    public void valid_password_girer() {
        page.password.sendKeys(ConfigurationReader.getProperty("validpass"));
    }


    @And("submit yapilir")
    public void submitYapilir() {
        page.submitButton.click();
        ReusableMethods.waitFor(5);


    }



    @Given("My Operation tiklanir")
    public void my_operation_tiklanir() {
        page.myOperations.click();
    }

    @Given("Money transfer tiklanir")
    public void money_transfer_tiklanir() {
        moneyPage.moneytransfer.click();
        ReusableMethods.waitFor(3);

    }

    @Given("gonderen hesabi secilir")
    public void gonderen_hesabi_secilir() {
        moneyPage.frombutton.click();

        Select select= new Select(moneyPage.frombutton);
        select.selectByValue("75483");
        ReusableMethods.waitFor(5);
    }

    @Given("alici hesabi secilir")
    public void alici_hesabi_secilir() {
        moneyPage.tobutton.click();
        Select select= new Select(moneyPage.tobutton);
        select.selectByValue("75482");
        ReusableMethods.waitFor(3);
    }

    @Given("Enter a value  transaction")
    public void enter_a_value_transaction() {
        moneyPage.balance.sendKeys(ConfigurationReader.getProperty("balance"));
        ReusableMethods.waitFor(3);
    }

    @Given("Enter  some information to description box.")
    public void enter_some_information_to_description_box() {
        moneyPage.aciklama.sendKeys(ConfigurationReader.getProperty("aciklama"));
        ReusableMethods.waitFor(3);
    }

    @Given("Click  Make Transfer Button")
    public void click_make_transfer_button() {
        moneyPage.maketransferbutton.click();
        ReusableMethods.waitFor(3);
    }

    @Then("Assert  visible text")
    public void assert_visible_text() {
        Assert.assertTrue(moneyPage.basariliyazisi.isDisplayed());
        ReusableMethods.waitFor(3);

    }



}




