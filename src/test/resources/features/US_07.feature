@infoinvalid
Feature: US_07 Sistem geçersiz kimlik bilgileriyle güncelleme yapmaya izin vermemelidir

  Background:
    Given Kullanici gmibank anasayfaya gider
    And Ana sayfada sag ustte bulunan "account-menu" simgesine tiklayiniz.
    And Sign in butonuna tiklayiniz.
    And Username e newuser yaziniz.
    And Password a "Ali.12!" yaziniz.
    And Sag alttaki Sign in Butonuna tiklayiniz.

  Scenario: TC_01 Email textboxinda "@" karakteri ve ".com" uzantisi kullanilmadan guncelleme yapilamamali.
    Given Ana sayfada sag ustte bulunan "account-menu" simgesine tiklayiniz.
    And User info secenegini tiklayiniz.
    And Email textboxindaki email i siliniz.
    And Silinen email yerine neunutzer32neu yaziniz.
    And Save butonuna tiklayiniz.
    Then Email textboxinin altinda This field is invalid yazisi cikmalidir.
    Then Kullanici gmibank sayfasini kapatir.

  Scenario: TC_02 English ve Türkçe'den baska bir dil secenegi olmamali.
    Given Ana sayfada sag ustte bulunan "account-menu" simgesine tiklayiniz.
    And User info secenegini tiklayiniz.
    And Kullanici Language dropdown ina tiklayiniz
    And 3saniye bekleyiniz
    And "English" && "Türkçe" dilllerinden baska bir dil seceneginin olmadigini dogrulayiniz.
    Then Kullanici gmibank sayfasini kapatir.