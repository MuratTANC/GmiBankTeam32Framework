package gmibank.stepdefinitions;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import gmibank.pojos.Country;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.WriteToText;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.*;

public class US_21_StepDefinitionsApi {

    Response response;
    JsonPath jsonPath;
    Country[] countries;

    @Given("In countries user sets all response using end point {string}")
    public void in_countries_user_sets_all_response_using_end_point(String api_end_point) {

        response = given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(api_end_point)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();
        response.prettyPrint();
    }
    List<Integer> id=new ArrayList<>();

    @Given("In countries user deserialization data json to java pojo")
    public void in_countries_user_deserialization_data_json_to_java_pojo() throws JsonProcessingException {
        jsonPath=response.jsonPath();
        ObjectMapper objectMapper=new ObjectMapper();
        Country[]countries = objectMapper.readValue(response.asString(),Country[].class);
        System.out.println(countries[0].getName());//ilk ulke ismini getirir.

        for (int i =0;i<countries.length;i++){
           id.add(countries[i].getId());
            System.out.println(id);
        }
        WriteToText.saveDataInFileWithid("allCountriesId.txt",countries);





        //json ile ulke isimlerini  bir Listin  icerisine attik
        List<String> listname=jsonPath.getList("name");
        System.out.println(listname);

    }

    @Given("In countries user validates data.")
    public void in_countries_user_validates_data() {

        //countries icindeki id value larini list halinde return eder ve verify yapar
        List<Integer> listid=jsonPath.getList("id");
        // System.out.println(listid);
        Assert.assertTrue(" id kaydi yok",listid.contains(30848));

        //countries icindeki name value larini list halinde return eder ve verify yapar
        List<String> listname=jsonPath.getList("name");
        //System.out.println(listname);
        Assert.assertTrue("name kaydi yok",listname.contains("Norwegan"));
        Assert.assertTrue("name kaydi yok",listname.contains("KENYA"));
        Assert.assertTrue("name kaydi yok",listname.contains("FRANCE"));
        Assert.assertTrue("name kaydi yok",listname.contains("Madagaskar"));


        //countries icindeki states value larini list halinde return eder ve verify yapar
        List<String> liststates=jsonPath.getList("states");
        Assert.assertTrue("states kaydi yok",liststates.contains(null));
        //System.out.println(liststates);

    }


}
