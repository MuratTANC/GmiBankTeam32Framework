package gmibank.stepdefinitions;

import gmibank.pages.US_04Pages;
import gmibank.pages.US_15Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US_15StepDefinations {
    US_15Pages us15Pages=new US_15Pages();
    US_04Pages us04Pages=new US_04Pages();


    @Then("kullanici My Operations menusune tiklar")
    public void kullanici_my_operations_menusune_tiklar() {
       us04Pages.myOperationsLinki.click();
    }

    @Then("kullanici Manage Account menusunu secer")
    public void kullanici_manage_account_menusunu_secer() {
        us15Pages.manageAccountLnki.click();

    }

    @Then("kullanici balancelari goruntuler")
    public void kullanici_balancelari_goruntuler() {
        Assert.assertTrue(us15Pages.balanceIlkKayit.isDisplayed());

    }

    @Then("kullanici acccount typelari goruntuler")
    public void kullanici_acccount_typelari_goruntuler() {
        Assert.assertTrue(us15Pages.accountTypeIlkKayit.isDisplayed());

    }


    @And("kullanici view butonuna tiklar")
    public void kullaniciViewButonunaTiklar() {
        us15Pages.viewButonu.click();
        
    }

    @And("kullanici tikladigi kisinin hesap ayrintilarini goruntuler")
    public void kullaniciTikladigiKisininHesapAyrintilariniGoruntuler() {
        Assert.assertTrue(us15Pages.accountDogrulama.isDisplayed());
    }
}
