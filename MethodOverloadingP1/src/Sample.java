class Demo
{
	void get1(int pid,String pname)
	{
		System.out.println("Your value is::"+pid+""+pname);
	}
	void get1(int cid)
	{
		System.out.println("Your value is::"+cid);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1(1001,"apple");
		f1.get1(2001);

	}

}
