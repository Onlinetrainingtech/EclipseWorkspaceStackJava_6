
public class Demo {

	
	void get1(int cid,String cname)
	{
		System.out.println("Get1 function is::"+cid+""+cname);
	}
	void get2(int empid,String empname)
	{
		System.out.println("Get2 function is::"+empid+""+empname);
	}
	
	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1(1001,"mobile");
		f1.get2(2001,"mohamed");

	}

}
