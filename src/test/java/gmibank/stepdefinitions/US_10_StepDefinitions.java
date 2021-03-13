package gmibank.stepdefinitions;

import gmibank.pages.US_09_Page;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class US_10_StepDefinitions {



    US_09_Page page= new US_09_Page();





    @When("Click Save Button")
    public void click_save_button() {
       page.city.click();
        page.adress.clear();


      //  page.savebutton.click();
        ReusableMethods.waitFor(3);
    }

    @Then("See This field is required.")
    public void see_this_field_is_required()
    {

        Assert.assertTrue(page.hatayazisiadres.isDisplayed());
        ReusableMethods.waitFor(3);
        Assert.assertTrue(page.hatayazisicity.isDisplayed());
        ReusableMethods.waitFor(3);
    }

    @Then("Select Country.")
    public void select_country() {
        page.country.click();
        Select select= new Select(page.country);
        select.selectByIndex(3);
        Assert.assertTrue(page.country.isDisplayed());
        ReusableMethods.waitFor(3);

    }

    @Then("Write a State.")
    public void write_a_state() {
        page.state.sendKeys(ConfigurationReader.getProperty("state"));
        Assert.assertTrue(page.state.isDisplayed());
        ReusableMethods.waitFor(3);


    }


    @Then("See Date TextBox")
    public void seeDateTextBox() {

        Assert.assertTrue(page.date.isDisplayed());

    }

    @Then("See Date Today")
    public void seeDateToday() {

        page.date.sendKeys(Driver.Date()+ Keys.TAB + "2020"+ Keys.TAB + Driver.Time());

        Assert.assertTrue(page.date.isEnabled());
    }

    @Then("Click Zelle Check Box")
    public void clickZelleCheckBox() {

        page.zelleEnrolled.click();


    }
}








