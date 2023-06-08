package St_1;

import java.util.Scanner;



public class Smith_Number {
	public static int sum2(int n) {
		int sum = 0;
		while(n>0) {
			int rem = n%10;
			sum+=rem;
		n/=10;
		}
		return sum;
	}
	
	public static  int prime_factor(int n) {
		int ans =0;
		for(int  i = 2; i<=n; i++) {
			while(n%i==0) {
			ans+=sum2(i);
			n/=i;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while(t>0) {
			int n = input.nextInt();
			int ans1=sum2(n);		
			int ans2 =prime_factor(n);
			
//			System.out.println(sum2(n)+" "+prime_factor(n));
			if(ans1 == ans2) {
				System.out.println("Is Smith Number");
			}
			else {
				System.out.println("Not a Smith Number");
			}
			t--;
			
		}
	}
}
