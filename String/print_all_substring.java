package String;

import java.util.Scanner;

public class print_all_substring {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = input.nextLine();
		int n = str.length();
		for(int i = 0 ; i < n ; i++){
			for(int j = i ; j < n ;j++){
				for(int k = i ; k<=j;k++){
					System.out.print(str.charAt(k));
				}
				System.out.println();	
			}
			
		}
	}
}
