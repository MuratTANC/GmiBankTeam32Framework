@us16
Feature: Money transfer should be available
  @US16TC01
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