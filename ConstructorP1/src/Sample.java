class Demo
{
	Demo()
	{
		System.out.println("This is default cons..");
	}
	Demo(int pid)
	{
		System.out.println("This is param cons.."+pid);
	}
	void get1()
	{
		System.out.println("This is normal function");
	}
}
public class Sample {

	public static void main(String[] args) {
	
		Demo f1=new Demo();
		f1.get1();
		new Demo(1001);

	}

}
