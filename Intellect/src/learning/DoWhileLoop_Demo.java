package learning;
import java.util.Scanner;
public class DoWhileLoop_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=0;
		do {
			System.out.println("Enter a number:");
			num=sc.nextInt();
			
			}
		while(num!=4);
		System.out.println("Executed Successfully.");
		
		//By using While Loop
		/*while(num!=5)
		{
			System.out.println("Enter a number");
			num=sc.nextInt();
		}
		System.out.println("Got 5!!!!!!!!!!!!!!!!!");*/
	}
}