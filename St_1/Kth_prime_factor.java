package St_1;
import java.util.Arrays;
import java.util.Scanner;

public class Kth_prime_factor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int [] arr = new int[100];
		int j = 0;
		for(int  i = 2; i<=n; i++) {
			while(n%i==0) {
			arr[j] = i;
			j++;
			n/=i;
			}
		}
		System.out.println(Arrays.toString(arr));
		if(arr[k-1]==0) {
			System.out.println(-1);
			
		}
		else {
			System.out.println(arr[k-1]);
			
		}
	}
}
