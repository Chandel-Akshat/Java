package String;

import java.util.Scanner;

public class remove_consecutive_duplicates {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Eneter the string : ");
		String str = input.nextLine();
		String ans = "";
		char a = str.charAt(0);
		ans+=a;
		int arr[]=new int[1000];
		String ab = "";
		int count =0;
		for(int i= 0 ; i < str.length() ; i++) {
			int j =0 ;
			if(str.charAt(i)==a) {
				count++;
				continue;
			}
			else {
				ans+=str.charAt(i);
				a=str.charAt(i);
				arr[j]=count;
				ab+=count;
				count=1;
				j++;
			}
		}
		int sum=0;
		char c = str.charAt(str.length()-1);
		for(int i = str.length()-1; i>=0;i--) {
			if(str.charAt(i)!=c) {
				ab+=sum;
				break;
			}
			else {
				sum++;
			}
		}
		for(int i = 0 ; i<ans.length();i++) {
			System.out.print(ans.charAt(i)+""+ab.charAt(i));
		}
	}
}
