package practice;

import java.util.Scanner;

public class even_or_odd {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number you want to check for odd or even");
		int num=input.nextInt();
		if(num%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}
}
