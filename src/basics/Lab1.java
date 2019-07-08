package basics;

import java.util.Arrays;

public class Lab1 {

	public static void main(String[] args) {
		
		System.out.println("Sum: " + add(3));
		
		System.out.println("Factorial: " + factorial(6));
		
		int[] input = {12, 4, 7, 80, 7, 62, 18, 72, 10}; 
		
		System.out.println("The largest value in the array is " + max(input));
		System.out.println("The smallest value in the array is " + min(input));
		System.out.println("The average value of all values in the array is " + average(input));
	}
	
	// Write a function that takes a value n returns the sum of numbers 1 to n
	static int add(int n) {
		int sum = 0;
		while(n > 0) {
			sum += n;
			n--;
		}
		return sum;
	}
	
	// 1! = 1
	// 2! = 2 * 1 = 3
	// 3! = 3 * 2 * 1 = 6
	// 4! = 4 * 3 * 2 * 1 = 24
	// 5! = 5 * 4 * 3 * 2 * 1 = 120
	// Write a function that computes the factorial valueDefinition: n!= n*(n-1)!, where 0! = 1	
	static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		else {
			return (n * factorial(n-1));
		}
	}
	
	// Write 3 functions that take an array as a parameter and return the minimum, average, 
	// and maximum values of that array.Hint: this should be static functions with a 
	// return type of the same data type as the array declaration.
	static int min(int[] input) {
		Arrays.sort(input);
		return input[0];
	}
	
	static int max(int[] input) {
		int max = input[0];
		for (int i=0; i<input.length; i++) {
			if (input[i] > max) {
				max = input[i];
			}
		}
		return max;
	}
	
	static int average(int[] input) {
		int sum = 0;
		for (int i=0; i<input.length; i++) {
			sum += input[i];
		}
		return sum / input.length;
	}
	
	
	
}
