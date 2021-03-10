package gmibank.stepdefinitions;

import gmibank.pages.US_19_Page;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class US_19_StepDefinitions {

US_19_Page page= new US_19_Page();






    @Given("logs in user login page as admin")
    public void logs_in_user_login_page_as_admin() {

    }

    @Given("user clicks on My Operations")
    public void user_clicks_on_my_operations() {
        Driver.waitAndClick(page.myOperations,3);
    }

    @Given("user clicks on Manage Account")
    public void user_clicks_on_manage_account() {
        Driver.waitAndClick(page.manageAccounts,3);
    }

    @Given("user clicks on Create a new Account")
    public void user_clicks_on_create_a_new_account() {
        page.newAccount.click();
    }

    @Given("user create a description {string}")
    public void user_create_a_description(String string) {
        Driver.waitAndSendText(page.description,string,2);
        Driver.wait(2);

    }

    @Given("user fills the balance box {string}")
    public void user_fills_the_balance_box(String string) {
        Driver.waitAndSendText(page.balance,string,2);
    }

    @Given("user selects a valid account type from Account Type Drop-down {string}")
    public void user_selects_a_valid_account_type_from_account_type_drop_down(String string) {
        Select select=new Select(page.accountType);
        select.selectByVisibleText(string);
    }

    @Given("user selects a valid account status type from Account Status Type Drop-down {string}")
    public void user_selects_a_valid_account_status_type_from_account_status_type_drop_down(String string) {
        Select select=new Select(page.accountStatusType);
        select.selectByVisibleText(string);
    }

    @Given("user selects a valid employee from Employee Drop-down")
    public void user_selects_a_valid_employee_from_employee_drop_down() {
        Select select=new Select(page.employee);
        select.selectByIndex(0);
        Driver.waitAndSendText(page.createDate,"12/12/20",3);
        Driver.waitAndSendText(page.closedDate,"10/12/23",3);
    }


    @Given("user clicks on the Save button")
    public void user_clicks_on_the_save_button() {
        page.saveButton.click();
    }

    @Then("verify transaction done")
    public void verify_transaction_done() {
     //   SoftAssert softAssert= new SoftAssert();
       // softAssert.assertTrue(page.BASARDIM.isDisplayed());
       // softAssert.assertAll();
    }









}
