package exception;

public class GetMessage {
	public static void main(String args[])
	{
		try
		{
			int a=35/0;
			System.out.println(a);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Intellect Design Arena Ltd.");
	}
}
