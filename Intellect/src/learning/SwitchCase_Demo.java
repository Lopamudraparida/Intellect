package learning;
import java.util.*;
public class SwitchCase_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   System.out.println("Please enter a command: ");
	        String text = sc.nextLine();

	        switch (text) {
	        case "start":
	            System.out.println("Program started!");
	            break;
	            

	        case "stop":
	            System.out.println("Program stopped.");
	            break;
	           

	        default:
	            System.out.println("Command not recognized");
	        }
	}

}
