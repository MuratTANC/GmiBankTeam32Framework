
Feature: customer_olusturdugu_tum_verileri_okur_ve_validate_yapar
  Scenario: TC_01_Verilerin_validate_edilmesi
    Given kullanici api "https://www.gmibank.com/api/tp-customers" gider
    Then kullanici tum customer bilgilerini okur
    And kullanici okudugu customerlerin verilerini validate yapar

  #Scenario: TC_02_Verilerin_tek_tek_validate_edilmesi
   # Given kullanici api "endpointe" gider
    #Then kullanici tum customer bilgilerini okur
    #And kullanici


