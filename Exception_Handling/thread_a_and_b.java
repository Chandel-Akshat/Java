package Exception_Handling;
import java.util.*;
import java.lang.*;

class Thread_a extends Thread{
	public void run() {
		System.out.println("Thread A");
		for(int i = 1 ; i <=10 ; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println("");
	}
}

class Thread_b extends Thread{
	public void run() {
		System.out.println("Thread B");
			for(int i = 1 ; i <=10 ; i++) {
				if(i%2!=0) {
					System.out.print(i+" ");
				}
			}
	}
}



public class thread_a_and_b {
	public static void main(String[] args) {
		Thread_a a=new Thread_a();
		a.setName("Thread A");
		a.start();
		
		
		try {
			a.join();
			System.out.println(Thread.currentThread().getName()+" is finshed");
			
		}
		catch(Exception e) {
			System.out.println("The Exception is"+e);
			
		}
		Thread_b b = new Thread_b();
		
		b.start();
		
		
	}
}
