package Devendra.Shopping;

import java.util.List;

import org.testng.annotations.Test;

public class ShoppingBasketTest {
	
        // Test case 1:
		@Test
		public void BasicExampleWithMultipleItems() {
        List<String> basket1 = List.of("Apple", "Apple", "Banana", "Melon", "Melon", "Lime", "Lime", "Lime");
        System.out.println("Test 1 - Total cost: " + ShoppingBasket.calculateTotalCost(basket1) + "p"); // Expected: 185p
		}
		
        // Test case 2
		@Test
		public void BasketWithOnlyApples() {
        List<String> basket2 = List.of("Apple", "Apple", "Apple");
        System.out.println("Test 2 - Total cost: " + ShoppingBasket.calculateTotalCost(basket2) + "p"); // Expected: 105p
		}
		
        // Test case 3
		@Test
		public void BasketWithOnlyBananas() {
        List<String> basket3 = List.of("Banana", "Banana");
        System.out.println("Test 3 - Total cost: " + ShoppingBasket.calculateTotalCost(basket3) + "p"); // Expected: 40p
		}
		
        // Test case 4:
		@Test
		public void BasketWithOnlyMelons() {
        List<String> basket4 = List.of("Melon", "Melon", "Melon");
        System.out.println("Test 4 - Total cost: " + ShoppingBasket.calculateTotalCost(basket4) + "p"); // Expected: 50p
		}
		
        // Test case 5:
		@Test
		public void BasketWithOnlyLimes() {
        List<String> basket5 = List.of("Lime", "Lime", "Lime", "Lime", "Lime");
        System.out.println("Test 5 - Total cost: " + ShoppingBasket.calculateTotalCost(basket5) + "p"); // Expected: 60p
		}
		
        // Test case 6:
		@Test
		public void EmptyBasket() {
        List<String> basket6 = List.of();
        System.out.println("Test 6 - Total cost: " + ShoppingBasket.calculateTotalCost(basket6) + "p"); // Expected: 0p
		}
}
