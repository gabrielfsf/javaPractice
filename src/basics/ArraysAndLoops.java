package basics;

public class ArraysAndLoops {
	public static void main(String[] args) {
		// Declare and define an array
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		int j = 0;
		while (j < cities.length) {
			System.out.println("CITY: " + cities[j]);
			j++;
		}
		
		// Declare an array defining size
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "Arizona";
		states[3] = "Texas";
		states[4] = "Utah";
		int i = 0;
		do {
			System.out.println("STATE: " + states[i]);
			i++;
		} while (i < states.length);
		
		int p = 0;
		boolean stateFound = false;
		while (!stateFound) {
			String state = states[p];
			System.out.println(states);
			if (state == "Texas") {
				System.out.println("STATE FOUND!");
				stateFound = true;
			}
			p++;
		}
		
		
		
		
		// Declare array
		String[] countries;
		
		// Define array
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "Mexico";
		for(int k=0; k<countries.length; k++) {
			System.out.println("COUNTRY: " + countries[k]);
		}
	}

}
