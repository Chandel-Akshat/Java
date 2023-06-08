package St_1;

import java.util.Arrays;
import java.util.Scanner;

public class MotoGp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = input.nextInt();
		int [] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = input.nextInt();
		}
		int ans = 100;
//		int arr1[] = new int[n-1];
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int min=100000;
		for(int i = 0 ; i < n-1 ; i++) {
			int diff = arr[i] - arr[i+1];
			if(diff<min) {
				min=diff;
			}
	
		}
//		Arrays.sort(arr1);
//		System.out.println(Arrays.toString(arr1));
		System.out.println(" "+min);
	}
}
