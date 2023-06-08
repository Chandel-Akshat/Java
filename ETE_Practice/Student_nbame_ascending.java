package ETE_Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Student_nbame_ascending {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		ArrayList<String> al = new ArrayList<String>();
		for(int i = 0;i<n;i++) {
			String a=input.next();
			al.add(a);
		}
		Collections.sort(al);
		for(int i=0;i<n;i++) {
		System.out.println(al);
	}
	}
}
