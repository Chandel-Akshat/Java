package practice;

import java.util.Scanner;

public class swap_first_and_last_column {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int row = input.nextInt();
		System.out.println("Enter number of columns : ");
		
		int column = input.nextInt();
		int arr[][]=new int[row][column];
		System.out.println("Enter the element of array : ");
		for(int i = 0 ; i<row ; i++) {
			for(int j = 0 ; j<column ; j++) {
				arr[i][j]=input.nextInt();
			}
		}
		System.out.println("Before swaping matrix is :");
		for(int i = 0 ; i<row ; i++) {
			for(int j = 0 ; j<column ; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i = 0; i<row;i++) {
			int temp = arr[i][0];
			arr[i][0]=arr[i][column-1];
			arr[i][column-1]=temp;
		}
		System.out.println("After swaping matrix is : ");
		for(int i = 0 ; i<row ; i++) {
			for(int j = 0 ; j<column ; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
