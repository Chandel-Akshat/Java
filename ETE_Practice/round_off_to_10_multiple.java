package ETE_Practice;

import java.util.Scanner;

public class round_off_to_10_multiple {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n = input.nextInt();
		int a = n%10;
		if(a<=5) {
			n=n-a;
		}
		else {
			int b = 10-a;
			n=n+b;
		}
		System.out.println("Answer will be : "+n);
		
	}
}
