Feature: US_29
  Scenario: TC_01
    Given kullanici jdbc ile customer veritabanina baglanir
    Then kullanici customer bilgilerini okur ve dogrular

  Scenario: TC_02
    Given kullanici jdbc ile country veritabanına baglanır
    Then kullanici country bilgilerini okur ve dogrular

  Scenario: TC_03
    Given kullanici jdbc ile states veritabanına baglanır
    Then kullanici states bilgilerini okur ve dogrular