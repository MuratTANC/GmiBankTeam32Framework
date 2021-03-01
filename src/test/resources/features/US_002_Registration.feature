Feature: US_002 Registration Page Negative Senerio

  Background:
    Given user go to main page
    And click on enterance button
    And Click on registration button

  Scenario: TC_002_SSN_Should be left
    And click on ssn button
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

  Scenario: TC_008_username is left blank
    And send the blank
    Then the mesage of username is invalid is visable

  Scenario: TC_009_email_isBlank
    And send the email button blank
    Then The mesage of Your email is required is visable

  Scenario: TC_010_email_dont_have_@
    And send mistake email
    Then the mesage of This field is invalid is visiable

  Scenario: TC_011_email_isnot_enough_character
    And send unsuffient character to email button
    Then the mesage of Your email is required to be at least 5 characters is visable

  Scenario: TC_012_newPassword_is blank
    And new password button should left
    Then the mesage of Your password is required.

  Scenario: TC_013_newPassword_isnot_enough_character
    And send insufient character to new password button
    Then the mesage of Your password is required to be at least 4 characters is visable

  Scenario: TC_014_newpassword_confirmation_should_beleft_blank
    And pasword confirmation button should be left
    Then the mesage of Your confirmation password is required is visable











