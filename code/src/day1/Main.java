package day1;

import java.util.Scanner;
import java.util.Arrays;


/**
 * Merge two sorted arrays
 * 
 * @author durga prasad
 *
 */
public class Main {

	
	public static int[] mergeSortedArrays(int[] a1, int[] a2) {
		
		int l1 = a1.length;
		int l2 = a2.length;
		int l3 = l1 + l2;
		int[] merged = new int[l3];
        int i = 0; 
        int j = 0;		
		int count = 0;
		
		while(i < l1 && j < l2) {
			
			if(a1[i] < a2[j]) {
				
				merged[count++] = a1[i++];
			
			}else if(a1[i] > a2[j]) {
				
				merged[count++] = a2[j++];
				
			}else {
				
				merged[count++] = a1[i++];
				merged[count++] = a2[j++];
			}
			
		}
		
		if(i != l1) {
			for(int k = i; k < l1; k++) {
				merged[count++] = a1[k]; 
			}
		}
		
		if(j != l2) {
			for(int k = j; k < l2; k++) {
				
				merged[count++] = a2[k];
			}
		}
		
		return merged;
	}
	
	
	
	
	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		
		int n1 = scanner.nextInt();  // 1st array size
		int n2 = scanner.nextInt(); // 2nd array size
				
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		
		for(int i = 0 ; i < n1; i++) {
			arr1[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < n2; i++) {
			arr2[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		System.out.println("input array 1 => " + Arrays.toString(arr1));
		System.out.println("input array 2 => " + Arrays.toString(arr2));
		
		System.out.println("Merged Array => " + Arrays.toString(mergeSortedArrays(arr1, arr2)));
	}
}
