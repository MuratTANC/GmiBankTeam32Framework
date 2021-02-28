@US011
Feature: User can choose a user from the registration and it cannot be blank US011
 Background: 
    Given kullanici gmi bank sayfasina gider
    When signin alanina gider
    And Signin butonuna tiklar
    And dogru username girer
    And dogru password girer
    And  giris butonuna tiklar
    And My Operationsa tiklar
    And Manage customerse tiklar

  Scenario: User Information Control Test

   And Click First ID
    And See FirstName
    And See LastName
    And See Middle Initial
    And See Email
    And See Mobile Phone Number
    And See Phone Number
    And See Zip Code
    And See Address
    And See City
    And See SSN
    And See Create Date
    And See Zelle Enrolled
    And See Country
    And See User
    And See Account
    Then See All Titles
