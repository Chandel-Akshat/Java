package St_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Aggresive_Cows {
	static boolean possible(int arr[],int d,int cows) {
		int n =arr.length;
		int m = arr[0];
		cows--;
		for(int i = 1; i< n;i++) {
			if(arr[i]-m>=d) {
				cows--;
				if(cows==0) {
					return true;
				}
				m=arr[i];
			}
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbner of stalls : ");
		int n = input.nextInt();
		System.out.println("Enter numbner of cows : ");
		int c = input.nextInt();
		System.out.println("Enter position of empty of stalls : ");
		int arr[] = new int[n];
		for(int i = 0 ; i< n;i++) {
			arr[i]=input.nextInt();
		}
		
		
		Arrays.sort(arr);
		int maxD = arr[n-1]-arr[0];
		
		int ans=1;
		for(int i =1; i<= maxD;i++) {
			boolean t = possible(arr,i,c);
			if(t) {
				ans=Math.max(ans, i);
			}
		}
		System.out.println("Largest minimum distance between the cows : ");
		System.out.println(ans);
	}
}
