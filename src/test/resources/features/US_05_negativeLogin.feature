
Feature: US_05
  Background:
    When kullanici gmi_bank anasayfaya gider
    Then kullanici giris_sekmesine tiklar
    And kullanici sign_in sekmesine tiklar


  Scenario:TC_01_invalid_degerer

    And kullanici valid customer username girer
    And kullanici invalid customer sifre girer
    Then kullanici sign_in butonuna tiklar
    And kullanici hatamesajini gorur
    And kullanici sayfayi kapatir

  Scenario:TC_02_invalid_degerer

    And kullanici invalid customer username girer
    And kullanici valid customer sifre girer
    Then kullanici sign_in butonuna tiklar
    And kullanici hatamesajini gorur
    And kullanici sayfayi kapatir

  Scenario:TC_03_invalid_degerer

    And kullanici invalid customer username girer
    And kullanici invalid customer sifre girer
    Then kullanici sign_in butonuna tiklar
    And kullanici hatamesajini gorur
    And kullanici sayfayi kapatir


  Scenario:TC_04_password_sifirlama

    And kullanici Did you forget your password secenegini secer
    And password sifirla butonunu gorur
    And kullanici sayfayi kapatir

  Scenario:TC_05_yeniden_registiration

    And kullanici new registiration secenegini secer
    And kullanici new registiration secenegini secer
    And Registiration sayfasina yonlendirilir
    And kullanici sayfayi kapatir