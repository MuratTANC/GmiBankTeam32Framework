Feature: Us_018

  Background:
    When Go to main page
    And Click on registration_sign in  button
    And click on sign in button
    And Enter your username on the username button
    And Enter your password on the password button
    And Click on signin submit button
    And As user manager, clicks on the My Operations link.
    And Click on the User Manage Accounts link

  Scenario: TC_001_viewOption_IsEnable
    Then user should be able to click on view button and all information is viewed

  Scenario: TC_002_editOption_IsEnable
    Then user should be able to click on edit button and user should be able to save changes

    Scenario: TC_003_DeleteOption_IsEnable
      Then user should be able to click on delete button and get warning message before deleting account