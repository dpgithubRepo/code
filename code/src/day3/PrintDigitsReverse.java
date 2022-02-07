package day3;
import java.util.Scanner;
/**
 * 
 * given a number, print the digits of it.
 * 
 * example: 87612 => 2,1,6,7,8
 * 
 * @author durga prasad
 *
 */
public class PrintDigitsReverse {
  
	public static void printRecursive(int n) {
		if(n<=0) return;
		
		System.out.println(n%10);
		n = n/10;
		printRecursive(n);
	}
	
	public static void printIterative(int n) {
		while(n>0) {
			System.out.println(n%10);
			n  = n/10;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		printRecursive(n);
		System.out.println("......");
		printIterative(n);
		
	}
}
