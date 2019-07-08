package dataStructures;

import java.util.HashMap;


public class Maps {

	public static void main(String[] args) {
		// LinkedHashMap - in the order that they were entered
		// HashMap - complete random order
		// TreeMap - rearranges to natural order (alphabetical or numerical)
		
		// Implement Map interfaces
		HashMap<Integer, String> hMap = new HashMap<>();
		mapUtil(hMap);

	}
	
	public static void mapUtil(HashMap<Integer, String> mapParam) {
		
		// Add key-value pairs
		mapParam.put(101, "Steve");
		mapParam.put(502, "Roger");
		mapParam.put(22, "Jennifer");
		mapParam.put(315, "Mika");
		mapParam.put(750, "Kelly");
		
		// Expose/access elements
		System.out.println("See all the keys: " + mapParam.keySet());
		System.out.println("See all the key-value pairs: " + mapParam);
		System.out.println(mapParam.get(502));
		
		// Iterate through map of key-value pairs
		for (int key : mapParam.keySet()) {
			System.out.println("[ KEY = " + key + " : VALUE = " + mapParam.get(key) + " ]");
		}
		
	}

}
