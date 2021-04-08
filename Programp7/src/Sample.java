import java.util.Scanner;

class Demo
{
	int a,b,c;
	Scanner sc1=new Scanner(System.in);
	void ArithmetiOperator()
	{
		System.out.println("Enter the a and b value is::");
		
		a=sc1.nextInt();
		b=sc1.nextInt();
		c=a%b;
		System.out.println("Result is::"+c);
	}
	void ComparisonOperator()
	{
		int a1=10,b1=20;
		System.out.println((a1>b1));
		System.out.println((a1<b1));
		System.out.println((a1==b1));
	}
	void logicalOperator()
	{
		int a2=10,b2=20;
		System.out.println((a2<b2)&&(b2>a2));
		System.out.println((a2<b2)&&(b2<a2));
		System.out.println((a2>b2)||(b2>a2));
		System.out.println(!(a2>b2));
	}
	void bitwiseOperator()
	{
		int a=2,b=3;
		System.out.println("BitwiseAnd::"+(a&b));
		System.out.println("BitWiseOR::"+(a|b));
		System.out.println("BitWiseXOR::"+(a^b));
		System.out.println("LeftshiftOperator::"+(a<<1));
		System.out.println("RightShiftOperator::"+(a>>1));
	}
	void cndOperator()
	{
		int a3=2,b3=4;
		int res;
		//res=(((a3<b3)?(System.out.println("A3 is big"):(System.out.println("B3 is big")));
		res=((a3<b3)?(a3+b3):(b3*a3));
		System.out.println(res);
	}
}


public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		//f1.ArithmetiOperator();
		//f1.ComparisonOperator();
		//f1.logicalOperator();
		//f1.bitwiseOperator();
		f1.cndOperator();
	}

}
