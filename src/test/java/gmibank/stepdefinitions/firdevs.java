package gmibank.stepdefinitions;


import com.fasterxml.jackson.core.JsonProcessingException;
import gmibank.pojos.Country;
import gmibank.utilities.ConfigurationReader;

import gmibank.utilities.WriteToTxt;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class firdevs {
    Response response;
    JsonPath jsonPath;

    Country[] countries;


    @Given("In countries user sets all response using end point {string}")
    public void ın_countries_user_sets_all_response_using_end_point(String url) {

        response = given().headers("Authorization",
                "Bearer " + ConfigurationReader.getProperty("tokenf"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(url)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();
        response.prettyPrint();


    }

    List<Integer> id = new ArrayList<>();

    @Given("In countries user deserialization data json to java pojo")
    public void ın_countries_user_deserialization_data_json_to_java_pojo() throws JsonProcessingException {
        jsonPath = response.jsonPath();


        ObjectMapper objectMapper = new ObjectMapper();

        countries = objectMapper.readValue(response.asString(), Country[].class);
        System.out.println(countries[0].getName());

  for (int i =0; i<countries.length; i++){
           id.add(countries[i].getId());
           System.out.println(id);
        }
          WriteToTxt.saveDataInFileWithid("deneme.txt",countries);

    }

    @Given("In countries user validates data.")
    public void ın_countries_user_validates_data() {

        List<Integer> idList = jsonPath.getList("id");
        System.out.println(idList);
        Assert.assertTrue("boyle bir id yok bence ", idList.contains(22334));


    }


    @Given("users can update any country with endPoint {string} {string} and its id {string}")
    public void users_can_update_any_country_with_end_point_and_its_id(String endpoint, String newname, String id) {
        Map<String, Object> update = new HashMap<>();
        update.put("id", id);
        update.put("name", newname);
        update.put("states", null);


        response = given().headers("Authorization",
                "Bearer " + ConfigurationReader.getProperty("tokenf"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .body(update)
                .put(endpoint)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();
        response.prettyPrint();


    }

}