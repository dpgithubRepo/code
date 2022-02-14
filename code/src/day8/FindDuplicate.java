package day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * Given an array numbers 1 to n of length n. Each integer appears once or twice.
 * 
 *  return all the integers which appear twice.
 *  
 *  algo must run in O(n) & uses only constant extra space
 * 
 * 
 * @author durga prasad
 *
 */
public class FindDuplicate {

	
	private static List<Integer>  findDuplicate(int[] arr) {
		
		List<Integer> result = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			int index = Math.abs(arr[i]) - 1;
			if(arr[index] < 0) {
				result.add(index + 1);
			}else {
				arr[index] *= -1;
			}
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr  = new int[n];
		
		for(int i = 0; i <n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		scanner.close();
	
		System.out.println(findDuplicate(arr));
	}
	
	
}
