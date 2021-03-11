@demo
Feature: demo sunum :)


  Scenario:ulke okuma
    Given  api end point "https://www.gmibank.com/api/tp-countries"
    And validate edelim


  Scenario: create country
    And  create a country using to api end point "https://www.gmibank.com/api/tp-countries"


  Scenario Outline:  read country and  validate created country using with id
    Given  creates a connection with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"
    And  user provides the query "<query>" and "<columnName>"
    Then  validate created country with 64272

    Examples: demo read the data
      |query|columnName|
      |Select * from tp_country|id|



  Scenario Outline: demo Update country
    And  user updates a country using api end point "https://www.gmibank.com/api/tp-countries"  "<name>" and its extension "<id>"

    Examples: Update country
      |name|id|
      |cennet |25589|


  Scenario Outline:  Delete countries
    Given user deletes a country using endpoint "<endPoint>" and its extension "<id>"
    Examples: Delete Country
      |endPoint                                |id    |
      |https://www.gmibank.com/api/tp-countries|/73028|


  @pdf
  Scenario Outline: bazi datalar customer data
    Given demo pdf user creates a connection with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"
    And demo pdf user provides the query "<query>"

    Examples: demo read the data
      |query|
      |Select * from tp_customer|