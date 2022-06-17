@smoke

Feature: guest user can use Search functionality in e-commerce website.

  Scenario: user can search by using product name in search field in the website

  Given user enters in search product name "Apple"
  When  user clicks on search field in website home page
  Then search should turn correct result with Apple products


   Scenario: user can search by using product SKU in search field in the website

     Given user enters in search product SKU "AP_MBP_13"
     When  user clicks on search field in the website
     Then search should turn correct product result

