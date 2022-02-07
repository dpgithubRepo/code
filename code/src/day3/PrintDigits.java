package day3;

import java.util.Scanner;

/**
 * 
 * given a number, print digits
 * 
 * example: 6578 => 6,5,7,8
 * 
 * @author durga prasad
 *
 */
public class PrintDigits {

	public static void printRecursive(int n) {
		if (n!=0) {
			printRecursive(n/10);
			System.out.println(n%10);
		}
	}
	
	public static void printIterative(int n) {
		int nod = 0;
		int temp = n;
		int mul = 1;
		while(temp > 0) {
			nod++;
			temp = temp/10;
		}
 
		mul = mul * (int)Math.pow(10, nod-1);
		temp = n;
		
		while(mul > 0) {
			int q = temp / mul;
			int r = temp % mul;
			mul = mul /10;
			temp = r;
			System.out.println(q);
			
		}

	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		printRecursive(n);
		System.out.println("........");
		printIterative(n);
	}
}
