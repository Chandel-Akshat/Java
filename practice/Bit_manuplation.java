package practice;

import java.util.Scanner;
import java.util.Arrays;

public class Bit_manuplation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number your want to check for : ");
		int num = input.nextInt();
		int count = 0;
		if (num==0) {
			System.out.println("Please enter a bit the ans is 0");
		}
			while(num>0) {
				int n = num%2;
				num/=2;
				count++;
				if(n==1) {
					System.out.println(count);
					break;
				}
			}
		
	}
}
