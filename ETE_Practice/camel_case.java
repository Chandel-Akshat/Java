package ETE_Practice;
//Problem Statement
//You are given provided with a string S and you have to reverse case i.e. all lower-cased characters
//should be upper-cased and all upper-cased character should be lower-cased.
//Input Format
//The first line of the input contains a string S.
//Output format
//Print a string after reversing the case.
//Constraints
//1 <= S.length <=1000
//Time Limit
//1 second
//Example
//Sample Input
//Happy Birthday
//Sample Output
//hAPPY bIRTHDAY
import java.util.Scanner;

public class camel_case {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String ans="";
		for(int i = 0;i<str.length();i++) {
			char a = str.charAt(i);
			if(Character.isUpperCase(a)) {
				ans+=Character.toLowerCase(a);
			}
			else {
				ans+=Character.toUpperCase(a);
			}
		}
		System.out.printf("\nOrignal : %s \nConverted : %s",str,ans);
	}
}
