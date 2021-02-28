package gmibank.stepdefinitions;

import com.sun.tools.jxc.ConfigReader;
import gmibank.pages.US_07_Page;
import gmibank.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.util.List;

public class US_07_StepDefinitions {

    US_07_Page us_07_page=new US_07_Page();

    @And("Silinen email yerine neunutzer{int}neu yaziniz.")
    public void silinenEmailYerineNeunutzerNeuYaziniz(int arg0) {
        us_07_page.email.sendKeys(ConfigurationReader.getProperty("invalid_email_dogrulama"));
    }

    @Then("Email textboxinin altinda This field is invalid yazisi cikmalidir.")
    public void email_textboxinin_altinda_this_field_is_invalid_yazisi_cikmalidir() {
        Assert.assertFalse(us_07_page.email.getText().contains(ConfigurationReader.getProperty("e_mail_invalid_yazisi")));
    }

    @And("{int}saniye bekleyiniz")
    public void saniyeBekleyiniz(int arg0) throws InterruptedException {
        Thread.sleep(3000);
        //wait(3000);

    }

    @And("{string} && {string} dilllerinden baska bir dil seceneginin olmadigini dogrulayiniz.")
    public void dilllerindenBaskaBirDilSecenegininOlmadiginiDogrulayiniz(String string, String string1) {
        List<WebElement> languageOptions;
        Select select = new Select(us_07_page.language);
        languageOptions = select.getOptions();
        System.out.println(languageOptions.get(0).getText());
        System.out.println(languageOptions.get(1).getText());

        for (WebElement w : languageOptions) {
            boolean language = w.getText().equals("Türkçe") || w.getText().equals("English");
            Assert.assertTrue("user can only select English or Turkish", language);


        }

    }

}
