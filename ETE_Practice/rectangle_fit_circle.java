package ETE_Practice;

import java.util.Scanner;

public class rectangle_fit_circle {
	public static void main(String[] args) {
		Scanner input  =new Scanner(System.in);
		float a =input.nextInt();
		float b =input.nextInt();
		float c =input.nextInt();
		float a1=(float) Math.sqrt(a*a+b*b);
		float r1=c*c;
		if(r1>=a1) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
	}
}
