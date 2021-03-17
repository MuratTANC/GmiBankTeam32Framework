@us23
  Feature: TpAccount Registration Test
    Scenario: Read all tp_account_registrations data and validate
      Given user create connection to gmibank data
      And read data
      And validate data