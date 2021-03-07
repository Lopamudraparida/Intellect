package exception;

public class StringException {
	public static void main(String args[])
	{	
		try {
		String s="My name is Lopamudra Parida";
		char c=s.charAt(30);
		System.out.println(c);
	    }
		catch(Exception e)//StringIndexOutOfBoundsException
		{
			System.out.println(e);
			System.out.println("Now program is working");
		}
		//finally {
			//System.out.println("Program........");
		//}

}
}
