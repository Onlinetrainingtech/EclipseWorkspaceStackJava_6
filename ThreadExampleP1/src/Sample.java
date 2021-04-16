import java.util.Scanner;

class Demo extends Thread
{
	int productid;
	Scanner sc=new Scanner(System.in);
	public void run()
	{
		try
		{
			System.out.println("Enter the n value is::");
			Thread.sleep(20000);
			productid=sc.nextInt();
			System.out.println("Your ProductId is::"+productid);
		}
		catch(InterruptedException r)
		{
			System.out.println(r);
		}
		System.out.println("This is run method");
	}
	void get1()
	{
		System.out.println("This is get1 method");
	}
}


public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		t1.start();
		t1.get1();

	}

}
