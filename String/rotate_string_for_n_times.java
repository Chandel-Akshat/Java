//Given a string and an integer n, shift and rotate the given string by n characters in right.
//Note : Assume n is always less than input string length.
//Input format :
//Line 1 : Input string
//Line 2 : Integer n
//Output Format :
//Rotated string
//Sample Input :
//CodingNinjas
//3
//Sample Output :
//jasCodingNin

package String;

import java.util.Scanner;

public class rotate_string_for_n_times {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter thge string : ");
		String str = input.nextLine();
		System.out.println("Enetr no. of times to rotate : ");
		int n = input.nextInt();
		char []arr=str.toCharArray();
		int temp = n;
		int len=str.length()-n;
		while(temp-->0) {
			System.out.print(arr[len]);
			len++;
		}
		for(int i = 0 ; i<str.length()-n;i++) {
			System.out.print(arr[i]);
		}
	}
}
