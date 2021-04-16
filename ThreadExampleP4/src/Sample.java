class Demo extends Thread
{
	int i;
	public void run()
	{
		for(i=0;i<=5;i++)
		{
			try
			{
			   Thread.sleep(10000);
			}
			catch(InterruptedException t)
			{
				
			}
			System.out.println("ForIn::"+i);
		}
		
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		Demo t2=new Demo();
		Demo t3=new Demo();
		t1.start();
		try
		{
			
		  t1.join();
			
		}
		catch(InterruptedException t)
		{
			System.out.println(t);
		}
		t2.start();
		t3.start();

	}

}
