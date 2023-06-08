package String;
import java.util.*;

import java.util.Scanner;

public class reverse_each_word {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = input.nextLine();
		int j = 0 ;
		for(int i = 0 ; i< str.length() ; i++) {
			
			if(str.charAt(i)==' ') {
				String ans= str.substring(j,i);
				for(int k = ans.length()-1 ; k>=0;k--) {
					System.out.print(ans.charAt(k));
				}
				System.out.print(' ');
				j=i+1;
			}
		}
		for(int i = str.length()-1; i>=0 ; i--) {
			if(str.charAt(i)==' ') {
				break;
			}
			else {
				System.out.print(str.charAt(i));
			}
		}
	}
}
