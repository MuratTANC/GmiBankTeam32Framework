Feature: US_001_Registration Page

  Scenario: TC_001_Positive_Senerio
    Given user go to main page
    And click on enterance button
    And Click on registration button
    And SSN should be written with current format
    And firstName should not be left blank
    And LastName should not be left blank
    And Adres information should be written
    And Phone Number should be written with the format
    And Username should not be left blank
    And Email information  should not be left blank
    And New password information should not be left blank
    And New password confirmation should not be left blank
    And click on registration button for save
    Then The mesage of Registration saved! Please check your email for confirmation  is disabled