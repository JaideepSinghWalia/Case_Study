Feature: Cart Option not available when empty
Scenario: The one where the user moves to cart without adding any item to it
Given Alex has registered in TestMeApp
When Alex searches a particular product like Carpet
And Tries to proceed to payment without adding any item in cart
Then TestMeApp doesn't display the cart icon