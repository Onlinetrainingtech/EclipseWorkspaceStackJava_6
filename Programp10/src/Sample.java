import java.util.Scanner;

public class Sample {

	int i,n;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the value is::");
		n=sc.nextInt();
	}
	void get2()
	{
		for(i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even"+i);
			}
			else
			{
				System.out.println("Odd"+i);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Sample d1=new Sample();
		d1.get1();
		d1.get2();

	}

}
