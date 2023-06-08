package St_practice;

import java.util.Arrays;
import java.util.Scanner;

public class MotoGP {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter number of Racers : ");
		int n = input.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the value of skills of "+n+" racers : ");
		for(int i =0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		Arrays.sort(arr);
		int diff = 10000000;
		for(int i = 0; i< n -1; i++) {
			int sub = arr[i+1]-arr[i];
			if(sub<diff) {
				diff=sub;
			}
		}
		System.out.println("Minimum possible diff between the skills of racers is : ");
		System.out.println(diff);
	}
}
