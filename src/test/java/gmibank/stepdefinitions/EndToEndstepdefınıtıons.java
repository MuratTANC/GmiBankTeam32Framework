package gmibank.stepdefinitions;

import gmibank.pages.SsnNumberPage;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.Select;

public class EndToEndstepdefınıtıons {
SsnNumberPage page= new SsnNumberPage();

    @Given("kullanıcı account type secer")
    public void kullanıcı_account_type_secer() {
        Select select= new Select(page.accountTypeDropdown);
        select.selectByVisibleText("CHECKING");

    }

    @Given("status type secer")
    public void status_type_secer() {
Select select= new Select(page.accountStatusTypeDropdown);
select.selectByVisibleText("SUESPENDED");
    }

    @Given("Create date  ve closed date secer")
    public void create_date_ve_closed_date_secer() {

    }

    @Given("employee secer")
    public void employee_secer() {

    }

    @Given("save tıklar")
    public void save_tıklar() {

page.save.click();
        Driver.wait(5);
    }

    @And("cikis yapar")
    public void cikisYapar() {
        page.signOutButton.click();
        Driver.wait(5);}
}
