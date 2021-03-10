package gmibank.stepdefinitions;



import com.fasterxml.jackson.databind.ObjectMapper;
import gmibank.jsonModels.StateJson;
import gmibank.pojos.Customer;
import gmibank.pojos.States;
import gmibank.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.List;

import static io.restassured.RestAssured.given;


public class US_27_StepDefinitions {

    Response response;
    Customer[] customers;
    Response responseAll;
    States[] states;
    ObjectMapper objectMapper = new ObjectMapper();
    Response  responsedelete;
    States[]  statedeleted;
    List<String> list;
    JsonPath jsonPath;



    @Given("user should create a state data from {string}")
    public void userShouldCreateAStateDataFrom(String url) {
        response = given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("tokenf"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .body(StateJson.CREATE_STATE3)
                .post(url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        response.prettyPrint();





    }



     @Then("user should create a state with  {string} and {string}")
     public void userShouldCreateAStateWithAnd(String ar, String arg1) {



     }

    @Given("user should be reads all states data from {string}")
    public void userShouldBeReadsAllStatesDataFrom(String arg0) {







    }

    @And("user should be delete a state with {string} and verify")
    public void userShouldBeDeleteAStateWithAndVerify(String id) {
     String url="https://www.gmibank.com/api/tp-states";

     /* response = given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("tokenf"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .delete(url+ id)
                .then()
                .extract()
                .response();*/



        response = given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("tokenf"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when().body(StateJson.CREATE_STATE2)
                .delete(url+id)
                .then()
                .extract()
                .response();






    jsonPath= response.jsonPath();
   String stateId= jsonPath.getString("id");
       Assert.assertFalse("state silinmedi ",stateId.contains("73007"));
       System.out.println("silindi gozunaydin");

    }
}