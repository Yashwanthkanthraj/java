package Basic_Inventory_System;

import java.util.ArrayList;

public class Inventory {

	private ArrayList<Product> products;

	public Inventory() {

		products = new ArrayList<>();
	}

	public void addProduct(String name, double price, int quantity) {

		for (Product product : products) {

			if (product.getName().equalsIgnoreCase(name)) {
				System.out.println("product already exists");
				return;
			}}

			products.add(new Product(name, price, quantity));
			System.out.println("product added: " + name);
		
	}

	public void removeProductByNumber(int productNumber) {
		int index = productNumber - 1;

		if (index < 0 || index >= products.size()) {
			System.out.println("invalid product number.");
			return;
		}
		String productName = products.get(index).getName();
		products.remove(index);
		System.out.println("product  removed :" + productName);
	}

	public void removeProductByName(String name) {
		boolean removed = false;
		for (Product product : products) {
			if (product.getName().equalsIgnoreCase(name)) {
				products.remove(product);
				removed = true;
				System.out.println("product removed: " + name);
				break;
			}
		}
		if (!removed) {
			System.out.println("product not found." + name);
		}
	}

	public void listAllProductNames() {
		if (products.isEmpty()) {
			System.out.println("inventory is empty. add products first.");
			return;
		}
		System.out.println("\n ------------Product names---------------");
		for (int i = 0; i < products.size(); i++) {

			System.out.println((i + 1) + ". " + products.get(i).getName());
		}
	}

	public void listInventory() {
		if (products.isEmpty()) {
			System.out.println("inventory is empty. add products first.");
			return;
		}

		System.out.println("\n ------------ Inventory ---------------");
		for (Product product : products) {
			System.out.printf("- %s  | Price:- $%.2f | Quantity: %d\n", product.getName(), product.getPrice(),
					product.getQuantity());
		}
	}

	public void reStockProduct(String name, int minQuantity, int restockAmount) {
		for (Product product : products) {
			if (product.getName().equalsIgnoreCase(name)) {

				if (product.getQuantity() < minQuantity) {
					product.restock(restockAmount);
					System.out.printf("Restocked %s by %d units.\n", name, restockAmount);
				} else {
					System.out.println("restock not needed for " + name);
				}
				return;
			}
		}
		System.out.println(" Product not Found: " + name);
	}

}
