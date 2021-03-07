package interface_Prog;

public class Igtb implements Intellect{
	public  void product()
	{
		System.out.println("IGTB Products are:");
		System.out.println("1->Digital");
		System.out.println("2->Payment & Cash Management");
		System.out.println("3->Liquidity Management System");
		System.out.println("4->Supply Chain & Trade Finance");
		System.out.println("5->Commercial Risk");
		
	}
	public void branch_location()
	{
		System.out.println("Branch location is in:"+"Mumbai "+" Chennai "+" Pune "+" Hyderabad ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Igtb i=new Igtb();
		i.product();
		i.branch_location();

	}

}
