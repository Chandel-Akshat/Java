package practice;

import java.util.Scanner;
import java.lang.*;

public class concatenate_string_builder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder str = new StringBuilder(input.nextLine());
		StringBuilder str2 = new StringBuilder(input.nextLine());
		StringBuilder str3 = str.append(str2);
		System.out.println(str3.toString());
	}
}
