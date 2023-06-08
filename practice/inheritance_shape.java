package practice;

import java.util.Scanner;

public class inheritance_shape {
	public static void main(String [] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter the two sides : ");
			int x = input.nextInt();
			int y = input.nextInt();
			
			Rectangle r1 = new Rectangle(x,y);
			System.out.println("Area of rectangle : "+r1.getArea());
			Triangle1 t1= new Triangle1(x,y);
			System.out.println("Area of triangle : "+t1.getArea());
		}
	}	
}
class Shape{

	int getArea(int a,int b) {
		return a * b;
	}
}
class Rectangle extends Shape{
	int length , breadth;
	 Rectangle(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	int getArea() {
		int ans = super.getArea(length,breadth);
		return ans;
	}
}
class Triangle1 extends Shape{
	int base,height;
	Triangle1(int base, int height){
		this.base=base;
		this.height=height;
	}
	int getArea() {
		int ans = super.getArea(base,height);
		return ans/2;
	}
}