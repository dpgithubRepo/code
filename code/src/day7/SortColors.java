package day7;

import java.util.Arrays;
import java.util.Scanner;


/**
 * 
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 * we will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 * You must solve this problem without using the library's sort function.
 * 
 * https://leetcode.com/problems/sort-colors/
 * 
 * @author durga prasad
 *
 */
public class SortColors {
	
	
	// O(n) but iterates the array only once
	public static void dutchNationalFlagSort(int[] arr) {
		int start = 0;
		int mid = 0;
		int last = arr.length -1;

		while(mid <= last) {
			if(arr[mid] == 0) {
				int temp = arr[start];
				arr[start] = arr[mid];
				arr[mid] = temp;
				mid++; start++;

			}
			else if(arr[mid] == 1) {
				mid++;
			}else {
				int temp = arr[last];
				arr[last] = arr[mid];
				arr[mid] = temp;
				last--;
			}

		}

	}
	
	
	// the following sort iterates the given array twice  O(n)
	public static void sort(int[] arr) {
		int count0 = 0;
		int count1 = 0;
		int count2 = 0 ;
		
		for(int i = 0; i < arr.length; i++) {   // iteration 1 whole array
			
			if(arr[i] == 0 ) 
				count0++;
			else if(arr[i] == 1) 
				count1++;
			else 
				count2++;
		}
		
		for(int i = 0; i < arr.length; i ++) {  //itertion 2 whole array for filling up elements
			while(count0 >0) {
				arr[i++] = 0;
				count0--;
			}
			
			while(count1 >0) {
				arr[i++] = 1;
				count1--;
			}
			
			while(count2 >0) {
				arr[i++] = 2;
				count2--;
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n ; i++) {
			arr[i] = scanner.nextInt();
		}
		
		dutchNationalFlagSort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	//	sort(arr);
	
	//	System.out.println(Arrays.toString(arr));
		
		scanner.close();
	}

}
