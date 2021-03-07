package exception;

public class ToStringExample {
	public static void main(String args[])
	{
		try
		{
			int a=10/0;
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}

}
