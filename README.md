Test Scenario: Calculate the total cost of items present in a shopping basket

Test case 1: A basic example with multiple items - (Apple, Apple, Banana, Melon, Melon, Lime, Lime, Lime)

Expected Result: 70p + 20p + 50p + 30p = 170p

Test case 2: Only apples in the basket - (Apple, Apple, Apple)

Expected Result: 105p

Test case 3: Only bananas in the basket - (Banana, Banana)

Expected Result: 40p

Test case 4: Basket with melons (Buy one get one free) - (Melon)

Expected Result: 50p

Test case 5: Basket with limes (Three for the price of two) - (limes, limes, limes) 

Expected Result: 30p

Test case 6: An empty basket - (no items)

Expected Result: 0p

Test case 7: A basket with odd and even counts for melons - (3 melons free + 3 melons to pay)

Expected Result: 150p

Test case 8: Basket with only limes (even multiple of 3) - 15p*2*3 (3 sets of 3 limes, pay for 2 in each set)

Expected Result: 90p

Test case 9: Basket with just one lime (should pay full price) 

Expected Result: 15p

Test case 10: Basket with only one melon (should pay full price)

Expected Result: 50p
