package practice;
import java.util.Scanner;

public class season {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the monthe you want to checkk for seaon in integer");
		int month=input.nextInt();
		if(month>=1 && month<=3) {
			System.out.println("Winter");
		}
		else if(month>3 && month<=6) {
			System.out.println("Summer");
		}
		else if(month>6 && month<=9) {
			System.out.println("Winter");
		}
		else if(month>=9 && month<=12) {
			System.out.println("Winter");
		}
		else {
			System.out.println("Invalid!!!! input enter the value again");
		}
	}
}
