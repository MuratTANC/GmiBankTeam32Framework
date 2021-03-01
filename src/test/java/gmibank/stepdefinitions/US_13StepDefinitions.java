package gmibank.stepdefinitions;

import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.Given;

import gmibank.pages.US_13Page;
import io.cucumber.java.eo.Se;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class US_13StepDefinitions {

    US_13Page us_13page = new US_13Page();

    //TC01
    @Given("Giris simgesine tiklar")
    public void giris_simgesine_tiklar() {
        us_13page.girisButton.click();
        us_13page.signInGirisButon.click();
    }

    @Given("Gecerli username ve password girer")
    public void gecerli_username_ve_password_girer() {
        us_13page.username.sendKeys(ConfigurationReader.getProperty("employee_username"));
        us_13page.password.sendKeys(ConfigurationReader.getProperty("employee_password"));
    }

    @Given("Sign in butonuna tiklar")
    public void sign_in_butonuna_tiklar() {
        us_13page.signInButton.click();
    }

    @Given("My Operation tiklar")
    public void my_operation_tiklar() {
        us_13page.myOperationsDropdown.click();
    }

    @Given("Manage Accounts tiklar")
    public void manage_accounts_tiklar() {
        us_13page.manageAccount.click();
    }

    @Given("+Create a new Account tiklar")
    public void create_a_new_account_tiklar() {
        us_13page.createAccountButton.click();
    }

    @Given("Create or edit a Account yazisini gorur")
    public void create_or_edit_a_account_yazisini_gorur() {
        Assert.assertTrue(us_13page.creaateOrEditACustomerYazisi.isDisplayed());
    }

    //TC02

    @Given("Description text box tiklanir")
    public void descriptions_text_box_tiklanir() {
        us_13page.descriptionTextBox.click();
    }

    @Given("Balance text box tiklanir")
    public void balance_text_box_tiklanir() {
        us_13page.balanceTextBox.click();
    }

    @Given("Description icin This field is required. yazisi gorunur.")
    public void this_field_is_required_yazisi_gorunur() {
        Assert.assertTrue(us_13page.thisFieldIsRequiredForDescription.isDisplayed());
    }


    //tc03

    @Given("Save butonuna tiklar")
    public void save_butonuna_tiklar() {
        us_13page.saveButton.click();
    }

    @Given("Balance icin This field is required. yazisi gorunur.")
    public void balance_icin_this_field_is_required_yazisi_gorunur() {
        Assert.assertTrue(us_13page.thisFieldIsRequiredForBalance.isDisplayed());

    }

    @Given("Account Type Drop Down  menusunden Account Typelari gorur")
    public void account_type_drop_down_menusunden_account_typelari_gorur() {

        Select select = new Select(us_13page.accountTypeDropdown);

        List<WebElement> accountTypeListe = select.getOptions();

        for (WebElement w : accountTypeListe) {
            System.out.println(w.getText());
        }

    /*
    select.selectByIndex(0);
    String birinciSecenek = select.getFirstSelectedOption().getText();
    Assert.assertEquals(birinciSecenek, "CHECKING");
    ReusableMethods.waitFor(3);

    select.selectByIndex(1);
    String ikinciSecenek = select.getFirstSelectedOption().getText();   //getFirstSelectedOption().getText();
    Assert.assertEquals(ikinciSecenek, "SAVING");
    ReusableMethods.waitFor(3);

    /*
    select.selectByIndex(2);
    String ucuncuSecenek = select.getFirstSelectedOption().getText();
    Assert.assertEquals(ikinciSecenek, "CREDIT_CARD");
        ReusableMethods.waitFor(3);
/*
    select.selectByIndex(3);
    String dorduncuSecenek = select.getFirstSelectedOption().getText();
    Assert.assertEquals(ikinciSecenek, "INVESTING");
        ReusableMethods.waitFor(3);

 */

    }

    @Given("Account Status Type Drop Down menusunden Account Status Typelari gorur.")
    public void account_status_type_drop_down_menusunden_account_status_typelari_gorur() {
        Select select = new Select(us_13page.accountStatusDropdown);

        List<WebElement> accountStatusTypeListe = select.getOptions();

        for (WebElement w : accountStatusTypeListe) {
            System.out.println(w.getText());
        }



/*
    Select select = new Select(us_13page.accountStatusDropdown);
    select.selectByIndex(0);
    String birinciSecenek = select.getFirstSelectedOption().getText();
    Assert.assertEquals(birinciSecenek, "ACTIVE");
        ReusableMethods.waitFor(3);

    select.selectByIndex(1);
    String ikinciSecenek = select.getFirstSelectedOption().getText();
    Assert.assertEquals(ikinciSecenek, "SUESPENDED");
        ReusableMethods.waitFor(3);

        select.selectByIndex(0);
    String ucuncuSecenek = select.getFirstSelectedOption().getText();
    Assert.assertEquals(ikinciSecenek, "CLOSED");
        ReusableMethods.waitFor(3);


    } */

    }
}

