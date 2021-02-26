package gmibank.stepdefinitions;

import gmibank.pages.SsnNumberPage;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class US10ManageCustomerStepdefinitions {



    SsnNumberPage page= new SsnNumberPage();





    @When("Click Save Button")
    public void click_save_button() {
        page.adress.clear();


        page.savebutton.click();
        ReusableMethods.waitFor(3);
    }

    @Then("See This field is required.")
    public void see_this_field_is_required() {
        Assert.assertTrue(page.hatayazisiadres.isDisplayed());
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


}








