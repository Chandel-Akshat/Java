package St_1;

import java.util.Arrays;
import java.util.Scanner;

public class Agressive_Cows {
	
	public static boolean distance(int arr[], int d , int cows) {
		int n = arr.length;
		int k = arr[0];
		cows--;
		for(int i = 1 ; i < n ; i++) {
			if(arr[i]-k>=d) {
				cows--;
			
				if(cows==0) {
				return true;
				}
			k = arr[i];
			}
		}
	return false;	
}
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int cows =  input.nextInt();
		int [] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = input.nextInt(); 
		}
		Arrays.sort(arr);
		int maxD = arr[n-1] - arr[0];
		int ans = 1;
		for(int i = 1 ; i <= maxD ; i++) {
			boolean possible = distance(arr,i,cows);
			if(possible) {
				ans = Math.max(ans, i);
			}
		}
		System.out.println(ans);
		
	}
}
