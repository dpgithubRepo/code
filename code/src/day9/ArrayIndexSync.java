package day9;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * Given an array of size N, containing elements from 0 to N-1 are present in the array. if a number is not present then the 
 * array will contain -1
 * 
 * arrange the array in a way that value at a index is equal to index or -1 if the value is not present
 * 
 * @author durga prasad
 *
 */

public class ArrayIndexSync {
	
	private static void indexArray(int[] arr, int size) {
		for(int i = 0; i < size; i++) {
			while(arr[i] != -1 && arr[i] != i) {
				int temp = arr[i]; 
				arr[i] = arr[temp]; 
				arr[temp] = temp; 
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int  i = 0; i < n ;i ++) {
			arr[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		indexArray(arr,n);
		System.out.println(Arrays.toString(arr));
	}

}
