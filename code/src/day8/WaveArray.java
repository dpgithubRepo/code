package day8;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given an array with no duplicates , arrange the elements such that odd elements are less than neighboring even elements forming a wave.
 * 
 * @author durga prasad
 *
 */
public class WaveArray {

	private static void waveArray(int [] arr) {
		Arrays.sort(arr);
		for(int i = 0; i < arr.length -1 ; i+=2) {
			System.out.println("i " + i);
			swap(arr, i, i + 1);
		}
	}
	
	private static void swap(int[] arr, int i , int j) {
		int temp = arr[i];
		arr[i] =  arr[j];
		arr[j] = temp;
 	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i < n;i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		
		waveArray(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
}
