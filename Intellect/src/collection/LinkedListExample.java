package collection;
import java.util.*;
public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		
		l.add("Lopamudra"); //[Lopamudra]
		l.add("Parida");    //[Lopamudra,Parida]
		l.add(null);        //[Lopamudra,Parida,null]
		l.add(2020);        //[Lopamudra,Parida,null,2020]
		l.set(0, "Software");  //[Software,Parida,null,2020]
		l.add(0, "developer");  //[developer,Software,Parida,null,2020]
		l.addFirst("Intellect"); //[Intellect,developer,Software,Parida,null,2020]
		l.removeLast();          //[Intellect,developer,Software,Parida,null]
		
        System.out.println(l);   //[Intellect,developer,Software,Parida,null]

	}

}
