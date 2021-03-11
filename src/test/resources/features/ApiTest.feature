@Api_Testing
  Feature: Gmi Bank 4 Api Testing
    Scenario: Read all customer data and validate
      Given user go to api end point "https://www.gmibank.com/api/tp-customers"
      And read all customer and set create pojo class
      Then Validate data
