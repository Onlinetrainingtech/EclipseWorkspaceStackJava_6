import java.util.Scanner;

class Demo
{
	int empid,salary;
	String empname;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the Empid and Salary is::");
		empid=sc.nextInt();
		salary=sc.nextInt();
		System.out.println("Enter the Empname is::");
		empname=sc.next();
	}
	void display()
	{
		System.out.println("Empid::Empname::Salary::"+empid+""+empname+""+salary);
	}
}


public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.input();
		f1.display();

	}

}
