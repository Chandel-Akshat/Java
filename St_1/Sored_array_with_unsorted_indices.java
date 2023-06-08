package St_1;

import java.util.Arrays;
import java.util.Scanner;

public class Sored_array_with_unsorted_indices {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = input.nextInt();
		}
		
		int arr1[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr1[i] = arr[i];
		}
		Arrays.sort(arr1);
		
		int [] arr2 = new int [n];
		for(int i = 0 ; i < n ; i++) {
			arr2[i] = arr1[n-1-i];
		}
		System.out.println(Arrays.toString(arr)+""+Arrays.toString(arr2)+" ");
		for(int i = 0; i<n ; i++ ) {
			for(int j = 0; j<n ; j++) {
				if(arr2[i]==arr[j]) {
					System.out.print(j+" ");
					arr[j]=-122;
					break;
				}
			}
		}
		
	}
}
 