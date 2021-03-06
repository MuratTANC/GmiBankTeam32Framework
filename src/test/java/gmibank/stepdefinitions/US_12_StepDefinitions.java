package gmibank.stepdefinitions;

import gmibank.pages.US_12_Page;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class US_12_StepDefinitions {
    US_12_Page manage2=new US_12_Page();

    @Given("user sign in to the system as employee")
    public void user_sign_in_to_the_system_as() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmibank_url"));
        manage2.dropDownAccount.click();
        manage2.accountSignIn.click();
        manage2.username.sendKeys("employee32");
        manage2.password.sendKeys("team32team32-");
        manage2.buttonSignin.click();
    }

    @When("user navigates to Manage Customers page under My Operations menu")
    public void user_navigates_to_page_under_my_operations_menu() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        manage2.myOperations.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        manage2.manageCostumer.click();

    }

    @Then("verify that a table is displayed in the Customers_page with following columns")
    public void verify_that_a_table_is_displayed_in_the_customers_page_with_following_columns(io.cucumber.datatable.DataTable dataTable) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(manage2.headList.get(0).getText().contains("ID"));
        Assert.assertTrue(manage2.headList.get(1).getText().contains("First Name"));
        Assert.assertTrue(manage2.headList.get(2).getText().contains("Last Name"));
        Assert.assertTrue(manage2.headList.get(3).getText().contains("Middle Initial"));
        Assert.assertTrue(manage2.headList.get(4).getText().contains("Email"));
        Assert.assertTrue(manage2.headList.get(5).getText().contains("Mobile Phone Number"));
        Assert.assertTrue(manage2.headList.get(6).getText().contains("Phone Number"));
        Assert.assertTrue(manage2.headList.get(7).getText().contains("Address"));
        Assert.assertTrue(manage2.headList.get(8).getText().contains("Create Date"));
        Assert.assertTrue(manage2.rowList.size()==10);
    }
    @Then("verify that there is view button in the table")
    public void verify_that_there_is_one_view_button_for_each_row_in_the_table() {
        manage2.buttonWiew.click();
        String title = manage2.CustomerYazi.getText();
        Assert.assertTrue(title.contains("Customer"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @When("verify that after clicking view button for a user with a randomly selected email in the page, user information is populated")
    public void verify_that_after_clicking_view_button_for_a_user_with_a_randomly_selected_email_in_the_page_user_information_is_populated() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(manage2.viewEmail.getText().contains("mail.com"));
    }

    @When("verify that in the user page, there is an edit button")
    public void verify_that_in_the_user_page_there_is_an_edit_button() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(manage2.editButton.getText().contains("Edit"));
    }

    @Then("verify that there is one edit button for each row in the table")
    public void verify_that_there_is_one_edit_button_for_each_row_in_the_table() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        manage2.rowspace.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_RIGHT).perform();
        actions.sendKeys(Keys.ARROW_RIGHT).perform();
        actions.sendKeys(Keys.ARROW_RIGHT).perform();
        actions.sendKeys(Keys.ARROW_RIGHT).perform();
        actions.sendKeys(Keys.ARROW_RIGHT).perform();
        System.out.println(manage2.viewRightEdit.getText());
        //
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        manage2.viewRightEdit.click();

        // Actions action = new Actions(Driver.getDriver());
        //   action.clickAndHold(manage2.viewRightEdit).click().perform();
        // action.moveToElement(manage2.viewRightEdit,2,0).click().perform();
        //  action.moveToElement(manage2.viewRightEdit).click().perform();
        //    Assert.assertTrue(manage2.viewRightEdit.isDisplayed());
    }

    @Then("verify that after clicking edit button for a user with a randomly selected email in the page, user information is populated on create_or_edit_customer_page")
    public void verify_that_after_clicking_edit_button_for_a_user_with_a_randomly_selected_email_in_the_page_user_information_is_populated_on_create_or_edit_customer_page() {
  /*
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(manage2.editEmail.getText());
        Assert.assertTrue(manage2.editEmail.getText().contains("mail"));
*/
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_RIGHT).perform();
        actions.sendKeys(Keys.ARROW_RIGHT).perform();
        actions.sendKeys(Keys.ARROW_RIGHT).perform();
        actions.sendKeys(Keys.ARROW_RIGHT).perform();
        actions.sendKeys(Keys.ARROW_RIGHT).perform();

        //
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        manage2.viewRightEdit.click();
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(manage2.Emailtext.getText());

        Assert.assertTrue(manage2.Emailtext.isEnabled());
    }

    @Then("user edit city by generating a new one in create_or_edit_customer_page")
    public void user_edit_city_by_generating_a_new_one_in_create_or_edit_customer_page() {
        manage2.editCity.clear();
        manage2.editCity.sendKeys("ankara");
        manage2.EditSaveBtn.submit();
    }

    @Then("verify that a message is displayed such as tPCustomer.updated on the customers_page and new value is seen on user_info_page")
    public void verify_that_a_message_is_displayed_such_as_t_p_customer_updated_on_the_customers_page_and_new_value_is_seen_on_user_info_page() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(manage2.succesEditedMessage.isDisplayed());
    }


    @When("user clicks delete button for a user with a randomly selected email in the page")
    public void user_clicks_button_for_a_user_with_a_randomly_selected_email_in_the_page() {
        manage2.deleteButon.click();

        manage2.confirmdelbtn.click();
    }

    @Then("verify that such an information message tPCustomer.deleted is appeared after delete operation")
    public void verify_that_such_an_information_message_is_appeared_after_delete_operation() {
        Assert.assertTrue(manage2.succesdelmessage.isEnabled());

    }

}
