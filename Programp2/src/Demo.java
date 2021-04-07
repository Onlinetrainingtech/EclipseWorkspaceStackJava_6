
public class Demo {

	void get1()
	{
		System.out.println("This is get1 function1");
	}
	void get2()
	{
		System.out.println("This is get2 function2");
	}
}

class Sample
{
	public static void main(String[] args) {
		
		Demo d1=new Demo();//This is Object Creation
		d1.get1();
		d1.get2();

	}

}
