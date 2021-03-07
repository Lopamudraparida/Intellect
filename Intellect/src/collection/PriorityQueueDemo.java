package collection;
import java.util.*;
public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Lopamudra");  
		queue.add("Nirmal");  
		queue.add("Kamal");  
		queue.add("Pabitra");  
		queue.add("Jyotsna");  
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("iterating the queue elements:");  
		Iterator itr1=queue.iterator();  
		while(itr1.hasNext())
		{  
		System.out.println(itr1.next());  
		}  
		queue.remove();  
		queue.poll();  
		
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext())
		{  
		  System.out.println(itr2.next());  
		}  

	}

}
