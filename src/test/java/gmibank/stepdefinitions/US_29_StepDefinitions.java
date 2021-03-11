package gmibank.stepdefinitions;

import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.DatabaseUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class US_29_StepDefinitions {


    @Given("kullanici jdbc ile customer veritabanina baglanir")
    public void kullanici_jdbc_ile_customer_veritabanina_baglanir() {
        DatabaseUtility.createConnection();
    }

    @Then("kullanici customer bilgilerini okur ve dogrular")
    public void kullanici_customer_bilgilerini_okur_ve_dogrular() {
        String query= ConfigurationReader.getProperty("sqlquery");
        List<Object> listofCustomer = DatabaseUtility.getRowList(query);
        System.out.println(listofCustomer.toString());
        Assert.assertTrue(listofCustomer.toString().contains(ConfigurationReader.getProperty("nid")));
        Assert.assertTrue(listofCustomer.toString().contains(ConfigurationReader.getProperty("nfirstName")));
        Assert.assertTrue(listofCustomer.toString().contains(ConfigurationReader.getProperty("nlastName")));
        Assert.assertTrue(listofCustomer.toString().contains(ConfigurationReader.getProperty("nmiddleInitial")));
        Assert.assertTrue(listofCustomer.toString().contains(ConfigurationReader.getProperty("nemail")));
        Assert.assertTrue(listofCustomer.toString().contains(ConfigurationReader.getProperty("nmobilePhoneNumber")));
        Assert.assertTrue(listofCustomer.toString().contains(ConfigurationReader.getProperty("nphoneNumber")));
        Assert.assertTrue(listofCustomer.toString().contains(ConfigurationReader.getProperty("nzipCode")));
        Assert.assertTrue(listofCustomer.toString().contains(ConfigurationReader.getProperty("naddress")));

        Assert.assertTrue(listofCustomer.toString().contains(ConfigurationReader.getProperty("ncity")));
        Assert.assertTrue(listofCustomer.toString().contains(ConfigurationReader.getProperty("nssn")));



    }

    @Given("kullanici jdbc ile country veritabanına baglanır")
    public void kullanici_jdbc_ile_country_veritabanına_baglanır() {
        DatabaseUtility.createConnection();

    }

    @Then("kullanici country bilgilerini okur ve dogrular")
    public void kullanici_country_bilgilerini_okur_ve_dogrular() {
        String query2= ConfigurationReader.getProperty("sqlquery2");
        List<Object> listofCountry = DatabaseUtility.getRowList(query2);
        System.out.println(listofCountry.toString());
        Assert.assertTrue(listofCountry.toString().contains(ConfigurationReader.getProperty("cid")));
        Assert.assertTrue(listofCountry.toString().contains(ConfigurationReader.getProperty("cname")));

    }

    @Given("kullanici jdbc ile states veritabanına baglanır")
    public void kullanici_jdbc_ile_states_veritabanına_baglanır() {
        DatabaseUtility.createConnection();
    }

    @Then("kullanici states bilgilerini okur ve dogrular")
    public void kullanici_states_bilgilerini_okur_ve_dogrular() {
        String query3= ConfigurationReader.getProperty("sqlquery3");
        List<Object> listofState = DatabaseUtility.getRowList(query3);
        System.out.println(listofState.toString());
        Assert.assertTrue(listofState.toString().contains(ConfigurationReader.getProperty("sid")));
        Assert.assertTrue(listofState.toString().contains(ConfigurationReader.getProperty("sname")));

    }



}
