package collection;
import java.util.*;
public class EnumerationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		System.out.println(v.capacity());
		for(int i=0;i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);
        Enumeration e=v.elements();
        while(e.hasMoreElements())
        {
        	Integer I=(Integer)e.nextElement();
        	if(I%2==0)
        	{
        		System.out.println(I);
        	}
        	//System.out.println(v);
        
        }
	}

}
