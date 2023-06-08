package String;

import java.util.Scanner;

public class first_non_repeated_char {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = input.nextLine();
		int n = str.length();
		boolean flag = true;
		for(int i = 0 ; i < n-1 ; i++) {
			for(int j = i+1 ; j < n ; j++) {
				if(str.charAt(i)==str.charAt(j)) {
					flag=false;
					break;
				}
				else {
					flag=true;
				}
			}
			if(flag==true) {
				System.out.println(str.charAt(i));
				break;
			}
			else {
				
			}
		}
	}
}
