package gmibank.utilities;

import gmibank.pojos.Country;
import gmibank.pojos.Customer;
import gmibank.pojos.States;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.Map;

public class WriteToTxt {

    public static void saveDataInFileWithSSN(String fileName, Customer[] customers) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < customers.length; i++)
                writer.append(customers[i].getSsn() + "\n");
            writer.close();
        } catch (Exception e) {
        }
    }

    public static void saveDataInFileAllCustomersInfo(String fileName, Customer[] customer) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < customer.length; i++) {
                writer.append(customer[i].getId() + " , " + customer[i].getFirstName() + " , " + customer[i].getLastName() + " , " + customer[i].getSsn() + "\n");
                if (customer[i].getUser() != null) {
                    writer.append(customer[i].getUser().getFirstName() + " , " + customer[i].getUser().getLastName() + "\n");
                }
                if (customer[i].getCountry() != null) {
                    writer.append(customer[i].getCountry().getName() + " , " + customer[i].getCountry().getStates() + "\n");
                }
            }
            writer.close();
        } catch (Exception e) {
        }
    }

    public static void saveDataInFileSsn(String fileName, Customer customer) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.append(customer.getSsn());
            writer.close();
        } catch (Exception e) {
        }
    }

    public static void saveAllStates2(String fileName, States[] states) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < states.length; i++) {
                writer.append(states[i].getName() + "," + states[i].getTpcountry() + "\n");
            }
            writer.close();
        } catch (Exception e) {
        }
    }

    public static void saveDataInFileWithJsonListMap(String fileName, List<Map<String, Object>> json) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            for (int i = 0; i < json.size(); i++) {
                writer.append(json.get(i).get("id") + " , " + json.get(i).get("name") + " , " + json.get(i).get("states") + "\n");
            }

            writer.close();
        } catch (Exception e) {

        }
    }

    public static void saveDataInFileWithJsonListMapState(String fileName, List<Map<String, Object>> json) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            for (int i = 0; i < json.size(); i++) {
                writer.append(json.get(i).get("id") + " , " + json.get(i).get("name") + " , " + json.get(i).get("tpcountry") + "\n");
            }

            writer.close();
        } catch (Exception e) {

        }
    }

    public static void saveDataInFile2(String fileName, Customer[] customers) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < customers.length; i++)

                writer.append(customers[i].getSsn() + ",\n");

            writer.close();
        } catch (Exception e) {

        }
    }

    public static void saveDataInFileWithAllCustomerInfo2(String fileName, Customer[] customers) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));


            for (int i = 0; i < customers.length; i++) {

                writer.append(customers[i].getFirstName() + " , " + customers[i].getLastName() + "," + customers[i].getCity() + " , " + customers[i].getAddress() + "\n");
                if (customers[i].getUser() != null)
                    writer.append(customers[i].getUser().getFirstName());
                if (customers[i].getCountry() != null)
                    writer.append(customers[i].getCountry().getName());

            }

            writer.close();
        } catch (Exception e) {

        }
    }

    public static void saveDataInFileWithUserInfo(String fileName, Customer customer) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            writer.append(customer.getUser().getFirstName());

            writer.close();
        } catch (Exception e) {

        }
    }

    public static void saveAllStates(String fileName, States[] states) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            for (int i = 0; i < states.length; i++)
                writer.append(states[i].getName() + " , " + states[i].getId() + "\n");

            writer.close();
        } catch (Exception e) {

        }
    }


    public static void saveDataInFileWithid(String fileName, Country[] countries) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < countries.length; i++)
                writer.append(countries[i].getId() + "\n");
            writer.close();
        } catch (Exception e) {
        }
    }




    public static void saveDataInFileWithStateid(String fileName, States[] sstates)


    {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < sstates.length; i++)
                writer.append(sstates[i].getId() + "\n");
            writer.close();
        } catch (Exception e) {
        }
    }



    public static void savetp_account_registrations_id(String fileName, List<Object> id){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));

            for (int i=0; i< id.size(); i++)
                writer.append(id.get(i).toString()+",\n");

            writer.close();
        } catch (IOException e){
        }
    }

    public static void savetp_account_registrations_address(String fileName, List<Object> address){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));

            for (int i=0; i< address.size(); i++)
                writer.append(address.get(i).toString()+",\n");

            writer.close();
        } catch (IOException e){
        }
    }

    public static void savetp_account_registrations_first_name(String fileName, List<Object> firstname){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));

            for (int i=0; i< firstname.size(); i++)
                writer.append(firstname.get(i).toString()+",\n");

            writer.close();
        } catch (IOException e){
        }
    }

    public static void savetp_account_registrations_last_name(String fileName, List<Object> lastname){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));

            for (int i=0; i< lastname.size(); i++)
                writer.append(lastname.get(i).toString()+",\n");

            writer.close();
        } catch (IOException e){
        }
    }

    public static void savetp_account_registrations_mobile_phone_number(String fileName, List<Object> mobilephonenumber){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));

            for (int i=0; i< mobilephonenumber.size(); i++)
                writer.append(mobilephonenumber.get(i).toString()+",\n");

            writer.close();
        } catch (IOException e){
        }
    }

    public static void savetp_account_registrations_ssn(String fileName, List<Object> ssn){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));

            for (int i=0; i< ssn.size(); i++)
                writer.append(ssn.get(i).toString()+",\n");

            writer.close();
        } catch (IOException e){
        }
    }

    public static void savetp_account_registrations_user_name(String fileName, List<Object> tpusername){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));

            for (int i=0; i< tpusername.size(); i++)
                writer.append(tpusername.get(i).toString()+",\n");

            writer.close();
        } catch (IOException e){
        }
    }

    public static void savetp_account_registrations_user_id(String fileName, List<Object> userid){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));

            for (int i=0; i< userid.size(); i++)
                writer.append(userid.get(i).toString()+",\n");

            writer.close();
        } catch (IOException e){
        }
    }


    public static void savetp_account_registrations_email(String fileName, List<Object> email){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));

            for (int i=0; i< email.size(); i++)
                writer.append(email.get(i).toString()+",\n");

            writer.close();
        } catch (IOException e){
        }
    }

    public static void savetp_account_registrations_create_date(String fileName, List<Object> tpcreatedate){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));

            for (int i=0; i< tpcreatedate.size(); i++)
                writer.append(tpcreatedate.get(i).toString()+",\n");

            writer.close();
        } catch (IOException e){
        }
    }

}
