package practice;

import java.util.Scanner;

public class find_triplet {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = input.nextInt();
		int []arr = new int[n];
		System.out.println("Enter the elements of array : ");
		for(int i = 0 ; i < n ; i++) {
			arr[i] = input.nextInt();
		}
		int count = 0;
		for(int i = 0; i < n-2 ; i++) {
			for(int j = 2 ; j < n ; j++) {
				if(arr[i]+arr[i+1]==arr[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
