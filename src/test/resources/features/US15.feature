Feature:US_15
  Background:
    Given kullanici gmi_bank anasayfaya gider
    Then kullanici giris_sekmesine tiklar
    Then kullanici sign_in sekmesine tiklar
    And kullanici valid manager username girer
    Then kullanici valid manager sifre girer
    And kullanici sign_in butonuna tiklar
    Then kullanici My Operations menusune tiklar
    And kullanici Manage Account menusunu secer

  Scenario: US_15_HesaplariGoruntuleme

    And kullanici balancelari goruntuler
    And kullanici acccount typelari goruntuler
    And kullanici sayfayi kapatir

  Scenario:
    And kullanici view butonuna tiklar
    And kullanici tikladigi kisinin hesap ayrintilarini goruntuler
    And kullanici sayfayi kapatir
