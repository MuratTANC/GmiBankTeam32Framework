package gmibank.stepdefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import gmibank.pojos.Customer;
import gmibank.utilities.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

import static gmibank.utilities.DatabaseUtility.*;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.head;

public class US_23_StepDefinitions {


    public static void main(String[] args) {

        String fileName1 = "C:\\Users\\MuratTANC\\Documents\\GmiBankTeam32Framework\\src\\test\\resources\\test_data\\id.txt";
        String fileName2 = "C:\\Users\\MuratTANC\\Documents\\GmiBankTeam32Framework\\src\\test\\resources\\test_data\\address.txt";
        String fileName3 = "C:\\Users\\MuratTANC\\Documents\\GmiBankTeam32Framework\\src\\test\\resources\\test_data\\firstname.txt";
        String fileName4 = "C:\\Users\\MuratTANC\\Documents\\GmiBankTeam32Framework\\src\\test\\resources\\test_data\\lastname.txt";
        String fileName5 = "C:\\Users\\MuratTANC\\Documents\\GmiBankTeam32Framework\\src\\test\\resources\\test_data\\mobilephonenumber.txt";
        String fileName6 = "C:\\Users\\MuratTANC\\Documents\\GmiBankTeam32Framework\\src\\test\\resources\\test_data\\ssn.txt";
        String fileName7 = "C:\\Users\\MuratTANC\\Documents\\GmiBankTeam32Framework\\src\\test\\resources\\test_data\\username.txt";
        String fileName8 = "C:\\Users\\MuratTANC\\Documents\\GmiBankTeam32Framework\\src\\test\\resources\\test_data\\userid.txt";
        String fileName9 = "C:\\Users\\MuratTANC\\Documents\\GmiBankTeam32Framework\\src\\test\\resources\\test_data\\email.txt";
        String fileName10 = "C:\\Users\\MuratTANC\\Documents\\GmiBankTeam32Framework\\src\\test\\resources\\test_data\\createdate.txt";

        createConnection();


        String queryTpaccount_registration = "Select * from tpaccount_registration";
        System.out.println(getColumnNames(queryTpaccount_registration));

        System.out.println("==========  ID LIST  ==========");
        List<Object> idList = getColumnData(queryTpaccount_registration, "id");
        System.out.println(idList);

        System.out.println("==========  ADDRESS LIST  ==========");
        List<Object> addressList = getColumnData(queryTpaccount_registration, "address");
        System.out.println(addressList);

        System.out.println("==========  FIRST NAME LIST  ==========");
        List<Object> first_nameList = getColumnData(queryTpaccount_registration, "first_name");
        System.out.println(first_nameList);

        System.out.println("==========  LAST ID LIST  ==========");
        List<Object> last_nameList = getColumnData(queryTpaccount_registration, "last_name");
        System.out.println(last_nameList);

        System.out.println("==========  MOBILE PHONE NUMBER LIST  ==========");
        List<Object> mobile_phone_numberList = getColumnData(queryTpaccount_registration, "mobile_phone_number");
        System.out.println(mobile_phone_numberList);

        System.out.println("==========  SSN LIST  ==========");
        List<Object> ssnList = getColumnData(queryTpaccount_registration, "ssn");
        System.out.println(ssnList);

        System.out.println("==========  USER NAME LIST  ==========");
        List<Object> user_nameList = getColumnData(queryTpaccount_registration, "user_name");
        System.out.println(user_nameList);

        System.out.println("==========  USER LIST  ==========");
        List<Object> user_idList = getColumnData(queryTpaccount_registration, "user_id");
        System.out.println(user_idList);

        System.out.println("==========  E-MAIL LIST  ==========");
        List<Object> emailList = getColumnData(queryTpaccount_registration, "email");
        System.out.println(emailList);

        System.out.println("==========  CREATE DATE LIST  ==========");
        List<Object> create_dateList = getColumnData(queryTpaccount_registration, "create_date");
        System.out.println(create_dateList);

        WriteToTxt.savetp_account_registrations_id(fileName1, idList);
        WriteToTxt.savetp_account_registrations_address(fileName2, addressList);
        WriteToTxt.savetp_account_registrations_first_name(fileName3, first_nameList);
        WriteToTxt.savetp_account_registrations_last_name(fileName4, last_nameList);
        WriteToTxt.savetp_account_registrations_mobile_phone_number(fileName5, mobile_phone_numberList);
        WriteToTxt.savetp_account_registrations_ssn(fileName6, ssnList);
        WriteToTxt.savetp_account_registrations_user_name(fileName7, user_nameList);
        WriteToTxt.savetp_account_registrations_user_id(fileName8, user_idList);
        WriteToTxt.savetp_account_registrations_email(fileName9, emailList);
        WriteToTxt.savetp_account_registrations_create_date(fileName10, create_dateList);

        List<String> id = new ArrayList<>();
        id.add("1252");
        id.add("1601");

        Assert.assertTrue("id yok", ReadTxt.returnCustomerSNNList(fileName1).containsAll(id));


    }
}