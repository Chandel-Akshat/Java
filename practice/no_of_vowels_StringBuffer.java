package practice;
import java.lang.*;
import java.util.Scanner;

public class no_of_vowels_StringBuffer {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		StringBuffer str = new StringBuffer(input.nextLine());
		int count =0;
		for(int i = 0 ; i<str.length();i++) {
			if(str.charAt(i)=='i'|| str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A'
					|| str.charAt(i)=='I' || str.charAt(i)=='E' || str.charAt(i)=='O' ||str.charAt(i)=='U') {
				count++;
			}
		}
		System.out.println(count);
	}
}
