
public class SampleTest {

	public <M> M test(M t)
	{
		return t;
	}
	
	
	public static void main(String[] args) {
		
		SampleTest g=new SampleTest();
		System.out.println(g.test(100));
		System.out.println(g.test("apple"));
		System.out.println(g.test(2.5));
		

	}

}
