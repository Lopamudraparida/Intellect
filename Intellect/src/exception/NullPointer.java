package exception;

public class NullPointer {
	public static void main(String args[])
	{
		try
		{
			String s=null;
			System.out.println(s.charAt(6));
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Found NUll Pointer Exception.");
		}
	}

}
