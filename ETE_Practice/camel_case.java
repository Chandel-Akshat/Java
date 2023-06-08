package ETE_Practice;

import java.util.Scanner;

public class camel_case {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String ans="";
		for(int i = 0;i<str.length();i++) {
			char a = str.charAt(i);
			if(Character.isUpperCase(a)) {
				System.out.print(Character.toLowerCase(a));
				ans+=Character.toLowerCase(a);
			}
			else {
				System.out.print(Character.toUpperCase(a));
				ans+=Character.toUpperCase(a);
			}
		}
		System.out.printf("\nOrignal : %s \nConverted : %s",str,ans);
	}
}
