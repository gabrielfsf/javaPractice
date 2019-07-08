package algorithms;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
		
		System.out.println(longestCommonPrefix(input));
		
	}
	
	public static String longestCommonPrefix(String[] input) {
		
		int size = input.length; 
	    // Covering empty array edge case
	    if (size == 0) return ""; 
	    // Covering single element array edge case 
	    if (size == 1) return input[0]; 
	    // Sort array of strings in alphabetical order
	    Arrays.sort(input); 
	    
	    String first = input[0].toLowerCase();
	    String last = input[size-1].toLowerCase();
	    String result = "";
	    int i = 0;
	    while (first.charAt(i) == last.charAt(i)) {
	      result += first.charAt(i);
	      i++;
	    }
	    return result;
	}

}
