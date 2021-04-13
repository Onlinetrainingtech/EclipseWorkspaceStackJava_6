class B
{
	int productid=1001;
	String pname="apple";
	void get1()
	{
		System.out.println("Baseclass Productid is::"+productid);
	}
}
class D extends B
{
	void get2()
	{
		String pname="mobile";
		System.out.println("Derived class pname is::"+super.pname);
	}
}


public class Sample {

	public static void main(String[] args) {
		
		D f1=new D();
		f1.get1();
		f1.get2();

	}

}
