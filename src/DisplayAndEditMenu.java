import java.util.Scanner;

//Display/Add/Update/Delete Sub Menu
public class DisplayAndEditMenu {
	
	public static void subMenu() {
		int userInput;
		
		Scanner in = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.println("\n**** Display/Add/Update/Delete Sub Menu ****");
				System.out.println("1. Display Products");
				System.out.println("2. Add New Products");
				System.out.println("3. Update Existing Products");
				System.out.println("4. Delete Existing Products");
				System.out.println("0. Return to Main Menu\n");
				System.out.print("Please key in your option: ");
				userInput = in.nextInt();
				
				switch (userInput) {
				case 0:
					Menu.menu();
					break;
				case 1:
					DisplayProducts.displayProduct();
					break;
				case 2:
					AddProducts.addProducts();
					break;
				case 3:
					//update
					break;
				case 4:
					//delete
					break;
				default:
					System.out.println("You did not enter a valid response. Please try again.");
					break;
				}
			}
			catch (Exception e) {
				System.out.println("\n***********\n");
				System.out.println("You did not enter an appropriate response. Please try again.\n");
				System.out.println("***********");
				subMenu();
				break;
			}
		}
	}
}
