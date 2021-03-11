package gmibank.stepdefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import gmibank.pojos.Country;
import gmibank.pojos.Customer;
import gmibank.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_20ApiTestStepDef {
    List<Map<String, Object>> listOfCostumers;
    HashMap<String, Object> putCostumer;
    Response response;
    Customer expectedTestData = new Customer();

    @Given("kullanici api {string} gider")
    public void kullanici_api_gider(String end_point) {

        response = given().headers("Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON)
                .when()
                .get(end_point)
                .then()
                .contentType(ContentType.JSON)
              //  .statusCode(200)
                .extract()
                .response();



        response.prettyPrint();

    }

    @Then("kullanici tum customer bilgilerini okur")
    public void kullanici_tum_customer_bilgilerini_okur() throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        Customer [] customer = objectMapper.readValue(response.asString(),Customer[].class);

    }

    @Then("kullanici okudugu customerlerin verilerini validate yapar")
    public void kullanici_okudugu_customerlerin_verilerini_validate_yapar() {

    }


}
