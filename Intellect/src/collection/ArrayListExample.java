package collection;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add("Lopamudra");
		a.add(21);
		a.add("Lopamudra");
		a.add(null);
		System.out.println(a); //[Lopamudra,21,Lopamudra,null]
		a.remove(2);
		System.out.println(a);//[Lopamudra,21,null]
		a.add(2,"Parida");
		a.add("Intellect");
		System.out.println(a); //[Lopamudra,21,Parida,null,Intellect]

	}

}

