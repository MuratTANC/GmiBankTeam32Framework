package gmibank.stepdefinitions;

import gmibank.pages.US_003Page;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class US_03_StepDefinitions {
    US_003Page us_003Page = new US_003Page();

    @When("kullanici gmibank_url adresine gider")
    public void kullaniciGmibank_urlAdresineGider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmibank_url"));
    }

    @And("Giris butonuna basar")
    public void girisButonunaBasar() {
        us_003Page.girisButonu.click();
    }

    @And("Register secer")
    public void registerSecer() {
        us_003Page.register.click();
    }

   @And("imlec sayfanin altina gecer")
    public void imlecSayfaninAltinaGecer() {
        Actions actions =new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }



    @Then("kullanici seviye cizelgesini red renkte gorur")
    public void kullaniciSeviyeCizelgesiniRedRenkteGorur() {



            Assert.assertTrue(us_003Page.red.isDisplayed());

    }

    @Then("{string} girer")
    public void girer(String password) {
        us_003Page.password.sendKeys(password);
    }



    @Then("kullanici seviye cizelgesini orange renkte gorur")
    public void kullaniciSeviyeCizelgesiniOrangeRenkteGorur() {
        Assert.assertTrue(us_003Page.orange.isDisplayed());
    }

    @Then("kullnici {string} girer")
    public void kullniciGirer(String passwordOrange) {
        us_003Page.password.sendKeys(passwordOrange);

    }




    @Then("kullanici seviye cizelgesini lightgreen renkte gorur")
    public void kullaniciSeviyeCizelgesiniLightgreenRenkteGorur() {
        Assert.assertTrue(us_003Page.lightgreen.isDisplayed());
    }





    @Then("kullanici seviye cizelgesini green renkte gorur")
    public void kullaniciSeviyeCizelgesiniGreenRenkteGorur() {
     Assert.assertTrue(us_003Page.green.isDisplayed());

    }


    @Then("kullanici seviye cizelgesini yellow renkte gorur")
    public void kullaniciSeviyeCizelgesiniYellowRenkteGorur() {
        Assert.assertFalse(us_003Page.yellow.isDisplayed());
    }

    @Then("kullanici {string}")
    public void kullanici(String yellow) {
        us_003Page.password.sendKeys(yellow);
    }


    @Then("kullanici password girer")
    public void kullaniciPasswordGirer() {
     us_003Page.password.sendKeys(ConfigurationReader.getProperty("password"));
     us_003Page.password.click();

    }

    @Then("hata mesaji alir")
    public void hataMesajiAlir() {
        Assert.assertTrue(us_003Page.hataMesaji.isDisplayed());
    }
}
