package day4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * given an array and the target value find if there exists a pair of elements in the array which sum up to the target
 
 * @author durga prasad
 *
 */
public class TargetSumPair {

	public static void findTargetSumPair(int[] arr, int target) {
		
		Arrays.sort(arr);  //nlogn  Arrays. sort(Object[]) is based on the TimSort algorithm, giving us a time complexity of O(n log(n)).
		int left = 0;
		int right = arr.length-1;
	    boolean targetFound = false;
	    
		while(left < right) {
			int sum = arr[left] + arr[right];
			if(sum == target) {
				System.out.println("tartget pair  = [" + arr[left] + " , "+ arr[right] +" ]" );
				targetFound = true;
				break;
			}else if(sum < target) {
				left++;
			}else {
				right--;
			}
		}
		
		if(!targetFound) System.out.println("no such pair summing to "+ target);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int target = scanner.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		
		findTargetSumPair(arr, target);
		
	}
}
