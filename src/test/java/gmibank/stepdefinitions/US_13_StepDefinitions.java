package gmibank.stepdefinitions;

import gmibank.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import gmibank.pages.US_13Page;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;
import java.util.List;

public class US_13_StepDefinitions {

    US_13Page us_13page = new US_13Page();

    //TC01
    @Given("Giris simgesine tiklar")
    public void giris_simgesine_tiklar() {
        us_13page.girisButton.click();
        us_13page.signInGirisButon.click();
    }

    @Given("Gecerli username ve password girer")
    public void gecerli_username_ve_password_girer() {
        us_13page.username.sendKeys(ConfigurationReader.getProperty("employee_username"));
        us_13page.password.sendKeys(ConfigurationReader.getProperty("employee_password"));
    }

    @Given("Sign in butonuna tiklar")
    public void sign_in_butonuna_tiklar() {
        us_13page.signInButton.click();
    }

    @Given("My Operation tiklar")
    public void my_operation_tiklar() {
        us_13page.myOperationsDropdown.click();
    }

    @Given("Manage Accounts tiklar")
    public void manage_accounts_tiklar() {
        us_13page.manageAccount.click();
    }

    @Given("+Create a new Account tiklar")
    public void create_a_new_account_tiklar() {
        us_13page.createAccountButton.click();
    }

    @Given("Create or edit a Account yazisini gorur")
    public void create_or_edit_a_account_yazisini_gorur() {
        Assert.assertTrue(us_13page.creaateOrEditACustomerYazisi.isDisplayed());
    }

    //TC02
    @Given("Description text box tiklanir")
    public void descriptions_text_box_tiklanir() {
        us_13page.descriptionTextBox.click();
    }

    @Given("Balance text box tiklanir")
    public void balance_text_box_tiklanir() {
        us_13page.balanceTextBox.click();
    }

    @Given("Description icin This field is required. yazisi gorunur.")
    public void this_field_is_required_yazisi_gorunur() {
        Assert.assertTrue(us_13page.thisFieldIsRequiredForDescription.isDisplayed());
    }


    //TC03
    @Given("Save butonuna tiklar")
    public void save_butonuna_tiklar() {
        us_13page.saveButton.click();
    }

    @Given("Balance icin This field is required. yazisi gorunur.")
    public void balance_icin_this_field_is_required_yazisi_gorunur() {
        Assert.assertTrue(us_13page.thisFieldIsRequiredForBalance.isDisplayed());

    }

    //TC04
    @Given("Account Type Drop Down  menusunden Account Typelari gorur")
    public void account_type_drop_down_menusunden_account_typelari_gorur() {
        System.out.println("================ ACCOUNT TYPE TEST ================");
        try {

        Select select = new Select(us_13page.accountTypeDropdown);

        List actualATDropdownValues = new ArrayList();

        for (WebElement element: select.getOptions()){
            actualATDropdownValues.add(element.getText());
        }
        List expectedATDropdownValues = new ArrayList();
        expectedATDropdownValues.add("CHECKING");
        expectedATDropdownValues.add("SAVING");
        expectedATDropdownValues.add("CREDIT_CARD");
        expectedATDropdownValues.add("INVESTING");

        for (int i = 0; i < actualATDropdownValues.size(); i++) {

            System.out.println("Actual : " + actualATDropdownValues.get(i) + " & Expected : " + expectedATDropdownValues.get(i) );
            Assert.assertTrue(actualATDropdownValues.get(i).equals(expectedATDropdownValues.get(i)));
        }
    } catch (Exception e){
        e.printStackTrace();
    }
    }

    //TC05
    @Given("Account Status Type Drop Down menusunden Account Status Typelari gorur.")
    public void account_status_type_drop_down_menusunden_account_status_typelari_gorur() {
        System.out.println("================ ACCOUNT STATUS TYPE TEST ================");
        try {

            Select select = new Select(us_13page.accountStatusDropdown);

            List actualASTDropdownValues = new ArrayList();

            for (WebElement element: select.getOptions()){
                actualASTDropdownValues.add(element.getText());
            }
            List expectedASTDropdownValues = new ArrayList();
            expectedASTDropdownValues.add("ACTIVE");
            expectedASTDropdownValues.add("SUESPENDED");
            expectedASTDropdownValues.add("CLOSED");

            for (int i = 0; i < actualASTDropdownValues.size(); i++) {

                System.out.println("Actual : " + actualASTDropdownValues.get(i) + " & Expected : " + expectedASTDropdownValues.get(i) );
                Assert.assertTrue(actualASTDropdownValues.get(i).equals(expectedASTDropdownValues.get(i)));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
