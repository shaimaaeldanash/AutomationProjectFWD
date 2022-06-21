@smoke

  Feature: user is able to add products to wishlist

    Scenario: success message appears and visible when user add products to wishlist
      Given user adds products to wishlist
      Then success message is visible and displayed

    Scenario: Number of items gets increased in wishlist showing in homepage
      Given  user adds products to wishlist
      When  success message is visible and displayed
      And user get the number of wishlist items after adding product
      Then number of wishlist items increased


