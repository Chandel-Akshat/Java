package Exception_Handling;
import java.util.*;
import java.lang.*;

class Threading1 extends Thread{
	public void run() {
		System.out.println(Thread.activeCount());
	}
	int a ,b;
	Threading1(int a ,int b){
		this.a=a;
		this.b=b;
	}
	int addition() {
		return a+b;
	}
}



public class Threading_extend {
	public static void main(String[] args) {
		Threading1 t =new Threading1(3,4);
		System.out.println(Thread.activeCount());
		t.start();
		System.out.println(Thread.activeCount());
		System.out.println(t.addition());
		
		System.out.println(Thread.activeCount());
		
}
}