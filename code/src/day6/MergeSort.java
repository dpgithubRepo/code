package day6;

import java.util.Arrays;
import java.util.Scanner;


/**
 * Merge Sort
 * 
 * @author durga prasad
 *
 */
public class MergeSort {
	
	public static int[] mergeSort(int[] arr, int low, int high) {
		
		if(low == high) {
			int[] last = new int[1];
			last[0] = arr[low];
			return last;
		}
		
		int mid = (low + high) /2;
		int [] first = mergeSort(arr, low, mid);
	    int [] second = mergeSort(arr, mid + 1, high);
	    int merged[] = mergeTwoSortedArrays(first, second);
	    return merged;
		
	}
	
	
	private static int[] mergeTwoSortedArrays(int[] first, int[] second) {
		int len1 = first.length;
		int len2 = second.length;
		int len = len1 + len2 ;
		int[] merged = new int[len];
		
		int i = 0, j = 0;
		int count = 0;
		
		while(i < len1 && j < len2) {
			
			if(first[i] < second[j]) {
				merged[count++] = first[i++];
			}else if(first[i] > second[i]) {
				merged[count++] = second[j++];
			}else {
				merged[count++] = first[i++];
				merged[count++] = second[j++];
			}
		}
		
		if(i != len1) {
			for(int k = i; k < len1; k++) {
				merged[count++] = first[k];
			}
		}

		if(j != len2) {
			for(int k = j; k < len2; k++) {
				merged[count++] = second[k];
			}
		}
		
		return merged;
	}

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length -1)));
	}
	
}
