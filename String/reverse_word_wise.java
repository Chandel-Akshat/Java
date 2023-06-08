package String;

import java.util.Scanner;

public class reverse_word_wise {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = input.nextLine();
		int n = str.length()-1;
		int j=n;
		String answer ="";
		for(int i = n ; i>=0 ;i--){
			String ans="";
			
			if(str.charAt(i)==' '){
				ans=str.substring(i+1,j+1);
				j=i-1;
				answer+=ans;
				answer+=" ";
			}
			
		}
		for(int i = 0 ; i<n ;i++){
			if(str.charAt(i)==' '){
				answer+=str.substring(0,i);
				break;
			}
		}
		System.out.println(answer);
		char[]arr = str.toCharArray();
	}
}
