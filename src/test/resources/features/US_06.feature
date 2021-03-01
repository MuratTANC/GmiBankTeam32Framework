@infovalid
Feature: US_06 Kullanıcı bilgisi bölümü Ana Sayfada düzenlenebilir olmalıdır

  Background:
    Given Kullanici gmibank anasayfaya gider
    And Ana sayfada sag ustte bulunan "account-menu" simgesine tiklayiniz.
    And Sign in butonuna tiklayiniz.
    And Username e newuser yaziniz.
    And Password a "Ali.12!" yaziniz.
    And Sag alttaki Sign in Butonuna tiklayiniz.

  Scenario: TC_01 Kullanıcı bilgilerine giderken doldurulan kullanıcı bilgisi olmalıdır
   Given Ana sayfada sag ustte bulunan "account-menu" simgesine tiklayiniz.
    And User info secenegini tiklayiniz.
    And First Name textboxindaki ismin  user   oldugunu dogrulayiniz.
    And LastName textboxindaki soyIsmin new  oldugunu dogrulayiniz.
    And Email textboxinindaki emailin newuser32@new.com   oldugunu dogrulayiniz
    Then Language textboxindaki  secenegin  "English" secilmis oldugunu  dogrulayiniz.
    Then Kullanici gmibank sayfasini kapatir.


  Scenario: TC_02 "İngilizce ve Türkçe" olmak üzere 2 dil mevcut olmalıdır
    Given Ana sayfada sag ustte bulunan "account-menu" simgesine tiklayiniz.
    And User info secenegini tiklayiniz.
    And Kullanici Language dropdown ina tiklayiniz
    Then "English" && "Türkçe" dilllerinin var oldugunu dogrulayiniz.
    Then Kullanici gmibank sayfasini kapatir.
@update
  Scenario: TC_03 Isim guncellenebilmeli
    Given Ana sayfada sag ustte bulunan "account-menu" simgesine tiklayiniz.
    And User info secenegini tiklayiniz.
    And Username textboxindaki deki ismi siliniz
    And Silinen username yerine  "Nutzer" yaziniz.
    And Save butonuna tiklayiniz.
    Then Kullanici gmibank sayfasini kapatir.
@update
  Scenario: TC_04 SoyIsim guncellenebilimeli
    Given Ana sayfada sag ustte bulunan "account-menu" simgesine tiklayiniz.
    And User info secenegini tiklayiniz.
    And lastname textboxindaki deki soyismi siliniz.
    And Silinen lastname yerine "neu" yaziniz.
    And Save butonuna tiklayiniz.
    Then Kullanici gmibank sayfasini kapatir.
  @update
  Scenario: TC_05 Email "@" karakteri  ve ".com" uzantilari eklenerek guncellenebilmeli
    Given Ana sayfada sag ustte bulunan "account-menu" simgesine tiklayiniz.
    And User info secenegini tiklayiniz.
    And Email textboxindaki email i siliniz.
    And Silinen email yerine "neunutzer32@neu.com" yaziniz.
    And Save butonuna tiklayiniz.
    Then Kullanici gmibank sayfasini kapatir.