@delstate
Feature: Gmi Bank 4 delete States
Scenario Outline: delete_states
  Given GMI4 user should be reads all states data from "https://www.gmibank.com/api/tp-states"
  And   GMI4 user should be deleted a state using endpoint "<endPoint>" and its extension "<id>"
  Examples:
  |endPoint                                     |  id   |
  |https://www.gmibank.com/api/tp-states         |  /19211 |

