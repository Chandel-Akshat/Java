package Array___List;
import java.util.*;

public class largest_and_smallest {
	public static void main(String[] args) {
	Scanner input  = new Scanner(System.in);
	ArrayList<Integer> al=new ArrayList<Integer>();
	int n = input.nextInt();
	for(int i=0 ;i<n;i++) {
		int a = input.nextInt();
		al.add(a);
	}
	int largest = Collections.max(al);
	int smallest = Collections.min(al);
	System.out.println("Largest : "+largest);
	System.out.println("Smallest : "+smallest);	
	Set <Integer> ans = new HashSet<Integer>(al);
	System.out.println(ans);
	ArrayList<Integer> sec = new ArrayList<Integer>(ans);
	System.out.println(sec);
	Collections.sort(sec);
	System.out.println("Second Largest : "+sec.get(sec.size()-2));
	}
}
