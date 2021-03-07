package exception;
import java.util.Scanner;

public class PrintStackTraceExample {
	public static void main(String args[])
	{
		int a,b,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input two integers:");
		a=sc.nextInt();
		b=sc.nextInt();
		try
		{
			res=a/b;
			System.out.println(res);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
