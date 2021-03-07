package collection;
import java.util.*;
public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Queue<String> q=new LinkedList<String>();  
          q.add("One");    
          q.add("Two");    
          q.add("Three");   
          q.add("Four");  
          q.add("Five");  
          Iterator<String> i=q.iterator();  
          while(i.hasNext())  
          {  
             System.out.println(i.next());  
          }  

	}

}
