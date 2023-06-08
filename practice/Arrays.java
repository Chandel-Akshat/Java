package practice;

import java.util.Scanner;

public class Arrays {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elemenst of array : ");
		for(int i = 0 ; i < n ; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the target : ");
		int target = scan.nextInt();
		for(int i = 0 ; i<n; i++) {
			for(int j = i ; j<n ; j++) {
				if(arr[i]+arr[j] == target) {
					System.out.println(i+""+j);
				}
			}
		}
	}
}
