package practice;

import java.util.Scanner;

public class find_missing_element {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = input.nextInt();
		int []arr = new int[n];
		int actual_sum = n*(n+1)/2;
		int sum = 0;
		System.out.println("Enter the elements of array : ");
		for(int i = 0 ; i<n-1 ; i++) {
			arr[i]=input.nextInt();
		}
		for(int i = 0 ; i<n ; i++) {
			sum+=arr[i];
		}
		int missing_element=actual_sum-sum;
		System.out.println("The missing element in the array is : "+missing_element );
	}
}
