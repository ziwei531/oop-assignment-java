import java.util.Scanner;

public class UserLogin {
	public static void login() {
		Scanner in = new Scanner(System.in);
		String admin = "admin";
		String defaultPassword = "abcd";
		
		String ID;
		String password;
		
		while (true) {
			try {
				System.out.println("Welcome to the Grocery Store Admin Terminal!");
				
				System.out.print("Please enter your Admin ID: ");
				ID = in.nextLine();
				System.out.print("Please enter your Admin password: ");
				password = in.nextLine();
				
				if ((ID.equals(admin)) && (password.equals(defaultPassword))) {
					System.out.println("Login Successful!");
					Menu.menu();
					break;
				}
				else {
					System.out.println("Login Unsucessful. Please try again.\n");
				}
			}
			catch(Exception e) {
				System.out.println("Something went wrong please try again.\n");
				System.out.println(e + "\n");
			}
		}
	}
}
