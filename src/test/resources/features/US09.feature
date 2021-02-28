@US009TC01
Feature: User can search for a new applicant by their SSN and see all their registration info populated US009
  Scenario: User Information Check Test
    Given kullanici gmi bank sayfasina gider
    When signin alanina gider
    And Signin butonuna tiklar
    And dogru username girer
    And dogru password girer
    And  giris butonuna tiklar
    And My Operationsa tiklar
    And Manage customerse tiklar
    And  Create A New Customer a tiklar
    And  Ssn bolumune tiklar ve  dogru ssn girer
    And search butonuna tiklar
    And firstname yazili oldugunu gorur
    And last name yazili oldugunu gorur
    Then  Mail Adress yazili oldugunu gorur