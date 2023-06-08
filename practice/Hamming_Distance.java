package practice;

import java.util.Scanner;

public class Hamming_Distance {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the first number : ");
		int n = input.nextInt();
		System.out.println("enter the second number : ");
		int m = input.nextInt();
		int x = n ^ m;
		int i = 0;
		while(x>0) {
			i=i+x&1;
			x>>=1;
		}
		System.out.println("The hamming distance will be : "+i);
	}
}
