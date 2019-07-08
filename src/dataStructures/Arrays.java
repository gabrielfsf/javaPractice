package dataStructures;

public class Arrays {

	public static void main(String[] args) {
		String[] alphabet = {"a", "b", "c", "d", "e", "f"};
		
		System.out.println("Using for loop");
		for (int i=0; i<alphabet.length; i++) {
			System.out.print(alphabet[i] + " ");
		}
		
		System.out.println("\n\nUsing enhanced for loop");
		for (String letter : alphabet) {
			System.out.print(letter + " ");
		}
		
		System.out.println("\n\nDouble Array");
		String[][] users = { 
						{"John", "Williams", "jw@testemail.com", "4802331808"},
						{"Sarah", "Jackson", "sj@testemail.com", "3233019876"},
						{"Rachel", "Wallace", "rw@testemail.com", "3133366181"}
					};
		
		// Get the size of the array
		int numOfUsers = users.length;
		int numOfFields = users[0].length;
		System.out.println("Number of users: " + numOfUsers);
		System.out.println("Number of fields: " + numOfFields);
		
		System.out.println("\nUsing For Loop to traverse double array");
		// Traverse the double array
		for (int i=0; i<numOfUsers; i++) {
			String firstName = users[i][0];
			String lastName = users[i][1];
			String email = users[i][2];
			String phoneNumber = users[i][3];
			System.out.println(firstName + " " + lastName + " " + email + " " + phoneNumber);
		}
		
		System.out.println("\nUsing nested For-Loops");
		for (int i=0; i<numOfUsers; i++) {
			System.out.print("[ ");
			for (int j=0; j<numOfFields; j++) {
				System.out.print(users[i][j] + " ");
			}
			System.out.println("]");
		}
		
		System.out.println("\nUsing nested Enhenced-For Loop to traverse double array");
		for (String[] user : users) {
			System.out.print("[ ");
			for(String field : user) {
				System.out.print(field + " ");
			}
			System.out.println("]");
		}

	}

}
