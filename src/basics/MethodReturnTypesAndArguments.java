package basics;

public class MethodReturnTypesAndArguments {

	public static void main(String[] args) {
		
		System.out.println("Program is starting.");
		printName();
		
		int num1 = 10;
		int num2 = 20;
		addNumbers(num1, num2);
		
		int product = multiplyNumbers(num1, num2);
		System.out.println("The product of numbers " + num1 + " and " + num2 + " is " + product);

	}
	
	static void printName() {
		System.out.println("My name is Tim");
	}
	
	static void addNumbers(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("The sum of numbers " + num1 + " and " + num2 + " is " + sum);
	}
	
	static int multiplyNumbers(int num1, int num2) {
		int product = num1 * num2;
		addNumbers(product, product);
		return product;
	}
}
