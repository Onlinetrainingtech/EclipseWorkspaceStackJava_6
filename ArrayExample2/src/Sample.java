import java.util.Scanner;

class Demo
{
	int a[][]=new int[2][2];
	int i,j,n,m;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the n and m value is::");
		n=sc.nextInt();
		m=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Enter the Array value is::");
				a[i][j]=sc.nextInt();
			}
		}
	}
	void display()
	{
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Your Array value is::"+a[i][j]);
			}
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo d1=new Demo();
		d1.get1();
		d1.display();

	}

}
