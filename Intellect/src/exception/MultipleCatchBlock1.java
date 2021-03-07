package exception;

public class MultipleCatchBlock1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   try
		   {
			   int a[]=new int[5];
			   //a[5]=30/5;
			   int s=30/0;
			   System.out.println(s);
		   }
		   catch(ArithmeticException e)
		   {
			   System.out.println(e);
		   }
		   catch(ArrayIndexOutOfBoundsException e)
		   {
			   System.out.println(e);
		   }
		   catch(StringIndexOutOfBoundsException e)
		   {
			   System.out.println(e);
		   }
		   catch(Exception e)
		   {
			   System.out.println(e);
		   }
	   }

	}


