package practice;

import java.util.Scanner;

public class Sum_of_string {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string you want to claculate the sum: ");
		String a = input.nextLine();
		int sum = 0 ; 
		int ans = 0;
		for(int i = 0 ; i < a.length() ; i++) {
			if(a.charAt(i)>=48 &&a.charAt(i)<=57) {
				sum+=a.charAt(i)-48;
				ans+=sum;
			}
		}
		if(ans==0) {
			System.out.println("Enter a valid string with integer");
		}
		else {
			System.out.println("Sum : "+ans);
		}
	}
}
