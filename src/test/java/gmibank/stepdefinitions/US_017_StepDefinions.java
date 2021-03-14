package gmibank.stepdefinitions;

import gmibank.pages.US_17Page;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class US_017_StepDefinions {
    US_17Page us_17Page= new US_17Page();



    @Given("user anasayfaya gider")
    public void user_anasayfaya_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmibank_url"));

    }

    @Given("user ilk girise tiklar")
    public void user_ilk_girise_tiklar() {
        us_17Page.girisButton.click();

    }

    @Given("user sign_in sekmesine tiklar")
    public void user_sign_in_sekmesine_tiklar() {
        us_17Page.signInEnterens.click();

    }

    @Given("user gecerli username girer")
    public void user_gecerli_username_girer() {
        us_17Page.username_Alani.sendKeys(ConfigurationReader.getProperty("admin_username")+ Keys.ENTER);

    }

    @Given("user gecerli password girer")
    public void user_gecerli_password_girer() {
        us_17Page.password_Alani.sendKeys(ConfigurationReader.getProperty("admin_password")+Keys.ENTER);

    }

    @Given("user signin ile giris yapar")
    public void user_signin_ile_giris_yapar() {
        us_17Page.signInButonu.click();

    }

    @Given("user administration bolumune tiklar")
    public void user_administration_bolumune_tiklar() throws InterruptedException {
        us_17Page.administration.click();

        Thread.sleep(5000);

    }

    @Given("user userManagmenta tiklar")
    public void user_user_managmenta_tiklar() {
        us_17Page.userManagementButton.click();

        Driver.wait(5);

    }

    @Then("user edit sekmesine tiklar")
    public void user_edit_sekmesine_tiklar() {
        us_17Page.editButonu.click();

        //Actions actions=new Actions(Driver.getDriver());
        //actions.sendKeys(Keys.PAGE_DOWN).perform();

    }


    @Then("admin profilesden {string} secer ve save eder")
    public void admin_profilesden_secer_ve_save_eder(String role) {
        WebElement profilesButton= us_17Page.profiles;
        Select select =new Select(profilesButton);
        select.selectByValue(role);
        us_17Page.save.click();



    }











}
