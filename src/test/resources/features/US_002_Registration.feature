Feature: US_002 Registration Page Negative Senerio

  Background:
    Given user go to main page
    And click on enterance button
    And Click on registration button

  Scenario: TC_002_SSN_Should be left

    Then your ssn is required is visable

  Scenario: TC_003_SSN_format_is_mistake
    And send mistake character
    Then the mesage of your is required is visable

  Scenario: TC_004_Firstname_is_left_blank
    And send mistake character to last name button
    And click on first name button
    Then the mesage of your first name is required
    Scenario: TC_005_lastname_is left_blank
      And click on last name button
      Then the mesage of your last name is required
      Scenario: TC_007_mobilephonenumber is mistake
        And send mistake number format to mobilephonenumber


        Then the mesage of Your mobile phone number is invalid is visiable






