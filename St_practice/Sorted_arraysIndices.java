package St_practice;
import java.util.*;
public class Sorted_arraysIndices {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int []arr = new int[n];
		System.out.println("Enter the elements of the array : ");
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int arr1[]= new int[n];
		for(int i = 0 ; i < n; i++) {
			arr1[i] = arr[i];
		}
		Arrays.sort(arr1);
		
		int arr2[]= new int[n];
		for(int i =0 ; i<n; i++) {
			arr2[i]=arr1[n-1-i];
		}
		System.out.println("Sorted array with unsorted indices is : ");
		for(int i = 0 ; i< n ; i++) {
			for(int j = 0 ; j< n ; j++) {
				if(arr2[i]==arr[j]) {
					System.out.print(j+" ");
					arr[j]=-222;
				}
			}
		}
	}
}
