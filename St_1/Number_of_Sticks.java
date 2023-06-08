//Mananjay has N sticks of K length. K being different or the same for every stick. He just
//wants to know how many sticks of particular length L can he make using only two or only a
//single stick(s) he has in stock. Two sticks or Single stick used to make the stick of particular
//length L can not be used twice.

package St_1;

import java.util.Scanner;

public class Number_of_Sticks {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of sticks : ");
		int n = input.nextInt();
		System.out.println("Enter the length of sticks : ");
		int k = input.nextInt();
		int count = 0;
		int []arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i]=input.nextInt();
		}
		
		for(int i = 0; i<n; i++) {
			for(int j = i; j < n ; j++) {
				if(arr[i]+arr[j]==k) {
					count++;
				}	
			}
		}
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0; j < n ;j++) {
				if((arr[i]==0 && arr[i]==k) || (arr[j]==0 && arr[i]==k)) {
					count--;
				}
			}
		}
		
		for(int i = 0 ; i < n ; i++) {
			if(arr[i]==k) {
				count++;
			}	
		}
		
		System.out.println(count);
		
	}
}
