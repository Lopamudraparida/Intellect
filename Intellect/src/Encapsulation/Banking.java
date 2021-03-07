package Encapsulation;

public class Banking {
	private String acc_holders_name;
	private int acc_balance;
	private String ifsc_code;
	private String branch_name;
	public String getAcc_holders_name() {
		return acc_holders_name;
	}

	public void setAcc_holders_name(String acc_holders_name) {
		this.acc_holders_name = acc_holders_name;
	}

	public int getAcc_balance() {
		return acc_balance;
	}

	public void setAcc_balance(int acc_balance) {
		this.acc_balance = acc_balance;
	}

	public String getIfsc_code() {
		return ifsc_code;
	}

	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	private int cvv;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banking b=new Banking();
		b.setAcc_holders_name("Lopamudra");
		b.setAcc_balance(1000000);
		b.setIfsc_code("UCBA1313");
		b.setBranch_name("Bangalore");
		b.setCvv(644);
		System.out.println("Account Holders Name:"+b.getAcc_holders_name());
		System.out.println("Account Balance: "+b.getAcc_balance());
		System.out.println("IFSC Code:"+b.getIfsc_code());
		System.out.println("Branch Name:"+b.getBranch_name());
		System.out.println("CVV NO:"+b.getCvv());
		
	}

}
