import java.util.Scanner;

public class Menu {
	public static void menu() {
		
		int userInput;
		Scanner in = new Scanner(System.in);
		
	    System.out.println("");
	    AlertSystem.alert();
	    System.out.println("");
		
		System.out.println("\n****** MAIN MENU *****");
		System.out.println("Please choose one of the options below, (0-4) ");
		System.out.println("1. Display Products");
		System.out.println("2. User Profile");
		System.out.println("3. Calculate Total Stock");
		System.out.println("4. Discount Feature"); //display what products are on discount
		System.out.println("0. Exit\n");
		
		System.out.print("Please key in your option: ");
		userInput = in.nextInt();
		
		switch(userInput) {
			case 1:
				ProductListing.product();
				break;
			case 2: 
				//<fileName>.userProfile();
				break;
			case 3:
				//<fileName>.calculate();
				break;
			case 4: 
				//<fileName>.discount();
				break;
			case 0:
				UserLogin.login();
				break;
			default:
				System.out.println("You did not enter a valid response. Please try again.");
		}
	}
}
