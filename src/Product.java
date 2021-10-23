public class Product {
	//This file is dedicated to create object classes for the products we have in the Grocery System. 
	
	private int productID;
	private String product;
	private int productStock;
	private double productPrice;
	private String productCategory;
	
	/*
	 * Category:
	 * Fruits
	 * Meat And Fish
	 * Vegetables
	 * Bread
	 * TinFood
	 */
	
	public Product(int productID, String product, int productStock, double productPrice, String productCategory) {
		this.productID = productID;
		this.product = product;
		this.productStock= productStock;
		this.productPrice = productPrice;
		this.productCategory = productCategory;
	} //constructor
	
	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getProductStock() {
		return productStock;
	}

	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	

	public String toString()
	{
		return "Product ID : " + this.productID
		+ "\nProduct Name: " + this.product
		+ "\nQuantity in stock: " + this.productStock
		+ "\nPrice: " + String.format("%.2f", this.productPrice)
		+ "\nProduct Category: " + this.productCategory
		+ "\n\n";
	}//end method toString
	
}
