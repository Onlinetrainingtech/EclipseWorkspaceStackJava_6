import java.util.Scanner;

class B
{
	int m1,m2;
	int tot;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the m1 value is::");
		m1=sc.nextInt();
	}
}
class D1 extends B
{
	void get2()
	{
		System.out.println("Enter the m2 value is::");
		m2=sc.nextInt();
	}
}
class D2 extends D1
{
	void calculation()
	{
		tot=m1+m2;
		System.out.println("Your total is::"+tot);
	}
}


public class Sample {

	public static void main(String[] args) {
	
		D2 f1=new D2();
		f1.get1();
		f1.get2();
		f1.calculation();
	}

}
