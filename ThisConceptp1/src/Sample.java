
public class Sample {

	int n1;
	String n2;
	void get1(int pid,String pname)
	{
		this.n1=pid;
		this.n2=pname;
		System.out.println("Get1 function is::"+pid+""+pname);
	}
	void display()
	{
		System.out.println("Display function is::"+n1+""+n2);
	}
	void get2()
	{
		System.out.println("get2 function is::"+n1+""+n2);
	}
	public static void main(String[] args) {
		
		Sample d1=new Sample();
		d1.get1(1001,"apple");
		d1.display();
		d1.get2();

	}

}
