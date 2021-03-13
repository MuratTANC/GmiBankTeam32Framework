@US19
Feature: System should allow Admin to create a new Account


  Background: User goes to login admin page
    Given  logs in user login page as admin


  @US19_TC01
  Scenario: User should create a description for the new account and it cannot be blank
    Given kullanici gmi bank sayfasina gider
    When signin alanina gider
    And Signin butonuna tiklar
    And dogru username girer
    And dogru password girer
    And  giris butonuna tiklar
    Given user clicks on My Operations
    And   user clicks on Manage Account
    And   user clicks on Create a new Account
    And   user create a description "benimhesap"
    And   user fills the balance box "5550000"
    And   user selects a valid account type from Account Type Drop-down "CREDIT_CARD"
    And   user selects a valid account status type from Account Status Type Drop-down "ACTIVE"
    And   user selects a valid employee from Employee Drop-down
    And   user clicks on the Save button
    Then  verify transaction done