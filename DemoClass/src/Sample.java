class Product
{
	void addProduct()
	{
		System.out.println("This addProduct");
	}
	void addCategory()
	{
		System.out.println("This addCategory");
	}
	void viewProduct()
	{
		System.out.println("This viewProduct");
	}
}
public class Sample {

	public static void main(String[] args) {
		
		
		Product f1=new Product();
		f1.addProduct();
		f1.addCategory();
		f1.viewProduct();

	}

}
