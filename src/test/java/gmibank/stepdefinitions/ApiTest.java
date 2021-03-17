package gmibank.stepdefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import gmibank.pojos.Customer;
import gmibank.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiTest {

    Response response;


    @Given("user go to api end point {string}")
    public void user_go_to_api_end_point(String api_end_point) {

        response = given().headers("Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON)
                .when()
                .get(api_end_point)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();

        //response.prettyPrint();

        System.out.println("=========================================================");
    }

    @Given("read all customer and set create pojo class")
    public void read_all_customer_and_set_create_pojo_class() throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        Customer[] customer = objectMapper.readValue(response.asString(), Customer[].class);
        System.out.println(customer[0].getFirstName());
        System.out.println("=====================================================");
        System.out.println(customer[2].getAddress());

        for (int i = 0; i < customer.length; i++) {
            System.out.println(customer[i].getFirstName());
        }
        System.out.println("=========================================================");

        for (int i = 0; i < customer.length; i++) {
            System.out.println(customer[i].getAddress());
        }
        System.out.println("=========================================================");


        for (int i = 0; i < customer.length; i++) {
            if (customer[i].getUser() != null) {
                System.out.println(customer[i].getAddress());
            }
        }

    }

    @Then("Validate data")
    public void validate_data() {


    }

}
