package gmibank.stepdefinitions;

import gmibank.pages.US_04Pages;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US_04_StepDefintions {

    US_04Pages us04Pages=new US_04Pages();

    @When("kullanici gmi_bank anasayfaya gider")
    public void kullanici_gmi_bank_anasayfaya_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmibank_url"));
    }

    @Then("kullanici giris_sekmesine tiklar")
    public void kullanici_giris_sekmesine_tiklar() {
        ReusableMethods.waitFor(1);
        us04Pages.girisButton.click();
    }

    @Then("kullanici sign_in sekmesine tiklar")
    public void kullanici_sign_in_sekmesine_tiklar() {

      us04Pages.signInGirisButon.click();
        ReusableMethods.waitFor(2);
    }

    @Then("kullanici valid customer username girer")
    public void kullanici_valid_customer_username_girer() {
        ReusableMethods.waitFor(2);
        us04Pages.username_Alani.sendKeys(ConfigurationReader.getProperty("cus_username"));
    }

    @Then("kullanici valid customer sifre girer")
    public void kullanici_valid_customer_sifre_girer() {
        us04Pages.password_Alani.sendKeys(ConfigurationReader.getProperty("cus_password"));

    }

    @Then("kullanici sign_in butonuna tiklar")
    public void kullanici_sign_in_butonuna_tiklar() {
        us04Pages.signInButonu.click();

    }

    @Then("kullanici giris yapildigini test eder")
    public void kullanici_giris_yapildigini_test_eder() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(us04Pages.myOperationsLinki.isDisplayed());

    }


    @And("kullanici valid user username girer")
    public void kullaniciValidUserUsernameGirer() {
        us04Pages.username_Alani.sendKeys(ConfigurationReader.getProperty("us_username"));
    }

    @And("kullanici valid user sifre girer")
    public void kullaniciValidUserSifreGirer() {
        us04Pages.password_Alani.sendKeys(ConfigurationReader.getProperty("us_password"));
    }

    @And("kullanici valid manager username girer")
    public void kullaniciValidManagerUsernameGirer() {
        us04Pages.username_Alani.sendKeys(ConfigurationReader.getProperty("man_username"));
    }

    @And("kullanici valid manager sifre girer")
    public void kullaniciValidManagerSifreGirer() {
        us04Pages.password_Alani.sendKeys(ConfigurationReader.getProperty("man_password"));
    }

    @And("kullanici valid employee username girer")
    public void kullaniciValidEmployeeUsernameGirer() {
        us04Pages.username_Alani.sendKeys(ConfigurationReader.getProperty("emp_username"));
    }

    @And("kullanici valid employee sifre girer")
    public void kullaniciValidEmployeeSifreGirer() {
        us04Pages.password_Alani.sendKeys(ConfigurationReader.getProperty("emp_password"));
    }

    @And("kullanici valid admin username girer")
    public void kullaniciValidAdminUsernameGirer() {
        us04Pages.username_Alani.sendKeys(ConfigurationReader.getProperty("admin_username"));
    }

    @And("kullanici valid admin sifre girer")
    public void kullaniciValidAdminSifreGirer() {
        us04Pages.password_Alani.sendKeys(ConfigurationReader.getProperty("admin_password"));
    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

    @When("kullanici giris islemini iptal eder")
    public void kullaniciGirisIsleminiIptalEder() {
        us04Pages.cancelButonu.click();
    }

    @And("kullanicinin anasayfaya geri doner")
    public void kullanicininAnasayfayaGeriDoner() {
       Assert.assertEquals(ConfigurationReader.getProperty("gmibank_url"),Driver.getDriver().getCurrentUrl());
    }


}
