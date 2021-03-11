@US14
Feature: Date should be created on the time of account creation

  Background:
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


  Scenario: TC_001 Tarih hesap olusturma sirasinda olusturulmalidir

    And Kullanici acilan create takvim menusunden ay gun yil ve saat secer
    And Kullanici acilan closed takvim menusunden ay gun yil ve saat secer
    And Kullanici save butonuna tiklar
    Then Kullanici hesap olusturulabildigini test eder
    And kullanici sayfayi kapatir


  Scenario: TC_002 Gecmis bir tarih secildiginde hesap olusturulamamalidir
    And Kullanici acilan create takvim menusunden gecmis bir ay gun yil ve saat secer
    And Kullanici acilan closed takvim menusunden gecmis bir ay gun yil ve saat secer
    Then Kullanici save butonuna tiklar
    Then Kullanici hesap olusturulamadigini test eder
    And kullanici sayfayi kapatir

  Scenario: TC_003 Employee kutusu bos olmamalidir
    And Kullanici Employee kutusundan kayitli bir kullanici secer
    Then Kullanici employee kutusundan secim yapabilmeli
    And kullanici sayfayi kapatir

