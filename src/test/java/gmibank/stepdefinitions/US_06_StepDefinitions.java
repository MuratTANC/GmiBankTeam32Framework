package gmibank.stepdefinitions;

import com.github.javafaker.Faker;
import gmibank.utilities.ConfigurationReader;
import gmibank.pages.US_06_Page;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US_06_StepDefinitions {

    US_06_Page us_06_page=new US_06_Page();

    Faker faker=new Faker();


    @Given("Kullanici gmibank anasayfaya gider")
    public void kullanici_gmibank_anasayfaya_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmibank_url"));

    }

    @Given("Ana sayfada sag ustte bulunan {string} simgesine tiklayiniz.")
    public void ana_sayfada_sag_ustte_bulunan_simgesine_tiklayiniz(String string)  {

        us_06_page.accountMenuButonu.click();
    }

    @Given("Sign in butonuna tiklayiniz.")
    public void sign_in_butonuna_tiklayiniz() {
        us_06_page.signIn.click();
    }


    @And("Username e newuser yaziniz.")
    public void usernameENewuserYaziniz() {
        us_06_page.signUserName.sendKeys(ConfigurationReader.getProperty("info_username"));
    }

    @Given("Password a {string} yaziniz.")
    public void password_a_yaziniz(String string)  {

        us_06_page.signPassword.sendKeys(string+Keys.ENTER);
    }

    @Given("Sag alttaki Sign in Butonuna tiklayiniz.")
    public void sag_alttaki_sign_in_butonuna_tiklayiniz()  {

        us_06_page.signInSignIn.click();

    }


    @Given("User info secenegini tiklayiniz.")
    public void user_info_secenegini_tiklayiniz()  {

        us_06_page.user_infoButonu.click();

    }


    @And("First Name textboxindaki ismin  user   oldugunu dogrulayiniz.")
    public void firstNameTextboxindakiIsminUserOldugunuDogrulayiniz() {
        Assert.assertFalse(us_06_page.firstName.getText().contains(ConfigurationReader.getProperty("firstName_dogrulama")));
    }


    @And("LastName textboxindaki soyIsmin new  oldugunu dogrulayiniz.")
    public void lastnameTextboxindakiSoyIsminNewOldugunuDogrulayiniz() {
        Assert.assertFalse(us_06_page.lastName.getText().contains(ConfigurationReader.getProperty("lastName_dogrulama")));

    }




    @And("Email textboxinindaki emailin newuser{int}@new.com   oldugunu dogrulayiniz")
    public void emailTextboxinindakiEmailinNewuserNewComOldugunuDogrulayiniz(int arg0) {
        Assert.assertFalse(us_06_page.email.getText().contains(ConfigurationReader.getProperty("email_dogrulama")));
    }


    @Then("Language textboxindaki  secenegin  {string} secilmis oldugunu  dogrulayiniz.")
    public void language_textboxindaki_secenegin_secilmis_oldugunu_dogrulayiniz(String string) {
        Select select = new Select(us_06_page.language);
        select.selectByVisibleText(string);

    }

    @Given("Kullanici Language dropdown ina tiklayiniz")
    public void kullanici_language_dropdown_ina_tiklayiniz() {

        Select select=new Select(us_06_page.language);
        us_06_page.language.click();
    }

    @Then("{string} && {string} dilllerinin var oldugunu dogrulayiniz.")
    public void dilllerinin_var_oldugunu_dogrulayiniz(String string, String string2) {

        List<WebElement> languageOptions;
        Select select =new Select(us_06_page.language);
        languageOptions=select.getOptions();
        System.out.println(languageOptions.get(0).getText());
        System.out.println(languageOptions.get(1).getText());
        for (WebElement w:languageOptions) {
            boolean language=w.getText().equals("Türkçe")||w.getText().equals("English") ;
            Assert.assertTrue("user can only select English or Turkish",language);
        }

    }

    @And("Username textboxindaki deki ismi siliniz")
    public void usernameTextboxindakiDekiIsmiSiliniz() {
        us_06_page.firstName.clear();
    }

    @And("Silinen username yerine  {string} yaziniz.")
    public void silinenUsernameYerineYaziniz(String string) {
        us_06_page.firstName.sendKeys(faker.name().firstName()+Keys.ENTER);
    }


    @And("lastname textboxindaki deki soyismi siliniz.")
    public void lastnameTextboxindakiDekiSoyismiSiliniz() {
        us_06_page.lastName.clear();
    }

    @And("Silinen lastname yerine {string} yaziniz.")
    public void silinenLastnameYerineYaziniz(String string) {

        us_06_page.lastName.sendKeys(faker.name().lastName()+Keys.ENTER);
    }


    @Given("Save butonuna tiklayiniz.")
    public void save_butonuna_tiklayiniz() {
        us_06_page.saveButonu.click();
    }

    @And("Email textboxindaki email i siliniz.")
    public void emailTextboxindakiEmailISiliniz() {
        us_06_page.email.clear();
    }

    @And("Silinen email yerine {string} yaziniz.")
    public void silinenEmailYerineYaziniz(String string) {
        us_06_page.email.sendKeys(faker.internet().emailAddress()+Keys.ENTER);
    }




    @Then("Kullanici gmibank sayfasini kapatir.")
    public void kullanici_gmibank_sayfasini_kapatir() {
        Driver.closeDriver();
    }


}
