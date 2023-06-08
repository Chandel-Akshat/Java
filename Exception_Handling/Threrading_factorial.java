package Exception_Handling;
import java.util.*;
import java.lang.*;


class Factorial extends Thread{
	public void run() {
		for(int  i = 1 ; i < 100 ; i++) {
			for(int j = i ; j< 100;j++) {
				for(int k = i; k<=j;k++) {
					System.out.println(i*j+",");
				}
			}
		}
	}
}
public class Threrading_factorial {
	public static void main(String[] args) {
		Thread Main =Thread.currentThread()
;		Main.setDaemon(true);
		Factorial t = new Factorial();
		try {
			System.out.println("Thread is executing : ");
			Main.wait();
			t.start();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
