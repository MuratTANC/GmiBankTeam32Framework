package gmibank.stepdefinitions;

import gmibank.pojos.States;
import gmibank.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class US_22_StepDefinitions {

    Response response;
    List<Integer> id=new ArrayList<>();
    States[] states;
    JsonPath jsonPath;


    @Given("user gets all data for states using api end point {string}")
    public void user_gets_all_data_for_states_using_api_end_point(String states_url) {
        response = given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(states_url)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();
        response.prettyPrint();

    }

    @Given("user deserializes states data as json to java pojo")
    public void user_deserializes_states_data_as_json_to_java_pojo() {
        jsonPath=response.jsonPath();
        String firstName=jsonPath.getString("name");
        System.out.println(firstName);

    }

    @Then("user validates the data for states")
    public void user_validates_the_data_for_states() {
        jsonPath=response.jsonPath();
        String firstName=jsonPath.getString("name");
        String expectedStateName="California";
        Assert.assertTrue("not find",firstName.contains(expectedStateName));
        System.out.println("Test passed: User validates the data for states");

    }


}