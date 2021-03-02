package gmibank.stepdefinitions;

import com.github.javafaker.Faker;
import gmibank.pages.Us_001_Page;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Us_001_StepDefinition {
    Us_001_Page us_001_page=new Us_001_Page();
    Faker faker = new Faker();
    String pasword=faker.internet().password();



    @Given("user go to main page")
    public void userGoToMainPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmibank_url"));
    }
    @And("click on enterance button")
    public void clickOnEnteranceButton() {
        us_001_page.girisButonu.click();
    }

    @Given("Click on registration button")
    public void click_on_registration_button() {
        us_001_page.register.click();
    }

    @And("SSN should be written with the format")
    public void ssnShouldBeWrittenWithTheFormat() {
        us_001_page.SSNButton.sendKeys(ConfigurationReader.getProperty("SSN")+ Keys.ENTER);
    }
    @And("SSN should be written with current format")
    public void ssnShouldBeWrittenWithCurrentFormat() {
        us_001_page.SSNButton.sendKeys(ConfigurationReader.getProperty("SSN")+Keys.ENTER);
    }


    @And("firstName should not be left blank")
    public void firstnameShouldNotBeLeftBlank() {
        us_001_page.FirstnameButton.sendKeys(faker.name().firstName()+Keys.ENTER);
    }

    @And("LastName should not be left blank")
    public void lastnameShouldNotBeLeftBlank() {
        us_001_page.lastNameButton.sendKeys(faker.name().lastName()+Keys.ENTER);
    }

    @And("Adres information should be written")
    public void adresInformationShouldBeWritten() {
        us_001_page.addressButton.sendKeys(ConfigurationReader.getProperty("AddresInformation")+Keys.ENTER);
    }

    @And("Phone Number should be written with the format")
    public void phoneNumberShouldBeWrittenWithTheFormat() {
        us_001_page.mobilephoneButton.sendKeys(ConfigurationReader.getProperty("PhoneNumber")+Keys.ENTER);
    }

    @And("Username should not be left blank")
    public void usernameShouldNotBeLeftBlank() {
        us_001_page.usernameButton.sendKeys(faker.name().username()+Keys.ENTER);
    }

    @And("Email information  should not be left blank")
    public void emailInformationShouldNotBeLeftBlank() {
        us_001_page.emailButton.sendKeys(faker.internet().emailAddress());
    }

    @And("New password information should not be left blank")
    public void newPasswordInformationShouldNotBeLeftBlank() {
        us_001_page.firstPasswordButton.sendKeys(pasword);
    }

    @And("New password confirmation should not be left blank")
    public void newPasswordConfirmationShouldNotBeLeftBlank() {
        us_001_page.secondPasswordButton.sendKeys(pasword);
    }

    @And("click on registration button for save")
    public void clickOnRegistrationButtonForSave() {
        us_001_page.registerSubmitButton.click();
    }

    @Then("The mesage of Registration saved! Please check your email for confirmation  is disabled")
    public void theMesageOfRegistrationSavedPleaseCheckYourEmailForConfirmationIsDisabled() {

    }

    @Then("your ssn is required is visable")
    public void yourSsnIsRequiredIsVisable() {
   Assert.assertTrue(us_001_page.ssnMesaji.getText().contains("translation-not-found[Your SSN is required]"));

    }

    @And("send mistake character")
    public void sendMistakeCharacter() {
        us_001_page.SSNButton.sendKeys(ConfigurationReader.getProperty("mistake_ssn"));
        us_001_page.FirstnameButton.click();
    }

    @Then("the mesage of your is required is visable")
    public void theMesageOfYourIsRequiredIsVisable() {
        Assert.assertTrue(us_001_page.ssnMesaji.getText().contains("Your SSN is invalid"));
    }

    @And("click on first name button")
    public void clickOnFirstNameButton() {
        us_001_page.FirstnameButton.click();
    }

    @Then("the mesage of your first name is required")
    public void theMesageOfYourFirstNameIsRequired() {
        Assert.assertTrue(us_001_page.firstNameMesaji.getText().contains("Your First Name is required"));
    }

    @And("send mistake character to last name button")
    public void sendMistakeCharacterToLastNameButton() {
        us_001_page.lastNameButton.submit();
    }

    @And("click on last name button")
    public void clickOnLastNameButton() {
        us_001_page.lastNameButton.submit();
    }

    @Then("the mesage of your last name is required")
    public void theMesageOfYourLastNameIsRequired() {
        Assert.assertTrue(us_001_page.LastNameMesaji.getText().contains("Your Last Name is required"));
    }

    @And("send mistake number format to mobilephonenumber")
    public void sendMistakeNumberFormatToMobilephonenumber() {
        us_001_page.mobilephoneButton.sendKeys(ConfigurationReader.getProperty("mistake_phoneNumber"));
       us_001_page.usernameButton.submit();
    }

    @Then("the mesage of Your mobile phone number is invalid is visiable")
    public void theMesageOfYourMobilePhoneNumberIsInvalidIsVisiable() {
        Assert.assertTrue(us_001_page.MobilephoneNumberMesage.getText().contains("Your mobile phone number is invalid"));
    }

    @And("click on ssn button")
    public void clickOnSsnButton() {
        us_001_page.SSNButton.submit();
    }

    @And("send the blank")
    public void sendTheBlank() {
        us_001_page.usernameButton.submit();
    }

    @Then("the mesage of username is invalid is visable")
    public void theMesageOfUsernameIsInvalidIsVisable() {
        Assert.assertTrue(us_001_page.usernameNameMesaji.getText().contains("Your username is required."));
    }

    @And("send the email button blank")
    public void sendTheEmailButtonBlank() {
        us_001_page.emailButton.submit();
    }

    @Then("The mesage of Your email is required is visable")
    public void theMesageOfYourEmailIsRequiredIsVisable() {
        Assert.assertTrue(us_001_page.emailMesageblank.getText().contains("Your email is required."));
    }

    @And("send mistake email")
    public void sendMistakeEmail() {
        us_001_page.emailButton.sendKeys(ConfigurationReader.getProperty("mistake_email"));
        us_001_page.firstPasswordButton.submit();
    }

    @Then("the mesage of This field is invalid is visiable")
    public void theMesageOfThisFieldIsInvalidIsVisiable() {
        Assert.assertTrue(us_001_page.emailnothave.getText().contains("This field is invalid"));
    }

    @And("send unsuffient character to email button")
    public void sendUnsuffientCharacterToEmailButton() {
        us_001_page.emailButton.sendKeys(ConfigurationReader.getProperty("unsufficient_email"));
        us_001_page.firstPasswordButton.submit();
    }

    @Then("the mesage of Your email is required to be at least {int} characters is visable")
    public void theMesageOfYourEmailIsRequiredToBeAtLeastCharactersIsVisable(int arg0) {
    Assert.assertTrue(us_001_page.emailnotenough.getText().contains("Your email is required to be at least 5 characters."));
    }

    @And("new password button should left")
    public void newPasswordButtonShouldLeft() {
        us_001_page.firstPasswordButton.submit();
    }

    @Then("the mesage of Your password is required.")
    public void theMesageOfYourPasswordIsRequired() {
        Assert.assertTrue(us_001_page.newpasswordmesage1.getText().contains("Your password is required."));
    }

    @And("send insufient character to new password button")
    public void sendInsufientCharacterToNewPasswordButton() {
        us_001_page.firstPasswordButton.sendKeys(ConfigurationReader.getProperty("insufficient_password"));
        us_001_page.secondPasswordButton.submit();
    }

    @Then("the mesage of Your password is required to be at least {int} characters is visable")
    public void theMesageOfYourPasswordIsRequiredToBeAtLeastCharactersIsVisable(int arg0) {
        Assert.assertTrue(us_001_page.newpasswordmesagenotenough.getText().contains("Your password is required to be at least 4 characters."));

    }

    @And("pasword confirmation button should be left")
    public void paswordConfirmationButtonShouldBeLeft() {
        us_001_page.secondPasswordButton.submit();

    }

    @Then("the mesage of Your confirmation password is required is visable")
    public void theMesageOfYourConfirmationPasswordIsRequiredIsVisable() {
        Assert.assertTrue(us_001_page.confirmationpasswordmesage.getText().contains("Your confirmation password is required."));
    }
}
