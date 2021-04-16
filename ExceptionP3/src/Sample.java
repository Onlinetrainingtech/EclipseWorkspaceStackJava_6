import java.util.InputMismatchException;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		try
		{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value is::");
		a=sc.nextInt();
		System.out.println("Your value is::"+a);
		}
		catch(InputMismatchException t)
		{
			System.out.println("Please given input properly");
		}
		finally
		{
			System.out.println("This finally block");
		}

	}

}
