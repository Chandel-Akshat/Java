package practice;

import java.util.Scanner;

public class Restaurant_customer_service {
	public static void main(String []args ) {
		Scanner input = new Scanner(System.in);
		System.out.println("The menu is as followed:");
		System.out.println("Menu 1:- Dal Makhani for Rs.100");
		System.out.println("Menu 2:- Mix Veg. for Rs.200");
		System.out.println("Menu 3:- Kadhai Paneer for Rs.300");
		System.out.println("Menu 4:- Veg. Biryani for Rs.400");
		System.out.println("Menu 5:- Butter Chicken for Rs.500");
		System.out.println("Menu 6:- Shahi Paneer for Rs.600");
		System.out.println("Enter the Dish you want to select");
		int total_bill = 0;
		
		
//-----------------------------USING FOR LOOP------------------------------------
		boolean flag=true;
		for(int i = 0 ; flag ; i++ ) {
			int dish_ordered = input.nextInt();
			if(dish_ordered == 0) {
				flag = false;
			}
			else if(dish_ordered == 1) {
				total_bill+=100;
			}
			else if(dish_ordered == 2) {
				total_bill+=200;
			}
			else if(dish_ordered == 3) {
				total_bill+=300;
			}
			else if(dish_ordered == 4) {
				total_bill+=400;
			}
			else if(dish_ordered == 5) {
				total_bill+=500;
			}
			else if(dish_ordered == 6) {
				total_bill+=600;
			}
			else if (dish_ordered >=7){
				System.out.println("You ordered " + dish_ordered+" that's INVALID dish thats not in the menu");
			}
	}
		
		
//-------------------------------------USING WHILE LOOP------------------------------------
//		int dish_ordered = input.nextInt();
//		while(dish_ordered!=0) {
//			switch(dish_ordered) {
//			case 1 :{
//				total_bill+=100;
//				break;
//			}
//			case 2:{
//				total_bill+=200;
//				break;
//			}
//			case 3:{
//				total_bill+=300;
//				break;
//			}
//			case 4:{
//				total_bill+=400;
//				break;
//			}
//			case 5:{
//				total_bill+=500;
//				break;
//			}
//			case 6:{
//				total_bill+=600;
//				break;
//			}
//			default:{
//				System.out.println("You ordered " + dish_ordered+" that's INVALID dish thats not in the menu");
//			}
//			
//		}
//		dish_ordered = input.nextInt();
//	}
		
		
//----------------------------------USING DO-WHILE LOOP------------------------------------
		
		System.out.println("The amount of total bill is: "+total_bill);
	}
}
