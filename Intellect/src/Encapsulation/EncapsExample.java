package Encapsulation;

public class EncapsExample {
	private String name;
	private String branch;
	private int empid;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getbranch() {
		return branch;
	}

	public void setbranch(String branch) {
		this.branch = branch;
	}

	public int getempid() {
		return empid;
	}

	public void setempid(int empid) {
		this.empid = empid;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsExample e=new EncapsExample();
		e.setName("Lopamudra");
		e.setbranch("CSE");
		e.setempid(1501289167);
		System.out.println("Name:"+e.getName()+" EmployeeId: "+e.getempid()+"  Branch: "+e.getbranch());
		}

}
