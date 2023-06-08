package ETE_Practice;

import java.util.Scanner;

public class remove_pucnct {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String ans=str.replaceAll("\\p{Punct}","");
		System.out.print(ans);
	}
}
