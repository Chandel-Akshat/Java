package St_practice;
import java.util.*;

public class Find_Triplet {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = input.nextInt();
		int []arr = new int[n];
		System.out.println("Enter the elements of the array : ");
		for(int i = 0 ; i< n ; i++) {
			arr[i]=input.nextInt();
		}
		int count = 0;
		for (int  i = 0 ; i< n -2;  i++) {
			for(int j = i+1;j<n-1;j++) {
				for(int k = j+1; k<n;k++) {
					if((arr[i]+arr[j]==arr[k]) || (arr[i]+arr[k]==arr[j]) ||(arr[k]+arr[j]==arr[i])) {
						count++;
					}
				}
			}
		}
		System.out.println("Total possible triplets in tha array  is :");
		System.out.println(count);
	}
}
