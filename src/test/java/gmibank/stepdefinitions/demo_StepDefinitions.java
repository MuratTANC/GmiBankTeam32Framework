package gmibank.stepdefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import gmibank.jsonModels.CountryJson;
import gmibank.pojos.Country;
import gmibank.pojos.Customer;
import gmibank.utilities.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static gmibank.utilities.DatabaseUtility.getQueryResultList;
import static io.restassured.RestAssured.given;

public class demo_StepDefinitions {
    Response response;
    Response responseAll;
    JsonPath jsonPath;
    Country[] country;
    List<Country> dbCountry = new ArrayList<>();

    @Given("api end point {string}")
    public void api_end_point(String url) {


        response = given().headers(
                "Authorization",
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

        // response.prettyPrint();



    }
    List <Integer> idlistesi = new ArrayList<>();
    @Given("validate edelim")
    public void validate_edelim() throws JsonProcessingException {


        ObjectMapper objectMapper = new ObjectMapper();
        country = objectMapper.readValue(response.asString(), Country[].class);
        System.out.println("ilk name okunuyor dikkat ");


        System.out.println(country[0].getName());


        System.out.println("id listesi geliyor ");
        System.out.println();
        for ( int i = 0; i< country.length ; i++)
        {
            idlistesi.add(country[i].getId());
        System.out.println("id listesi :"+ country[i].getId());
        }


        WriteToTxt.saveDataInFileWithid("countrylistesi.txt", country);
        List<String> readId = ReadTxt.returnCustomerSNNList("countrylistesi.txt");

        Assert.assertEquals("sorun var ",idlistesi,readId);
        System.out.println("hersey basarili ");

    }
    // Create Country
    @Given("create a country using to api end point {string}")
    public void create_a_country_using_to_api_end_point(String url) {
        response = given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("tokenf"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .body(CountryJson.createCountry)
                .post(url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        response.prettyPrint();


    }
    //== Validate Created  Country Using Database
    @Given("creates a connection with db using {string} , {string} and {string}")
    public void creates_a_connection_with_db_using_and(String url, String user, String password) {

        DatabaseUtility.createConnection(url,user,password);
    }

    @Given("user provides the query {string} and {string}")
    public void user_provides_the_query_and(String string, String string2) {

    }

    @Then("validate created country with {int}")
    public void validate_created_country_with(Integer int1) {

    }

    @Given("user updates a country using api end point {string}  {string} and its extension {string}")
    public void user_updates_a_country_using_api_end_point_and_its_extension(String url , String name, String id) {

        Map<String ,Object> putName = new HashMap<>();

        putName.put("id",id);
        putName.put("name",name);
        putName.put("states",null);

        response = given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("tokenf"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .body(putName)
                .put(url)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();

        response.prettyPrint();




    }

    @Given("user deletes a country using endpoint {string} and its extension {string}")
    public void user_deletes_a_country_using_endpoint_and_its_extension(String url, String id) {
        response = given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("tokenf"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .delete(url+id)
                .then()
                .extract()
                .response();

        responseAll = given().headers(
                "Authorization",
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


        JsonPath jsonPath = responseAll.jsonPath();
        String kalanidlerbizimdir = jsonPath.getString("id");
        Assert.assertFalse("silinmedi haberin olsun ",kalanidlerbizimdir.contains(id));
        System.out.println("-------------------------");
        System.out.println("islem tamam ");

    }

    @Given("demo pdf user creates a connection with db using {string} , {string} and {string}")
    public void demo_pdf_user_creates_a_connection_with_db_using_and(String url, String user, String password) {
        DatabaseUtility.createConnection(url,user,password);
    }

    @Given("demo pdf user provides the query {string}")
    public void demo_pdf_user_provides_the_query(String query) {

        List <Customer> Customers = new ArrayList<>();

        List <List< Object>> list =getQueryResultList(query);
        for (int i=0; i<=5; i++){
            Customer customer = new Customer();

            customer.setFirstName(list.get(i).get(2).toString());
            customer.setLastName(list.get(i).get(2).toString());
            customer.setMobilePhoneNumber(list.get(i).get(4).toString());
            customer.setCity(list.get(i).get(9).toString());
            customer.setSsn(list.get(i).get(10).toString());

            Customers.add(customer);
        }

        PDFGenerator.pdfGeneratorRowsAndCellsWithListFirstToFive("                    *** Team 32 PROJE   SUNUMU*** \n                                                      === ilk datalar  ===",Customers,"sunumDosyasi.pdf" );




    }












}
