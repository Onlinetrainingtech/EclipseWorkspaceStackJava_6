import java.util.HashMap;
import java.util.Map;

class Demo
{
	HashMap<Integer,String>g1=new HashMap<>();
	void get()
	{
		g1.put(101,"Azar");
		g1.put(102,"mohan");
		g1.put(103, "mohamed");
		
		for(Map.Entry m:g1.entrySet())
		{
			System.out.println("Your Value is::"+m.getKey()+""+m.getValue());
		}
		System.out.println("Your size is::"+g1.size());
		System.out.println("Remove the element is::"+g1.remove(101));
		System.out.println("Search the data is::"+g1.containsKey(101));
		System.out.println("After Removing size is::"+g1.size());
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get();

	}

}
