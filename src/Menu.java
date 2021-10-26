import java.util.Scanner;

public class Menu {
	public static void menu() {
		boolean isValid = true;

		do {
			try {
				int userInput;
				Scanner in = new Scanner(System.in);
				
			    System.out.println("");
			    AlertSystem.alert();
			    System.out.println("");
				
				System.out.println("\n****** MAIN MENU *****");
				System.out.println("Please choose one of the options below, (0-4) ");
				System.out.println("1. Display/Add/Update/Delete Products");
				System.out.println("2. User Profile");
				System.out.println("3. Calculate Total Stock");
				System.out.println("4. Discount Feature"); 
				System.out.println("0. Exit\n");
				
				System.out.print("Please key in your option: ");
				userInput = in.nextInt();
				
				switch(userInput) {
				case 1:
					DisplayAndEditMenu.subMenu();
					isValid = false;
					break;
				case 2: 
					//<fileName>.userProfile();
					isValid = false;
					break;
				case 3:
					//<fileName>.calculate();
					isValid = false;
					break;
				case 4: 
					//<fileName>.discount();
					isValid = false;
					break;
				case 0:
					UserLogin.login();
					isValid = false;
					break;
				default:
					System.out.println("\n***********\n");
					System.out.println("You did not enter a valid response. Please try again.\n");
					System.out.println("***********");
				}
			}
			catch (Exception e) {
				System.out.println("\n***********\n");
				System.out.println("You did not enter an appropriate response. Please try again.\n");
				System.out.println("***********");
			}

		} while(isValid); //end do
	}
}
