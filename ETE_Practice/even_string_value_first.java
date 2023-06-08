package ETE_Practice;

import java.util.Scanner;

public class even_string_value_first {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str= input.nextLine();
		for(int i =0; i< str.length();i++) {
			if(i%2==0) {
				System.out.print(str.charAt(i));
			}
		}
		for(int i =0; i< str.length();i++) {
			if(i%2!=0) {
				System.out.print(str.charAt(i));
			}
		}
		
	}
}
