package ETE_Practice;

import java.util.Scanner;

public class employee_exist_or_not {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		String arr[] = new String[n];
		for(int i=0;i<n;i++) {
			arr[i]=input.nextLine();
		}
		int m = input.nextInt();
		if(m<=n) {
			String a = arr[m-1];
			char x = a.charAt(2);
			String b =a.substring(3,a.length());
			System.out.println(Character.toUpperCase(x)+""+b);
		}
		else {
			System.out.print("employee not found");
		}
	}
}
