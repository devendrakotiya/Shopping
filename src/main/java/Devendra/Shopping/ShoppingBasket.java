package Devendra.Shopping;

import java.util.HashMap;
import java.util.List;

public class ShoppingBasket {
	
	 public static int calculateTotalCost(List<String> basket) {
	        
	        final int APPLE_PRICE = 35;
	        final int BANANA_PRICE = 20;
	        final int MELON_PRICE = 50;
	        final int LIME_PRICE = 15;
	        
	        // Create a map to count the occurrences of each item
	        HashMap<String, Integer> itemCounts = new HashMap<>();
	        
	        // Count occurrences of each item in the basket
	        for (String item : basket) {
	            itemCounts.put(item, itemCounts.getOrDefault(item, 0) + 1);
	        }
	        
//	        aspple = 1+1
	        
	        // Initialize total cost
	        int totalCost = 0;
	        
	        // Calculate the cost for each item
	        for (String item : itemCounts.keySet()) {
	            int count = itemCounts.get(item);
	            
	            if (item.equals("Apple")) {
	                totalCost += count * APPLE_PRICE;
	            } else if (item.equals("Banana")) {
//	            	buy 6 get 12 
//	            	6*20 = 120
	            	totalCost = totalCost + (count/12)*6*BANANA_PRICE + (count%12)*BANANA_PRICE;
//	                totalCost += count * BANANA_PRICE;
	            } else if (item.equals("Melon")) {
	                // Melons: Buy one get one free offer
	                totalCost += (count / 2 + count % 2) * MELON_PRICE; // Pay for half (rounded up)
	            } else if (item.equals("Lime")) {
	                // Limes: Three for the price of two offer
	                totalCost += (count / 3)*2*LIME_PRICE + (count % 3)*LIME_PRICE;
	            }
	        }
	        
	        return totalCost;
	    }
	
}
