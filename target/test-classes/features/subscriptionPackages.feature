Feature: STC tv packages names and prices
  In order to check the STC tv packages and prices
  As a customer
  I want to Navigate to the STC tv main page

  Scenario: Verify STC tv packages name and prices
    Given saudi arabian customer will navigate to the stc tv main page
    When he or she should see three packages
      | LITE | CLASSIC | PREMIUM |
    Then he or she should see the prices and currency of each package
#      | litePackagePrice | classicPackagePrice | premiumPackagePrice | packageCurrency |
      | 15 | 25 | 60 | SAR |

  Scenario: Verify STC tv packages name and prices for Bahrain
    Given bahraini customer will navigate to the stc tv main page
    When he or she should navigate to the STC tv package for bahrain
    Then he or she should see three packages
      | LITE | CLASSIC | PREMIUM |
    Then he or she should see the prices and currency of each package
#      | litePackagePrice | classicPackagePrice | premiumPackagePrice | packageCurrency |
      | 2 | 3 | 6 | BHD |

  Scenario: Verify STC tv packages name and prices for Kuwait
    Given kuwaiti customer will navigate to the stc tv main page
    When he or she should navigate to the STC tv package for Kuwait
    Then he or she should see three packages
      | LITE | CLASSIC | PREMIUM |
    Then he or she should see the prices and currency of each package
#      | litePackagePrice | classicPackagePrice | premiumPackagePrice | packageCurrency |
      | 1.2 | 2.5 | 4.8 | KWD |