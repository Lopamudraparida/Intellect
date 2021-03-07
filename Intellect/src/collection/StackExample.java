package collection;
import java.util.*;
public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.push("Intellect");
		s.push("iGTB");
		s.push("Mumbai");
		System.out.println(s);
		System.out.println(s.search("iGTB"));
		System.out.println(s.search("Lopamudra"));

	}

}
