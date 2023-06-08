package practice;

import java.util.Scanner;

public class part_of_substring {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string a : ");
		String a = input.nextLine();
		System.out.println("Enter string b : ");
		String b = input.nextLine();
		boolean flag=false;
		for(int i = 0 ; i < a.length();i++) {
			for(int j = 0 ; j < b.length() ; j++) {
				if(a.charAt(i)==b.charAt(j)) {
					flag=true;
				}
			}
		}
		if(flag==true) {
			System.out.println("b is substring of a");
		}
		else {
			System.out.println("b is not a substring of a");
		}
	}
}
