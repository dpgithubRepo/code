package day4;

import java.util.Arrays;
import java.util.Scanner;


/**
 * 
 * given an unsorted array of positive integers check if any duplicates with nlogn
 * 
 * @author durga prasad
 *
 */
public class CheckDuplicate {
	
	public static boolean hasDuplicates(int[] arr) {
		boolean flag = false;
		Arrays.sort(arr);  //Arrays.sort(Object[]) is based on the TimSort algorithm, giving us a time complexity of O(n log(n)).
		
		for(int i = 0; i < arr.length -2; i++) {
			if(arr[i] == arr[i+1]) {
				flag = true;
				System.out.println(arr[i] + " is duplicated");
				break; 
			}
		}
		
		return flag;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0 ; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		System.out.println(hasDuplicates(arr));
		
	}

}
