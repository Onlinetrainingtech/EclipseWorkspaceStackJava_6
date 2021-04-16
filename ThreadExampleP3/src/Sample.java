class Demo extends Thread
{
	public void run()
	{
		process1();
	}
	void process1()
	{
		System.out.println("This is Process-1"+Thread.currentThread().getName());
		process2();
		
	}
	void process2()
	{
		System.out.println("This is Process::"+Thread.currentThread().getPriority());
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		t1.setName("Threading");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		System.out.println("ThreadDestory::"+t1.isInterrupted());
		System.out.println("ThreadAlive::"+t1.isAlive());

	}

}
