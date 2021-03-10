package gmibank.stepdefinitions;

import gmibank.pages.US_09_Page;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class US_09_StepDefinitions {

    US_09_Page page = new US_09_Page();
    SoftAssert softAssert = new SoftAssert();

    @Given("kullanici gmi bank sayfasina gider")
    public void kullanici_gmi_bank_sayfasina_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_url"));
        softAssert.assertAll();

    }

    @When("signin alanina gider")
    public void signin_alanina_gider() {
        page.firstSignIn.click();
    }

    @When("Signin butonuna tiklar")
    public void signin_butonuna_tiklar() {
        page.signIn.click();
    }

    @When("dogru username girer")
    public void dogru_username_girer() {
        page.userName.sendKeys(ConfigurationReader.getProperty("dogruuser"));
    }

    @When("dogru password girer")
    public void dogru_password_girer() {
        page.password.sendKeys(ConfigurationReader.getProperty("dogrusifre"));
    }

    @When("giris butonuna tiklar")
    public void giris_butonuna_tiklar() {
        page.submitButton.click();
    }

    @When("My Operationsa tiklar")
    public void my_operationsa_tiklar() {
        page.myOperations.click();
    }

    @When("Manage customerse tiklar")
    public void manage_customerse_tiklar() {
        page.manageCustomers.click();
    }

    @When("Create A New Customer a tiklar")
    public void create_a_new_customer_a_tiklar() {
        page.createNewCustomer.click();
        ReusableMethods.waitFor(3);
    }

    @When("Ssn bolumune tiklar ve  dogru ssn girer")
    public void ssn_bolumune_tiklar_ve_dogru_ssn_girer() {
        page.ssn.sendKeys(ConfigurationReader.getProperty("ssns"));
        ReusableMethods.waitFor(2);
    }

    @When("search butonuna tiklar")
    public void search_butonuna_tiklar() {
        page.searchButton.click();
    }

    @When("firstname yazili oldugunu gorur")
    public void firstname_yazili_oldugunu_gorur() {

        softAssert.assertTrue(page.isim.isDisplayed());
        softAssert.assertAll();
    }

    @When("last name yazili oldugunu gorur")
    public void last_name_yazili_oldugunu_gorur() {

        softAssert.assertTrue(page.soyisim.isDisplayed());
        softAssert.assertAll();
    }

    @Then("Mail Adress yazili oldugunu gorur")
    public void mail_adress_yazili_oldugunu_gorur() {
        softAssert.assertTrue(page.email.isDisplayed());
        softAssert.assertAll();
    }

    @When("signout click edilir")
    public void signout_click_edilir() {


        page.signOutButton.click();
    }
}