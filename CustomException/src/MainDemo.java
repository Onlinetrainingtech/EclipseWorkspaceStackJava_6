
public class MainDemo {
	  public void get(int amount) throws ExceptionDemo
	    {
	    	int sal=200;
	    	if((sal-amount)<500)
	    	{
	    		throw new ExceptionDemo();
	    	}
	    	else
	    	{
	    		System.out.println("SuccfullyCredited");
	    	}
	    }
	public static void main(String[] args) throws ExceptionDemo {
		
		MainDemo sc=new MainDemo();
		sc.get(500);

	}

}
