class Demo
{
	void get1()
	{
		try
		{
		int a=10;
		int c;
		c=a/0;
		System.out.println("Result is::"+c);
		}
		catch(ArithmeticException t)
		{
			System.out.println("Please check your divided..");
		}
        get2();
	}
	void get2()
	{
		System.out.println("This is get2 function..");
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();
		
	}

}
