package practice;
import java.util.*;
import java.lang.*;

import java.util.Scanner;

public class concatinate_using_tokenizer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringTokenizer str = new StringTokenizer(input.nextLine());
		String delimeter = input.nextLine();
		StringBuilder s = new StringBuilder();
		while(str.hasMoreTokens()) {
			s.append(str.nextToken());
			s.append(delimeter);
		}
		System.out.println(s);
	}
}
