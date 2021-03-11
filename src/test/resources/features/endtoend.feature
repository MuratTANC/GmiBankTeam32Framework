Feature: endToEnd

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

  Scenario: login
    Given kullanici gmi bank sayfasina gider
    When signin alanina gider
    And Signin butonuna tiklar
    And dogru username girer
    And dogru password girer
    And  giris butonuna tiklar



  Scenario: User Information Check Test
    Given kullanici gmi bank sayfasina gider
    When signin alanina gider
    And Signin butonuna tiklar
    And dogru username girer
    And dogru password girer
    And  giris butonuna tiklar
    And My Operationsa tiklar
    And Manage customerse tiklar
    And  Create A New Customer a tiklar
    And  Ssn bolumune tiklar ve  dogru ssn girer
    And search butonuna tiklar



    Scenario: Create a new account
      Given Kullanici gmibank anasayfaya gider
      And Kullanici account menu simgesine tiklar
      And Kullanici acilan menude Sign in'e tiklar
      And Kullanici username girer
      And Kullanici passwordu girer
      And kullanici Sign in'e tiklar
      And Kullanici My Operations secenegine tiklar
      And Kullanici acilan menuden Manage Accounts'a tiklar
      And kullanici sag ust kosedeki Create a new Account butonuna tiklar
      And kullanici Description kutusunu doldurur.
      And kullanici Balance kutusunu doldurur.
      And kullanıcı account type secer
      And  status type secer
      And Create date  ve closed date secer
      And employee secer
      And save tıklar
      And cikis yapar








  Scenario: Money transfer should be available
    Given  kullanici gmi bank internet sayfasina gider
    And  drop down menu tiklanir
    And Sign tikla
    And valid  name girer
    And valid  password girer
    And submit yapilir
    And My Operation tiklanir
    And Money transfer tiklanir
    And gonderen hesabi secilir
    And alici hesabi secilir
    And Enter a value  transaction
    And Enter  some information to description box.
    And Click  Make Transfer Button
    Then Assert  visible text






