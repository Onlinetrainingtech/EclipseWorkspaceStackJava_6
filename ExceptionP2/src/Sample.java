
public class Sample {

	public static void main(String[] args) {
		
		try
		{
		String s1=null;
		System.out.println("length of the String::"+s1.length());
		}
		catch(NullPointerException r)
		{
			System.out.println("Please given as String"+r);
		}

	}

}
