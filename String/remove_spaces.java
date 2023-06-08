package String;
//Write a Java program to remove all whitespace from a string.
import java.util.Scanner;

public class remove_spaces {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = input.nextLine();
		String ans = "";
		for(int i = 0 ; i < str.length() ; i++) {
			char a = str.charAt(i);
			if(a!=' ') {
//				System.out.print(str.charAt(i));
				ans+=a;
			}
		}
		
		System.out.println("String after removing spaces : "+ans);
	}
}
