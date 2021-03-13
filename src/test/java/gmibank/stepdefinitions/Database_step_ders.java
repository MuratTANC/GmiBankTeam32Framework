package gmibank.stepdefinitions;

import gmibank.utilities.DatabaseUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

import static gmibank.utilities.DatabaseUtility.*;

public class Database_step_ders {

    public static void main(String[] args) {

         createConnection();
         String queryCustomer = "Select * from tp_customer";
         getColumnNames(queryCustomer);
         System.out.println( getColumnNames(queryCustomer));
         System.out.println("================================================");
         getColumnData(queryCustomer,"first_name");
         System.out.println(getColumnData(queryCustomer,"first_name"));
         System.out.println("================================================");
         System.out.println(getCellValue(queryCustomer, 4, 1));



        String queryCountry = "Select * from tp_country";
        System.out.println(getColumnNames(queryCountry));
        System.out.println(getQueryResultList(queryCountry));


    }
    List<Object> objectList;
    @Given("user creates a connection with db using {string} , {string} and {string}")
    public void user_creates_a_connection_with_db_using_and(String url, String user, String password) {
        DatabaseUtility.createConnection(url,user,password);
    }

    @Given("user reads the Customers data using {string} and {string}")
    public void user_reads_the_customers_data_using_and(String query, String ssn) {
        objectList= DatabaseUtility.getColumnData(query,ssn);
        System.out.println(objectList.toString());
    }

    @Then("validate customers data")
    public void validate_customers_data() {
        Assert.assertTrue(objectList.contains("159-63-9211"));
        System.out.println("Validation is succesvol");
    }
}
