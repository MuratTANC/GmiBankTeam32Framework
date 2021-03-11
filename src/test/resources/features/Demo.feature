Feature: demo sunumu
  Scenario:  Read ulke (country)
    Given api end point "https://www.gmibank.com/api/tp-countries"
    And validate eder



  Scenario:  Create country
    And demo user create a country using to api end point "https://www.gmibank.com/api/tp-countries"



  Scenario Outline:  read country data and validate created country using with id
    Given demo user creates a connection with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"
    And demo user provides the query "<query>" and "<columnName>"
    Then demo validate created country with 64288

    Examples: demo read the data
      |query|columnName|
      |Select * from tp_country|id|



  @





  Scenario Outline: Update country
    And update a country using api end point "https://www.gmibank.com/api/tp-countries"  "<name>" and  "<id>"

    Examples: Update country
      |name|id|
      |kore|73012|

  Scenario Outline: Delete country
    Given  country using endpoint "<endPoint>"  "<id>"
    Examples: Delete Country
      |endPoint                                |id    |
      |https://www.gmibank.com/api/tp-countries|/73012|



  Scenario Outline: read  ilkcustomerler c data
    Given demo pdf user creates a connection with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"
    And demo pdf user provides the query "<query>"

    Examples: demo read the data
      |query|
      |Select * from tp_customer|
