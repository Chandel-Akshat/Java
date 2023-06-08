package String;

import java.util.Scanner;

public class reverse_string {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = input.nextLine();
		String rev = "";
		for(int i = str.length()-1 ; i>=0 ; i--) {
			rev+=str.charAt(i);
		}
		System.out.println("Reversed string will be : ");
		System.out.println(rev);
	}
}
