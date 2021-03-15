Feature: US_17 System should allow the Admin to manage users
  Background:
    Given user anasayfaya gider
    And user ilk girise tiklar
    And user sign_in sekmesine tiklar
    And user gecerli username girer
    And user gecerli password girer
    And user signin ile giris yapar
    And user administration bolumune tiklar
    And user userManagmenta tiklar

  Scenario Outline: TC_for_"<role>"Admin can activate a role as "<role>"
    Then user edit sekmesine tiklar
    And admin profilesden "<role>" secer ve save eder
    Examples:
      |role|
      |ROLE_USER|
      |ROLE_EMPLOYEE|
      |ROLE_MANAGER |
      |ROLE_ADMIN   |

Scenario:TC_02
  Then user view sekmesine tiklar
  And islemi dogrular

  Scenario: TC_03
    Then user delete sekmesine tiklar
    And islemin testini dogrular


