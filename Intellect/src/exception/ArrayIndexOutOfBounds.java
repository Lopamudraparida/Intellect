package exception;

public class ArrayIndexOutOfBounds {
	public static void main(String args[]) {
	try{
	String company[]= {"INTELLECT","IGTB"};
	for(int i=5;i<=10;i++)
		{
			System.out.println(company[i]);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
		System.out.println("Found an Array Index Out of Bounds Exception.");
	}
	
}
}
