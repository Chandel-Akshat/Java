package String;
import java.util.*;
import java.lang.*;

//Write a Java program to replace a particular character in a string with another
//character.


import java.util.Scanner;

public class Replace_aparticular_character {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = input.nextLine();
		System.out.println("Enter the charcter you want to replace for");
		char a = input.next().charAt(0);
		System.out.println("Enter the charcter you want to replace with");
		char b = input.next().charAt(0);
		String ans =str.replace(a, b);
		System.out.println("The replaced string is : "+ans);
	}
}
