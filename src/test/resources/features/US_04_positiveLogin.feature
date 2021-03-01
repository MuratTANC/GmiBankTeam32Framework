
Feature: US_04
  Background:
    When kullanici gmi_bank anasayfaya gider
    Then kullanici giris_sekmesine tiklar
    And kullanici sign_in sekmesine tiklar


  Scenario:TC_01_costumer_olarak_sisteme_giris

    And kullanici valid customer username girer
    And kullanici valid customer sifre girer
    Then kullanici sign_in butonuna tiklar
    And kullanici giris yapildigini test eder
    And kullanici sayfayi kapatir

  Scenario:TC_02_user_olarak_sisteme_giris

    And kullanici valid user username girer
    And kullanici valid user sifre girer
    Then kullanici sign_in butonuna tiklar
    And kullanici giris yapildigini test eder
    And kullanici sayfayi kapatir

  Scenario:TC_03_manager_olarak_sisteme_giris

    And kullanici valid manager username girer
    And kullanici valid manager sifre girer
    Then kullanici sign_in butonuna tiklar
    And kullanici giris yapildigini test eder
    And kullanici sayfayi kapatir

  Scenario:TC_04_user_olarak_sisteme_giris

    And kullanici valid employee username girer
    And kullanici valid employee sifre girer
    Then kullanici sign_in butonuna tiklar
    And kullanici giris yapildigini test eder
    And kullanici sayfayi kapatir

  Scenario:TC_05_user_olarak_sisteme_giris

    And kullanici valid admin username girer
    And kullanici valid admin sifre girer
    Then kullanici sign_in butonuna tiklar
    And kullanici giris yapildigini test eder
    And kullanici sayfayi kapatir

  Scenario:TC_06_giris_islemi_iptali

    When kullanici giris islemini iptal eder
    And kullanicinin anasayfaya geri doner




