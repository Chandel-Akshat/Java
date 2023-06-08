package ETE_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class sort_name_register {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		String str[]=new String[n];
		for(int i = 0;i<n;i++) {
			str[i]=input.nextLine();
		}
		Arrays.sort(str);
		for(int i = 0;i<n;i++) {
			System.out.println(str[i]);
		}
	}
}
