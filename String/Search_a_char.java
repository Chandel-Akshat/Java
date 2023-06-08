package String;



//Write a Java program to find the index of a particular character in a string.
//Write a Java program to check if a string contains a particular character.



import java.util.Scanner;
import java.lang.*;
import java.util.*;

public class Search_a_char {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter the string : ");
			String str = input.nextLine();
			System.out.println("Enter the charcter you want to search for");
			String a = input.next();
			int count  = 0;  
			System.out.print("The index value where "+a+" is present :");
			for(int i = 0 ; i<str.length() ; i++) {
				
				if(str.charAt(i)==a.charAt(0)) {
					System.out.print(+i+"    ");
					
					count++;
				}
			}
			System.out.println("no. of time it occured : "+count);
		}
	}
}
