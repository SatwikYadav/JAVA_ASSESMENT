import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


public class Ecommerce {
	
	private static Scanner sc;
	static HashMap<String, List> customers = new HashMap<>(); 
	static HashMap<String, List> products = new HashMap<>(); 
	static HashMap<String, List> Orders = new HashMap<>(); 

	public static Set<String> registerCustomer() {
		sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter password");
		String password = sc.next();
		List details = new List();
		details.add(name);
		details.add(password);
		customers.put(name, details); 
		return customers.keySet();
	}
	
	private static String createProduct() {
		System.out.println("Enter name of the product");
		String name = sc.next();
		System.out.println("Enter type of Product");
		String type = sc.next();
		System.out.println("Enter price of the product");
		String price = sc.next();
		List details = new List();
		details.add(type);
		details.add(price);
		products.put(name, details);
		return "Product Created";
	}
	
	private static Set<String> viewProducts() {
		return products.keySet();
	}
	
	
	private static char[] orderProducts() {
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter password");
		String password = sc.next();
		if(customers.keySet().contains(name)) {
			List details = customers.get(name);
//			if (password==details.get(1)) {
//				
//				System.out.println("Product Name: ");
//				System.out.println("Product type: ");
//				System.out.println("Product price: ");
//				System.out.println("Du you want to buy ..?");
//				String option = sc.next();
//				if (option == "yes") {
//					
//				}
			}
			return null;
		}
	
	
	
	public static void main(String args[]) {
		sc = new Scanner(System.in);
		System.out.println("enter your Option");
		
		while(true) {
			System.out.println("1.Register a customer");
			System.out.println("2.Create a product");
			System.out.println("3.View the Products");
			System.out.println("4.Create an order");
			System.out.println("5.Checkout");
			int option = sc.nextInt();
			switch(option) {
				case 1:
					System.out.println(registerCustomer());
					break;
				case 2:
					System.out.println(createProduct());
					break;
				case 3:
					System.out.println(viewProducts());
					break;
				case 4:
					System.out.println(orderProducts());
					break;
				default:
					System.out.println("Choose the correct Option");
					break;
			}
		}
	}


	
}
