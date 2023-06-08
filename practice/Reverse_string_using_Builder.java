package practice;
import java.lang.*;
import java.util.Scanner;

public class Reverse_string_using_Builder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder str = new StringBuilder(input.nextLine());
		System.out.println(str.reverse());
		
	}
}
