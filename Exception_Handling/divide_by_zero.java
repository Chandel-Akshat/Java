package Exception_Handling;
import java.util.*;
import java.lang.*;

public class divide_by_zero {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int ans=0;
		try {
			ans =a/b;
		}
		catch(ArithmeticException exp) {
			System.out.println(exp);
		}
		System.out.println(ans);
		
		
		
	}
}
