
public class Product {

	int prdid;
	String prdname;
	float prdprice;
	
	public Product(int prdid, String prdname, float prdprice) {
		super();
		this.prdid = prdid;
		this.prdname = prdname;
		this.prdprice = prdprice;
	}
	
	public static void main(String[] args) {
		
		Product prod=new Product(1,"Mouse",235.0f);

		System.out.println(prod);
	}

	@Override
	public String toString() {
		return "Product [Product No = " + prdid + ", Product Name= " + prdname + ", Product Price= " + prdprice + "]";
	}



}
