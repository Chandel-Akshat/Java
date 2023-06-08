package practice;

import java.util.Scanner;

public class Addarray {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = scan.nextInt();
		System.out.println("Enter "+n+" of the array : ");
		int arr [] = new int [n];
		for (int i = 0 ; i < n ; i++) {
			arr[i] = scan.nextInt();
		}
		int sum = 0;
		for (int i = 0 ; i < n ; i++) {
			sum += arr[i];
		}
		System.out.print("The sum of all the elemensts in array is : "+sum);
	}
}
