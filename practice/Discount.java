package practice;

import java.util.Scanner;

public class Discount {
	public static void main(String args[]) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the amount you want to check for discount:");
		int amount = input.nextInt();
		float discount=0;
		if (amount<=25000) {
			discount=(amount*(5f/100));
			System.out.println("Discount thata will be offered will be 5% and the discount value is: "+discount );
		}
		else if(amount>2500 && amount<=5000) {
			discount=(amount*(20f/100));
			System.out.println("Discount thata will be offered will be 20% and the discount value is: "+discount );
		}
		else if(amount>5000) {
			discount=(amount*(40f/100));
			System.out.println("Discount thata will be offered will be 40% and the discount value is: "+discount );
		}
	}
}
