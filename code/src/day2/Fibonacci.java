package day2;

import java.util.Scanner;

/**
 * 
 * given a number find the fibonacci sequence of it
 * 
 * @author durga prasad
 *
 */
public class Fibonacci {

	// using recursion
	public static int fibonacciRecursive(int n) {

		if (n == 0 || n == 1)
			return n;

		int fib1 = fibonacciRecursive(n - 1);
		int fib2 = fibonacciRecursive(n - 2);

		return fib1 + fib2;

	}

	// using iteration
	public static int fibonacciIterative(int n) {

		int a = 0;
		int b = 1;
		int count = 1;
		int c = 0;

		while (count <= n) {
			count++;
			a = b;
			b = c;
			c = a + b;
		}

		return c;

	}
	
	//using memoization pattern of dynamic programming
	public static int fibonacciDP(int n, int[] store) {
		
		if (n == 0 || n == 1)
			return n;
		
		if(store[n] != 0) return store [n];
		int fib1 = fibonacciRecursive(n - 1);
		int fib2 = fibonacciRecursive(n - 2);
		int res = fib1 + fib2;
		store[n] = res;
		return res;
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // input number
		scanner.close();

		System.out.println(fibonacciRecursive(n));
		System.out.println(fibonacciIterative(n));
		System.out.println(fibonacciDP(n, new int[n+1]));
	}
}
