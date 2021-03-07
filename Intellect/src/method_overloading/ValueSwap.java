package method_overloading;


public class ValueSwap {
	public void without_var_swap(int x,int y)
	{
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x+"  "+y);
		//return(x,y);
	}
	public void with_var_swap(float m,float n)
	{
		float temp=m;
		m=n;
		n=temp;
		System.out.println(m+" "+n);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValueSwap v=new ValueSwap();
		v.without_var_swap(10, 20);
		v.with_var_swap(11,78);
	}

}
