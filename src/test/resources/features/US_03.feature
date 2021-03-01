Feature: US_03 Register sayfasina kullanici password icin guvenli ve yuksek seviyeli bir sifre girebilme

  Background:

    Given kullanici gmibank_url adresine gider
    And Giris butonuna basar
    And Register secer
    And imlec sayfanin altina gecer

    Scenario Outline:Red Test

      Then "<password>" girer
      Then kullanici seviye cizelgesini red renkte gorur
      Examples:
      |password|
      |aAAA    |
      |Aabc    |
      |1abcd   |
      |1ABCD   |
      |!abc    |
      |1!aA    |
      |!aAA    |


      Scenario Outline: Orange Test
        Then  kullnici "<passwordOrange>" girer
        Then kullanici seviye cizelgesini orange renkte gorur
        Examples:
        |passwordOrange|
        |aAAAAAAA      |
        |Abcdefg       |
        |1abcdef       |
        |1ABCDEFG      |
        |!aaaaaaa      |

        Scenario Outline: Light Green Test
          Then kullanici "<passwordLightGreenTest>"
          Then kullanici seviye cizelgesini lightgreen renkte gorur
          Examples:
          |passwordLightGreenTest|
          |!aaAAcc           |
          |1ABCdef           |


        Scenario Outline: Green
            Then kullanici "<passwordGreen>"
            Then kullanici seviye cizelgesini green renkte gorur
            Examples:
            |passwordGreen|
            |!12ABc?      |

        Scenario Outline: Yellow
              Then kullanici "<passwordYellow>"
              Then kullanici seviye cizelgesini yellow renkte gorur
              Examples:
          |passwordYellow|
          |aaaAAAA1      |

          Scenario: Your password is required to be at least 4 characters.
            Then kullanici password girer
            Then hata mesaji alir






