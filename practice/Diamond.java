package practice;

import java.util.Scanner;

public class Diamond {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter the no.  of rows  you want : ");
			int n = input.nextInt();
			System.out.println("Diamond pattern is as followed : ");
			 Diamond_orignal(n);
			 System.out.println();
			 System.out.println("Revesre of Diamond is : ");
			 Diamond_conjugate(n);
		}
		
	}

static void Diamond_orignal(int n) {
	for(int row = 0 ; row < 2*n ; row++) {
		int star = row > n ? 2*n-row : row;
		int space  = n - star;
		for(int col = 0 ; col<space; col++) {
			System.out.print(" ");
		}
		for(int col = 0 ; col<star ; col++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}

static void Diamond_conjugate(int n) {
	for(int row = 0 ; row < 2*n+1 ; row++) {
		
		int star = row > n ? 2*n-row : row;
		int space  = n - star;
		for(int col = 0 ; col<space; col++) {
			System.out.print("*");
		}
		for(int col = 0 ; col<star ; col++) {
			System.out.print(" ");
		}
		for(int col = 0 ; col<star; col++) {
			System.out.print(" ");
		}
		for(int col = 0 ; col<space ; col++) {
			System.out.print("*");
		}
			System.out.print("\n");
		
	}
	
}




}
