import java.util.Scanner;
import java.util.Arrays;

public class AddProducts {
	public static void addProducts() {
		Scanner in = new Scanner(System.in);
		int userIn;
		
		while (true) {
			try {
				System.out.println("\n**** Add Products ****");
				System.out.println("1. Proceed to Add Product");
				System.out.println("2. Return to Display/Add/Update/Delete Sub Menu");
				System.out.println("3. Return to Main Menu\n");
				
				userIn = in.nextInt();
				switch (userIn) {
				case 1:
					addMenu();
					break;
				case 2: 
					DisplayAndEditMenu.subMenu();
					break;
				case 3:
					Menu.menu();
					break;
				default:
					System.out.println("You did not enter a valid response. Please try again.");
					break;
				}
			}
			catch (Exception e) {
				System.out.println("\n***********\n");
				System.out.println("You did not give an appropriate input. Please try again.");
				System.out.println("***********");
				addProducts();
			}
		}
	}
	
	public static void addMenu() {
		
		Scanner in = new Scanner(System.in);
	
		int productID = 0;
		String product;
		int productStock;
		double productPrice;
		String productCategory;
		int userInput;
	
		System.out.println("What is the name of the product?");
		product = in.nextLine();
		
		System.out.println("How many of this product's stock is available?");
		productStock = in.nextInt();
		
		System.out.println("What is this product's price?");
		productPrice = in.nextDouble();
		
		boolean isValid = true;
		
		try {
			do {
				System.out.println("Which category does this product belong to?");
				System.out.println("1. Fruits");
				System.out.println("2. Meat And Fish");
				System.out.println("3. Vegetables");
				System.out.println("4. TinFood");
				userInput = in.nextInt();
				
				switch (userInput) {
				case 1:
					productCategory = "Fruits";
					isValid = false;
					break;
				case 2:
					productCategory = "Meat and Fish";
					isValid = false;
					break;
				case 3:
					productCategory = "Vegetable";
					isValid = false;
					break;
				case 4:
					productCategory = "Tin Food";
					isValid = false;
					break;
				default:
					productCategory = "";
					System.out.println("\n***********\n");
					System.out.println("You did not enter a valid response. Please try again.\n");
					System.out.println("***********");
					break;
				}
			} while (isValid);
			
			productID = DisplayProducts.allProducts[DisplayProducts.allProducts.length - 1].getProductID();
			productID++;
			
			DisplayProducts.allProducts = newArray(productID, product, productStock, productPrice, productCategory);
			
			System.out.println("\n***********\n");
			System.out.println("Product added successfully!\n");
			System.out.println("***********");
			
		}
		catch (Exception e) {
			System.out.println("\n***********\n");
			System.out.println("You did not give an appropriate input. Please try again.\n");
			System.out.println("***********");
			addMenu();
		}
	}
	
	public static Product[] newArray(int ID, String productName, int stock, double price, String category) {
		Product addedProduct = new Product(ID, productName, stock, price, category);
		
		//get a new array size
		Product[] newProductArr = new Product[DisplayProducts.allProducts.length + 1];
		
		//iterate through the old array so as to add the existing elements into the new array. 
		//after that add the new element into the new array. 
		 
		for (int i = 0; i < DisplayProducts.allProducts.length; i++) {
			newProductArr[i] = DisplayProducts.allProducts[i];
			newProductArr[DisplayProducts.allProducts.length] = addedProduct;
			
		}
		
		return newProductArr;
	}
	
	
}
