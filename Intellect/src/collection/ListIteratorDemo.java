package collection;
import java.util.*;
public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add("Lopa");
		l.add("Liki");
		l.add("Lipi");
		l.add("Lity");
		System.out.println("Set of input elements are:" +l);
		
		ListIterator itr=l.listIterator();
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			if(s.equals("Liki"))
			{
				itr.remove();
			}
			else if(s.equals("Lipi"))
			{
				itr.add("Nirmal");
			}
			else if(s.equals("Lity"))
			{
				itr.add("Kamal");
			}
			
		}
		System.out.println("Result List of elements are:" +l);
   }
}
