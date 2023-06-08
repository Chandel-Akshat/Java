
package St_practice;
import java.util.Scanner;
public class Smith_no {
	
	public static int Number_break(int n) {
		int sum = 0;
		while(n>0) {
			int rem = n%10;
			sum+=rem;
			n/=10;
		}
		return sum;
	}
	
	public static int Prime_factor(int n) {
		int ans=0;
		for(int i = 2; i <=n;i++) {
			while(n%i==0) {
				ans+=Number_break(i);
				n/=i;
			}
		}
		return ans;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while(t-->0) {
			System.out.println("Enter the number youtu want to check for smith or not : ");
			int n = input.nextInt();
			int ans1 = Number_break(n);
			int ans2 = Prime_factor(n);
			if(ans1==ans2) {
				System.out.println(n+" is a SMITH NUMBER");
			}
			else{
				System.out.println(n+" is not a SMITH NUMBER");
			}
			
		}
	}
}
