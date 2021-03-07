package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,    "Intellect");  //Put elements in Map  
		   map.put(2,    "iGTB");    
		   map.put(3,    "Goregaon");   
		   map.put(4,    "Mumbai");   
		   map.put(0,    "lopamudra");
		   
		   map.put(null, "Hey");
		   map.put(10,"");
		   String txt=map.get(4);
		   for(Map.Entry<Integer,String> m : map.entrySet())
		   {    
			  // int key=entry.getKey();
			  // String value=entry.getValue();
			   
			    System.out.println(m.getKey()+" "+m.getValue());    
		   }
	}

}
