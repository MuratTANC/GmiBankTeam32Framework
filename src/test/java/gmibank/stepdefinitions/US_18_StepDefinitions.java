package gmibank.stepdefinitions;

import gmibank.pages.US_018_Page;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class US_18_StepDefinitions {

    US_018_Page us_018_page = new US_018_Page();


    @When("click on sign in button")
    public void click_on_sign_in_button() {
        us_018_page.signInGirisButonu.click();
    }

    @When("Enter your username on the username button")
    public void enter_your_username_on_the_username_button() {
        us_018_page.usernameButtonu.sendKeys(ConfigurationReader.getProperty("managername") + Keys.ENTER);
    }

    @When("Enter your password on the password button")
    public void enter_your_password_on_the_password_button() {
        us_018_page.passwordButtonu.sendKeys(ConfigurationReader.getProperty("managerpassword") + Keys.ENTER);
    }

    @When("Click on signin submit button")
    public void click_on_signin_submit_button() {
        us_018_page.signInsubmitButonu.click();

    }

    @When("As user manager, clicks on the My Operations link.")
    public void as_user_manager_clicks_on_the_my_operations_link() {
        us_018_page.myOperationButton.click();
    }

    @When("Click on the User Manage Accounts link")
    public void click_on_the_user_manage_accounts_link() {
        us_018_page.ManageCustomerButton.click();
    }

    @Then("user should be able to click on view button and all information is viewed")
    public void user_should_be_able_to_click_on_view_button_and_all_information_is_viewed() {
        Assert.assertTrue(us_018_page.viewButton.isEnabled());
    }


    @And("Click on registration_sign in  button")
    public void clickOnRegistration_signInButton() {
      us_018_page.firstenterancebuttonu.click();
    }

    @When("Go to main page")
    public void goToMainPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_url"));
    }

    @Then("user should be able to click on edit button and user should be able to save changes")
    public void userShouldBeAbleToClickOnEditButtonAndUserShouldBeAbleToSaveChanges() {
    Assert.assertTrue(us_018_page.editButton.isEnabled());
    }

    @Then("user should be able to click on delete button and get warning message before deleting account")
    public void userShouldBeAbleToClickOnDeleteButtonAndGetWarningMessageBeforeDeletingAccount(int arg0) {

    }
}
