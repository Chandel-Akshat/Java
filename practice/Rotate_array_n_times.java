package practice;

import java.util.Scanner;
import java.util.Arrays;

public class Rotate_array_n_times{
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elemenst of array : ");
		for(int i = 0 ; i < n ; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter how many times you want to rotate : ");
		int rotation = scan.nextInt();
		rotation= rotation%n;
		System.out.println("Rotated array will be : ");
		for(int i = 0 ; i < n ; i++) {
			
			if(i<rotation) {
				System.out.print(arr[n+i-rotation]+" ");
			}
			else {
				System.out.print(arr[i-rotation]+" ");
			}
		}
		
	}
}
