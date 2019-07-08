package practice;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String[] s = {"A", "B", "C", "D", "E", "F", "G"};
		s = removeElement(s, 2);
		System.out.println(Arrays.toString(s));
		
		

	}
	
	public static String[] removeElement(String[] s, int index){
		for(int i = index; i < s.length-2; i++){
		s[i] = s[i+1];
		}
		return s;
	}
}


//Write a Java program to update specific array element by given element.
