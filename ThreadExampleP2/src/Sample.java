class Demo implements Runnable
{
	public void run()
	{
		System.out.println("This is run method");
	}
}
public class Sample {

	public static void main(String[] args) {
		Demo r1=new Demo();
		Thread t1=new Thread(r1);
		t1.start();
			

	}

}
