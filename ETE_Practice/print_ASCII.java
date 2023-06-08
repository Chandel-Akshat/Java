package ETE_Practice;

import java.util.Scanner;
import java.util.*;

public class print_ASCII {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int wc=1;
		for(int i = 0 ; i <str.length();i++) {
			if(str.charAt(i)==' ') {
				wc++;
			}
		}
		System.out.println("No. of words in sentence : "+wc);
		System.out.print(str.charAt(0)+"->"+(int)str.charAt(0)+" ");
		for(int i = 0 ; i <str.length();i++) {
			if(str.charAt(i)==' ') {
				System.out.print(str.charAt(i+1)+"->"+(int)str.charAt(i+1)+" ");
			}
		}
		System.out.println();
		for(int i = 0 ; i <str.length();i++) {
			if(str.charAt(i)!=' ') {
				System.out.print(str.charAt(i)+"->"+(int)str.charAt(i)+" ");
			}
		}
	}
}
