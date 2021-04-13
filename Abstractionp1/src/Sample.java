abstract class Demo
{
	abstract void get1();
	void get2()
	{
		System.out.println("This is normal methods..");
	}
}
class D extends Demo
{
	public void get1()
	{
		System.out.println("This is abstract method process..");
	}
}
public class Sample {

	public static void main(String[] args) {
		
		D f1=new D();
		f1.get1();
		f1.get2();

	}

}
