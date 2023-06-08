package ETE_Practice;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
import java.lang.*;


public class reverse_String_with_all_cases {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		StringTokenizer a= new StringTokenizer(str);
		String ans1="";
		String ans2="";
		String ans3="";
		String ans4="";
		while(a.hasMoreTokens()) {
			StringBuilder b = new StringBuilder(a.nextToken());
			ans1=b+" "+ans1;
			ans2+=b.reverse()+" ";
			ans3=b+" "+ans3;
		}
		System.out.println("Reverse word wise (i.e last word of sentence become first word and vicaa versa) : ");
		System.out.println(ans1);
		System.out.println("Revserse particular word (i.e revrse 1st word at its place) : )");
		System.out.println(ans2);
		System.out.println("Revrse the whole sentence : ");
		System.out.println(ans3);
	}
}
