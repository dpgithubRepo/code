package day1;
import java.util.Scanner;
import java.util.Arrays;

/**
 * 
 * given an array and a rotation number, rotate the array by that number
 * 
 * example: [1,2,3,4,5,6] and rotation = 2  = > [3,4,5,6,1,2]
 * 
 * example: [1,2,3,4,5,6] and rotation = 0 = > [1,2,3,4,5,6]
 * 
 * example: [1,2,3,4,5,6] and rotation = 9 = > [4,5,6,1,2,3]
 * 
 * example: [1,2,3,4,5,6] and rotation = -2 = > [5,6,1,2,3,4]
 * 
 *  
 * @author durga prasad
 *
 */
public class RotateMain {
	
	 static int[] rotate(int[] arr, int rotation) {
		
		int len = arr.length;
		
		if(rotation == 0 || len == rotation || len <=1) {
			
			return arr;
			
		}
		
		rotation = rotation > 0 ? rotation : rotation + len;
		
		rotation = rotation % len;
		
		reverse(arr, 0, rotation-1);
		
		reverse(arr, rotation, arr.length-1);
		
		reverse(arr, 0, arr.length-1);
		
		return arr;
	}
	
	 static void  reverse(int[] arr, int start, int end) {
		
		for(int i = start, j = end; i < j; i++, j-- ) {
			
			int temp =  arr[i];
			
			arr[i] = arr[j];
			
			arr[j] = temp;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("input the array size");
		int n = scanner.nextInt(); //size of the array;
		System.out.println("input the rotation number");
		int r = scanner.nextInt();
		
		int[] arr = new int[n];
		System.out.println("input the array elements");
		for(int i = 0; i < n; i++) {
			arr[i]  = scanner.nextInt();
		}
		
		scanner.close();
		
		
		System.out.println("input array => "+ Arrays.toString(arr));
		rotate(arr,r);
		System.out.println("rotated array =>" + Arrays.toString(arr));
		
		
	}
}
