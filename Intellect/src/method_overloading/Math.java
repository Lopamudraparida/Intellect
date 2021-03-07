package method_overloading;

public class Math {
	public void Math(int x,int y,int z)
	{
		int res=x*y*z;
		System.out.println(x*y*z);
	}
	public double Math(float m,float n)
	{
		return(m/n);
	}
	public long Math(int a,int b)
	{
		return(a%b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Math m=new Math();
			m.Math(12,4,1);
			m.Math(12, 3);
			m.Math(21, 2);
	}

}
