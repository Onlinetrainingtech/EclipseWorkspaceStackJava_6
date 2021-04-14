import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

class Demo
{
	//HashSet<Integer>list1=new HashSet<>();
	TreeSet<Integer>list1=new TreeSet<>();
	void get1()
	{
		list1.add(101);
		list1.add(102);
		list1.add(103);
		list1.add(104);
		list1.add(104);
		
		Iterator g1=list1.iterator();
		while(g1.hasNext())
		{
			System.out.println("InsideWhileloopData is::"+g1.next());
		}
		
		System.out.println("Searching Data is::"+list1.contains(101));
		System.out.println("Remove Data is::"+list1.remove(102));
		System.out.println("After Removing Data is::"+list1.contains(102));
		System.out.println("Your Data is::"+list1);
	}
}

public class Sample {

	public static void main(String[] args) {
		
		Demo d1=new Demo();
		d1.get1();

	}

}
