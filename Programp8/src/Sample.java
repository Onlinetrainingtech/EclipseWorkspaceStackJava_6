class Demo
{
	void process()
	{
		int a=100,b=3;
		if(a%b==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
	void nestedif()
	{
		int age=59,salary=19000;
		int bns;
		if(age>=61)
		{
			if(salary>=20000)
			{
				bns=salary+1000;
				System.out.println("Your Salary is::"+bns);
			}
			else
			{
				bns=salary+2000;
				System.out.println("Your salary is::"+bns);
			}
		}
		else
		{
			System.out.println("Your Age is::low");
		}
	}
	void switchcase()
	{
		String str="mobile2";
		switch(str)
		{
		case "mobile2":
			System.out.println("You can choose mobile2");
			break;
		case "mobile1":
			System.out.println("You can choose mobile1");
			break;
		case "mobile3":
			System.out.println("You can choose mobile3");
			break;
		default:
			System.out.println("Default case");
			break;
		}
	}
}

public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		//f1.process();
		//f1.nestedif();
		f1.switchcase();

	}

}
