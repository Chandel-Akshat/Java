package St_practice;
import java.util.*;

public class No_of_Stick {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of sticks : ");
		int n = input.nextInt();
		System.out.println("Enter the size of equivalent stick : ");
		int k = input.nextInt();
		int []arr = new int[n];
		System.out.println("Enter the length of "+n+" sticks : ");
		for(int i = 0; i<n; i++) {
			arr[i]=input.nextInt();
		}
		int count = 0;
		for(int i = 0; i<n-1; i++) {
			if(arr[i]==k) {
				count++;
				arr[i]=0;
			}
			for(int j =0; j<n;j++) {
				if(arr[i]+arr[j]==k) {
					count++;
					arr[i]=0;
					arr[j]=0;
				}
			}
		}
		System.out.println("Number of cases to meet stick length "+n+" is : ");
		System.out.println(count);
	}
}
