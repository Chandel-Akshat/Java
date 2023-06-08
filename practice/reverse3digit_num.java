package practice;

import java.util.Scanner;

public class reverse3digit_num {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a 3 digit number you want to revrse:");
		int num = input.nextInt();
		int first_digit = num/100;
		int second_digit = (num/10)%10;
		int third_digit = num%10;
		System.out.println("The revrse of the number is: "+third_digit+""+second_digit+""+first_digit);
	}
}
