package dataStructures;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		
		// Create a collection
		ArrayList<String> cities = new ArrayList<>();
		
		// Add elements
		cities.add("Phoenix");
		cities.add("Los Angeles");
		cities.add("Miami");
		cities.add("Chicago");
		
		// Iterate through the collection
		for (String city : cities) {
			System.out.println(city);
		}
		
		// Get the size
		int size = cities.size();
		System.out.println("\nThere are " + size + " elements in this collection");
		
		// Retrieve a specific element
		System.out.println("\nMy favorite city is " + cities.get(1));
		
		// Remove
		cities.remove(0);
		size = cities.size();
		System.out.println("\nNow, there are " + size + " elements in this collection");
		for (String city : cities) {
			System.out.println(city);
		} 

	}

}
