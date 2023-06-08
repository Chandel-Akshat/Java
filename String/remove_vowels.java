package String;

import java.util.Scanner;

public class remove_vowels {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = input.nextLine();
		String ans ="";
		for(int i = 0 ; i < str.length() ; i++) {
			if(str.charAt(i)!='a' && str.charAt(i)!='i' && str.charAt(i)!='e' && str.charAt(i)!='o' && str.charAt(i)!='u' && str.charAt(i)!='A' && str.charAt(i)!='I' && str.charAt(i)!='E' && str.charAt(i)!='O' && str.charAt(i)!='U') {
				ans+=str.charAt(i);
			}
		}
		System.out.println(ans);
	}
}
