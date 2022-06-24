@smoke

Feature: users could register with new accounts

  Scenario: guest user could register with valid data successfully

  Given user go to register page
  When user select gender type
  And user enter first name Shaimaa and last name Nasser
  And user enter date of birth
  And user enter email user3@example.com field
  And user fills Password fields P@ssw0rd ,P@ssw0rd
  And user clicks on register button
  Then success message is displayed