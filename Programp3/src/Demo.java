class Sample
{
	String pname="apple";//class or instance variable
	void fun1()
	{
	   int productid=1001;//localvariable
	   System.out.println("This is local variable fun1::"+productid);
	   System.out.println("This is gloable variable fun1::"+pname);
	}
	void fun2()
	{
		 System.out.println("This is gloable variable fun2::"+pname);
	}
}
public class Demo {

	public static void main(String[] args) {
		
		Sample f1=new Sample();
		f1.fun1();
		f1.fun2();

	}

}
