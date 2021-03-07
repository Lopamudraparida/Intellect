package method_overriding;

public class Calculation extends Math{
	public void area()
	{
		System.out.println("Area of Square is:");
	}
   public void arithmetic()
   {
	   System.out.println("a^2");
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation c=new Calculation();
		c.area();
		c.arithmetic();
		
		Math mc=new Calculation();
		mc.area();
		mc.arithmetic();
		
		Math m=new Math();
		m.area();
		m.arithmetic();
		
		
	}

}
