package Basic_Inventory_System;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Inventory In = new Inventory();
		In.addProduct("apple", 2.99, 500);
		In.addProduct("Saree", 1000, 500);
		In.addProduct("blouse", 300, 500);
		
		
		Scanner scanner = new Scanner(System.in);
		boolean isRunning = true;

		while (isRunning) {
			System.out.println("/n --------------- Inventory System --------------");
			System.out.println("1. Add product.");
			System.out.println("2. Remove Product By Number.");
			System.out.println("3. Remove Product By Name.");
			System.out.println("4. List All Product Names.");
			System.out.println("5. List Inventory Products.");
			System.out.println("6. Restock Products.");
			System.out.println("7. Exiting.");
			System.out.println("Enter Your Choice.");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Enter the product name to add to Inventory.");
				String name = scanner.nextLine();
				System.out.println("Enter the product price.");
				double price = scanner.nextDouble();
				System.out.println("Enter the product quantity.");
				int quantity = scanner.nextInt();
				scanner.nextLine();
				In.addProduct(name, price, quantity);
				break;

			case 2:
				In.listAllProductNames();
				System.out.println("Enter the product naumber to remove from Inventory.");
				int productNUmber = scanner.nextInt();
				scanner.nextLine();
				In.removeProductByNumber(productNUmber);
				break;

			case 3:
				In.listInventory();
				System.out.println("Enter the product name to remove from Inventory.");
				String productName = scanner.nextLine().trim();
				In.removeProductByName(productName);
				break;

			case 4:
				In.listAllProductNames();
				break;

			case 5:
				In.listInventory();
				break;

			case 6:
				System.out.println("Enter the product name to Restock.");
				name = scanner.nextLine();
				System.out.println("Enter the  minmum quantity to Restock.");
				int minquantity = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter the minmum amount for Restocking Quantity.");
				int restockAmount = scanner.nextInt();
				scanner.nextLine();
				In.reStockProduct(name, minquantity, restockAmount);
				break;

			case 7:
				isRunning = false;
				System.out.println("Exiting.");
				break;

			default:
				System.out.println("invalid choice, try again");
				break;
			}
		}
		scanner.close();
	}
}
