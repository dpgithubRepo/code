package day4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * given an array and the target value find all  triplets in the array which sum up to the target
 
 * @author durga prasad
 *
 */
public class TargetSumTriplet {
	
	
	public static void printTriplets(int[] arr, int target) { //O(nlogn) + O(n^2) = O(n^2)
		
		Arrays.sort(arr); //nlogn 
		
		
		//n2
		for(int i = 0; i < arr.length; i++) { 
			
			int left = i +1 ;
			int right = arr.length - 1;
			int curr = arr[i];
			
			while(left < right) {
				
				if(curr + arr[right] + arr[left] == target) {
					
					System.out.println("[" +curr + ", "+ arr[left] +" , "+ arr[right]  +"]");
					left++;
					continue;
					
				}else if(curr + arr[right] + arr[left] < target) {
					left ++;
					
				}else {
					right--;
				}
			}
			
		}
		
		
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
		
		printTriplets(arr, target);
	}

}
