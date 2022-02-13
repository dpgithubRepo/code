package day7;

import java.util.Scanner;


/**
 * 
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 * 
 * 
 * https://leetcode.com/problems/rotate-image/
 * 
 * 
 * input 
 * 
 * 5	1	9	11	
 * 2	4	8	10	
 * 13	3	6	7	   
 * 15	14	12	16	
 * 
 * 
 * output
 * 
 * 15	13	2	5	
 * 14	3	4	1
 * 12	6	8	9	
 * 16	7	10	11	
 * 
 * 
 * @author durga prasad
 *
 */
public class RotateImage {
	
	
	private static void rotateArray(int[][] arr) {
		//transpose the matrix first : transpose swap i & j
		int rows = arr.length;
		int cols = arr[0].length;
		
		
		//firt transpose
		for(int i = 0; i < rows; i++) {
			for(int j = i + 1; j < cols; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		//reverse the elements in the rows
		for(int i = 0; i < rows; i++) {
			for(int j = 0, k = cols-1; j <= k; j++,k-- ) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][k];
				arr[i][k] =  temp;
				
			}
		}
	}
	
	private static void print2DArray(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(arr[i][j]+ "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i = 0; i < n ; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		
		scanner.close();
		 System.out.println( "input array ");
		print2DArray(arr);
		
		rotateArray(arr);
		
		 System.out.println("after rotating");
		 System.out.println();
		print2DArray(arr);
	}

}
