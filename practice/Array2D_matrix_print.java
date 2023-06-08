package practice;

import java.util.Scanner;

public class Array2D_matrix_print {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int m = input.nextInt();
		System.out.println("Enter the number of column : ");
		int n = input.nextInt();
		int arr[][] = new int [m][n];
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				arr[i][j] = input.nextInt();
			}
		}
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
		
	}
}
