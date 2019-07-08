package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "THe Lord of the Rings";
		
		if (bookTitle.contains("Ring")) {
			System.out.println("The book contains the word " + wordChoice);
		}
		
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
		}
		
		String firstName = "Gabriel";
		String lastName = "Ferraz";
		String ssn = "983473831";
		
		
		// Print the initials plus last 4 digits of SSN
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0, 1));
		System.out.print(ssn.substring(5));
	}

}
