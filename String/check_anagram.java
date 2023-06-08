package String;

import java.util.Scanner;

public class check_anagram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string 1: ");
		String s1 = input.nextLine();
		char[] arr1 =s1.toCharArray();
		System.out.println("Enter the string 2: ");
		String s2 = input.nextLine();
		int n = s1.length();
		int m = s2.length();
		char arr2[]=s2.toCharArray();
		int count = 0;
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j<m ; j++) {
				if(arr2[j]!=0 && arr1[i]==arr2[j]) {
					count++;
					arr2[j]=0;
				}
			}
			
		}
		if(count==s1.length()) {
			System.out.println("It is an anagram");
		}
		else {
			System.out.println("Not a anagram");
		}
	}
}
