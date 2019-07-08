package dataStructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		// LinkedHashSet - in the order that they were entered
		// HashSet - complete random order
		// TreeSet - rearranges to natural order (alphabetical or numerical)
		
		// Define the collection
		Set<String> animals = new LinkedHashSet<>();
		
		// Add elements
		animals.add("Duck");
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Pig");
		animals.add("Horse");
		animals.add("Snake");
		System.out.println(animals.size() + " " + animals);
		
		animals.add("Duck");
		animals.add("Dog");
		animals.add("Goose");
		System.out.println(animals.size() + " " + animals);
		
		// Create a new set that we can use for comparison
		Set<String> farmAnimals = new HashSet<>();
		
		farmAnimals.add("Chicken");
		farmAnimals.add("Cow");
		farmAnimals.add("Pig");
		farmAnimals.add("Horse");
		farmAnimals.add("Duck");
		
		// What is the INTERSECTION (common animals) between animals and farmAnimals
		// 1. Copy existing set into a new set
		Set<String> intersectionSet = new HashSet<>(animals);
		System.out.println("\n" + intersectionSet);
		// 2. Retain ONLY the elements that are also in the other set
		intersectionSet.retainAll(farmAnimals);
		System.out.println("\nThe animals found in both sets are: " + intersectionSet);
		
		// What is the UNION (both animals and farmAnimals combined)
		Set<String> unionSet = new HashSet<>(farmAnimals);
		unionSet.addAll(animals);
		System.out.println("The union is: " + unionSet);
		
		// What is the DIFFERENCE (in animals but NOT in farmAnimals
		Set<String> differenceSet = new HashSet<>(animals);
		differenceSet.removeAll(farmAnimals);
		System.out.println("The difference is: " + differenceSet);
	}

}
