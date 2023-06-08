package ETE_Practice;

import java.util.Scanner;

public class longest_distinct_substring {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String str= input.nextLine();
		int value = str.length()-1;
		for(int i = 0 ; i < str.length()-1 ; i++) {
			for(int j = i+1 ; j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					value=j;
					break;
				}
			}
			
		}
		System.out.print(str.substring(0,value)+" : "+value);
		
	}
}
