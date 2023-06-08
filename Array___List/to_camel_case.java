package Array___List;

import java.util.Scanner;
import java.util.*;
import java.lang.*;

public class to_camel_case {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		String str = input.nextLine();
		StringTokenizer st = new StringTokenizer(str," ");
		while(st.hasMoreTokens()) {
			String ans = st.nextToken();
			char a = ans.charAt(0);
			System.out.print(Character.toUpperCase(a));
			for(int i = 1 ; i <ans.length();i++) {
				System.out.print(ans.charAt(i));
			}
		}
	}
}
