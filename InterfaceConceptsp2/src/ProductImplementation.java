
public class ProductImplementation implements ProductDAO 
{

	@Override
	public void addProduct(Product p) {
		
		System.out.println("Your ProductId is::"+p.getPid());
		System.out.println("Your ProductName is::"+p.getPname());
		
	}

}
