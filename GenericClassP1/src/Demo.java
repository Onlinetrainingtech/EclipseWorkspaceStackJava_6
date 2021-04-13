
public class Demo<T>
{
	public T t;//int t;
	
	public void setValue(T t)
	{
		this.t=t;
	}
	public void get()
	{
		System.out.println("Integer/String::"+t);
	}

	public static void main(String[] args) 
	{
		
	   Demo<Integer>h1=new Demo<Integer>();
	   Demo<String>h2=new Demo<String>();
	   
	   h1.setValue(1001);
	   
	   h2.setValue("apple");
	   
	   h1.get();
	   
	   h2.get();

	}

}
