package abstraction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s=new SBI();
		s.ceo();
		s.rule();
		s.currency();
		s.manager();
		
		PNB p=new PNB();
		p.ceo();
		//p.rule();
		//p.currency();
		p.location();
		
		HDFC h=new HDFC();
		h.ceo();
		//h.rule();
		//h.currency();
		h.location();
		
		BOI b=new BOI();
		b.ceo();
		//b.rule();
		//b.currency();
		b.customer();	
		}
}
