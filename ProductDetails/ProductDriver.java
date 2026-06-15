class Product{
	private int productId;
	private String productName;
	private double price;
	private String category;

	public Product(int productId, String productName, double price, String category) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.category = category;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public String toString() {
		return "Employee productId = " + productId + ", \nproductName = " + productName + ", \nprice = " + price + ", \ncategory = "
				+ category;
	}
	
	public boolean equals(Object obj) {
		Product pro = (Product)obj;
		
		if (this.productId == pro.productId && this.productName.equals(pro.productName) && this.price == pro.price && this.category.equals(pro.category)) {
			return true;
		}
		return false;
	}
	
}

public class ProductDriver{
	public static void main(String[] args){
		Product product = new Product(101, "laptop", 1231432, "Electronics");
		System.out.println(product);
		
		Product product2 = new Product(101, "laptop", 1231432, "Electronics");
		
		System.out.println(product.equals(product2));
		
	}
}
