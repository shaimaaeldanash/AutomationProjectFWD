@smoke

  Feature: Guest user should be able to switch currencies between US-Euro ( $ - € ) in home page.
    Scenario: guest user can select Euro currency

      Given user selects Euro from dropdown list
      And Euro is displayed as currency
      Then user can see The 4 products are showing with Euro sign


