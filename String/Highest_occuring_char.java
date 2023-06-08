package String;

import java.util.Scanner;

public class Highest_occuring_char {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = input.nextLine();
		char a = '@';
		int count=0;
		for(int i = 0 ; i < str.length() ; i++) {
			int sum =0;
			for(int j = 0; j < str.length();j++) {
				if(str.charAt(i)==str.charAt(j)&& str.charAt(i)!=' ') {
					sum++;
				}
			}
			if(sum>count) {
				count=sum;
				a=str.charAt(i);
			}
		}
		System.out.println(count+" "+a);
	}
}
