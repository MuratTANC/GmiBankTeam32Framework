
Feature: Manage Customers
  Background:
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

  @US010TC01
  Scenario:Address as street and number should be provided and cannot be left blank
    And Click Save Button
    Then See This field is required.

  @US010TC02
  Scenario: City should be provided and cannot be left as blank US010
    And Click Save Button
    Then See This field is required.

  @US010TC03
  Scenario: Country should be typed and cannot be blank US010
    Then Select Country.

  @US010TC04
  Scenario: State should be provided as US state and cannot be blank US010
    Then Write a State.

  @US011TC05
  Scenario: The date cannot be typed earlier, in the past, at the time of creation a customer US011
    Then See Date TextBox

  @US011TC06
  Scenario: The date should be created as month, day, year, hour and minute US011
    Then See Date Today

  @US011TC07
  Scenario: User can select Zelle Enrolled optionally and save it. US011
    Then Click Zelle Check Box
