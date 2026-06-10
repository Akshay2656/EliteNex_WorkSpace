class Product{
	private int productId;
	private String productName;
	private double price;
	private String category;
	
	Product(int productId, String productName, double price, String category){
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.category = category;
	}
	
	public void setId(int productId){
		this.productId = productId;
	}
	
	public int getId(){
		return productId;
	}
	
	public void setProductName(String productName){
		this.productName = productName;
		
	}
	
	public String getProductName(){
		return productName;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setCategory(String category){
		this.category = category;
	}
	
	public String getCategory(){
		return category;
	}
	
	public String toString(){
	
		return "Product Id: "+productId+"\nProductName: "+productName+"\nProduct Price: "+price+"\nProduct Category: "+category;
	}
	
	public boolean equals(Object obj){
		Product pro = (Product) obj;
		if (pro.productId == this.productId && pro.productName.equals(this.productName) && pro.price == this.price && pro.category.equals(category)){
			return true;
		}
		return false;
	}
}

public class ProductDriver{
	public static void main(String[] args){
		Product product1 = new Product(101, "Laptop", 1234567, "Eletronics");
		Product product2 = new Product(101, "Laptop", 1234567, "Eletronics");
		System.out.println(product1);
		System.out.println(product2);
		System.out.println(product1.equals(product2));
	}
}