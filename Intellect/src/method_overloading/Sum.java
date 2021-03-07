package method_overloading;

public class Sum {
	public int Sum(int x,int y)
	{
		return(x+y);
	}
	public int Sum(int x,int y,int z)   //overloaded sum,but parameter is different
	{
		return(x+y+z);
	}
	public double Sum(long x,long y)  //overloaded sum,but parameter n datatype are different
	{
		return(x+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s=new Sum();
		System.out.println(s.Sum(10, 40));

		System.out.println(s.Sum(10,50,40));

		System.out.println(s.Sum(1463,25540));
		
	}


}
