package exception;
import java.util.Scanner;
public class TryCatchArithmetic {

	public static void main(String[] args) {
		int a,b,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input two integers:");
		a=sc.nextInt();
		b=sc.nextInt();
		try
		{
			res=a/b;
			System.out.println("Result="+res);
		}
		catch(Throwable e)
		{
			System.out.println(e);
			System.out.println("Found Arithmetic Exception!!");
		}
	}

}
