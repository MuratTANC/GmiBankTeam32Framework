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
    JsonPath jsonPath;

    @Given("GMI4 user should be reads all states data from {string}")
    public void gmi4_user_should_be_reads_all_states_data_from(String states_url1) {
        response = given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(states_url1)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();
        response.prettyPrint();



    }


    @Given("GMI4 user should be deleted a state using endpoint {string} and its extension {string}")
    public void gmi4_user_should_be_deleted_a_state_using_endpoint_and_its_extension(String URL, String ID) {
        response = given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .delete(URL+ID)
                .then()
                .extract()
                .response();

        response.prettyPrint();
    }

}