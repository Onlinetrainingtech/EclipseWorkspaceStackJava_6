
public class MainClass {

	public static void main(String[] args) {
		
		Product p=new Product();
		p.setPid(1001);
		p.setPname("apple");
		ProductImplementation pm=new ProductImplementation();
		pm.addProduct(p);
		System.out.println("Workingfine...");

	}

}
