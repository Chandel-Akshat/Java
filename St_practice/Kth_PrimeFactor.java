package St_practice;

import java.util.Scanner;

public class Kth_PrimeFactor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number you want to check for prime factor : ");
		int n = input.nextInt();
		System.out.println("Enter the index number : ");
		int k = input.nextInt();
		int arr[]=new int[100];
		int j=0;
		for(int i =2 ; i<=n; i++) {
			while(n%i==0) {
				arr[j]=i;
				j++;
				n/=i;
			}
		}
		if(arr[k-1]==0) {
			System.out.println(-1);
		}
		else {
			System.out.println(arr[k-1]);
		}
		
	}
}
