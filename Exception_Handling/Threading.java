package Exception_Handling;
import java.util.*;
import java.lang.*;

class Running implements Runnable{
	public void run() {
		System.out.println(Thread.activeCount());
	}
	
}


public class Threading {
	public static void main(String[] args) {
		Running r = new Running();
		Thread t =new Thread(r);
		t.start();
		System.out.println(Thread.activeCount());
	}
}
