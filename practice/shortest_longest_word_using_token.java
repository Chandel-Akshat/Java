package practice;
import java.util.*;

public class shortest_longest_word_using_token {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringTokenizer str = new StringTokenizer(input.nextLine());
		int max=Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		String ans=new String();
		String ans1=new String();
		while(str.hasMoreTokens()) {
			String temp = str.nextToken();
			if(temp.length()>max) {
				max=temp.length();
				ans=temp;
			}
			else if(temp.length()<min) {
				min=temp.length();
				ans1=temp;
			}
		}
		System.out.println("Longest word : " + ans);

		System.out.println("Shortest word : " + ans1);
	}
}
