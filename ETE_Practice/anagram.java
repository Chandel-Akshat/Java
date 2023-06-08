package ETE_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		String str2 = input.next();
		String a1=str.toLowerCase();
		String b1 =str2.toLowerCase();
		char[]a = a1.toCharArray();
		char[]b = b1.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		boolean flag = true;
		if(a.length!=b.length) {
			flag=false;
		}
		for(int  i = 0 ; i< a.length ; i++) {
			if(a[i]!=b[i]) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not an anagram");
		}
		System.out.println(Arrays.equals(a, b));
	}
}
