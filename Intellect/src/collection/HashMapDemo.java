package collection;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
			   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
			   map.put(1,"Intellect");  //Put elements in Map  
			   map.put(2,"iGTB");    
			   map.put(3,"Goregaon");   
			   map.put(4,"Mumbai");   
			       
			   System.out.println("Iterating Hashmap...");  
			   for(Map.Entry m : map.entrySet()){    
			    System.out.println(m.getKey()+" "+m.getValue());    
			   }  
			} 

	}

