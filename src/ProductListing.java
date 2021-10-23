import java.util.Scanner;

public class ProductListing {

	//Assume 100 is stock limit
	
	//instance variables
	static Product fruits1 = new Product(1, "Banana", 75, 3.90, "Fruits");
	static Product fruits2 = new Product(2, "Apple", 20, 9.99, "Fruits");
	static Product fruits3 = new Product(3, "Avocado", 35, 8.99, "Fruits");
	static Product fruits4 = new Product(4, "Watermelon", 55, 6.99, "Fruits");
	static Product fruits5 = new Product(5, "Oranges", 15, 5.99, "Fruits");
	
	static Product meatAndFish1 = new Product(6, "Beef", 100, 10.99, "Meat and Fish");
	static Product meatAndFish2 = new Product(7, "Chicken", 0, 11.99, "Meat and Fish");
	static Product meatAndFish3 = new Product(8, "Lamb", 30, 12.99, "Meat and Fish");
	static Product meatAndFish4 = new Product(9, "Salmon", 20, 13.99, "Meat and Fish");
	static Product meatAndFish5 = new Product(10, "Tuna", 90, 7.99, "Meat and Fish");
	
	static Product vegetable1 = new Product(11, "Leek", 0, 1.99, "Vegetable");
	static Product vegetable2 = new Product(12, "Lettuce", 0, 2.99, "Vegetable");
	static Product vegetable3 = new Product(13, "Carrot", 50, 3.80, "Vegetable");
	static Product vegetable4 = new Product(14, "Cabbage", 100, 3.99, "Vegetable");
	static Product vegetable5 = new Product(15, "Cauliflower", 110, 5.99, "Vegetable");
	
	static Product tinFood1 = new Product(16, "Baked Beans", 60, 5.99, "Tin Food");
	static Product tinFood2 = new Product(17, "Sardine", 15, 5.99, "Tin Food");
	static Product tinFood3 = new Product(18, "Mackarel", 20, 10.99, "Tin Food");
	static Product tinFood4 = new Product(19, "Spaghetti Sauce", 66, 15.99, "Tin Food");
	static Product tinFood5 = new Product(20, "Campbell's Soup", 70, 12.99, "Tin Food");
	
	//since we are not using a database system, we'll use an array to store all the data. 
	static Product[] allProducts = {
					fruits1, fruits2, fruits3, fruits4, fruits5,
					meatAndFish1, meatAndFish2, meatAndFish3, meatAndFish4, 
					meatAndFish5, vegetable1, vegetable2, vegetable3, vegetable4,
					vegetable5, tinFood1, tinFood2, tinFood3, tinFood4, tinFood5
				};
	
	public static void product() {
		int userInput;
	
		Scanner in = new Scanner(System.in);
		
		//Display Categories 
		
		while (true) {
				System.out.println("\n**** Display Menu ****");
				System.out.println("1. Display Fruit Category");
				System.out.println("2. Display Vegetable Category");
				System.out.println("3. Display Meat and Fish Category");
				System.out.println("4. Display Tin Food Category");
				System.out.println("0. Return to Main Menu\n");
				
				System.out.print("Please key in your option: ");
				userInput = in.nextInt();
					
					
				switch(userInput) {
				case 0:
					Menu.menu();
					break;
				case 1:
					System.out.println("\n**** Fruit Category ****");
					for (Product m: allProducts) {
						if (m.getProductCategory().equals("Fruits")) {
							System.out.println(m.toString());
						}
					}
					break;
				case 2:
					System.out.println("\n**** Vegetable Category ****");
					for (Product m: allProducts) {
						if (m.getProductCategory().equals("Vegetable")) {
							System.out.println(m.toString());
						}
					}
					break;
				case 3:
					System.out.println("\n**** Meat and Fish Category ****");
					for (Product m: allProducts) {
						if (m.getProductCategory().equals("Meat and Fish")) {
							System.out.println(m.toString());
						}
					}
					break;
				case 4: 
					System.out.println("\n**** Tin Food Category ****");
					for (Product m: allProducts) {
						if (m.getProductCategory().equals("Tin Food")) {
							System.out.println(m.toString());
						}
					}
					break;
				default:
					System.out.println("You did not enter a valid response. Please try again.");
					break;
			}
		}

		
	}
	

}
