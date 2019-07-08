package exceptionFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PhoneNumberApp {

	public static void main(String[] args) {
		// This will read a text file and retrieve phone number
		
		String filename = "/Users/gabrielferraz/Documents/files/phoneNumbers.txt";
		File file = new File(filename);
//		String[] phoneList = new String[9];
		String phoneNumber = null;
		List<String> phoneList = new ArrayList<>();
			
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((phoneNumber = br.readLine()) != null) {
				phoneList.add(phoneNumber);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Unable to read file");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("File is empty");
		} 
			  	
		// Valid phone number:
					// 10 digits long
					// Area code cannot start with 0 or 1
					// Number cannot have 911 in it
		for (int i=0; i<phoneList.size(); i++) {
			phoneNumber = phoneList.get(i);
			try {
				if (phoneNumber.length() != 10) {
					throw new TenDigitsException(phoneNumber);
				}
				if (phoneNumber.substring(0, 1).equals("0") || phoneNumber.substring(0, 1).equals("1")) {
					throw new AreaCodeException(phoneNumber);
				}
				if (phoneNumber.contains("911")) {
					throw new EmergencyException(phoneNumber);
				}
				System.out.println(phoneNumber);
			} catch (TenDigitsException e) {
				System.out.println("ERROR: Invalid phone number. Phone number must have 10 digits");
				System.out.println(e.toString());
			} catch (AreaCodeException e) {
				System.out.println("ERROR: Invalid area code. Area code cannot begin with 0 or 1");
				System.out.println(e.toString());
			} catch (EmergencyException e) {
				System.out.println("ERROR: Phone number cannot contain 911");
				System.out.println(e.toString());
			}
		}
	}
}
class TenDigitsException extends Exception {
	
	String num;
	
	TenDigitsException(String num) {
		this.num = num;
	}
	public String toString() {
		return ("TenDigitsException: " + num);
	}
}

class AreaCodeException extends Exception {
	
	String num;
	
	AreaCodeException(String num) {
		this.num = num;
	}
	public String toString() {
		return ("AreaCodeException: " + num);
	}
}

class EmergencyException extends Exception {
	
	String num;
	
	EmergencyException(String num) {
		this.num = num;
	}
	public String toString() {
		return ("EmergencyException: " + num);
	}
}
