package St_practice;
import java.util.*;
public class Highest_Peak {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of peaks he travelled : ");
		int n = input.nextInt();
		System.out.println("Enter the height of "+n+" peaks : ");
		int arr[]= new int[n];
		
		for(int i = 0 ; i< n ; i++) {
			arr[i]=input.nextInt();
		}
		
		for(int i = 1 ; i< n -1; i++) {
			if((arr[i-1]<arr[i]) && (arr[i]>arr[i+1])) {
				System.out.println(arr[i]);
			}
			
		}
		if(arr[n-1]>arr[n-2]) {
			System.out.println(arr[n-1]);
		}
		
	}
}
