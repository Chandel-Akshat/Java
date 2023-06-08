package practice;
import java.util.*;
import java.util.Scanner;

public class Tokenize_string_print_in_next_line {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringTokenizer str = new StringTokenizer(input.nextLine());
		while(str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		}
	}
}
