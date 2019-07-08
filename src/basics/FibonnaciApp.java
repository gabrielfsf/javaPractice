package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		// Fibonnaci number is defined by the sum of the 2 previous fibonnaci numbers
		// fib(0) = 0
		// fib(1) = 1
		// fib(2) = fib(0) + fib(1) = 0 + 1 = 1
		// fib(3) = fib(1) + fib(2) = 1 + 1 = 2
		// fib(4) = fib(2) + fib(3) = 1 + 2 = 3
		// fib(5) = fib(3) + fib(4) = 2 + 3 = 5
		// fib(6) = fib(4) + fib(5) = 3 + 5 = 8
		// fib(7) = fib(5) + fib(6) = 5 + 8 = 13
		// fib(8) = fib(6) + fib(7) = 8 + 13 = 21
		// fib(9) = fib(7) + fib(8) = 13 + 21 = 34
		// fib(10) = fib(8) + fib(9) = 21 + 34 = 55
		
		System.out.println(fib(10));
	}
	
	public static int fib(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		else {
			return (fib(n-2) + fib(n-1));
		}
	}

}
