package assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lab3 {

	public static void main(String[] args) {
		
		String filename = "/Users/gabrielferraz/Documents/files/passwordList.txt";
		String password = null;
		List<String> pswList = new ArrayList<>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			while ((password = br.readLine()) != null) {
				pswList.add(password);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Cannot read file.");
			e.printStackTrace();
		}
		
		for (int i=0; i<pswList.size(); i++) {
			password = pswList.get(i);
			try {
				if (!password.matches(".*[a-zA-Z].*")) {
				throw new ContainLetterException(password);
				}
				if (!password.matches(".*[0-9].*")) {
					throw new ContainNumberException(password);
					}
				if (!password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")) {
					throw new ContainSpecialCharacterException(password);
					}
				System.out.println(password);
			} catch (ContainLetterException e) {
				System.out.println(e.toString());
			} catch (ContainNumberException e) {
				System.out.println(e.toString());
			} catch (ContainSpecialCharacterException e) {
				System.out.println(e.toString());
			}
			
		}
			
		
	}

}

class ContainNumberException extends Exception {
	
	String pwd;
	
	ContainNumberException(String password) {
		this.pwd = password;
	}
	
	public String toString() {
		return "ERROR: Password must contain at least one number: " + pwd;
	}
}

class ContainLetterException extends Exception {
	
	String pwd;
	
	ContainLetterException(String password) {
		this.pwd = password;
	}
	
	public String toString() {
		return "ERROR: Password must contain at least one letter: " + pwd;
	}
}

class ContainSpecialCharacterException extends Exception {
	
	String pwd;
	
	ContainSpecialCharacterException(String password) {
		this.pwd = password;
	}
	
	public String toString() {
		return "ERROR: Password must contain at least one special character: " + pwd;
	}
}


