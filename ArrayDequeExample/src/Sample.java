import java.util.ArrayDeque;

class Demo
{
	ArrayDeque<Integer>h1=new ArrayDeque<>();
	void g1()
	{
		h1.add(101);
		h1.add(102);
		h1.add(103);
		
		h1.addFirst(201);
		
		h1.addLast(205);
		
		h1.removeLast();
		System.out.println("Display Your Data is::"+h1);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.g1();

	}

}
