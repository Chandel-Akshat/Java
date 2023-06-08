package ETE_Practice;

import java.util.Scanner;

public class array_diagnol_sum {
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
		int sum1=0;
		for(int i = 0 ; i<n;i++) {
			sum1+=arr[i][i];
		}
		int sum2=0;
		int  k = m-1;
		for(int i = 0 ; i<n;i++) {
			sum2+=arr[i][k];
		}
		System.out.println("Sum of 1 diagnol : "+sum1);
		System.out.println("Sum of 2 diagnol : "+sum2);
		
	}
}
