Feature: STC TV Packages Names and Prices
  In order to check the STC TV packages and prices
  As a customer
  I want to navigate to the STC TV main page

  Scenario: Verify STC TV packages names and prices
    Given saudi arabian customer will navigate to the stc TV main page
    When he or she should see three packages
      | LITE | CLASSIC | PREMIUM |
    Then he or she should see the prices and currency of each package
      | 15 | 25 | 60 | SAR |

  Scenario: Verify STC TV packages name and prices for Bahrain
    Given bahraini customer will navigate to the stc TV main page
    When he or she should navigate to the STC TV package for Bahrain
    Then he or she should see three packages
      | LITE | CLASSIC | PREMIUM |
    Then he or she should see the prices and currency of each package
      | 2 | 3 | 6 | BHD |

  Scenario: Verify STC TV packages name and prices for Kuwait
    Given kuwaiti customer will navigate to the stc TV main page
    When he or she should navigate to the STC TV package for Kuwait
    Then he or she should see three packages
      | LITE | CLASSIC | PREMIUM |
    Then he or she should see the prices and currency of each package
      | 1.2 | 2.5 | 4.8 | KWD |