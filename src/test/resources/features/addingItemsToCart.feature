@AddItemCart
  Feature: User should be able to add items to the cart and view their cart

    Background:
      Given The user is in the home page adding items

      Scenario Outline: User can add items they have searched and edit their cart
        When The user enters the name of the "<item>" into the search bar
        And The user clicks on the search button
        When The user clicks on the product page for the item
        Then The user will click on the add to cart button
        When The user clicks on their cart
        Then The user should see their product in the cart
        Then The user should be able to remove that item from the cart

        Examples:
          | item |
          | Top Loaders |
          | Card Sleeves     |
          | Top Loaders |
