@smoke
Feature: F02_Login | users could use login functionality to use their accounts

  Scenario: user could login with valid email and password

  Given user go to login page
  When user login with valid user1@example.com and P@ssw0rd
  And user press on login button
  Then user login to the account successfully


  Scenario: user could login with invalid email and password
  Given user go to login page
  When user login with invalid Shaimaa@example.com and P@ssw0rd
  And user press on login button
  Then user could not login to the account