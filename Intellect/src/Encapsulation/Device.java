package Encapsulation;

public class Device {
	int a,b;
	public void mobile()
	{
		a=30;
		b=50;
	    int gcd=1;
		for(int i = 1; i <= a && i <= b; i++)
        {
            if(a%i==0 && b%i==0)
                gcd = i;
        }

        System.out.printf("GCD of %d and %d is: %d", a, b, gcd);
        System.out.println("\n");
    }
	public void laptop()
	{
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping:\n"+a+" "+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Device d=new Device();
		d.mobile();
		d.laptop();
	}

}
