
public class AlertSystem {
	
  public static void alert(){
    System.out.println("############### ALERT ###############");
    System.out.println("These are the products which stocks are less than 25 or more than 100");
    System.out.println("Please check each product's stock and update. Thank you.");
    
		for(Product m: DisplayProducts.allProducts) {
			if(m.getProductStock() < 25 || m.getProductStock() > 100) {
				System.out.println(m.toString());
			}
		}
		
    System.out.println("####################################");
  }
	
}
