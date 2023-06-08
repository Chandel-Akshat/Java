package St_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Largest_dist_bw_Magnets {
	public static boolean possible(int arr[],int d,int k) {
		int m =arr.length;
		int o = arr[0];
		k--;
		for(int  i = 1 ; i < m; i++) {
			if(arr[i]-o>=d) {
				k--;
				if(k==0) {
					return true;
				}
				o=arr[i];
			}
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i< n;i++) {
			arr[i]=input.nextInt();
		}
		Arrays.sort(arr);
		int maxD=arr[n-1]-arr[0];
		int ans =1;
		for(int i = 1; i<=maxD ; i++) {
			boolean t = possible(arr,i,k);
			if(t) {
				ans=Math.max(ans, i);
			}
		}
		System.out.println(ans);
	}
}
