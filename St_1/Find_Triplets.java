//Given an array of distinct integers. The task is to count all the triplets such that the sum of
//two elements equals the third element.


package St_1;

import java.util.Scanner;

public class Find_Triplets {
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
			for(int j = i+1 ; j < n ; j++) {
				for(int k = j+1 ; k < n ; k++) {
					
		
				if((arr[i]+arr[j]==arr[k] || (arr[j]+arr[k]==arr[i] || (arr[k]+arr[i]==arr[j])))) {
					count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
