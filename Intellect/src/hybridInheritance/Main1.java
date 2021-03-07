package hybridInheritance;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tcs t=new Tcs();
		t.name();
		t.address();
		t.idCard();
		t.location();
		
		Intellect in=new Intellect();
		in.location();
		
		Infosys i=new Infosys();
		i.location();
		//i.name();
		//i.address();
		//i.idCard();
		
		Oracle o=new Oracle();
		o.location();
		//o.name();
		//o.address();
		//o.idCard();
		
		Google g=new Google();
		g.location();
		//g.name();
		//g.address();
		//g.idCard();
		
		ExamProcess e=new ExamProcess();
		//e.location();
		e.online();
		e.f2f();
		e.hr();
		
		Salary s=new Salary();
		//s.online();
		//s.f2f();
		//s.hr();
		s.acc_to_interview();
		
		Candidate c=new Candidate();
		c.objective();
		c.academic_details();
		c.name();
		c.address();
		c.idCard();
		
				
	}
	}

