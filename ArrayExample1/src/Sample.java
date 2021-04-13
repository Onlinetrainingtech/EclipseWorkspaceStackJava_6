import java.util.Scanner;

class Demo
{
	int a[]=new int[50];
	int i,n;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
	}
	void get2()
	{
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the Array Value is::");
			a[i]=sc.nextInt();
		}
	}
	void display()
	{
		for(i=0;i<n;i++)
		{
			System.out.println("Result is::"+a[i]);
		}
	}
}

public class Sample {

	public static void main(String[] args) {
		
		Demo d1=new Demo();
		d1.get1();
		d1.get2();
		d1.display();

	}

}
