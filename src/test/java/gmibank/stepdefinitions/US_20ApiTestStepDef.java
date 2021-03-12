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
import org.junit.Assert;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_20ApiTestStepDef {

    Response response;
    JsonPath jsonPath;
   // Customer[] customer;
   // List<Integer> id=new ArrayList<>();

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
                .statusCode(200)
                .extract()
                .response();

        response.prettyPrint();


    }

    @Then("kullanici tum customer bilgilerini okur")
    public void kullanici_tum_customer_bilgilerini_okur() throws IOException{
        jsonPath=response.jsonPath();
        String firstName=jsonPath.getString("firstName");
        String lastName=jsonPath.getString("lastName");
        String email=jsonPath.getString("email");
        String mobilno=jsonPath.getString("mobilePhoneNumber");
        String city=jsonPath.getString("city");
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(mobilno);
        System.out.println(city);
        System.out.println(email);
        Assert.assertTrue(firstName.contains(ConfigurationReader.getProperty("us_20firstName")));
        Assert.assertTrue(lastName.contains(ConfigurationReader.getProperty("us_20lastName")));
        Assert.assertTrue(mobilno.contains(ConfigurationReader.getProperty("us_20mobilePhoneNumber")));
        Assert.assertTrue(email.contains(ConfigurationReader.getProperty("us_20email")));
        Assert.assertTrue(city.contains(ConfigurationReader.getProperty("us_20city")));
    }

    @Then("kullanici okudugu customerlerin verilerini validate yapar")
    public void kullanici_okudugu_customerlerin_verilerini_validate_yapar() {

    }


}
