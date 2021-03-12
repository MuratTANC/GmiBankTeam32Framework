@demo
Feature: demo sunum :)


  Scenario:ulke  okuma ve id siralama
    Given  api end point "https://www.gmibank.com/api/tp-countries"
    And validate edelim


  Scenario: yeni ulke olusturma
    And  create a country using to api end point "https://www.gmibank.com/api/tp-countries"


  Scenario Outline: database baglanma  ve validate etme
    Given  creates a connection with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"
    And  user provides the query "<query>" and "<columnName>"
    Then  validate created country with 64272

    Examples: demo read the data
      |query|columnName|
      |Select * from tp_country|id|



  Scenario Outline:  ulkeyi update etme
    And  user updates a country using api end point "https://www.gmibank.com/api/tp-countries"  "<name>" and its extension "<id>"

    Examples: Update country
      |name|id|
      |cennet |25589|


  Scenario Outline: ulke silme
    Given user deletes a country using endpoint "<endPoint>" and its extension "<id>"
    Examples: Delete Country
      |endPoint                                |id    |
      |https://www.gmibank.com/api/tp-countries|/73028|


  @pdf
  Scenario Outline: pdf alma :)
    Given demo pdf user creates a connection with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"
    And demo pdf user provides the query "<query>"

    Examples: demo read the data
      |query|
      |Select * from tp_customer|