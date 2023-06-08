package practice;

import java.util.Scanner;

public class sum_of_1and2nd_digit_of_5dig_num {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 5 digit number: ");
		int num = input.nextInt();
		int first = num/10000;
		int second_last = (num/10)%10;
		int sum=first+second_last;
		System.out.println("The sum of the first and second last digit is: "+sum);
	}
}
