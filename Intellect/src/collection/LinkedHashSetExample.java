package collection;
import java.util.*;
public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      LinkedHashSet<String> set=new LinkedHashSet();  
          set.add("Intellect");    
          set.add("iGTB");    
          set.add("Mumbai");   
          set.add("Chennai");  
          set.add("Pune");  
          Iterator<String> i=set.iterator();  
          while(i.hasNext())  
          {  
          System.out.println(i.next());  
          }  

	}

}
