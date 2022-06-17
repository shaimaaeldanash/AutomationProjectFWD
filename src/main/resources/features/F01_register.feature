@smoke

Feature: users could register with new accounts

  Scenario: guest user could register with valid data successfully

  Given user go to register page
  When user select gender type
  And user enter first name Shaimaa and last name Nasser
  And user enter date of birth
  And user enter email test4@example.com field
  And user fills Password fields Password# ,password#
  And user clicks on register button
  Then success message is displayed