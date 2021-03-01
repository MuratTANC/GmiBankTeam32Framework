package gmibank.stepdefinitions;

import gmibank.pages.US_04Pages;
import gmibank.pages.US_05Pages;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US_05StepDefinitions {
    US_05Pages us05Pages=new US_05Pages();
    US_04Pages us04Pages=new US_04Pages();


    @Then("kullanici invalid customer sifre girer")
    public void kullanici_invalid_customer_sifre_girer() {
        us04Pages.password_Alani.sendKeys("aaaa");
    }

    @Then("kullanici hatamesajini gorur")
    public void kullanici_hatamesajini_gorur() {
        Assert.assertTrue(us04Pages.HataMesaji.isDisplayed());

    }


    @And("kullanici invalid customer username girer")
    public void kullaniciInvalidCustomerUsernameGirer() {
        us04Pages.username_Alani.sendKeys("aaaa");

    }

    @And("kullanici Did you forget your password secenegini secer")
    public void kullaniciDidYouForgetYourPasswordSeceneginiSecer() {
        us05Pages.forgetPasswordLinki.click();
    }

    @And("kullanici new registiration secenegini secer")
    public void kullaniciNewRegistirationSeceneginiSecer() {
        us05Pages.accountOlusturLinki.click();
    }

    @And("password sifirla butonunu gorur")
    public void passwordSifirlaButonunuGorur() {
        Assert.assertTrue(us05Pages.resetPasswordButonu.isDisplayed());
    }

    @And("Registiration sayfasina yonlendirilir")
    public void registirationSayfasinaYonlendirilir() {
        Assert.assertTrue(us05Pages.registirationSayfasi.isDisplayed());

    }


}
