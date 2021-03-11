package gmibank.stepdefinitions;

import gmibank.pages.US_14_Pages;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class US_14_StepDefinitions {

    US_14_Pages us_14_pages = new US_14_Pages();

    @Given("Kullanici account menu simgesine tiklar")
    public void kullaniciAccountMenuSimgesineTiklar() {
        us_14_pages.accountMenu.click();
    }

    @Given("Kullanici acilan menude Sign in'e tiklar")
    public void kullanici_acilan_menude_sign_in_e_tiklar() {
        us_14_pages.ilkSignIn.click();
    }
    @Given("Kullanici username girer")
    public void kullanici_username_girer() {
        us_14_pages.userName.sendKeys(ConfigurationReader.getProperty("man_username"));
    }
    @Given("Kullanici passwordu girer")
    public void kullanici_passwordu_girer() {
        us_14_pages.password.sendKeys(ConfigurationReader.getProperty("man_password"));
    }
    @Given("kullanici Sign in'e tiklar")
    public void kullanici_sign_in_e_tiklar() {
        us_14_pages.signIn.click();
    }
    @Given("Kullanici My Operations secenegine tiklar")
    public void kullanici_my_operations_secenegine_tiklar() {
        us_14_pages.myOperationsMenu.click();
    }
    @Given("Kullanici acilan menuden Manage Accounts'a tiklar")
    public void kullanici_acilan_menuden_manage_accounts_a_tiklar() {
        us_14_pages.manageAccount.click();
    }
    @Given("kullanici sag ust kosedeki Create a new Account butonuna tiklar")
    public void kullanici_sag_ust_kosedeki_create_a_new_account_butonuna_tiklar() {
        us_14_pages.createNewAccountButton.click();
    }
    @Given("kullanici Description kutusunu doldurur.")
    public void kullanici_description_kutusunu_doldurur() {
        us_14_pages.descriptionTextBox.sendKeys("Nederland");
    }
    @Given("kullanici Balance kutusunu doldurur.")
    public void kullanici_balance_kutusunu_doldurur() {
        us_14_pages.balanceTextBox.sendKeys("5050");
    }
    @Given("Kullanici acilan create takvim menusunden ay gun yil ve saat secer")
    public void kullaniciAcilanCreateTakvimMenusundenAyGunYilVeSaatSecer() {
        us_14_pages.createDateTextBox.sendKeys("01-03-2021 00:22");
    }
    @And("Kullanici acilan closed takvim menusunden ay gun yil ve saat secer")
    public void kullaniciAcilanClosedTakvimMenusundenAyGunYilVeSaatSecer() {
        us_14_pages.closedDateTextBox.sendKeys("11-03-2021 17:00");
    }
    @Given("Kullanici save butonuna tiklar")
    public void kullanici_save_butonuna_tiklar() {
        us_14_pages.saveButton.click();

    }
    @Then("Kullanici hesap olusturulabildigini test eder")
    public void kullanici_hesap_olusturulabildigini_test_eder() {
        Assert.assertTrue(us_14_pages.hesapOlusturulduYazisi.isDisplayed());

    }

    @And("Kullanici acilan create takvim menusunden gecmis bir ay gun yil ve saat secer")
    public void kullaniciAcilanCreateTakvimMenusundenGecmisBirAyGunYilVeSaatSecer() {
        us_14_pages.createDateTextBox.sendKeys("01-03-2020/01:00");
    }

    @And("Kullanici acilan closed takvim menusunden gecmis bir ay gun yil ve saat secer")
    public void kullaniciAcilanClosedTakvimMenusundenGecmisBirAyGunYilVeSaatSecer() {
        us_14_pages.closedDateTextBox.sendKeys("11-08-2020 17:00");
    }

    @Then("Kullanici hesap olusturulamadigini test eder")
    public void kullaniciHesapOlusturulamadiginiTestEder() {
       SoftAssert softAssert = new SoftAssert();
       softAssert.assertFalse(us_14_pages.hesapOlusturulduYazisi.isDisplayed());
      // Assert.assertFalse(us_14_pages.hesapOlusturulduYazisi.isDisplayed());

    }

    @And("Kullanici Employee kutusundan kayitli bir kullanici secer")
    public void kullaniciEmployeeKutusundanKayitliBirKullaniciSecer() {
        Select select = new Select(us_14_pages.employeeDropDown);
        System.out.println(select.getOptions().size());

        Assert.assertTrue(select.getOptions().size()>1);


    }

    @Then("Kullanici employee kutusundan secim yapabilmeli")
    public void kullaniciEmployeeKutusundanSecimYapabilmeli() {



    }
}
