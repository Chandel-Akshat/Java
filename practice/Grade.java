package practice;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the marks you want to convert into grades");
		int marks=input.nextInt();
		if(marks>=85&& marks<=100) {
			System.out.println("Grade A");
		}
		else if(marks>=75 && marks<85) {
			System.out.println("Grade B");
		}
		else if(marks>=65 && marks<75) {
			System.out.println("Grade C");
		}
		else if(marks<65) {
			System.out.println("Grade D");
		}
		
	}
}
