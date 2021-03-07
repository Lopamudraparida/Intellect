package collection;
import java.util.*;
public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		System.out.println(v.capacity()); //Default Initial Capacity of Vector=10
		for(int i=1;i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v.capacity());
		v.addElement("Intellect");
		System.out.println(v.capacity());
		System.out.println(v);
		}

}
