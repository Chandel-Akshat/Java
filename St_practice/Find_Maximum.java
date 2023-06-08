package St_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Find_Maximum {
	public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = input.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array : ");
		for (int i = 0 ; i < n ; i++) {
			arr[i] = input.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Maximum number present in the array is : "+arr[n-1]);
	}
}
