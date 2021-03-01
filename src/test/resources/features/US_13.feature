@us13
Feature: US_013 An Employee can create a new Account

  @createaccount
  Scenario: TC_01 Create a new account
    Given Kullanici gmibank anasayfaya gider
    And Giris simgesine tiklar
    And Gecerli username ve password girer
    And Sign in butonuna tiklar
    And My Operation tiklar
    And Manage Accounts tiklar
    And +Create a new Account tiklar
    And Create or edit a Account yazisini gorur

  @descriptions
  Scenario: TC_02 Description Negative Test
    And Description text box tiklanir
    And Balance text box tiklanir
    And Description icin This field is required. yazisi gorunur.

  @balance
  Scenario: TC_03 Balance Negative Test
    Given Save butonuna tiklar
    And Balance icin This field is required. yazisi gorunur.

  @accounttype
  Scenario: TC_04 Account Type
    Given Account Type Drop Down  menusunden Account Typelari gorur

  @accounstatustype
  Scenario: TC_05 Account Status Type
    Given Account Status Type Drop Down menusunden Account Status Typelari gorur.