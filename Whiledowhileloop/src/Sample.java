
public class Sample {

	void get1()
	{
		int i,n=5;
		i=0;
		while(i<=n)
		{
			System.out.println("I value is::"+i);
			i++;
		}
	}
	void get2()
	{
		int j,m=5;
		j=0;
		do
		{
			System.out.println("J value is::"+j);
			j++;
		}while(j<=m);
	}
	
	public static void main(String[] args) {
		
		Sample d1=new Sample();
		d1.get1();
		d1.get2();

	}

}
