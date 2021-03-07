package hierarchicalInheritance;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chrome c=new Chrome();
		c.version();
		c.windows();
		c.license_no();
		c.property();
		Firefox f=new Firefox();
		//f.version();
		//f.windows();
		f.license_no();
		f.property();
		Opera o=new Opera();
		//o.version();
		//o.windows();
		o.license_no();
		o.property();
		InternetExplorer ie=new InternetExplorer();
		//ie.version();
	    //ie.windows();
		ie.license_no();
		ie.property();
	}

}
