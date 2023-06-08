package ETE_Practice;

import java.util.Scanner;
import java.util.*;

public class swap_first_and_last_column_2Dmatrix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int arr[][] = new int[n][m];
		for(int i = 0 ; i < n;i++) {
			for(int j = 0 ; j<m;j++) {
				arr[i][j]=input.nextInt();
			}
		}
		for(int i =0 ; i<n;i++) {
			int temp = arr[i][0];
			arr[i][0]=arr[i][m-1];
			arr[i][m-1]=temp;
		}
		for(int i = 0 ; i < n;i++) {
			for(int j = 0 ; j<m;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
