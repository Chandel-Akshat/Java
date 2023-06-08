package String;

import java.util.Scanner;

public class Check_palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = input.nextLine();
		int right = str.length()-1;
		int left = 0;
		boolean a = true;
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				a=false;
			}
			left++;
			right--;
		}
		if(a==true) {
			System.out.println("String "+str+" is a palindrome");
		}
		else if(a==false){
			System.out.println("String "+str+" is not a palindrome");
		}
	}
}
