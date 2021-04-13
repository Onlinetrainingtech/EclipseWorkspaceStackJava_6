
public class Sample {

	static int a=10;
	Sample()
	{
		a++;
		System.out.println("A value is::"+a);
	}
	public static void main(String[] args) {
		
		new Sample();
		new Sample();
		new Sample();

	}

}
