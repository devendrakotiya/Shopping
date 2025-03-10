package Devendra.Shopping;

import java.util.List;

import org.testng.annotations.Test;

public class ShoppingBasketTest {
	
	@Test
	public void A_Basic_example_with_multiple_items() {
	List<String> basket1 = List.of("Apple", "Apple", "Banana", "Melon", "Melon", "Lime", "Lime", "Lime");
    System.out.println("Test 1 - Total cost: " + ShoppingBasket.calculateTotalCost(basket1) + "p"); 
	}
	
    
	@Test
	public void Only_apples_in_the_basket() {
    List<String> basket2 = List.of("Apple", "Apple", "Apple");
    System.out.println("Test 2 - Total cost: " + ShoppingBasket.calculateTotalCost(basket2) + "p"); 
	}
	
    
	@Test
	public void Only_bananas_in_the_basket() {
    List<String> basket3 = List.of("Banana", "Banana");
    System.out.println("Test 3 - Total cost: " + ShoppingBasket.calculateTotalCost(basket3) + "p"); 
	}
	
    
	@Test
	public void Basket_with_melons() {
    List<String> basket4 = List.of("Melon", "Melon", "Melon");
    System.out.println("Test 4 - Total cost: " + ShoppingBasket.calculateTotalCost(basket4) + "p"); 
	}
	
   
	@Test
	public void Basket_with_limes() {
    List<String> basket5 = List.of("Lime", "Lime", "Lime", "Lime", "Lime");
    System.out.println("Test 5 - Total cost: " + ShoppingBasket.calculateTotalCost(basket5) + "p"); 
	}
	
    
    @Test
    public void An_empty_basket() {
	List<String> basket6 = List.of();
    System.out.println("Test 6 - Total cost: " + ShoppingBasket.calculateTotalCost(basket6) + "p"); 
    }
    
  
    @Test
    public void A_basket_with_odd_and_even_counts_for_melons() {
    List<String> basket7 = List.of("Melon", "Melon", "Melon", "Melon", "Melon", "Melon");
    System.out.println("Test 7 - Total cost: " + ShoppingBasket.calculateTotalCost(basket7) + "p"); 
    }
    
    
    @Test
    public void Basket_with_only_limes() {
    List<String> basket8 = List.of("Lime", "Lime", "Lime", "Lime", "Lime", "Lime", "Lime", "Lime", "Lime");
    System.out.println("Test 8 - Total cost: " + ShoppingBasket.calculateTotalCost(basket8) + "p");
    }
    
    
    @Test
    public void Basket_with_just_one_lime() {
    List<String> basket9 = List.of("Lime");
    System.out.println("Test 9 - Total cost: " + ShoppingBasket.calculateTotalCost(basket9) + "p"); 
 
    }
    
    
    @Test
    public void Basket_with_only_one_melon() {
    List<String> basket10 = List.of("Melon");
    System.out.println("Test 10 - Total cost: " + ShoppingBasket.calculateTotalCost(basket10) + "p"); 
    }
    
}
