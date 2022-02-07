package day2;
import java.util.Scanner;
/**
 * given a 2d array, iterate spirally and display the elements
 */
public class ArraySpiralDisplay {

	public static void spiralDisplay(int[][] a) {
		int l1 = a.length;
		int l2 = a[0].length;
		int count = 0;
		int total_elements = l1 * l2;
		int minR = 0;
		int minC = 0;
		int maxR = l1 - 1;
		int maxC = l2 - 1;
		while(count < total_elements) {
			
			//left border
			for(int i = minR, j = minC;  i <= maxR && count < total_elements; i++) {
				System.out.println(a[i][j]);
				count++;
			}
			
			minC++;
			
			//bottom border
			for(int i = maxR, j = minC; j <= maxC && count < total_elements ; j++) {
				System.out.println(a[i][j]);
				count++;
			}
			maxR--;
			
			//right border
			for(int i = maxR,j = maxC; i >= minR && count < total_elements; i--) {
				System.out.println(a[i][j]);
				count++;
			}
			maxC--;
			
			for(int i = minR, j = maxC; j >= minC && count < total_elements; j--) {
				System.out.println(a[i][j]);
				count++;
			}
			minR++;
			
			//break;
		}
		
		System.out.println("Spiral display end");
		System.out.println("total elements displayed "+ count);
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();  // no of rows
		int n = scanner.nextInt(); //  no of cols
		int arr[][] = new int[m][n];
		
		for(int  i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
		
		for(int  i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(arr[i][j] +"\t");
			}
			System.out.println();
		}
		
		System.out.println("Spiral display start");
		spiralDisplay(arr);
		
	}
}
